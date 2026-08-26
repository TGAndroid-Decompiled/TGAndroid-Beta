package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_vision_common.zzku;
import com.google.android.gms.internal.mlkit_vision_common.zzld;
import com.google.android.gms.internal.mlkit_vision_common.zzle;
import com.google.android.gms.internal.mlkit_vision_common.zzlg;
import com.google.android.gms.internal.mlkit_vision_common.zzlh;
import com.google.android.gms.internal.mlkit_vision_common.zzln;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.AboutLinkCell;
import org.telegram.ui.Cells.CheckBoxCell;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.CircularProgressDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.URLSpanNoUnderline;

public final class ChangeUsernameActivity extends BaseFragment {
    public Adapter adapter;
    public final long botId;
    public int checkReqId;
    public ChatActivity$$ExternalSyntheticLambda7 checkRunnable;
    public ActionBarMenuItem doneButton;
    public UsernameCell editableUsernameCell;
    public UsernameHelpCell helpCell;
    public boolean ignoreCheck;
    public InputCell inputCell;
    public String lastCheckName;
    public RecyclerListView listView;
    public final ArrayList loadingUsernames;
    public boolean needReorder;
    public final ArrayList notEditableUsernames;
    public CheckBoxCell.AnonymousClass2 statusTextView;
    public String username;
    public final ArrayList usernames;
    public static final Paint linkBackgroundActive = new Paint(1);
    public static final Paint linkBackgroundInactive = new Paint(1);
    public static final Paint dragPaint = new Paint(1);

    public final class AnonymousClass2 implements RecyclerListView.OnItemClickListener {
        public AnonymousClass2() {
        }

        @Override
        public final void onItemClick(int i, View view) {
            boolean z = view instanceof UsernameCell;
            ChangeUsernameActivity changeUsernameActivity = ChangeUsernameActivity.this;
            if (!z) {
                if (view instanceof InputCell) {
                    changeUsernameActivity.focusUsernameField(true);
                    return;
                }
                return;
            }
            UsernameCell usernameCell = (UsernameCell) view;
            TLRPC.TL_username tL_username = usernameCell.currentUsername;
            if (tL_username == null || usernameCell.loading) {
                return;
            }
            if (tL_username.editable && changeUsernameActivity.botId == 0) {
                changeUsernameActivity.listView.smoothScrollToPosition(0);
                changeUsernameActivity.focusUsernameField(true);
                return;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(changeUsernameActivity.getParentActivity(), 0, changeUsernameActivity.getResourceProvider());
            String string = LocaleController.getString(tL_username.active ? R.string.UsernameDeactivateLink : R.string.UsernameActivateLink);
            AlertDialog alertDialog = builder.alertDialog;
            alertDialog.title = string;
            alertDialog.message = LocaleController.getString(tL_username.active ? R.string.UsernameDeactivateLinkProfileMessage : R.string.UsernameActivateLinkProfileMessage);
            builder.setPositiveButton(LocaleController.getString(tL_username.active ? R.string.Hide : R.string.Show), new VoIPFragment$$ExternalSyntheticLambda37(this, tL_username, i, view, 2));
            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), new ChatActivity$$ExternalSyntheticLambda131(4));
            builder.show();
        }
    }

    public final class Adapter extends RecyclerListView.SelectionAdapter {
        public Adapter() {
        }

        @Override
        public final int getItemCount() {
            ChangeUsernameActivity changeUsernameActivity = ChangeUsernameActivity.this;
            RecyclerListView recyclerListView = changeUsernameActivity.listView;
            if (recyclerListView != null) {
                ArrayList arrayList = recyclerListView.forcedSections;
                if (arrayList != null) {
                    arrayList.clear();
                } else {
                    recyclerListView.forcedSections = new ArrayList();
                }
                if (changeUsernameActivity.usernames.size() > 0) {
                    changeUsernameActivity.listView.forcedSections.add(Long.valueOf(AndroidUtilities.pack(3, changeUsernameActivity.usernames.size() + 3)));
                }
            }
            return (changeUsernameActivity.usernames.size() > 0 ? changeUsernameActivity.usernames.size() + 2 : 0) + 3;
        }

        @Override
        public final int getItemViewType(int i) {
            if (i == 0) {
                return 0;
            }
            if (i == 1) {
                return 3;
            }
            if (i == 2) {
                return 1;
            }
            if (i == 3) {
                return 0;
            }
            return i != getItemCount() - 1 ? 4 : 2;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.mItemViewType == 4;
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            int i2;
            int i3 = viewHolder.mItemViewType;
            ChangeUsernameActivity changeUsernameActivity = ChangeUsernameActivity.this;
            long j = changeUsernameActivity.botId;
            View view = viewHolder.itemView;
            if (i3 == 0) {
                HeaderCell headerCell = (HeaderCell) view;
                if (i == 0) {
                    i2 = j != 0 ? R.string.BotSetPublicLinkHeader : R.string.SetUsernameHeader;
                } else {
                    i2 = R.string.UsernamesProfileHeader;
                }
                headerCell.setText(LocaleController.getString(i2));
                return;
            }
            if (i3 == 2) {
                ((TextInfoPrivacyCell) view).setText(LocaleController.getString(j != 0 ? R.string.BotUsernamesHelp : R.string.UsernamesProfileHelp));
                return;
            }
            if (i3 == 3) {
                changeUsernameActivity.ignoreCheck = true;
                InputCell inputCell = (InputCell) view;
                changeUsernameActivity.inputCell = inputCell;
                inputCell.field.setText(changeUsernameActivity.username);
                changeUsernameActivity.ignoreCheck = false;
                return;
            }
            if (i3 != 4) {
                return;
            }
            TLRPC.TL_username tL_username = (TLRPC.TL_username) changeUsernameActivity.usernames.get(i - 4);
            UsernameCell usernameCell = (UsernameCell) view;
            if (tL_username.editable) {
                changeUsernameActivity.editableUsernameCell = usernameCell;
            } else if (changeUsernameActivity.editableUsernameCell == usernameCell) {
                changeUsernameActivity.editableUsernameCell = null;
            }
            usernameCell.set(tL_username, i < getItemCount() - 2, false, changeUsernameActivity.botId);
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            ChangeUsernameActivity changeUsernameActivity = ChangeUsernameActivity.this;
            if (i == 0) {
                return new RecyclerListView.Holder(new HeaderCell(changeUsernameActivity.getParentActivity()));
            }
            if (i == 1) {
                UsernameHelpCell usernameHelpCell = changeUsernameActivity.new UsernameHelpCell(changeUsernameActivity.getParentActivity());
                usernameHelpCell.setTag(-33024);
                return new RecyclerListView.Holder(usernameHelpCell);
            }
            if (i == 2) {
                return new RecyclerListView.Holder(new TextInfoPrivacyCell(changeUsernameActivity.getParentActivity(), 24, null));
            }
            if (i == 3) {
                return new RecyclerListView.Holder(changeUsernameActivity.new InputCell(changeUsernameActivity.getParentActivity()));
            }
            if (i != 4) {
                return null;
            }
            return new RecyclerListView.Holder(new UsernameCell(changeUsernameActivity.getParentActivity(), changeUsernameActivity.getResourceProvider()) {
                {
                    this.isProfile = true;
                }

                @Override
                public final String getUsernameEditable() {
                    return ChangeUsernameActivity.this.username;
                }
            });
        }
    }

    public final class InputCell extends FrameLayout {
        public final EditTextBoldCursor field;
        public final TextView tme;

        public InputCell(Activity activity) {
            super(activity);
            LinearLayout linearLayout = new LinearLayout(getContext());
            linearLayout.setOrientation(0);
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(getContext());
            this.field = editTextBoldCursor;
            editTextBoldCursor.setTextSize(1, 17.0f);
            editTextBoldCursor.setHintTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteHintText, false));
            int i = Theme.key_windowBackgroundWhiteBlackText;
            editTextBoldCursor.setTextColor(Theme.getColor(null, i, false));
            editTextBoldCursor.setBackgroundDrawable(null);
            editTextBoldCursor.setMaxLines(1);
            editTextBoldCursor.setLines(1);
            editTextBoldCursor.setPadding(0, 0, 0, 0);
            editTextBoldCursor.setSingleLine(true);
            editTextBoldCursor.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            editTextBoldCursor.setInputType(180224);
            editTextBoldCursor.setImeOptions(6);
            editTextBoldCursor.setHint(LocaleController.getString(R.string.UsernameLinkPlaceholder));
            editTextBoldCursor.setCursorColor(Theme.getColor(null, i, false));
            editTextBoldCursor.setCursorSize(AndroidUtilities.dp(19.0f));
            editTextBoldCursor.setCursorWidth(1.5f);
            editTextBoldCursor.setOnEditorActionListener(new ChatActivity$$ExternalSyntheticLambda380(this, 2));
            editTextBoldCursor.setText(ChangeUsernameActivity.this.username);
            editTextBoldCursor.addTextChangedListener(new TextWatcher() {
                @Override
                public final void afterTextChanged(Editable editable) {
                    InputCell inputCell = InputCell.this;
                    boolean zStartsWith = ChangeUsernameActivity.this.username.startsWith("@");
                    ChangeUsernameActivity changeUsernameActivity = ChangeUsernameActivity.this;
                    if (zStartsWith) {
                        changeUsernameActivity.username = changeUsernameActivity.username.substring(1);
                    }
                    if (changeUsernameActivity.username.length() > 0) {
                        String str = "https://" + MessagesController.getInstance(((BaseFragment) changeUsernameActivity).currentAccount).linkPrefix + "/" + changeUsernameActivity.username;
                        String string = LocaleController.formatString("UsernameHelpLink", R.string.UsernameHelpLink, str);
                        int iIndexOf = string.indexOf(str);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                        if (iIndexOf >= 0) {
                            spannableStringBuilder.setSpan(new AboutLinkCell.AnonymousClass5(str, changeUsernameActivity, 3), iIndexOf, str.length() + iIndexOf, 33);
                        }
                    }
                }

                @Override
                public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                    InputCell inputCell = InputCell.this;
                    ChangeUsernameActivity changeUsernameActivity = ChangeUsernameActivity.this;
                    String str = changeUsernameActivity.username;
                    changeUsernameActivity.username = charSequence == null ? "" : charSequence.toString();
                    ChangeUsernameActivity changeUsernameActivity2 = ChangeUsernameActivity.this;
                    UsernameCell usernameCell = changeUsernameActivity2.editableUsernameCell;
                    if (usernameCell == null || str == null) {
                        return;
                    }
                    usernameCell.updateUsername(changeUsernameActivity2.username);
                }

                @Override
                public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                    InputCell inputCell = InputCell.this;
                    ChangeUsernameActivity changeUsernameActivity = ChangeUsernameActivity.this;
                    String str = changeUsernameActivity.username;
                    changeUsernameActivity.username = charSequence == null ? "" : charSequence.toString();
                    ChangeUsernameActivity changeUsernameActivity2 = ChangeUsernameActivity.this;
                    UsernameCell usernameCell = changeUsernameActivity2.editableUsernameCell;
                    if (usernameCell != null && str != null) {
                        usernameCell.updateUsername(changeUsernameActivity2.username);
                    }
                    if (changeUsernameActivity2.ignoreCheck) {
                        return;
                    }
                    changeUsernameActivity2.checkUserName(changeUsernameActivity2.username);
                }
            });
            long j = ChangeUsernameActivity.this.botId;
            if (j != 0) {
                editTextBoldCursor.setEnabled(false);
            }
            TextView textView = new TextView(getContext());
            this.tme = textView;
            textView.setMaxLines(1);
            textView.setLines(1);
            textView.setPadding(0, 0, 0, 0);
            textView.setSingleLine(true);
            textView.setText(ChangeUsernameActivity.this.getMessagesController().linkPrefix + "/");
            textView.setTextSize(1, 17.0f);
            textView.setTextColor(Theme.getColor(null, i, false));
            textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            textView.setTranslationY(-AndroidUtilities.dp(3.0f));
            linearLayout.addView(textView, LayoutHelper.createLinear(-2, -2, 0.0f, 16, 21, 15, 0, 15));
            linearLayout.addView(editTextBoldCursor, LayoutHelper.createLinear(-2, -2, 1.0f, 16, 0, 15, 21, 15));
            addView(linearLayout, LayoutHelper.createFrame(-1, -1, 48));
            if (j != 0) {
                editTextBoldCursor.setAlpha(0.6f);
                textView.setAlpha(0.6f);
            }
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
        }
    }

    public final class TouchHelperCallback extends ItemTouchHelper.Callback {
        public TouchHelperCallback() {
        }

        @Override
        public final void clearView(RecyclerView.ViewHolder viewHolder) {
            View view = viewHolder.itemView;
            Object tag = view.getTag();
            if (tag instanceof Float) {
                float fFloatValue = ((Float) tag).floatValue();
                WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
                ViewCompat.Api21Impl.setElevation(view, fFloatValue);
            }
            view.setTag(null);
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
            View view2 = viewHolder.itemView;
            view2.setPressed(false);
            view2.setTag(R.id.dragging, null);
        }

        @Override
        public final int getMovementFlags(RecyclerListView recyclerListView, RecyclerView.ViewHolder viewHolder) {
            return (viewHolder.mItemViewType == 4 && ((UsernameCell) viewHolder.itemView).active) ? ItemTouchHelper.Callback.makeMovementFlags(3, 0) : ItemTouchHelper.Callback.makeMovementFlags(0, 0);
        }

        @Override
        public final void onChildDraw(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float f, float f2, int i, boolean z) {
            View view = viewHolder.itemView;
            if (z && view.getTag() == null) {
                WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
                Float fValueOf = Float.valueOf(ViewCompat.Api21Impl.getElevation(view));
                int childCount = recyclerView.getChildCount();
                float f3 = 0.0f;
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = recyclerView.getChildAt(i2);
                    if (childAt != view) {
                        float elevation = ViewCompat.Api21Impl.getElevation(childAt);
                        if (elevation > f3) {
                            f3 = elevation;
                        }
                    }
                }
                ViewCompat.Api21Impl.setElevation(view, f3 + 1.0f);
                view.setTag(fValueOf);
            }
            view.setTranslationX(f);
            view.setTranslationY(f2);
        }

        @Override
        public final boolean onMove(RecyclerListView recyclerListView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
            if (viewHolder.mItemViewType != viewHolder2.mItemViewType) {
                return false;
            }
            View view = viewHolder2.itemView;
            if ((view instanceof UsernameCell) && !((UsernameCell) view).active) {
                return false;
            }
            Adapter adapter = ChangeUsernameActivity.this.adapter;
            int adapterPosition = viewHolder.getAdapterPosition();
            int adapterPosition2 = viewHolder2.getAdapterPosition();
            int i = adapterPosition - 4;
            int i2 = adapterPosition2 - 4;
            if (i < ChangeUsernameActivity.this.usernames.size()) {
                ChangeUsernameActivity changeUsernameActivity = ChangeUsernameActivity.this;
                ArrayList arrayList = changeUsernameActivity.usernames;
                if (i2 < arrayList.size()) {
                    if (adapterPosition != adapterPosition2) {
                        changeUsernameActivity.needReorder = true;
                    }
                    TLRPC.TL_username tL_username = (TLRPC.TL_username) arrayList.get(i);
                    arrayList.set(i, (TLRPC.TL_username) arrayList.get(i2));
                    arrayList.set(i2, tL_username);
                    RecyclerView.AdapterDataObservable adapterDataObservable = adapter.mObservable;
                    adapterDataObservable.notifyItemMoved(adapterPosition, adapterPosition2);
                    int size = arrayList.size() + 3;
                    if (adapterPosition == size || adapterPosition2 == size) {
                        adapterDataObservable.notifyItemRangeChanged(adapterPosition, 1, 3);
                        adapterDataObservable.notifyItemRangeChanged(adapterPosition2, 1, 3);
                    }
                }
            }
            return true;
        }

        @Override
        public final void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int i) {
            ChangeUsernameActivity changeUsernameActivity = ChangeUsernameActivity.this;
            if (i == 0) {
                changeUsernameActivity.sendReorder$3();
            } else {
                changeUsernameActivity.listView.cancelClickRunnables(false);
                viewHolder.itemView.setPressed(true);
            }
            if (viewHolder != null) {
                viewHolder.itemView.setTag(R.id.dragging, i == 2 ? Boolean.TRUE : null);
            }
        }

        @Override
        public final void onSwiped(RecyclerView.ViewHolder viewHolder) {
        }
    }

    public abstract class UsernameCell extends FrameLayout {
        public boolean active;
        public final AnimatedFloat activeFloat;
        public final AnimatedTextView activeView;
        public ValueAnimator activeViewTextColorAnimator;
        public float activeViewTextColorT;
        public long botId;
        public TLRPC.TL_username currentUsername;
        public boolean editable;
        public boolean isProfile;
        public final Drawable[] linkDrawables;
        public boolean loading;
        public ValueAnimator loadingAnimator;
        public final CircularProgressDrawable loadingDrawable;
        public float loadingFloat;
        public final ImageView loadingView;
        public final Theme.ResourcesProvider resourcesProvider;
        public boolean useDivider;
        public final AnimatedFloat useDividerAlpha;
        public final SimpleTextView usernameView;

        public UsernameCell(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.isProfile = false;
            this.useDividerAlpha = new AnimatedFloat(300L, this, CubicBezierInterpolator.DEFAULT);
            this.activeFloat = new AnimatedFloat(400L, this, CubicBezierInterpolator.EASE_OUT_QUINT);
            this.resourcesProvider = resourcesProvider;
            setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider));
            SimpleTextView simpleTextView = new SimpleTextView(getContext());
            this.usernameView = simpleTextView;
            simpleTextView.setTextSize(16);
            simpleTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
            simpleTextView.setEllipsizeByGradient(true);
            addView(simpleTextView, LayoutHelper.createFrame(-1, -2.0f, 48, 70.0f, 9.0f, 0.0f, 50.0f));
            ImageView imageView = new ImageView(getContext());
            this.loadingView = imageView;
            CircularProgressDrawable circularProgressDrawable = new CircularProgressDrawable(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(1.35f), Theme.getColor(Theme.key_windowBackgroundWhiteBlueText, resourcesProvider));
            this.loadingDrawable = circularProgressDrawable;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageDrawable(circularProgressDrawable);
            imageView.setAlpha(0.0f);
            imageView.setVisibility(0);
            circularProgressDrawable.setBounds(0, 0, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
            addView(imageView, LayoutHelper.createFrame(14, 14.0f, 48, 70.0f, 35.0f, 0.0f, 0.0f));
            AnimatedTextView animatedTextView = new AnimatedTextView(getContext(), false, true, true);
            this.activeView = animatedTextView;
            animatedTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider));
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT;
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = animatedTextView.drawable;
            animatedTextDrawable.moveAmplitude = 0.4f;
            animatedTextDrawable.animateDuration = 120L;
            animatedTextDrawable.animateWave = 1.0f;
            animatedTextDrawable.animateInterpolator = cubicBezierInterpolator;
            animatedTextView.setTextSize(AndroidUtilities.dp(13.0f));
            addView(animatedTextView, LayoutHelper.createFrame(-1, -2.0f, 48, 70.0f, 23.0f, 0.0f, 0.0f));
            Drawable[] drawableArr = {context.getDrawable(R.drawable.msg_link_1).mutate(), context.getDrawable(R.drawable.msg_link_2).mutate()};
            this.linkDrawables = drawableArr;
            Drawable drawable = drawableArr[0];
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable.setColorFilter(new PorterDuffColorFilter(-1, mode));
            drawableArr[1].setColorFilter(new PorterDuffColorFilter(-1, mode));
            ChangeUsernameActivity.linkBackgroundActive.setColor(Theme.getColor(Theme.key_featuredStickers_addButton, resourcesProvider));
            ChangeUsernameActivity.linkBackgroundInactive.setColor(Theme.getColor(Theme.key_chats_unreadCounterMuted, resourcesProvider));
        }

        public String getUsernameEditable() {
            return null;
        }

        @Override
        public final void onDraw(Canvas canvas) {
            float f;
            float f2;
            super.onDraw(canvas);
            float f3 = this.activeFloat.set(this.active ? 1.0f : 0.0f, false);
            Drawable[] drawableArr = this.linkDrawables;
            if (f3 < 1.0f) {
                canvas.drawCircle(AndroidUtilities.dp(35.0f), AndroidUtilities.dp(29.0f), AndroidUtilities.dp(16.0f), ChangeUsernameActivity.linkBackgroundInactive);
                drawableArr[1].setAlpha((int) ((1.0f - f3) * 255.0f));
                f = 255.0f;
                f2 = 0.0f;
                drawableArr[1].setBounds(zzle.m(AndroidUtilities.dp(35.0f), drawableArr[1]), zzld.m(AndroidUtilities.dp(29.0f), drawableArr[1]), zzlh.m(AndroidUtilities.dp(35.0f), drawableArr[1]), zzlg.m(AndroidUtilities.dp(29.0f), drawableArr[1]));
                drawableArr[1].draw(canvas);
            } else {
                f = 255.0f;
                f2 = 0.0f;
            }
            if (f3 > f2) {
                Paint paint = ChangeUsernameActivity.linkBackgroundActive;
                int i = (int) (f3 * f);
                paint.setAlpha(i);
                canvas.drawCircle(AndroidUtilities.dp(35.0f), AndroidUtilities.dp(29.0f), AndroidUtilities.dp(16.0f) * f3, paint);
                drawableArr[0].setAlpha(i);
                drawableArr[0].setBounds(zzle.m(AndroidUtilities.dp(35.0f), drawableArr[0]), zzld.m(AndroidUtilities.dp(29.0f), drawableArr[0]), zzlh.m(AndroidUtilities.dp(35.0f), drawableArr[0]), zzlg.m(AndroidUtilities.dp(29.0f), drawableArr[0]));
                drawableArr[0].draw(canvas);
            }
            float f4 = this.useDividerAlpha.set(this.useDivider ? 1.0f : 0.0f, false);
            if (f4 > f2) {
                int alpha = Theme.dividerPaint.getAlpha();
                Theme.dividerPaint.setAlpha((int) (alpha * f4));
                canvas.drawRect(AndroidUtilities.dp(70.0f), getHeight() - 1, getWidth(), getHeight(), Theme.dividerPaint);
                Theme.dividerPaint.setAlpha(alpha);
            }
            Paint paint2 = ChangeUsernameActivity.dragPaint;
            paint2.setColor(Theme.getColor(null, Theme.key_stickers_menu, false));
            paint2.setAlpha((int) (paint2.getAlpha() * f3));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(getWidth() - AndroidUtilities.dp(37.0f), AndroidUtilities.dp(25.0f), getWidth() - AndroidUtilities.dp(21.0f), AndroidUtilities.dp(27.0f));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(0.3f), AndroidUtilities.dp(0.3f), paint2);
            rectF.set(getWidth() - AndroidUtilities.dp(37.0f), AndroidUtilities.dp(31.0f), getWidth() - AndroidUtilities.dp(21.0f), AndroidUtilities.dp(33.0f));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(0.3f), AndroidUtilities.dp(0.3f), paint2);
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(58.0f), 1073741824));
        }

        public final void set(TLRPC.TL_username tL_username, boolean z, boolean z2, long j) {
            int i;
            int i2;
            int i3 = 1;
            this.currentUsername = tL_username;
            this.useDivider = z;
            this.botId = j;
            invalidate();
            if (this.currentUsername == null) {
                this.active = false;
                this.editable = false;
                return;
            }
            this.active = tL_username.active;
            this.editable = j == 0 && tL_username.editable;
            updateUsername(tL_username.username);
            boolean z3 = this.isProfile;
            AnimatedTextView animatedTextView = this.activeView;
            if (z3) {
                if (this.editable) {
                    i2 = R.string.UsernameProfileLinkEditable;
                } else {
                    i2 = this.active ? R.string.UsernameProfileLinkActive : R.string.UsernameProfileLinkInactive;
                }
                animatedTextView.setText(LocaleController.getString(i2), z2, !this.active);
            } else {
                if (this.editable) {
                    i = R.string.UsernameLinkEditable;
                } else {
                    i = this.active ? R.string.UsernameLinkActive : R.string.UsernameLinkInactive;
                }
                animatedTextView.setText(LocaleController.getString(i), z2, !this.active);
            }
            boolean z4 = this.active || this.editable;
            ValueAnimator valueAnimator = this.activeViewTextColorAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.activeViewTextColorAnimator = null;
            }
            if (z2) {
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.activeViewTextColorT, z4 ? 1.0f : 0.0f);
                this.activeViewTextColorAnimator = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new ChangeUsernameActivity$UsernameCell$$ExternalSyntheticLambda0(this, i3));
                this.activeViewTextColorAnimator.setDuration(120L);
                this.activeViewTextColorAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT);
                this.activeViewTextColorAnimator.start();
                return;
            }
            this.activeViewTextColorT = z4 ? 1.0f : 0.0f;
            int i4 = Theme.key_windowBackgroundWhiteGrayText2;
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            int iBlendARGB = ColorUtils.blendARGB(this.activeViewTextColorT, Theme.getColor(i4, resourcesProvider), Theme.getColor(Theme.key_windowBackgroundWhiteBlueText, resourcesProvider));
            this.loadingDrawable.paint.setColor(iBlendARGB);
            animatedTextView.setTextColor(iBlendARGB);
        }

        public void setLoading(boolean z) {
            int i = 0;
            if (this.loading != z) {
                this.loading = z;
                ValueAnimator valueAnimator = this.loadingAnimator;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                this.loadingView.setVisibility(0);
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.loadingFloat, z ? 1.0f : 0.0f);
                this.loadingAnimator = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new ChangeUsernameActivity$UsernameCell$$ExternalSyntheticLambda0(this, i));
                this.loadingAnimator.addListener(new ChatActivity.AnonymousClass77(10, this, z));
                this.loadingAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT);
                this.loadingAnimator.setDuration(200L);
                this.loadingAnimator.start();
            }
        }

        public final void updateUsername(String str) {
            if (this.editable) {
                str = getUsernameEditable();
            }
            boolean zIsEmpty = TextUtils.isEmpty(str);
            SimpleTextView simpleTextView = this.usernameView;
            if (!zIsEmpty) {
                simpleTextView.setText("@" + str, false);
            } else {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("@");
                SpannableString spannableString = new SpannableString(LocaleController.getString(R.string.UsernameLinkPlaceholder));
                spannableString.setSpan(new ForegroundColorSpan(Theme.getColor(Theme.key_windowBackgroundWhiteHintText, this.resourcesProvider)), 0, spannableString.length(), 33);
                spannableStringBuilder.append((CharSequence) spannableString);
                simpleTextView.setText(spannableStringBuilder, false);
            }
        }
    }

    public final class UsernameHelpCell extends FrameLayout {
        public static final int $r8$clinit = 0;
        public Integer height;
        public ValueAnimator heightUpdateAnimator;
        public final LinkSpanDrawable.LinksTextView text1View;
        public final CheckBoxCell.AnonymousClass2 text2View;

        public UsernameHelpCell(Activity activity) {
            super(activity);
            ChangeUsernameActivity.this.helpCell = this;
            setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(17.0f));
            setClipChildren(false);
            LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(activity, null);
            this.text1View = linksTextView;
            linksTextView.setTextSize(1, 15.0f);
            int i = Theme.key_windowBackgroundWhiteGrayText8;
            linksTextView.setTextColor(Theme.getColor(null, i, false));
            linksTextView.setGravity(LocaleController.isRTL ? 5 : 3);
            int i2 = Theme.key_windowBackgroundWhiteLinkText;
            linksTextView.setLinkTextColor(Theme.getColor(null, i2, false));
            int i3 = Theme.key_windowBackgroundWhiteLinkSelection;
            linksTextView.setHighlightColor(Theme.getColor(null, i3, false));
            linksTextView.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
            CheckBoxCell.AnonymousClass2 anonymousClass2 = new CheckBoxCell.AnonymousClass2(this, activity, 2);
            ChangeUsernameActivity.this.statusTextView = anonymousClass2;
            this.text2View = anonymousClass2;
            anonymousClass2.setTextSize(1, 15.0f);
            anonymousClass2.setTextColor(Theme.getColor(null, i, false));
            anonymousClass2.setGravity(LocaleController.isRTL ? 5 : 3);
            anonymousClass2.setLinkTextColor(Theme.getColor(null, i2, false));
            anonymousClass2.setHighlightColor(Theme.getColor(null, i3, false));
            anonymousClass2.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
            addView(linksTextView, LayoutHelper.createFrame(-1, -2, 48));
            addView(anonymousClass2, LayoutHelper.createFrame(-1, -2, 48));
            if (ChangeUsernameActivity.this.botId == 0) {
                zzln.m(R.string.UsernameHelp, linksTextView);
                return;
            }
            String string = LocaleController.getString(R.string.BotUsernameHelp);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
            int iIndexOf = string.indexOf(42);
            int iLastIndexOf = string.lastIndexOf(42);
            if (iIndexOf != -1 && iLastIndexOf != -1 && iIndexOf != iLastIndexOf) {
                spannableStringBuilder.replace(iLastIndexOf, iLastIndexOf + 1, (CharSequence) "");
                spannableStringBuilder.replace(iIndexOf, iIndexOf + 1, (CharSequence) "");
                spannableStringBuilder.setSpan(new URLSpanNoUnderline("https://fragment.com", null), iIndexOf, iLastIndexOf - 1, 33);
            }
            linksTextView.setText(spannableStringBuilder);
        }

        @Override
        public final void onMeasure(int i, int i2) {
            Integer num = this.height;
            if (num != null) {
                i2 = View.MeasureSpec.makeMeasureSpec(num.intValue(), 1073741824);
            }
            super.onMeasure(i, i2);
        }

        public final void update() {
            int iDp;
            final float fDp;
            CheckBoxCell.AnonymousClass2 anonymousClass2 = this.text2View;
            if (anonymousClass2.getVisibility() == 0) {
                anonymousClass2.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec(9999999, Integer.MIN_VALUE));
            }
            ValueAnimator valueAnimator = this.heightUpdateAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            Integer num = this.height;
            final int measuredHeight = num == null ? getMeasuredHeight() : num.intValue();
            int iDp2 = AndroidUtilities.dp(27.0f);
            LinkSpanDrawable.LinksTextView linksTextView = this.text1View;
            int height = linksTextView.getHeight() + iDp2;
            if (anonymousClass2.getVisibility() != 0 || TextUtils.isEmpty(anonymousClass2.getText())) {
                iDp = 0;
            } else {
                iDp = AndroidUtilities.dp(8.0f) + anonymousClass2.getMeasuredHeight();
            }
            final int i = height + iDp;
            final float translationY = linksTextView.getTranslationY();
            if (anonymousClass2.getVisibility() != 0 || TextUtils.isEmpty(anonymousClass2.getText())) {
                fDp = 0.0f;
            } else {
                fDp = AndroidUtilities.dp(8.0f) + anonymousClass2.getMeasuredHeight();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.heightUpdateAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    ChangeUsernameActivity.UsernameHelpCell usernameHelpCell = this.f$0;
                    usernameHelpCell.getClass();
                    float fFloatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    usernameHelpCell.text1View.setTranslationY(AndroidUtilities.lerp(translationY, fDp, fFloatValue));
                    usernameHelpCell.height = Integer.valueOf(AndroidUtilities.lerp(measuredHeight, i, fFloatValue));
                    usernameHelpCell.requestLayout();
                }
            });
            this.heightUpdateAnimator.setDuration(200L);
            this.heightUpdateAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            this.heightUpdateAnimator.start();
        }
    }

    public ChangeUsernameActivity(Bundle bundle) {
        super(bundle);
        this.username = "";
        this.notEditableUsernames = new ArrayList();
        this.usernames = new ArrayList();
        this.loadingUsernames = new ArrayList();
        if (bundle != null) {
            this.botId = bundle.getLong("bot_id");
        }
    }

    public final boolean checkUserName(String str) {
        CheckBoxCell.AnonymousClass2 anonymousClass2;
        UsernameHelpCell usernameHelpCell;
        if (str != null && str.startsWith("@")) {
            str = str.substring(1);
        }
        CheckBoxCell.AnonymousClass2 anonymousClass3 = this.statusTextView;
        if (anonymousClass3 != null) {
            anonymousClass3.setVisibility(!TextUtils.isEmpty(str) ? 0 : 8);
            UsernameHelpCell usernameHelpCell2 = this.helpCell;
            if (usernameHelpCell2 != null) {
                int i = UsernameHelpCell.$r8$clinit;
                usernameHelpCell2.update();
            }
        }
        ChatActivity$$ExternalSyntheticLambda7 chatActivity$$ExternalSyntheticLambda7 = this.checkRunnable;
        if (chatActivity$$ExternalSyntheticLambda7 != null) {
            AndroidUtilities.cancelRunOnUIThread(chatActivity$$ExternalSyntheticLambda7);
            this.checkRunnable = null;
            this.lastCheckName = null;
            if (this.checkReqId != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.checkReqId, true);
            }
        }
        if (str == null) {
            if (str != null || str.length() < 4) {
                anonymousClass2 = this.statusTextView;
                if (anonymousClass2 != null) {
                    anonymousClass2.setText(LocaleController.getString(R.string.UsernameInvalidShort));
                    CheckBoxCell.AnonymousClass2 anonymousClass4 = this.statusTextView;
                    int i2 = Theme.key_text_RedRegular;
                    anonymousClass4.setTag(Integer.valueOf(i2));
                    this.statusTextView.setTextColor(Theme.getColor(null, i2, false));
                    usernameHelpCell = this.helpCell;
                    if (usernameHelpCell != null) {
                        int i3 = UsernameHelpCell.$r8$clinit;
                        usernameHelpCell.update();
                    }
                }
            } else {
                if (str.length() <= 32) {
                    long j = this.botId;
                    String str2 = (j != 0 ? MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j)) : UserConfig.getInstance(this.currentAccount).getCurrentUser()).username;
                    if (str2 == null) {
                        str2 = "";
                    }
                    if (str.equals(str2)) {
                        CheckBoxCell.AnonymousClass2 anonymousClass5 = this.statusTextView;
                        if (anonymousClass5 != null) {
                            anonymousClass5.setText(LocaleController.formatString("UsernameAvailable", R.string.UsernameAvailable, str));
                            CheckBoxCell.AnonymousClass2 anonymousClass6 = this.statusTextView;
                            int i4 = Theme.key_windowBackgroundWhiteGreenText;
                            anonymousClass6.setTag(Integer.valueOf(i4));
                            this.statusTextView.setTextColor(Theme.getColor(null, i4, false));
                            UsernameHelpCell usernameHelpCell3 = this.helpCell;
                            if (usernameHelpCell3 != null) {
                                int i5 = UsernameHelpCell.$r8$clinit;
                                usernameHelpCell3.update();
                            }
                        }
                        return true;
                    }
                    CheckBoxCell.AnonymousClass2 anonymousClass7 = this.statusTextView;
                    if (anonymousClass7 != null) {
                        anonymousClass7.setText(LocaleController.getString(R.string.UsernameChecking));
                        CheckBoxCell.AnonymousClass2 anonymousClass8 = this.statusTextView;
                        int i6 = Theme.key_windowBackgroundWhiteGrayText8;
                        anonymousClass8.setTag(Integer.valueOf(i6));
                        this.statusTextView.setTextColor(Theme.getColor(null, i6, false));
                        UsernameHelpCell usernameHelpCell4 = this.helpCell;
                        if (usernameHelpCell4 != null) {
                            int i7 = UsernameHelpCell.$r8$clinit;
                            usernameHelpCell4.update();
                        }
                    }
                    this.lastCheckName = str;
                    ChatActivity$$ExternalSyntheticLambda7 chatActivity$$ExternalSyntheticLambda8 = new ChatActivity$$ExternalSyntheticLambda7(5, this, str);
                    this.checkRunnable = chatActivity$$ExternalSyntheticLambda8;
                    AndroidUtilities.runOnUIThread(chatActivity$$ExternalSyntheticLambda8, 300L);
                    return true;
                }
                CheckBoxCell.AnonymousClass2 anonymousClass9 = this.statusTextView;
                if (anonymousClass9 != null) {
                    anonymousClass9.setText(LocaleController.getString(R.string.UsernameInvalidLong));
                    CheckBoxCell.AnonymousClass2 anonymousClass10 = this.statusTextView;
                    int i8 = Theme.key_text_RedRegular;
                    anonymousClass10.setTag(Integer.valueOf(i8));
                    this.statusTextView.setTextColor(Theme.getColor(null, i8, false));
                    UsernameHelpCell usernameHelpCell5 = this.helpCell;
                    if (usernameHelpCell5 != null) {
                        int i9 = UsernameHelpCell.$r8$clinit;
                        usernameHelpCell5.update();
                        return false;
                    }
                }
            }
        } else if (str.startsWith("_") || str.endsWith("_")) {
            CheckBoxCell.AnonymousClass2 anonymousClass11 = this.statusTextView;
            if (anonymousClass11 != null) {
                anonymousClass11.setText(LocaleController.getString(R.string.UsernameInvalid));
                CheckBoxCell.AnonymousClass2 anonymousClass12 = this.statusTextView;
                int i10 = Theme.key_text_RedRegular;
                anonymousClass12.setTag(Integer.valueOf(i10));
                this.statusTextView.setTextColor(Theme.getColor(null, i10, false));
                UsernameHelpCell usernameHelpCell6 = this.helpCell;
                if (usernameHelpCell6 != null) {
                    int i11 = UsernameHelpCell.$r8$clinit;
                    usernameHelpCell6.update();
                    return false;
                }
            }
        } else {
            for (int i12 = 0; i12 < str.length(); i12++) {
                char cCharAt = str.charAt(i12);
                if (i12 == 0 && cCharAt >= '0' && cCharAt <= '9') {
                    CheckBoxCell.AnonymousClass2 anonymousClass13 = this.statusTextView;
                    if (anonymousClass13 != null) {
                        anonymousClass13.setText(LocaleController.getString(R.string.UsernameInvalidStartNumber));
                        CheckBoxCell.AnonymousClass2 anonymousClass14 = this.statusTextView;
                        int i13 = Theme.key_text_RedRegular;
                        anonymousClass14.setTag(Integer.valueOf(i13));
                        this.statusTextView.setTextColor(Theme.getColor(null, i13, false));
                        UsernameHelpCell usernameHelpCell7 = this.helpCell;
                        if (usernameHelpCell7 != null) {
                            int i14 = UsernameHelpCell.$r8$clinit;
                            usernameHelpCell7.update();
                            return false;
                        }
                    }
                } else if ((cCharAt < '0' || cCharAt > '9') && ((cCharAt < 'a' || cCharAt > 'z') && ((cCharAt < 'A' || cCharAt > 'Z') && cCharAt != '_'))) {
                    CheckBoxCell.AnonymousClass2 anonymousClass15 = this.statusTextView;
                    if (anonymousClass15 != null) {
                        anonymousClass15.setText(LocaleController.getString(R.string.UsernameInvalid));
                        CheckBoxCell.AnonymousClass2 anonymousClass16 = this.statusTextView;
                        int i15 = Theme.key_text_RedRegular;
                        anonymousClass16.setTag(Integer.valueOf(i15));
                        this.statusTextView.setTextColor(Theme.getColor(null, i15, false));
                        UsernameHelpCell usernameHelpCell8 = this.helpCell;
                        if (usernameHelpCell8 != null) {
                            int i16 = UsernameHelpCell.$r8$clinit;
                            usernameHelpCell8.update();
                            return false;
                        }
                    }
                }
            }
            if (str != null) {
                anonymousClass2 = this.statusTextView;
                if (anonymousClass2 != null) {
                    anonymousClass2.setText(LocaleController.getString(R.string.UsernameInvalidShort));
                    CheckBoxCell.AnonymousClass2 anonymousClass17 = this.statusTextView;
                    int i17 = Theme.key_text_RedRegular;
                    anonymousClass17.setTag(Integer.valueOf(i17));
                    this.statusTextView.setTextColor(Theme.getColor(null, i17, false));
                    usernameHelpCell = this.helpCell;
                    if (usernameHelpCell != null) {
                        int i18 = UsernameHelpCell.$r8$clinit;
                        usernameHelpCell.update();
                    }
                }
            } else {
                anonymousClass2 = this.statusTextView;
                if (anonymousClass2 != null) {
                    anonymousClass2.setText(LocaleController.getString(R.string.UsernameInvalidShort));
                    CheckBoxCell.AnonymousClass2 anonymousClass18 = this.statusTextView;
                    int i19 = Theme.key_text_RedRegular;
                    anonymousClass18.setTag(Integer.valueOf(i19));
                    this.statusTextView.setTextColor(Theme.getColor(null, i19, false));
                    usernameHelpCell = this.helpCell;
                    if (usernameHelpCell != null) {
                        int i110 = UsernameHelpCell.$r8$clinit;
                        usernameHelpCell.update();
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final View createView(Context context) {
        String str;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.Username));
        this.actionBar.setActionBarMenuOnItemClick(new CallLogActivity.AnonymousClass1(this, 18));
        this.doneButton = this.actionBar.createMenu().addItemWithWidth(1, R.drawable.ic_ab_done, LocaleController.getString(R.string.Done), AndroidUtilities.dp(56.0f));
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(getUserId()));
        if (user == null) {
            long j = this.botId;
            int i = this.currentAccount;
            user = j != 0 ? MessagesController.getInstance(i).getUser(Long.valueOf(j)) : UserConfig.getInstance(i).getCurrentUser();
        }
        if (user != null) {
            this.username = null;
            if (user.usernames != null) {
                for (int i2 = 0; i2 < user.usernames.size(); i2++) {
                    TLRPC.TL_username tL_username = user.usernames.get(i2);
                    if (tL_username != null && tL_username.editable) {
                        this.username = tL_username.username;
                        break;
                    }
                }
            }
            if (this.username == null && (str = user.username) != null) {
                this.username = str;
            }
            if (this.username == null) {
                this.username = "";
            }
            this.notEditableUsernames.clear();
            ArrayList arrayList = this.usernames;
            arrayList.clear();
            for (int i3 = 0; i3 < user.usernames.size(); i3++) {
                if (user.usernames.get(i3).active) {
                    arrayList.add(user.usernames.get(i3));
                }
            }
            for (int i4 = 0; i4 < user.usernames.size(); i4++) {
                if (!user.usernames.get(i4).active) {
                    arrayList.add(user.usernames.get(i4));
                }
            }
        }
        this.fragmentView = new FrameLayout(context);
        RecyclerListView recyclerListView = new RecyclerListView(context, null);
        this.listView = recyclerListView;
        recyclerListView.setSections();
        this.actionBar.setAdaptiveBackground(this.listView);
        this.fragmentView.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundGray));
        zzku.m(this.listView);
        RecyclerListView recyclerListView2 = this.listView;
        Adapter adapter = new Adapter();
        this.adapter = adapter;
        recyclerListView2.setAdapter(adapter);
        this.listView.setSelectorDrawableColor(getThemedColor(Theme.key_listSelector));
        new ItemTouchHelper(new TouchHelperCallback()).attachToRecyclerView(this.listView);
        ((FrameLayout) this.fragmentView).addView(this.listView, LayoutHelper.createFrame(-1.0f, -1));
        this.fragmentView.setOnTouchListener(new ArticleViewer$$ExternalSyntheticLambda23(5));
        this.listView.setOnItemClickListener(new AnonymousClass2());
        AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda174(this, 5), 40L);
        return this.fragmentView;
    }

    public final void focusUsernameField(boolean z) {
        InputCell inputCell = this.inputCell;
        if (inputCell != null) {
            if (!inputCell.field.isFocused()) {
                EditTextBoldCursor editTextBoldCursor = this.inputCell.field;
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
            }
            this.inputCell.field.requestFocus();
            if (z) {
                AndroidUtilities.showKeyboard(this.inputCell.field);
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ThemeDescription(this.fragmentView, 1, null, null, null, null, Theme.key_windowBackgroundWhite));
        arrayList.add(new ThemeDescription(this.actionBar, 64, null, null, null, null, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(this.actionBar, 128, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.actionBar, 256, null, null, null, null, Theme.key_actionBarDefaultSelector));
        return arrayList;
    }

    public final long getUserId() {
        long j = this.botId;
        return j != 0 ? j : UserConfig.getInstance(this.currentAccount).getClientUserId();
    }

    public final void lambda$checkUserName$5(String str) {
        TL_account.checkUsername checkusername = new TL_account.checkUsername();
        checkusername.username = str;
        this.checkReqId = ConnectionsManager.getInstance(this.currentAccount).sendRequest(checkusername, new BoostsActivity$$ExternalSyntheticLambda7(this, str, checkusername, 5), 2);
    }

    public final void lambda$saveName$11(int i) {
        ConnectionsManager.getInstance(this.currentAccount).cancelRequest(i, true);
    }

    public final void lambda$saveName$6(AlertDialog alertDialog, TLRPC.User user) {
        try {
            alertDialog.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
        }
        ArrayList<TLRPC.User> arrayList = new ArrayList<>();
        arrayList.add(user);
        MessagesController.getInstance(this.currentAccount).putUsers(arrayList, false);
        MessagesStorage.getInstance(this.currentAccount).putUsersAndChats(arrayList, null, false, true);
        UserConfig.getInstance(this.currentAccount).saveConfig(true);
        finishFragment();
    }

    public final void lambda$saveName$9(AlertDialog alertDialog, TLRPC.TL_error tL_error, TL_account.updateUsername updateusername) {
        try {
            alertDialog.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
        }
        AlertsCreator.processError(this.currentAccount, tL_error, this, updateusername, new Object[0]);
        shakeIfOff();
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (MessagesController.getGlobalMainSettings().getBoolean("view_animations", true)) {
            return;
        }
        focusUsernameField(false);
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (z) {
            focusUsernameField(false);
        }
    }

    public final void saveName$1() {
        int i = 1;
        long j = this.botId;
        if (j != 0) {
            finishFragment();
            return;
        }
        if (this.username.startsWith("@")) {
            this.username = this.username.substring(1);
        }
        if (!this.username.isEmpty() && !checkUserName(this.username)) {
            shakeIfOff();
            return;
        }
        int i2 = this.currentAccount;
        TLRPC.User user = j != 0 ? MessagesController.getInstance(i2).getUser(Long.valueOf(j)) : UserConfig.getInstance(i2).getCurrentUser();
        if (getParentActivity() == null || user == null) {
            return;
        }
        String publicUsername = UserObject.getPublicUsername(user);
        if (publicUsername == null) {
            publicUsername = "";
        }
        if (publicUsername.equals(this.username)) {
            finishFragment();
            return;
        }
        AlertDialog alertDialog = new AlertDialog(getParentActivity(), 3, null);
        TL_account.updateUsername updateusername = new TL_account.updateUsername();
        updateusername.username = this.username;
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
        int iSendRequest = ConnectionsManager.getInstance(this.currentAccount).sendRequest(updateusername, new BoostsActivity$$ExternalSyntheticLambda7(this, alertDialog, updateusername, 6), 2);
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(iSendRequest, this.classGuid);
        alertDialog.setOnCancelListener(new ChatEditActivity$$ExternalSyntheticLambda52(this, iSendRequest, i));
        alertDialog.show();
    }

    public final void sendReorder$3() {
        ArrayList arrayList;
        ArrayList arrayList2;
        TLObject tLObject;
        if (this.needReorder) {
            this.needReorder = false;
            ArrayList<String> arrayList3 = new ArrayList<>();
            int i = 0;
            while (true) {
                arrayList = this.notEditableUsernames;
                if (i >= arrayList.size()) {
                    break;
                }
                if (((TLRPC.TL_username) arrayList.get(i)).active) {
                    arrayList3.add(((TLRPC.TL_username) arrayList.get(i)).username);
                }
                i++;
            }
            int i2 = 0;
            while (true) {
                arrayList2 = this.usernames;
                if (i2 >= arrayList2.size()) {
                    break;
                }
                if (((TLRPC.TL_username) arrayList2.get(i2)).active) {
                    arrayList3.add(((TLRPC.TL_username) arrayList2.get(i2)).username);
                }
                i2++;
            }
            long j = this.botId;
            if (j == 0) {
                TL_account.reorderUsernames reorderusernames = new TL_account.reorderUsernames();
                reorderusernames.order = arrayList3;
                tLObject = reorderusernames;
            } else {
                TL_bots.reorderUsernames reorderusernames2 = new TL_bots.reorderUsernames();
                reorderusernames2.bot = MessagesController.getInstance(this.currentAccount).getInputUser(j);
                reorderusernames2.order = arrayList3;
                tLObject = reorderusernames2;
            }
            getConnectionsManager().sendRequest(tLObject, new PassportActivity$$ExternalSyntheticLambda1(5));
            ArrayList<TLRPC.TL_username> arrayList4 = new ArrayList<>();
            arrayList4.addAll(arrayList);
            arrayList4.addAll(arrayList2);
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(getUserId()));
            user.usernames = arrayList4;
            MessagesController.getInstance(this.currentAccount).putUser(user, false, true);
        }
    }

    public final void shakeIfOff() {
        if (this.listView == null) {
            return;
        }
        for (int i = 0; i < this.listView.getChildCount(); i++) {
            View childAt = this.listView.getChildAt(i);
            if ((childAt instanceof HeaderCell) && i == 0) {
                AndroidUtilities.shakeViewSpring(((HeaderCell) childAt).getTextView());
            } else if (childAt instanceof UsernameHelpCell) {
                AndroidUtilities.shakeViewSpring(childAt);
            } else if (childAt instanceof InputCell) {
                InputCell inputCell = (InputCell) childAt;
                AndroidUtilities.shakeViewSpring(inputCell.field);
                AndroidUtilities.shakeViewSpring(inputCell.tme);
            }
        }
        BotWebViewVibrationEffect.APP_ERROR.vibrate();
    }

    public final void toggleUsername(TLRPC.TL_username tL_username, boolean z, boolean z2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.usernames;
            if (i >= arrayList.size()) {
                return;
            }
            if (arrayList.get(i) == tL_username) {
                toggleUsername(i + 4, z, z2);
                return;
            }
            i++;
        }
    }

    public final void toggleUsername(int i, boolean z, boolean z2) {
        TLRPC.TL_username tL_username;
        int iMin;
        int i2 = i - 4;
        if (i2 >= 0) {
            ArrayList arrayList = this.usernames;
            if (i2 < arrayList.size() && (tL_username = (TLRPC.TL_username) arrayList.get(i2)) != null) {
                tL_username.active = z;
                int i3 = -1;
                if (z) {
                    int i4 = 0;
                    while (true) {
                        if (i4 >= arrayList.size()) {
                            i4 = -1;
                            break;
                        } else if (!((TLRPC.TL_username) arrayList.get(i4)).active) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                    if (i4 >= 0) {
                        iMin = Math.max(0, i4 - 1);
                        i3 = iMin + 4;
                    }
                } else {
                    int i5 = -1;
                    for (int i6 = 0; i6 < arrayList.size(); i6++) {
                        if (((TLRPC.TL_username) arrayList.get(i6)).active) {
                            i5 = i6;
                        }
                    }
                    if (i5 >= 0) {
                        iMin = Math.min(arrayList.size() - 1, i5 + 1);
                        i3 = iMin + 4;
                    }
                }
                if (this.listView != null) {
                    for (int i7 = 0; i7 < this.listView.getChildCount(); i7++) {
                        View childAt = this.listView.getChildAt(i7);
                        this.listView.getClass();
                        if (RecyclerView.getChildAdapterPosition(childAt) == i) {
                            if (z2) {
                                AndroidUtilities.shakeView(childAt);
                            }
                            if (!(childAt instanceof UsernameCell)) {
                                break;
                            }
                            UsernameCell usernameCell = (UsernameCell) childAt;
                            usernameCell.setLoading(this.loadingUsernames.contains(tL_username.username));
                            TLRPC.TL_username tL_username2 = usernameCell.currentUsername;
                            if (tL_username2 == null) {
                                break;
                            }
                            usernameCell.set(tL_username2, usernameCell.useDivider, true, usernameCell.botId);
                            break;
                        }
                    }
                }
                if (i3 < 0 || i == i3) {
                    return;
                }
                Adapter adapter = this.adapter;
                int i8 = i3 - 4;
                if (i2 < ChangeUsernameActivity.this.usernames.size()) {
                    ArrayList arrayList2 = ChangeUsernameActivity.this.usernames;
                    if (i8 >= arrayList2.size()) {
                        return;
                    }
                    arrayList2.add(i8, (TLRPC.TL_username) arrayList2.remove(i2));
                    adapter.mObservable.notifyItemMoved(i, i3);
                    for (int i9 = 0; i9 < arrayList2.size(); i9++) {
                        adapter.notifyItemChanged(i9 + 4);
                    }
                }
            }
        }
    }
}
