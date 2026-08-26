package org.telegram.ui;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.util.Log;
import com.google.android.gms.internal.mlkit_vision_common.zzkf;
import com.google.android.gms.internal.mlkit_vision_common.zzku;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ChatsWidgetProvider;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.ContactsWidgetProvider;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.ChatActionCell;
import org.telegram.ui.Cells.GroupCreateUserCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackgroundGradientDrawable;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.ForegroundColorSpanThemable;
import org.telegram.ui.Components.InviteMembersBottomSheet;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.MotionBackgroundDrawable;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.VideoEditTextureView$$ExternalSyntheticLambda1;

public final class EditWidgetActivity extends BaseFragment {
    public int chatsEndRow;
    public int chatsStartRow;
    public final int currentWidgetId;
    public EditWidgetActivityDelegate delegate;
    public int infoRow;
    public ItemTouchHelper itemTouchHelper;
    public ListAdapter listAdapter;
    public RecyclerListView listView;
    public ImageView previewImageView;
    public int rowCount;
    public int selectChatsRow;
    public final ArrayList selectedDialogs;
    public WidgetPreviewCell widgetPreviewCell;
    public final int widgetType;

    public interface EditWidgetActivityDelegate {
        void didSelectDialogs();
    }

    public final class ListAdapter extends RecyclerListView.SelectionAdapter {
        public final Context mContext;

        public ListAdapter(Context context) {
            this.mContext = context;
        }

        @Override
        public final int getItemCount() {
            return EditWidgetActivity.this.rowCount;
        }

        @Override
        public final int getItemViewType(int i) {
            if (i == 0) {
                return 2;
            }
            EditWidgetActivity editWidgetActivity = EditWidgetActivity.this;
            if (i == editWidgetActivity.selectChatsRow) {
                return 1;
            }
            return i == editWidgetActivity.infoRow ? 0 : 3;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int i = viewHolder.mItemViewType;
            return i == 1 || i == 3;
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            boolean z;
            int i2 = viewHolder.mItemViewType;
            EditWidgetActivity editWidgetActivity = EditWidgetActivity.this;
            View view = viewHolder.itemView;
            if (i2 == 0) {
                TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) view;
                if (i == editWidgetActivity.infoRow) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    int i3 = editWidgetActivity.widgetType;
                    if (i3 == 0) {
                        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.EditWidgetChatsInfo));
                    } else if (i3 == 1) {
                        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.EditWidgetContactsInfo));
                    }
                    if (SharedConfig.passcodeHash.length() > 0) {
                        spannableStringBuilder.append((CharSequence) "\n\n").append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.WidgetPasscode2)));
                    }
                    textInfoPrivacyCell.setText(spannableStringBuilder);
                    return;
                }
                return;
            }
            if (i2 == 1) {
                TextCell textCell = (TextCell) view;
                textCell.setColors(-1, Theme.key_windowBackgroundWhiteBlueText4);
                Context context = this.mContext;
                Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
                Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
                int color = Theme.getColor(null, Theme.key_switchTrackChecked, false);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                drawable.setColorFilter(new PorterDuffColorFilter(color, mode));
                drawable2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_checkboxCheck, false), mode));
                textCell.setTextAndIcon(LocaleController.getString(R.string.SelectChats), new CombinedDrawable(drawable, drawable2), editWidgetActivity.chatsStartRow != -1);
                textCell.getImageView().setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
                return;
            }
            if (i2 != 3) {
                return;
            }
            GroupCreateUserCell groupCreateUserCell = (GroupCreateUserCell) view;
            Long l = (Long) editWidgetActivity.selectedDialogs.get(i - editWidgetActivity.chatsStartRow);
            long jLongValue = l.longValue();
            if (DialogObject.isUserDialog(jLongValue)) {
                TLRPC.User user = editWidgetActivity.getMessagesController().getUser(l);
                z = i != editWidgetActivity.chatsEndRow - 1;
                groupCreateUserCell.setObject(user, null, null);
                groupCreateUserCell.drawDivider = z;
                return;
            }
            TLRPC.Chat chat = editWidgetActivity.getMessagesController().getChat(Long.valueOf(-jLongValue));
            z = i != editWidgetActivity.chatsEndRow - 1;
            groupCreateUserCell.setObject(chat, null, null);
            groupCreateUserCell.drawDivider = z;
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View view;
            Context context = this.mContext;
            if (i == 0) {
                TextInfoPrivacyCell textInfoPrivacyCell = new TextInfoPrivacyCell(context, 24, null);
                textInfoPrivacyCell.setBackgroundDrawable(Theme.getThemedDrawableByKey(context, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
                view = textInfoPrivacyCell;
            } else if (i == 1) {
                TextCell textCell = new TextCell(context);
                textCell.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                view = textCell;
            } else if (i != 2) {
                GroupCreateUserCell groupCreateUserCell = new GroupCreateUserCell(0, 0, this.mContext, null, false, false);
                ImageView imageView = new ImageView(context);
                imageView.setImageResource(R.drawable.list_reorder);
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                groupCreateUserCell.setTag(R.id.object_tag, imageView);
                groupCreateUserCell.addView(imageView, LayoutHelper.createFrame(40, -1.0f, (LocaleController.isRTL ? 3 : 5) | 16, 10.0f, 0.0f, 10.0f, 0.0f));
                imageView.setOnTouchListener(new PassportActivity$$ExternalSyntheticLambda22(6, this, groupCreateUserCell));
                imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_chats_pinnedIcon, false), PorterDuff.Mode.MULTIPLY));
                view = groupCreateUserCell;
            } else {
                EditWidgetActivity editWidgetActivity = EditWidgetActivity.this;
                WidgetPreviewCell widgetPreviewCell = editWidgetActivity.new WidgetPreviewCell(context);
                editWidgetActivity.widgetPreviewCell = widgetPreviewCell;
                view = widgetPreviewCell;
            }
            return new RecyclerListView.Holder(view);
        }

        @Override
        public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
            int i = viewHolder.mItemViewType;
            if (i == 3 || i == 1) {
                viewHolder.itemView.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
            }
        }
    }

    public final class TouchHelperCallback extends ItemTouchHelper.Callback {
        public boolean moved;

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
            viewHolder.itemView.setPressed(false);
        }

        @Override
        public final int getMovementFlags(RecyclerListView recyclerListView, RecyclerView.ViewHolder viewHolder) {
            return viewHolder.mItemViewType != 3 ? ItemTouchHelper.Callback.makeMovementFlags(0, 0) : ItemTouchHelper.Callback.makeMovementFlags(3, 0);
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
            int adapterPosition = viewHolder.getAdapterPosition();
            int adapterPosition2 = viewHolder2.getAdapterPosition();
            EditWidgetActivity editWidgetActivity = EditWidgetActivity.this;
            ListAdapter listAdapter = editWidgetActivity.listAdapter;
            EditWidgetActivity editWidgetActivity2 = EditWidgetActivity.this;
            int i = editWidgetActivity2.chatsStartRow;
            int i2 = adapterPosition - i;
            int i3 = adapterPosition2 - i;
            int i4 = editWidgetActivity2.chatsEndRow - i;
            if (i2 >= 0 && i3 >= 0 && i2 < i4 && i3 < i4) {
                Long l = (Long) editWidgetActivity2.selectedDialogs.get(i2);
                ArrayList arrayList = EditWidgetActivity.this.selectedDialogs;
                arrayList.set(i2, (Long) arrayList.get(i3));
                arrayList.set(i3, l);
                listAdapter.mObservable.notifyItemMoved(adapterPosition, adapterPosition2);
                ((GroupCreateUserCell) viewHolder.itemView).setDrawDivider(adapterPosition2 != editWidgetActivity.chatsEndRow - 1);
                ((GroupCreateUserCell) viewHolder2.itemView).setDrawDivider(adapterPosition != editWidgetActivity.chatsEndRow - 1);
                this.moved = true;
            }
            return true;
        }

        @Override
        public final void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int i) {
            EditWidgetActivity editWidgetActivity = EditWidgetActivity.this;
            if (i != 0) {
                editWidgetActivity.listView.cancelClickRunnables(false);
                viewHolder.itemView.setPressed(true);
            } else if (this.moved) {
                WidgetPreviewCell widgetPreviewCell = editWidgetActivity.widgetPreviewCell;
                if (widgetPreviewCell != null) {
                    widgetPreviewCell.updateDialogs();
                }
                this.moved = false;
            }
        }

        @Override
        public final void onSwiped(RecyclerView.ViewHolder viewHolder) {
        }
    }

    public final class WidgetPreviewCell extends FrameLayout {
        public Drawable backgroundDrawable;
        public BackgroundGradientDrawable.Disposable backgroundGradientDisposable;
        public RectF bitmapRect;
        public final ViewGroup[] cells;
        public Drawable oldBackgroundDrawable;
        public BackgroundGradientDrawable.Disposable oldBackgroundGradientDisposable;
        public Paint roundPaint;
        public final Drawable shadowDrawable;

        public WidgetPreviewCell(Context context) {
            super(context);
            this.roundPaint = new Paint(1);
            this.bitmapRect = new RectF();
            this.cells = new ViewGroup[2];
            int i = 0;
            setWillNotDraw(false);
            setPadding(0, AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f));
            LinearLayout linearLayoutM = zzkf.m(context, 1);
            addView(linearLayoutM, LayoutHelper.createFrame(-2, -2, 17));
            ChatActionCell chatActionCell = new ChatActionCell(context, null, false);
            chatActionCell.setCustomText(LocaleController.getString(R.string.WidgetPreview));
            linearLayoutM.addView(chatActionCell, LayoutHelper.createLinear(-2, -2, 17, 0, 0, 0, 4));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setBackgroundResource(R.drawable.widget_bg);
            linearLayoutM.addView(linearLayout, LayoutHelper.createLinear(-2, -2, 17, 10, 0, 10, 0));
            EditWidgetActivity.this.previewImageView = new ImageView(context);
            int i2 = EditWidgetActivity.this.widgetType;
            if (i2 == 0) {
                while (i < 2) {
                    this.cells[i] = (ViewGroup) EditWidgetActivity.this.getParentActivity().getLayoutInflater().inflate(R.layout.shortcut_widget_item, (ViewGroup) null);
                    linearLayout.addView(this.cells[i], LayoutHelper.createLinear(-1, -2));
                    i++;
                }
                linearLayout.addView(EditWidgetActivity.this.previewImageView, LayoutHelper.createLinear(218, 160, 17));
                EditWidgetActivity.this.previewImageView.setImageResource(R.drawable.chats_widget_preview);
            } else if (i2 == 1) {
                while (i < 2) {
                    this.cells[i] = (ViewGroup) EditWidgetActivity.this.getParentActivity().getLayoutInflater().inflate(R.layout.contacts_widget_item, (ViewGroup) null);
                    linearLayout.addView(this.cells[i], LayoutHelper.createLinear(160, -2));
                    i++;
                }
                linearLayout.addView(EditWidgetActivity.this.previewImageView, LayoutHelper.createLinear(160, 160, 17));
                EditWidgetActivity.this.previewImageView.setImageResource(R.drawable.contacts_widget_preview);
            }
            updateDialogs();
            this.shadowDrawable = Theme.getThemedDrawableByKey(context, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow);
        }

        @Override
        public final void dispatchSetPressed(boolean z) {
        }

        @Override
        public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        @Override
        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            BackgroundGradientDrawable.Disposable disposable = this.backgroundGradientDisposable;
            if (disposable != null) {
                disposable.dispose();
                this.backgroundGradientDisposable = null;
            }
            BackgroundGradientDrawable.Disposable disposable2 = this.oldBackgroundGradientDisposable;
            if (disposable2 != null) {
                disposable2.dispose();
                this.oldBackgroundGradientDisposable = null;
            }
        }

        @Override
        public final void onDraw(Canvas canvas) {
            Drawable drawable = Theme.themedWallpaper;
            if (drawable == null) {
                drawable = Theme.wallpaper;
            }
            Drawable drawable2 = this.backgroundDrawable;
            if (drawable != drawable2 && drawable != null) {
                if (Theme.animatingColors != null) {
                    this.oldBackgroundDrawable = drawable2;
                    this.oldBackgroundGradientDisposable = this.backgroundGradientDisposable;
                } else {
                    BackgroundGradientDrawable.Disposable disposable = this.backgroundGradientDisposable;
                    if (disposable != null) {
                        disposable.dispose();
                        this.backgroundGradientDisposable = null;
                    }
                }
                this.backgroundDrawable = drawable;
            }
            EditWidgetActivity editWidgetActivity = EditWidgetActivity.this;
            float themeAnimationValue = ((ActionBarLayout) ((BaseFragment) editWidgetActivity).parentLayout).getThemeAnimationValue();
            int i = 0;
            while (i < 2) {
                Drawable drawable3 = i == 0 ? this.oldBackgroundDrawable : this.backgroundDrawable;
                if (drawable3 != null) {
                    if (i != 1 || this.oldBackgroundDrawable == null || ((BaseFragment) editWidgetActivity).parentLayout == null) {
                        drawable3.setAlpha(255);
                    } else {
                        drawable3.setAlpha((int) (255.0f * themeAnimationValue));
                    }
                    if ((drawable3 instanceof ColorDrawable) || (drawable3 instanceof GradientDrawable) || (drawable3 instanceof MotionBackgroundDrawable)) {
                        drawable3.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                        if (drawable3 instanceof BackgroundGradientDrawable) {
                            this.backgroundGradientDisposable = ((BackgroundGradientDrawable) drawable3).drawExactBoundsSize(canvas, this);
                        } else {
                            drawable3.draw(canvas);
                        }
                    } else if (drawable3 instanceof BitmapDrawable) {
                        if (((BitmapDrawable) drawable3).getTileModeX() == Shader.TileMode.REPEAT) {
                            canvas.save();
                            float f = 2.0f / AndroidUtilities.density;
                            canvas.scale(f, f);
                            drawable3.setBounds(0, 0, (int) Math.ceil(getMeasuredWidth() / f), (int) Math.ceil(getMeasuredHeight() / f));
                        } else {
                            int measuredHeight = getMeasuredHeight();
                            float fMax = Math.max(getMeasuredWidth() / drawable3.getIntrinsicWidth(), measuredHeight / drawable3.getIntrinsicHeight());
                            int iCeil = (int) Math.ceil(drawable3.getIntrinsicWidth() * fMax);
                            int iCeil2 = (int) Math.ceil(drawable3.getIntrinsicHeight() * fMax);
                            int measuredWidth = (getMeasuredWidth() - iCeil) / 2;
                            int i2 = (measuredHeight - iCeil2) / 2;
                            canvas.save();
                            canvas.clipRect(0, 0, iCeil, getMeasuredHeight());
                            drawable3.setBounds(measuredWidth, i2, iCeil + measuredWidth, iCeil2 + i2);
                        }
                        drawable3.draw(canvas);
                        canvas.restore();
                    }
                    if (i == 0 && this.oldBackgroundDrawable != null && themeAnimationValue >= 1.0f) {
                        BackgroundGradientDrawable.Disposable disposable2 = this.oldBackgroundGradientDisposable;
                        if (disposable2 != null) {
                            disposable2.dispose();
                            this.oldBackgroundGradientDisposable = null;
                        }
                        this.oldBackgroundDrawable = null;
                        invalidate();
                    }
                }
                i++;
            }
            int measuredWidth2 = getMeasuredWidth();
            int measuredHeight2 = getMeasuredHeight();
            Drawable drawable4 = this.shadowDrawable;
            drawable4.setBounds(0, 0, measuredWidth2, measuredHeight2);
            drawable4.draw(canvas);
        }

        @Override
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(264.0f), 1073741824));
        }

        @Override
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        public final void updateDialogs() {
            EditWidgetActivity editWidgetActivity;
            TLRPC.Dialog tL_dialog;
            TLRPC.Dialog dialog;
            String string;
            TLRPC.Chat chat;
            TLRPC.User user;
            TLRPC.FileLocation fileLocation;
            Bitmap bitmapDecodeFile;
            int i;
            int i2;
            String str;
            int i3;
            int i4;
            int i5;
            AvatarDrawable avatarDrawable;
            TLRPC.UserProfilePhoto userProfilePhoto;
            ?? r4;
            int i6;
            EditWidgetActivity editWidgetActivity2;
            String str2;
            Object obj;
            Bitmap bitmap;
            String str3;
            ?? r5;
            ?? r0;
            TLRPC.FileLocation fileLocation2;
            ?? r9;
            Object obj2;
            char c;
            Bitmap bitmapDecodeFile2;
            ArrayList arrayList;
            ?? r6;
            EditWidgetActivity editWidgetActivity3;
            String str4;
            String str5;
            int i7;
            long fromChatId;
            Object chat2;
            ?? user2;
            int color;
            String str6;
            TLRPC.MessageMedia messageMedia;
            CharSequence charSequenceM;
            String str7;
            String strReplace;
            String string2;
            String str8;
            SpannableStringBuilder spannableStringBuilderValueOf;
            SpannableStringBuilder spannableStringBuilderValueOf2;
            String string3;
            CharSequence charSequence;
            TLRPC.MessageAction messageAction;
            ?? avatarDrawable2;
            ?? avatarDrawable3;
            String string4;
            TLRPC.UserProfilePhoto userProfilePhoto2;
            TLRPC.FileLocation fileLocation3;
            String str9 = " - ";
            EditWidgetActivity editWidgetActivity4 = EditWidgetActivity.this;
            int i8 = editWidgetActivity4.widgetType;
            int i9 = 12;
            int i10 = 8;
            int i11 = 2;
            ?? r14 = 1;
            Bitmap bitmap2 = null;
            ViewGroup[] viewGroupArr = this.cells;
            if (i8 != 0) {
                editWidgetActivity = editWidgetActivity4;
                if (i8 == 1) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= 2) {
                            break;
                        }
                        int i13 = 0;
                        for (int i14 = 2; i13 < i14; i14 = 2) {
                            int i15 = (i12 * 2) + i13;
                            EditWidgetActivity editWidgetActivity5 = editWidgetActivity;
                            if (editWidgetActivity5.selectedDialogs.isEmpty()) {
                                if (i15 < editWidgetActivity5.getMediaDataController().hints.size()) {
                                    long j = editWidgetActivity5.getMediaDataController().hints.get(i15).peer.user_id;
                                    tL_dialog = (TLRPC.Dialog) editWidgetActivity5.getMessagesController().dialogs_dict.get(j);
                                    if (tL_dialog == null) {
                                        tL_dialog = new TLRPC.TL_dialog();
                                        tL_dialog.id = j;
                                    }
                                    dialog = tL_dialog;
                                } else {
                                    dialog = null;
                                }
                            } else if (i15 < editWidgetActivity5.selectedDialogs.size()) {
                                tL_dialog = (TLRPC.Dialog) editWidgetActivity5.getMessagesController().dialogs_dict.get(((Long) editWidgetActivity5.selectedDialogs.get(i15)).longValue());
                                if (tL_dialog == null) {
                                    tL_dialog = new TLRPC.TL_dialog();
                                    tL_dialog.id = ((Long) editWidgetActivity5.selectedDialogs.get(i15)).longValue();
                                }
                                dialog = tL_dialog;
                            } else {
                                dialog = null;
                            }
                            if (dialog == null) {
                                viewGroupArr[i12].findViewById(i13 == 0 ? R.id.contacts_widget_item1 : R.id.contacts_widget_item2).setVisibility(4);
                                if (i15 == 0 || i15 == 2) {
                                    viewGroupArr[i12].setVisibility(8);
                                }
                            } else {
                                viewGroupArr[i12].findViewById(i13 == 0 ? R.id.contacts_widget_item1 : R.id.contacts_widget_item2).setVisibility(0);
                                if (i15 == 0 || i15 == 2) {
                                    viewGroupArr[i12].setVisibility(0);
                                }
                                if (DialogObject.isUserDialog(dialog.id)) {
                                    user = editWidgetActivity5.getMessagesController().getUser(Long.valueOf(dialog.id));
                                    if (UserObject.isUserSelf(user)) {
                                        string = LocaleController.getString(R.string.SavedMessages);
                                    } else if (UserObject.isReplyUser(user)) {
                                        string = LocaleController.getString(R.string.RepliesTitle);
                                    } else {
                                        string = UserObject.isDeleted(user) ? LocaleController.getString(R.string.HiddenName) : UserObject.getFirstName(user);
                                    }
                                    if (UserObject.isReplyUser(user) || UserObject.isUserSelf(user) || user == null || (userProfilePhoto = user.photo) == null || (fileLocation = userProfilePhoto.photo_small) == null || fileLocation.volume_id == 0 || fileLocation.local_id == 0) {
                                        fileLocation = null;
                                    }
                                    chat = null;
                                } else {
                                    TLRPC.Chat chat3 = editWidgetActivity5.getMessagesController().getChat(Long.valueOf(-dialog.id));
                                    string = chat3.title;
                                    TLRPC.ChatPhoto chatPhoto = chat3.photo;
                                    if (chatPhoto != null && (fileLocation = chatPhoto.photo_small) != null) {
                                        if (fileLocation.volume_id != 0 && fileLocation.local_id != 0) {
                                            chat = chat3;
                                            user = null;
                                        }
                                    }
                                    chat = chat3;
                                    user = null;
                                    fileLocation = null;
                                }
                                ((TextView) viewGroupArr[i12].findViewById(i13 == 0 ? R.id.contacts_widget_item_text1 : R.id.contacts_widget_item_text2)).setText(string);
                                if (fileLocation != null) {
                                    try {
                                        bitmapDecodeFile = BitmapFactory.decodeFile(editWidgetActivity5.getFileLoader().getPathToAttach(fileLocation, true).toString());
                                    } catch (Throwable th) {
                                        th = th;
                                        FileLog.e(th);
                                        i = dialog.unread_count;
                                        if (i > 0) {
                                            if (i > 99) {
                                                str = String.format("%d+", 99);
                                            } else {
                                                str = String.format("%d", Integer.valueOf(i));
                                            }
                                            ViewGroup viewGroup = viewGroupArr[i12];
                                            if (i13 == 0) {
                                                i3 = R.id.contacts_widget_item_badge1;
                                            } else {
                                                i3 = R.id.contacts_widget_item_badge2;
                                            }
                                            ((TextView) viewGroup.findViewById(i3)).setText(str);
                                            ViewGroup viewGroup2 = viewGroupArr[i12];
                                            if (i13 == 0) {
                                                i4 = R.id.contacts_widget_item_badge_bg1;
                                            } else {
                                                i4 = R.id.contacts_widget_item_badge_bg2;
                                            }
                                            viewGroup2.findViewById(i4).setVisibility(0);
                                        } else {
                                            ViewGroup viewGroup3 = viewGroupArr[i12];
                                            if (i13 == 0) {
                                                i2 = R.id.contacts_widget_item_badge_bg1;
                                            } else {
                                                i2 = R.id.contacts_widget_item_badge_bg2;
                                            }
                                            viewGroup3.findViewById(i2).setVisibility(8);
                                        }
                                        i13++;
                                        editWidgetActivity = editWidgetActivity5;
                                    }
                                } else {
                                    bitmapDecodeFile = null;
                                }
                                int iDp = AndroidUtilities.dp(48.0f);
                                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iDp, iDp, Bitmap.Config.ARGB_8888);
                                bitmapCreateBitmap.eraseColor(0);
                                Canvas canvas = new Canvas(bitmapCreateBitmap);
                                if (bitmapDecodeFile == null) {
                                    if (user != null) {
                                        try {
                                            avatarDrawable = new AvatarDrawable(user);
                                            if (UserObject.isReplyUser(user)) {
                                                avatarDrawable.setAvatarType(12);
                                            } else if (UserObject.isUserSelf(user)) {
                                                avatarDrawable.setAvatarType(1);
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            FileLog.e(th);
                                            i = dialog.unread_count;
                                            if (i > 0) {
                                                if (i > 99) {
                                                    str = String.format("%d+", 99);
                                                } else {
                                                    str = String.format("%d", Integer.valueOf(i));
                                                }
                                                ViewGroup viewGroup4 = viewGroupArr[i12];
                                                if (i13 == 0) {
                                                    i3 = R.id.contacts_widget_item_badge1;
                                                } else {
                                                    i3 = R.id.contacts_widget_item_badge2;
                                                }
                                                ((TextView) viewGroup4.findViewById(i3)).setText(str);
                                                ViewGroup viewGroup5 = viewGroupArr[i12];
                                                if (i13 == 0) {
                                                    i4 = R.id.contacts_widget_item_badge_bg1;
                                                } else {
                                                    i4 = R.id.contacts_widget_item_badge_bg2;
                                                }
                                                viewGroup5.findViewById(i4).setVisibility(0);
                                            } else {
                                                ViewGroup viewGroup6 = viewGroupArr[i12];
                                                if (i13 == 0) {
                                                    i2 = R.id.contacts_widget_item_badge_bg1;
                                                } else {
                                                    i2 = R.id.contacts_widget_item_badge_bg2;
                                                }
                                                viewGroup6.findViewById(i2).setVisibility(8);
                                            }
                                            i13++;
                                            editWidgetActivity = editWidgetActivity5;
                                        }
                                    } else {
                                        avatarDrawable = new AvatarDrawable(chat);
                                    }
                                    try {
                                        avatarDrawable.setBounds(0, 0, iDp, iDp);
                                        avatarDrawable.draw(canvas);
                                        try {
                                            canvas.setBitmap(null);
                                            ViewGroup viewGroup7 = viewGroupArr[i12];
                                            if (i13 == 0) {
                                                i5 = R.id.contacts_widget_item_avatar1;
                                            } else {
                                                i5 = R.id.contacts_widget_item_avatar2;
                                            }
                                            ((ImageView) viewGroup7.findViewById(i5)).setImageBitmap(bitmapCreateBitmap);
                                        } catch (Throwable th3) {
                                            th = th3;
                                            FileLog.e(th);
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        FileLog.e(th);
                                        i = dialog.unread_count;
                                        if (i > 0) {
                                            if (i > 99) {
                                                str = String.format("%d+", 99);
                                            } else {
                                                str = String.format("%d", Integer.valueOf(i));
                                            }
                                            ViewGroup viewGroup8 = viewGroupArr[i12];
                                            if (i13 == 0) {
                                                i3 = R.id.contacts_widget_item_badge1;
                                            } else {
                                                i3 = R.id.contacts_widget_item_badge2;
                                            }
                                            ((TextView) viewGroup8.findViewById(i3)).setText(str);
                                            ViewGroup viewGroup9 = viewGroupArr[i12];
                                            if (i13 == 0) {
                                                i4 = R.id.contacts_widget_item_badge_bg1;
                                            } else {
                                                i4 = R.id.contacts_widget_item_badge_bg2;
                                            }
                                            viewGroup9.findViewById(i4).setVisibility(0);
                                        } else {
                                            ViewGroup viewGroup10 = viewGroupArr[i12];
                                            if (i13 == 0) {
                                                i2 = R.id.contacts_widget_item_badge_bg1;
                                            } else {
                                                i2 = R.id.contacts_widget_item_badge_bg2;
                                            }
                                            viewGroup10.findViewById(i2).setVisibility(8);
                                        }
                                        i13++;
                                        editWidgetActivity = editWidgetActivity5;
                                    }
                                    i = dialog.unread_count;
                                    if (i > 0) {
                                        if (i > 99) {
                                            str = String.format("%d+", 99);
                                        } else {
                                            str = String.format("%d", Integer.valueOf(i));
                                        }
                                        ViewGroup viewGroup11 = viewGroupArr[i12];
                                        if (i13 == 0) {
                                            i3 = R.id.contacts_widget_item_badge1;
                                        } else {
                                            i3 = R.id.contacts_widget_item_badge2;
                                        }
                                        ((TextView) viewGroup11.findViewById(i3)).setText(str);
                                        ViewGroup viewGroup12 = viewGroupArr[i12];
                                        if (i13 == 0) {
                                            i4 = R.id.contacts_widget_item_badge_bg1;
                                        } else {
                                            i4 = R.id.contacts_widget_item_badge_bg2;
                                        }
                                        viewGroup12.findViewById(i4).setVisibility(0);
                                    } else {
                                        ViewGroup viewGroup13 = viewGroupArr[i12];
                                        if (i13 == 0) {
                                            i2 = R.id.contacts_widget_item_badge_bg1;
                                        } else {
                                            i2 = R.id.contacts_widget_item_badge_bg2;
                                        }
                                        viewGroup13.findViewById(i2).setVisibility(8);
                                    }
                                } else {
                                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                                    BitmapShader bitmapShader = new BitmapShader(bitmapDecodeFile, tileMode, tileMode);
                                    float width = iDp / bitmapDecodeFile.getWidth();
                                    canvas.save();
                                    canvas.scale(width, width);
                                    this.roundPaint.setShader(bitmapShader);
                                    try {
                                        this.bitmapRect.set(0.0f, 0.0f, bitmapDecodeFile.getWidth(), bitmapDecodeFile.getHeight());
                                        canvas.drawRoundRect(this.bitmapRect, bitmapDecodeFile.getWidth(), bitmapDecodeFile.getHeight(), this.roundPaint);
                                        canvas.restore();
                                        canvas.setBitmap(null);
                                        ViewGroup viewGroup14 = viewGroupArr[i12];
                                        if (i13 == 0) {
                                            i5 = R.id.contacts_widget_item_avatar1;
                                        } else {
                                            i5 = R.id.contacts_widget_item_avatar2;
                                        }
                                        ((ImageView) viewGroup14.findViewById(i5)).setImageBitmap(bitmapCreateBitmap);
                                    } catch (Throwable th5) {
                                        th = th5;
                                        FileLog.e(th);
                                        i = dialog.unread_count;
                                        if (i > 0) {
                                            if (i > 99) {
                                                str = String.format("%d+", 99);
                                            } else {
                                                str = String.format("%d", Integer.valueOf(i));
                                            }
                                            ViewGroup viewGroup15 = viewGroupArr[i12];
                                            if (i13 == 0) {
                                                i3 = R.id.contacts_widget_item_badge1;
                                            } else {
                                                i3 = R.id.contacts_widget_item_badge2;
                                            }
                                            ((TextView) viewGroup15.findViewById(i3)).setText(str);
                                            ViewGroup viewGroup16 = viewGroupArr[i12];
                                            if (i13 == 0) {
                                                i4 = R.id.contacts_widget_item_badge_bg1;
                                            } else {
                                                i4 = R.id.contacts_widget_item_badge_bg2;
                                            }
                                            viewGroup16.findViewById(i4).setVisibility(0);
                                        } else {
                                            ViewGroup viewGroup17 = viewGroupArr[i12];
                                            if (i13 == 0) {
                                                i2 = R.id.contacts_widget_item_badge_bg1;
                                            } else {
                                                i2 = R.id.contacts_widget_item_badge_bg2;
                                            }
                                            viewGroup17.findViewById(i2).setVisibility(8);
                                        }
                                        i13++;
                                        editWidgetActivity = editWidgetActivity5;
                                    }
                                    i = dialog.unread_count;
                                    if (i > 0) {
                                        if (i > 99) {
                                            str = String.format("%d+", 99);
                                        } else {
                                            str = String.format("%d", Integer.valueOf(i));
                                        }
                                        ViewGroup viewGroup18 = viewGroupArr[i12];
                                        if (i13 == 0) {
                                            i3 = R.id.contacts_widget_item_badge1;
                                        } else {
                                            i3 = R.id.contacts_widget_item_badge2;
                                        }
                                        ((TextView) viewGroup18.findViewById(i3)).setText(str);
                                        ViewGroup viewGroup19 = viewGroupArr[i12];
                                        if (i13 == 0) {
                                            i4 = R.id.contacts_widget_item_badge_bg1;
                                        } else {
                                            i4 = R.id.contacts_widget_item_badge_bg2;
                                        }
                                        viewGroup19.findViewById(i4).setVisibility(0);
                                    } else {
                                        ViewGroup viewGroup110 = viewGroupArr[i12];
                                        if (i13 == 0) {
                                            i2 = R.id.contacts_widget_item_badge_bg1;
                                        } else {
                                            i2 = R.id.contacts_widget_item_badge_bg2;
                                        }
                                        viewGroup110.findViewById(i2).setVisibility(8);
                                    }
                                }
                            }
                            i13++;
                            editWidgetActivity = editWidgetActivity5;
                        }
                        i12++;
                    }
                }
            } else {
                int i16 = 0;
                while (i16 < i11) {
                    if (editWidgetActivity4.selectedDialogs.isEmpty()) {
                        r4 = i16 < editWidgetActivity4.getMessagesController().dialogsServerOnly.size() ? editWidgetActivity4.getMessagesController().dialogsServerOnly.get(i16) : bitmap2;
                    } else if (i16 < editWidgetActivity4.selectedDialogs.size()) {
                        TLRPC.Dialog tL_dialog2 = (TLRPC.Dialog) editWidgetActivity4.getMessagesController().dialogs_dict.get(((Long) editWidgetActivity4.selectedDialogs.get(i16)).longValue());
                        if (tL_dialog2 == null) {
                            tL_dialog2 = new TLRPC.TL_dialog();
                            tL_dialog2.id = ((Long) editWidgetActivity4.selectedDialogs.get(i16)).longValue();
                        }
                        r4 = tL_dialog2;
                    }
                    if (r4 == 0) {
                        viewGroupArr[i16].setVisibility(i10);
                        editWidgetActivity3 = editWidgetActivity4;
                        i6 = i16;
                        str4 = str9;
                    } else {
                        viewGroupArr[i16].setVisibility(0);
                        i6 = i16;
                        if (DialogObject.isUserDialog(r4.id)) {
                            editWidgetActivity2 = editWidgetActivity4;
                            TLRPC.User user3 = editWidgetActivity4.getMessagesController().getUser(Long.valueOf(r4.id));
                            if (user3 != null) {
                                if (UserObject.isUserSelf(user3)) {
                                    string4 = LocaleController.getString(R.string.SavedMessages);
                                } else if (UserObject.isReplyUser(user3)) {
                                    string4 = LocaleController.getString(R.string.RepliesTitle);
                                } else {
                                    string4 = UserObject.isDeleted(user3) ? LocaleController.getString(R.string.HiddenName) : ContactsController.formatName(user3.first_name, user3.last_name);
                                }
                                if (UserObject.isReplyUser(user3) || UserObject.isUserSelf(user3) || (userProfilePhoto2 = user3.photo) == null || (fileLocation3 = userProfilePhoto2.photo_small) == null) {
                                    str2 = "";
                                } else {
                                    str2 = "";
                                    if (fileLocation3.volume_id != 0 && fileLocation3.local_id != 0) {
                                        r9 = fileLocation3;
                                        str3 = string4;
                                        r5 = bitmap2;
                                        r0 = user3;
                                    }
                                }
                                str3 = string4;
                                Bitmap bitmap3 = bitmap2;
                                r9 = bitmap3;
                                r0 = user3;
                                r5 = bitmap3;
                            } else {
                                str2 = "";
                                Bitmap bitmap4 = bitmap2;
                                bitmap = bitmap4;
                                obj2 = user3;
                                obj = bitmap4;
                                str3 = str2;
                                r0 = obj2;
                                r5 = obj;
                                r9 = bitmap;
                            }
                        } else {
                            editWidgetActivity2 = editWidgetActivity4;
                            str2 = "";
                            TLRPC.Chat chat4 = editWidgetActivity2.getMessagesController().getChat(Long.valueOf(-r4.id));
                            if (chat4 != null) {
                                String str10 = chat4.title;
                                TLRPC.ChatPhoto chatPhoto2 = chat4.photo;
                                if (chatPhoto2 == null || (fileLocation2 = chatPhoto2.photo_small) == null || fileLocation2.volume_id == 0 || fileLocation2.local_id == 0) {
                                    str3 = str10;
                                    Bitmap bitmap5 = bitmap2;
                                    r5 = chat4;
                                    r0 = bitmap5;
                                    r9 = bitmap5;
                                } else {
                                    r9 = fileLocation2;
                                    str3 = str10;
                                    r5 = chat4;
                                    r0 = bitmap2;
                                }
                            } else {
                                obj = chat4;
                                Bitmap bitmap6 = bitmap2;
                                bitmap = bitmap6;
                                obj2 = bitmap6;
                                str3 = str2;
                                r0 = obj2;
                                r5 = obj;
                                r9 = bitmap;
                            }
                        }
                        ((TextView) viewGroupArr[i6].findViewById(R.id.shortcut_widget_item_text)).setText(str3);
                        if (r9 != 0) {
                            try {
                                bitmapDecodeFile2 = BitmapFactory.decodeFile(editWidgetActivity2.getFileLoader().getPathToAttach(r9, r14).toString());
                            } catch (Throwable th6) {
                                th = th6;
                                c = 1;
                                FileLog.e(th);
                                arrayList = (ArrayList) editWidgetActivity2.getMessagesController().dialogMessage.get(r4.id);
                                if (arrayList != null) {
                                    r6 = bitmap2;
                                } else {
                                    r6 = bitmap2;
                                }
                                if (r6 != 0) {
                                    fromChatId = r6.getFromChatId();
                                    if (fromChatId > 0) {
                                        user2 = editWidgetActivity2.getMessagesController().getUser(Long.valueOf(fromChatId));
                                        chat2 = bitmap2;
                                    } else {
                                        chat2 = editWidgetActivity2.getMessagesController().getChat(Long.valueOf(-fromChatId));
                                        user2 = bitmap2;
                                    }
                                    color = getContext().getResources().getColor(R.color.widget_text);
                                    if (r6.messageOwner instanceof TLRPC.TL_messageService) {
                                        if (ChatObject.isChannel(r5)) {
                                            messageAction = r6.messageOwner.action;
                                            if (messageAction instanceof TLRPC.TL_messageActionHistoryClear) {
                                            }
                                            charSequence = str2;
                                        } else {
                                            charSequence = r6.messageText;
                                        }
                                        color = getContext().getResources().getColor(R.color.widget_action_text);
                                        charSequenceM = charSequence;
                                        editWidgetActivity3 = editWidgetActivity2;
                                        str4 = str9;
                                    } else {
                                        str6 = "📎 ";
                                        editWidgetActivity3 = editWidgetActivity2;
                                        if (r5 != 0) {
                                            str4 = str9;
                                            messageMedia = r6.messageOwner.media;
                                            if (!(messageMedia instanceof TLRPC.TL_messageMediaPhoto)) {
                                                if (!(messageMedia instanceof TLRPC.TL_messageMediaDocument)) {
                                                    if (r6.caption != null) {
                                                        if (r6.isVideo()) {
                                                            str6 = "📹 ";
                                                        } else if (r6.isVoice()) {
                                                            str6 = "🎤 ";
                                                        } else if (r6.isMusic()) {
                                                            str6 = "🎧 ";
                                                        } else if (r6.isPhoto()) {
                                                            str6 = "🖼 ";
                                                        }
                                                        StringBuilder sbM = Log.m(str6);
                                                        sbM.append((Object) r6.caption);
                                                        charSequenceM = sbM.toString();
                                                    } else {
                                                        if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                                                            charSequenceM = "📊 " + ((TLRPC.TL_messageMediaPoll) messageMedia).poll.question.text;
                                                        } else if (messageMedia instanceof TLRPC.TL_messageMediaGame) {
                                                            charSequenceM = "🎮 " + r6.messageOwner.media.game.title;
                                                        } else if (r6.type == 14) {
                                                            charSequenceM = SurfaceContainer$$ExternalSyntheticOutline0.m("🎧 ", r6.getMusicAuthor(), str4, r6.getMusicTitle());
                                                        } else {
                                                            charSequenceM = r6.messageText;
                                                            AndroidUtilities.highlightText(charSequenceM, r6.highlightedWords, (Theme.ResourcesProvider) null);
                                                        }
                                                        if (r6.messageOwner.media != null) {
                                                            color = getContext().getResources().getColor(R.color.widget_action_text);
                                                        }
                                                    }
                                                } else if (r6.caption != null) {
                                                    if (r6.isVideo()) {
                                                        str6 = "📹 ";
                                                    } else if (r6.isVoice()) {
                                                        str6 = "🎤 ";
                                                    } else if (r6.isMusic()) {
                                                        str6 = "🎧 ";
                                                    } else if (r6.isPhoto()) {
                                                        str6 = "🖼 ";
                                                    }
                                                    StringBuilder sbM2 = Log.m(str6);
                                                    sbM2.append((Object) r6.caption);
                                                    charSequenceM = sbM2.toString();
                                                } else {
                                                    if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                                                        charSequenceM = "📊 " + ((TLRPC.TL_messageMediaPoll) messageMedia).poll.question.text;
                                                    } else if (messageMedia instanceof TLRPC.TL_messageMediaGame) {
                                                        charSequenceM = "🎮 " + r6.messageOwner.media.game.title;
                                                    } else if (r6.type == 14) {
                                                        charSequenceM = SurfaceContainer$$ExternalSyntheticOutline0.m("🎧 ", r6.getMusicAuthor(), str4, r6.getMusicTitle());
                                                    } else {
                                                        charSequenceM = r6.messageText;
                                                        AndroidUtilities.highlightText(charSequenceM, r6.highlightedWords, (Theme.ResourcesProvider) null);
                                                    }
                                                    if (r6.messageOwner.media != null) {
                                                        color = getContext().getResources().getColor(R.color.widget_action_text);
                                                    }
                                                }
                                            } else if (!(messageMedia instanceof TLRPC.TL_messageMediaDocument)) {
                                                if (r6.caption != null) {
                                                    if (r6.isVideo()) {
                                                        str6 = "📹 ";
                                                    } else if (r6.isVoice()) {
                                                        str6 = "🎤 ";
                                                    } else if (r6.isMusic()) {
                                                        str6 = "🎧 ";
                                                    } else if (r6.isPhoto()) {
                                                        str6 = "🖼 ";
                                                    }
                                                    StringBuilder sbM3 = Log.m(str6);
                                                    sbM3.append((Object) r6.caption);
                                                    charSequenceM = sbM3.toString();
                                                } else {
                                                    if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                                                        charSequenceM = "📊 " + ((TLRPC.TL_messageMediaPoll) messageMedia).poll.question.text;
                                                    } else if (messageMedia instanceof TLRPC.TL_messageMediaGame) {
                                                        charSequenceM = "🎮 " + r6.messageOwner.media.game.title;
                                                    } else if (r6.type == 14) {
                                                        charSequenceM = SurfaceContainer$$ExternalSyntheticOutline0.m("🎧 ", r6.getMusicAuthor(), str4, r6.getMusicTitle());
                                                    } else {
                                                        charSequenceM = r6.messageText;
                                                        AndroidUtilities.highlightText(charSequenceM, r6.highlightedWords, (Theme.ResourcesProvider) null);
                                                    }
                                                    if (r6.messageOwner.media != null) {
                                                        color = getContext().getResources().getColor(R.color.widget_action_text);
                                                    }
                                                }
                                            } else if (r6.caption != null) {
                                                if (r6.isVideo()) {
                                                    str6 = "📹 ";
                                                } else if (r6.isVoice()) {
                                                    str6 = "🎤 ";
                                                } else if (r6.isMusic()) {
                                                    str6 = "🎧 ";
                                                } else if (r6.isPhoto()) {
                                                    str6 = "🖼 ";
                                                }
                                                StringBuilder sbM4 = Log.m(str6);
                                                sbM4.append((Object) r6.caption);
                                                charSequenceM = sbM4.toString();
                                            } else {
                                                if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                                                    charSequenceM = "📊 " + ((TLRPC.TL_messageMediaPoll) messageMedia).poll.question.text;
                                                } else if (messageMedia instanceof TLRPC.TL_messageMediaGame) {
                                                    charSequenceM = "🎮 " + r6.messageOwner.media.game.title;
                                                } else if (r6.type == 14) {
                                                    charSequenceM = SurfaceContainer$$ExternalSyntheticOutline0.m("🎧 ", r6.getMusicAuthor(), str4, r6.getMusicTitle());
                                                } else {
                                                    charSequenceM = r6.messageText;
                                                    AndroidUtilities.highlightText(charSequenceM, r6.highlightedWords, (Theme.ResourcesProvider) null);
                                                }
                                                if (r6.messageOwner.media != null) {
                                                    color = getContext().getResources().getColor(R.color.widget_action_text);
                                                }
                                            }
                                        } else {
                                            str4 = str9;
                                            messageMedia = r6.messageOwner.media;
                                            if (!(messageMedia instanceof TLRPC.TL_messageMediaPhoto)) {
                                                if (!(messageMedia instanceof TLRPC.TL_messageMediaDocument)) {
                                                    if (r6.caption != null) {
                                                        if (r6.isVideo()) {
                                                            str6 = "📹 ";
                                                        } else if (r6.isVoice()) {
                                                            str6 = "🎤 ";
                                                        } else if (r6.isMusic()) {
                                                            str6 = "🎧 ";
                                                        } else if (r6.isPhoto()) {
                                                            str6 = "🖼 ";
                                                        }
                                                        StringBuilder sbM5 = Log.m(str6);
                                                        sbM5.append((Object) r6.caption);
                                                        charSequenceM = sbM5.toString();
                                                    } else {
                                                        if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                                                            charSequenceM = "📊 " + ((TLRPC.TL_messageMediaPoll) messageMedia).poll.question.text;
                                                        } else if (messageMedia instanceof TLRPC.TL_messageMediaGame) {
                                                            charSequenceM = "🎮 " + r6.messageOwner.media.game.title;
                                                        } else if (r6.type == 14) {
                                                            charSequenceM = SurfaceContainer$$ExternalSyntheticOutline0.m("🎧 ", r6.getMusicAuthor(), str4, r6.getMusicTitle());
                                                        } else {
                                                            charSequenceM = r6.messageText;
                                                            AndroidUtilities.highlightText(charSequenceM, r6.highlightedWords, (Theme.ResourcesProvider) null);
                                                        }
                                                        if (r6.messageOwner.media != null) {
                                                            color = getContext().getResources().getColor(R.color.widget_action_text);
                                                        }
                                                    }
                                                } else if (r6.caption != null) {
                                                    if (r6.isVideo()) {
                                                        str6 = "📹 ";
                                                    } else if (r6.isVoice()) {
                                                        str6 = "🎤 ";
                                                    } else if (r6.isMusic()) {
                                                        str6 = "🎧 ";
                                                    } else if (r6.isPhoto()) {
                                                        str6 = "🖼 ";
                                                    }
                                                    StringBuilder sbM6 = Log.m(str6);
                                                    sbM6.append((Object) r6.caption);
                                                    charSequenceM = sbM6.toString();
                                                } else {
                                                    if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                                                        charSequenceM = "📊 " + ((TLRPC.TL_messageMediaPoll) messageMedia).poll.question.text;
                                                    } else if (messageMedia instanceof TLRPC.TL_messageMediaGame) {
                                                        charSequenceM = "🎮 " + r6.messageOwner.media.game.title;
                                                    } else if (r6.type == 14) {
                                                        charSequenceM = SurfaceContainer$$ExternalSyntheticOutline0.m("🎧 ", r6.getMusicAuthor(), str4, r6.getMusicTitle());
                                                    } else {
                                                        charSequenceM = r6.messageText;
                                                        AndroidUtilities.highlightText(charSequenceM, r6.highlightedWords, (Theme.ResourcesProvider) null);
                                                    }
                                                    if (r6.messageOwner.media != null) {
                                                        color = getContext().getResources().getColor(R.color.widget_action_text);
                                                    }
                                                }
                                            } else if (!(messageMedia instanceof TLRPC.TL_messageMediaDocument)) {
                                                if (r6.caption != null) {
                                                    if (r6.isVideo()) {
                                                        str6 = "📹 ";
                                                    } else if (r6.isVoice()) {
                                                        str6 = "🎤 ";
                                                    } else if (r6.isMusic()) {
                                                        str6 = "🎧 ";
                                                    } else if (r6.isPhoto()) {
                                                        str6 = "🖼 ";
                                                    }
                                                    StringBuilder sbM7 = Log.m(str6);
                                                    sbM7.append((Object) r6.caption);
                                                    charSequenceM = sbM7.toString();
                                                } else {
                                                    if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                                                        charSequenceM = "📊 " + ((TLRPC.TL_messageMediaPoll) messageMedia).poll.question.text;
                                                    } else if (messageMedia instanceof TLRPC.TL_messageMediaGame) {
                                                        charSequenceM = "🎮 " + r6.messageOwner.media.game.title;
                                                    } else if (r6.type == 14) {
                                                        charSequenceM = SurfaceContainer$$ExternalSyntheticOutline0.m("🎧 ", r6.getMusicAuthor(), str4, r6.getMusicTitle());
                                                    } else {
                                                        charSequenceM = r6.messageText;
                                                        AndroidUtilities.highlightText(charSequenceM, r6.highlightedWords, (Theme.ResourcesProvider) null);
                                                    }
                                                    if (r6.messageOwner.media != null) {
                                                        color = getContext().getResources().getColor(R.color.widget_action_text);
                                                    }
                                                }
                                            } else if (r6.caption != null) {
                                                if (r6.isVideo()) {
                                                    str6 = "📹 ";
                                                } else if (r6.isVoice()) {
                                                    str6 = "🎤 ";
                                                } else if (r6.isMusic()) {
                                                    str6 = "🎧 ";
                                                } else if (r6.isPhoto()) {
                                                    str6 = "🖼 ";
                                                }
                                                StringBuilder sbM8 = Log.m(str6);
                                                sbM8.append((Object) r6.caption);
                                                charSequenceM = sbM8.toString();
                                            } else {
                                                if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                                                    charSequenceM = "📊 " + ((TLRPC.TL_messageMediaPoll) messageMedia).poll.question.text;
                                                } else if (messageMedia instanceof TLRPC.TL_messageMediaGame) {
                                                    charSequenceM = "🎮 " + r6.messageOwner.media.game.title;
                                                } else if (r6.type == 14) {
                                                    charSequenceM = SurfaceContainer$$ExternalSyntheticOutline0.m("🎧 ", r6.getMusicAuthor(), str4, r6.getMusicTitle());
                                                } else {
                                                    charSequenceM = r6.messageText;
                                                    AndroidUtilities.highlightText(charSequenceM, r6.highlightedWords, (Theme.ResourcesProvider) null);
                                                }
                                                if (r6.messageOwner.media != null) {
                                                    color = getContext().getResources().getColor(R.color.widget_action_text);
                                                }
                                            }
                                        }
                                    }
                                    ((TextView) viewGroupArr[i6].findViewById(R.id.shortcut_widget_item_time)).setText(LocaleController.stringForMessageListDate(r6.messageOwner.date));
                                    ViewGroup viewGroup20 = viewGroupArr[i6];
                                    int i17 = R.id.shortcut_widget_item_message;
                                    ((TextView) viewGroup20.findViewById(i17)).setText(charSequenceM.toString());
                                    ((TextView) viewGroupArr[i6].findViewById(i17)).setTextColor(color);
                                } else {
                                    editWidgetActivity3 = editWidgetActivity2;
                                    str4 = str9;
                                    str5 = str2;
                                    if (r4.last_message_date != 0) {
                                        ((TextView) viewGroupArr[i6].findViewById(R.id.shortcut_widget_item_time)).setText(LocaleController.stringForMessageListDate(r4.last_message_date));
                                    } else {
                                        ((TextView) viewGroupArr[i6].findViewById(R.id.shortcut_widget_item_time)).setText(str5);
                                    }
                                    ((TextView) viewGroupArr[i6].findViewById(R.id.shortcut_widget_item_message)).setText(str5);
                                }
                                if (r4.unread_count > 0) {
                                    ViewGroup viewGroup21 = viewGroupArr[i6];
                                    i7 = R.id.shortcut_widget_item_badge;
                                    ((TextView) viewGroup21.findViewById(i7)).setText(String.format("%d", Integer.valueOf(r4.unread_count)));
                                    viewGroupArr[i6].findViewById(i7).setVisibility(0);
                                    if (editWidgetActivity3.getMessagesController().isDialogMuted(r4.id, 0L)) {
                                        viewGroupArr[i6].findViewById(i7).setBackgroundResource(R.drawable.widget_counter_muted);
                                    } else {
                                        viewGroupArr[i6].findViewById(i7).setBackgroundResource(R.drawable.widget_counter);
                                    }
                                } else {
                                    viewGroupArr[i6].findViewById(R.id.shortcut_widget_item_badge).setVisibility(8);
                                }
                                i16 = i6 + 1;
                                str9 = str4;
                                editWidgetActivity4 = editWidgetActivity3;
                                i9 = 12;
                                i10 = 8;
                                i11 = 2;
                                r14 = 1;
                                bitmap2 = null;
                            }
                        } else {
                            bitmapDecodeFile2 = bitmap2;
                        }
                        int iDp2 = AndroidUtilities.dp(48.0f);
                        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(iDp2, iDp2, Bitmap.Config.ARGB_8888);
                        bitmapCreateBitmap2.eraseColor(0);
                        Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
                        if (bitmapDecodeFile2 == null) {
                            if (r0 != 0) {
                                avatarDrawable3 = new AvatarDrawable((TLRPC.User) r0);
                                if (UserObject.isReplyUser((TLRPC.User) r0)) {
                                    avatarDrawable3.setAvatarType(i9);
                                    avatarDrawable2 = avatarDrawable3;
                                } else if (UserObject.isUserSelf(r0)) {
                                    avatarDrawable2 = avatarDrawable3;
                                    avatarDrawable3.setAvatarType(r14);
                                    avatarDrawable2 = avatarDrawable3;
                                }
                            } else {
                                avatarDrawable2 = new AvatarDrawable((TLRPC.Chat) r5);
                            }
                            avatarDrawable2 = avatarDrawable3;
                            avatarDrawable2.setBounds(0, 0, iDp2, iDp2);
                            avatarDrawable2.draw(canvas2);
                            c = 1;
                        } else {
                            Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                            BitmapShader bitmapShader2 = new BitmapShader(bitmapDecodeFile2, tileMode2, tileMode2);
                            if (this.roundPaint == null) {
                                this.roundPaint = new Paint((int) r14);
                                this.bitmapRect = new RectF();
                            }
                            float width2 = iDp2 / bitmapDecodeFile2.getWidth();
                            canvas2.save();
                            canvas2.scale(width2, width2);
                            this.roundPaint.setShader(bitmapShader2);
                            c = 1;
                            this.bitmapRect.set(0.0f, 0.0f, bitmapDecodeFile2.getWidth(), bitmapDecodeFile2.getHeight());
                            canvas2.drawRoundRect(this.bitmapRect, bitmapDecodeFile2.getWidth(), bitmapDecodeFile2.getHeight(), this.roundPaint);
                            canvas2.restore();
                        }
                        try {
                            canvas2.setBitmap(bitmap2);
                            ((ImageView) viewGroupArr[i6].findViewById(R.id.shortcut_widget_item_avatar)).setImageBitmap(bitmapCreateBitmap2);
                        } catch (Throwable th7) {
                            th = th7;
                            FileLog.e(th);
                        }
                        arrayList = (ArrayList) editWidgetActivity2.getMessagesController().dialogMessage.get(r4.id);
                        if (arrayList != null || arrayList.size() <= 0) {
                            r6 = bitmap2;
                        } else {
                            r6 = (MessageObject) arrayList.get(0);
                        }
                        if (r6 != 0) {
                            fromChatId = r6.getFromChatId();
                            if (fromChatId > 0) {
                                user2 = editWidgetActivity2.getMessagesController().getUser(Long.valueOf(fromChatId));
                                chat2 = bitmap2;
                            } else {
                                chat2 = editWidgetActivity2.getMessagesController().getChat(Long.valueOf(-fromChatId));
                                user2 = bitmap2;
                            }
                            color = getContext().getResources().getColor(R.color.widget_text);
                            if (r6.messageOwner instanceof TLRPC.TL_messageService) {
                                if (ChatObject.isChannel(r5)) {
                                    messageAction = r6.messageOwner.action;
                                    if (!(messageAction instanceof TLRPC.TL_messageActionHistoryClear) || (messageAction instanceof TLRPC.TL_messageActionChannelMigrateFrom)) {
                                        charSequence = str2;
                                    } else {
                                        charSequence = r6.messageText;
                                    }
                                } else {
                                    charSequence = r6.messageText;
                                }
                                color = getContext().getResources().getColor(R.color.widget_action_text);
                                charSequenceM = charSequence;
                                editWidgetActivity3 = editWidgetActivity2;
                                str4 = str9;
                            } else {
                                str6 = "📎 ";
                                editWidgetActivity3 = editWidgetActivity2;
                                if (r5 != 0 || r5.id <= 0 || chat2 != null || (ChatObject.isChannel(r5) && !ChatObject.isMegagroup(r5))) {
                                    str4 = str9;
                                    messageMedia = r6.messageOwner.media;
                                    if (!(messageMedia instanceof TLRPC.TL_messageMediaPhoto) && (messageMedia.photo instanceof TLRPC.TL_photoEmpty) && messageMedia.ttl_seconds != 0) {
                                        charSequenceM = LocaleController.getString(R.string.AttachPhotoExpired);
                                    } else if (!(messageMedia instanceof TLRPC.TL_messageMediaDocument) && (messageMedia.document instanceof TLRPC.TL_documentEmpty) && messageMedia.ttl_seconds != 0) {
                                        charSequenceM = LocaleController.getString(R.string.AttachVideoExpired);
                                    } else if (r6.caption != null) {
                                        if (r6.isVideo()) {
                                            str6 = "📹 ";
                                        } else if (r6.isVoice()) {
                                            str6 = "🎤 ";
                                        } else if (r6.isMusic()) {
                                            str6 = "🎧 ";
                                        } else if (r6.isPhoto()) {
                                            str6 = "🖼 ";
                                        }
                                        StringBuilder sbM9 = Log.m(str6);
                                        sbM9.append((Object) r6.caption);
                                        charSequenceM = sbM9.toString();
                                    } else {
                                        if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                                            charSequenceM = "📊 " + ((TLRPC.TL_messageMediaPoll) messageMedia).poll.question.text;
                                        } else if (messageMedia instanceof TLRPC.TL_messageMediaGame) {
                                            charSequenceM = "🎮 " + r6.messageOwner.media.game.title;
                                        } else if (r6.type == 14) {
                                            charSequenceM = SurfaceContainer$$ExternalSyntheticOutline0.m("🎧 ", r6.getMusicAuthor(), str4, r6.getMusicTitle());
                                        } else {
                                            charSequenceM = r6.messageText;
                                            AndroidUtilities.highlightText(charSequenceM, r6.highlightedWords, (Theme.ResourcesProvider) null);
                                        }
                                        if (r6.messageOwner.media != null && !r6.isMediaEmpty()) {
                                            color = getContext().getResources().getColor(R.color.widget_action_text);
                                        }
                                    }
                                } else {
                                    if (r6.isOutOwner()) {
                                        string2 = LocaleController.getString(R.string.FromYou);
                                        str7 = str2;
                                    } else {
                                        if (user2 != 0) {
                                            String firstName = UserObject.getFirstName(user2);
                                            str7 = str2;
                                            strReplace = firstName.replace("\n", str7);
                                        } else {
                                            str7 = str2;
                                            strReplace = "DELETED";
                                        }
                                        string2 = strReplace;
                                    }
                                    CharSequence charSequence2 = r6.caption;
                                    if (charSequence2 != null) {
                                        String string5 = charSequence2.toString();
                                        if (string5.length() > 150) {
                                            string5 = string5.substring(0, 150);
                                        }
                                        if (r6.isVideo()) {
                                            str6 = "📹 ";
                                        } else if (r6.isVoice()) {
                                            str6 = "🎤 ";
                                        } else if (r6.isMusic()) {
                                            str6 = "🎧 ";
                                        } else if (r6.isPhoto()) {
                                            str6 = "🖼 ";
                                        }
                                        StringBuilder sbM10 = Log.m(str6);
                                        sbM10.append(string5.replace('\n', ' '));
                                        Object[] objArr = new Object[2];
                                        objArr[0] = sbM10.toString();
                                        objArr[c] = string2;
                                        spannableStringBuilderValueOf2 = SpannableStringBuilder.valueOf(String.format("%2$s: \u2068%1$s\u2069", objArr));
                                        str8 = str9;
                                    } else if (r6.messageOwner.media == null || r6.isMediaEmpty()) {
                                        str8 = str9;
                                        String strSubstring = r6.messageOwner.message;
                                        if (strSubstring != null) {
                                            if (strSubstring.length() > 150) {
                                                strSubstring = strSubstring.substring(0, 150);
                                            }
                                            Object[] objArr2 = new Object[2];
                                            objArr2[0] = strSubstring.replace('\n', ' ').trim();
                                            objArr2[c] = string2;
                                            spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(String.format("%2$s: \u2068%1$s\u2069", objArr2));
                                        } else {
                                            spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(str7);
                                        }
                                        spannableStringBuilderValueOf2 = spannableStringBuilderValueOf;
                                    } else {
                                        color = getContext().getResources().getColor(R.color.widget_action_text);
                                        TLRPC.MessageMedia messageMedia2 = r6.messageOwner.media;
                                        try {
                                            if (messageMedia2 instanceof TLRPC.TL_messageMediaPoll) {
                                                string3 = SurfaceContainer$$ExternalSyntheticOutline0.m("📊 \u2068", ((TLRPC.TL_messageMediaPoll) messageMedia2).poll.question.text, "\u2069");
                                            } else {
                                                if (messageMedia2 instanceof TLRPC.TL_messageMediaGame) {
                                                    string3 = SurfaceContainer$$ExternalSyntheticOutline0.m("🎮 \u2068", messageMedia2.game.title, "\u2069");
                                                } else if (r6.type == 14) {
                                                    str8 = str9;
                                                    string3 = SurfaceContainer$$ExternalSyntheticOutline0.m("🎧 \u2068", r6.getMusicAuthor(), str8, r6.getMusicTitle(), "\u2069");
                                                } else {
                                                    str8 = str9;
                                                    string3 = r6.messageText.toString();
                                                }
                                                Object[] objArr3 = new Object[2];
                                                objArr3[0] = string3.replace('\n', ' ');
                                                objArr3[c] = string2;
                                                SpannableStringBuilder spannableStringBuilderValueOf3 = SpannableStringBuilder.valueOf(String.format("%2$s: \u2068%1$s\u2069", objArr3));
                                                spannableStringBuilderValueOf3.setSpan(new ForegroundColorSpanThemable(Theme.key_chats_attachMessage, null), string2.length() + 2, spannableStringBuilderValueOf3.length(), 33);
                                                spannableStringBuilderValueOf2 = spannableStringBuilderValueOf3;
                                            }
                                            spannableStringBuilderValueOf3.setSpan(new ForegroundColorSpanThemable(Theme.key_chats_attachMessage, null), string2.length() + 2, spannableStringBuilderValueOf3.length(), 33);
                                        } catch (Exception e) {
                                            FileLog.e(e);
                                        }
                                        str8 = str9;
                                        Object[] objArr4 = new Object[2];
                                        objArr4[0] = string3.replace('\n', ' ');
                                        objArr4[c] = string2;
                                        SpannableStringBuilder spannableStringBuilderValueOf4 = SpannableStringBuilder.valueOf(String.format("%2$s: \u2068%1$s\u2069", objArr4));
                                        spannableStringBuilderValueOf2 = spannableStringBuilderValueOf4;
                                    }
                                    try {
                                        try {
                                            spannableStringBuilderValueOf2.setSpan(new ForegroundColorSpanThemable(Theme.key_chats_nameMessage, null), 0, string2.length() + 1, 33);
                                        } catch (Exception e2) {
                                            e = e2;
                                            FileLog.e(e);
                                        }
                                    } catch (Exception e3) {
                                        e = e3;
                                    }
                                    charSequenceM = spannableStringBuilderValueOf2;
                                    str4 = str8;
                                }
                            }
                            ((TextView) viewGroupArr[i6].findViewById(R.id.shortcut_widget_item_time)).setText(LocaleController.stringForMessageListDate(r6.messageOwner.date));
                            ViewGroup viewGroup22 = viewGroupArr[i6];
                            int i18 = R.id.shortcut_widget_item_message;
                            ((TextView) viewGroup22.findViewById(i18)).setText(charSequenceM.toString());
                            ((TextView) viewGroupArr[i6].findViewById(i18)).setTextColor(color);
                        } else {
                            editWidgetActivity3 = editWidgetActivity2;
                            str4 = str9;
                            str5 = str2;
                            if (r4.last_message_date != 0) {
                                ((TextView) viewGroupArr[i6].findViewById(R.id.shortcut_widget_item_time)).setText(LocaleController.stringForMessageListDate(r4.last_message_date));
                            } else {
                                ((TextView) viewGroupArr[i6].findViewById(R.id.shortcut_widget_item_time)).setText(str5);
                            }
                            ((TextView) viewGroupArr[i6].findViewById(R.id.shortcut_widget_item_message)).setText(str5);
                        }
                        if (r4.unread_count > 0) {
                            ViewGroup viewGroup23 = viewGroupArr[i6];
                            i7 = R.id.shortcut_widget_item_badge;
                            ((TextView) viewGroup23.findViewById(i7)).setText(String.format("%d", Integer.valueOf(r4.unread_count)));
                            viewGroupArr[i6].findViewById(i7).setVisibility(0);
                            if (editWidgetActivity3.getMessagesController().isDialogMuted(r4.id, 0L)) {
                                viewGroupArr[i6].findViewById(i7).setBackgroundResource(R.drawable.widget_counter_muted);
                            } else {
                                viewGroupArr[i6].findViewById(i7).setBackgroundResource(R.drawable.widget_counter);
                            }
                        } else {
                            viewGroupArr[i6].findViewById(R.id.shortcut_widget_item_badge).setVisibility(8);
                        }
                    }
                    i16 = i6 + 1;
                    str9 = str4;
                    editWidgetActivity4 = editWidgetActivity3;
                    i9 = 12;
                    i10 = 8;
                    i11 = 2;
                    r14 = 1;
                    bitmap2 = null;
                }
                editWidgetActivity = editWidgetActivity4;
                ViewGroup viewGroup24 = viewGroupArr[0];
                int i19 = R.id.shortcut_widget_item_divider;
                viewGroup24.findViewById(i19).setVisibility(viewGroupArr[1].getVisibility());
                viewGroupArr[1].findViewById(i19).setVisibility(8);
            }
            EditWidgetActivity editWidgetActivity6 = editWidgetActivity;
            if (viewGroupArr[0].getVisibility() == 0) {
                editWidgetActivity6.previewImageView.setVisibility(8);
            } else {
                editWidgetActivity6.previewImageView.setVisibility(0);
            }
        }
    }

    public EditWidgetActivity(int i, int i2) {
        super(null);
        ArrayList<Long> arrayList = new ArrayList<>();
        this.selectedDialogs = arrayList;
        this.widgetType = i;
        this.currentWidgetId = i2;
        ArrayList<TLRPC.User> arrayList2 = new ArrayList<>();
        ArrayList<TLRPC.Chat> arrayList3 = new ArrayList<>();
        getMessagesStorage().getWidgetDialogIds(i2, i, arrayList, arrayList2, arrayList3, true);
        getMessagesController().putUsers(arrayList2, true);
        getMessagesController().putChats(arrayList3, true);
        updateRows$26();
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(false);
        INavigationLayout iNavigationLayout = this.parentLayout;
        if (iNavigationLayout != null && ((ActionBarLayout) iNavigationLayout).isLayersLayout) {
            this.actionBar.setOccupyStatusBar(false);
        }
        if (this.widgetType == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.WidgetChats));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.WidgetShortcuts));
        }
        this.actionBar.createMenu().addItem(1, LocaleController.getString(R.string.Done).toUpperCase());
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public final void onItemClick(int i) {
                EditWidgetActivity editWidgetActivity = EditWidgetActivity.this;
                if (i == -1) {
                    if (editWidgetActivity.delegate == null) {
                        editWidgetActivity.finishActivity();
                        return;
                    } else {
                        editWidgetActivity.finishFragment();
                        return;
                    }
                }
                if (i != 1 || editWidgetActivity.getParentActivity() == null) {
                    return;
                }
                ArrayList<MessagesStorage.TopicKey> arrayList = new ArrayList<>();
                int i2 = 0;
                while (true) {
                    ArrayList arrayList2 = editWidgetActivity.selectedDialogs;
                    if (i2 >= arrayList2.size()) {
                        break;
                    }
                    arrayList.add(MessagesStorage.TopicKey.of(((Long) arrayList2.get(i2)).longValue(), 0L));
                    i2++;
                }
                MessagesStorage messagesStorage = editWidgetActivity.getMessagesStorage();
                int i3 = editWidgetActivity.currentWidgetId;
                messagesStorage.putWidgetDialogs(i3, arrayList);
                SharedPreferences.Editor editorEdit = editWidgetActivity.getParentActivity().getSharedPreferences("shortcut_widget", 0).edit();
                editorEdit.putInt("account" + i3, ((BaseFragment) editWidgetActivity).currentAccount);
                int i4 = editWidgetActivity.widgetType;
                editorEdit.putInt("type" + i3, i4);
                editorEdit.commit();
                AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(editWidgetActivity.getParentActivity());
                if (i4 == 0) {
                    ChatsWidgetProvider.updateWidget(editWidgetActivity.getParentActivity(), appWidgetManager, i3);
                } else {
                    ContactsWidgetProvider.updateWidget(editWidgetActivity.getParentActivity(), appWidgetManager, i3);
                }
                EditWidgetActivityDelegate editWidgetActivityDelegate = editWidgetActivity.delegate;
                if (editWidgetActivityDelegate != null) {
                    editWidgetActivityDelegate.didSelectDialogs();
                } else {
                    editWidgetActivity.finishActivity();
                }
            }
        });
        this.listAdapter = new ListAdapter(context);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
        this.fragmentView = frameLayout;
        RecyclerListView recyclerListView = new RecyclerListView(context, null);
        this.listView = recyclerListView;
        zzku.m(recyclerListView);
        this.listView.setVerticalScrollBarEnabled(false);
        this.listView.setAdapter(this.listAdapter);
        ((DefaultItemAnimator) this.listView.getItemAnimator()).delayAnimations = false;
        frameLayout.addView(this.listView, LayoutHelper.createFrame(-1.0f, -1));
        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(new TouchHelperCallback());
        this.itemTouchHelper = itemTouchHelper;
        itemTouchHelper.attachToRecyclerView(this.listView);
        this.listView.setOnItemClickListener(new BoostsActivity$$ExternalSyntheticLambda0(15, this, context));
        this.listView.setOnItemLongClickListener(new AnonymousClass2());
        return this.fragmentView;
    }

    public final void finishActivity() {
        if (getParentActivity() == null) {
            return;
        }
        getParentActivity().finish();
        AndroidUtilities.runOnUIThread(new ComposeDrawable$$ExternalSyntheticLambda0(this, 17), 1000L);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ThemeDescription(this.listView, 16, new Class[]{TextCell.class}, null, null, null, Theme.key_windowBackgroundWhite));
        arrayList.add(new ThemeDescription(this.fragmentView, 1, null, null, null, null, Theme.key_windowBackgroundGray));
        ActionBar actionBar = this.actionBar;
        int i = Theme.key_actionBarDefault;
        arrayList.add(new ThemeDescription(actionBar, 1, null, null, null, null, i));
        arrayList.add(new ThemeDescription(this.listView, 32768, null, null, null, null, i));
        arrayList.add(new ThemeDescription(this.actionBar, 64, null, null, null, null, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(this.actionBar, 128, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.actionBar, 256, null, null, null, null, Theme.key_actionBarDefaultSelector));
        arrayList.add(new ThemeDescription(this.actionBar, Integer.MIN_VALUE, null, null, null, null, Theme.key_actionBarDefaultSubmenuBackground));
        arrayList.add(new ThemeDescription(this.actionBar, 1073741824, null, null, null, null, Theme.key_actionBarDefaultSubmenuItem));
        arrayList.add(new ThemeDescription(this.actionBar, 1073741832, null, null, null, null, Theme.key_actionBarDefaultSubmenuItemIcon));
        arrayList.add(new ThemeDescription(this.listView, 4096, null, null, null, null, Theme.key_listSelector));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, Theme.key_divider));
        arrayList.add(new ThemeDescription(this.listView, 32, new Class[]{TextInfoPrivacyCell.class}, null, null, null, Theme.key_windowBackgroundGrayShadow));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteGrayText4));
        int i2 = Theme.key_windowBackgroundWhiteBlueText4;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCell.class}, new String[]{"textView"}, null, null, -1, null, i2));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCell.class}, new String[]{"imageView"}, null, null, -1, null, i2));
        return arrayList;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    public final void lambda$createView$1$2(Context context, int i) {
        if (i == this.selectChatsRow) {
            InviteMembersBottomSheet inviteMembersBottomSheet = new InviteMembersBottomSheet(context, this.currentAccount, null, 0L, this, null);
            inviteMembersBottomSheet.setDelegate(new VideoEditTextureView$$ExternalSyntheticLambda1(this, 18));
            inviteMembersBottomSheet.setSelectedContacts(this.selectedDialogs);
            showDialog(inviteMembersBottomSheet);
        }
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        if (this.delegate != null) {
            return super.onBackPressed(z);
        }
        if (!z) {
            return false;
        }
        finishActivity();
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        DialogsActivity.loadDialogs(AccountInstance.getInstance(this.currentAccount));
        getMediaDataController().loadHints(true);
        return super.onFragmentCreate();
    }

    public final void updateRows$26() {
        this.rowCount = 2;
        this.selectChatsRow = 1;
        ArrayList arrayList = this.selectedDialogs;
        if (arrayList.isEmpty()) {
            this.chatsStartRow = -1;
            this.chatsEndRow = -1;
        } else {
            int i = this.rowCount;
            this.chatsStartRow = i;
            int size = arrayList.size() + i;
            this.rowCount = size;
            this.chatsEndRow = size;
        }
        int i2 = this.rowCount;
        this.rowCount = i2 + 1;
        this.infoRow = i2;
        ListAdapter listAdapter = this.listAdapter;
        if (listAdapter != null) {
            listAdapter.mObservable.notifyChanged();
        }
    }

    public final class AnonymousClass2 implements RecyclerListView.OnItemLongClickListenerExtended {
        public final Rect rect = new Rect();

        public AnonymousClass2() {
        }

        @Override
        public final boolean mo1082onItemClick(View view, int i, float f, float f2) {
            EditWidgetActivity editWidgetActivity = EditWidgetActivity.this;
            if (editWidgetActivity.getParentActivity() != null && (view instanceof GroupCreateUserCell)) {
                ImageView imageView = (ImageView) view.getTag(R.id.object_tag);
                Rect rect = this.rect;
                imageView.getHitRect(rect);
                if (!rect.contains((int) f, (int) f2)) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(editWidgetActivity.getParentActivity(), 0, null);
                    builder.setItems(new CharSequence[]{LocaleController.getString(R.string.Delete)}, new ThemeActivity$$ExternalSyntheticLambda14(this, i, 1));
                    editWidgetActivity.showDialog(builder.alertDialog);
                    return true;
                }
            }
            return false;
        }

        @Override
        public final void onLongClickRelease() {
        }

        @Override
        public final void onMove(float f) {
        }
    }
}
