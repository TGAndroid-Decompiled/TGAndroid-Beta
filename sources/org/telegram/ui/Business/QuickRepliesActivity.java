package org.telegram.ui.Business;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.text.style.ReplacementSpan;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.util.Consumer;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.AlertDialogDecor;
import org.telegram.ui.ActionBar.BackDrawable;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AnimatedColor;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.Text;
import org.telegram.ui.Components.TypefaceSpan;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.Components.spoilers.SpoilersTextView;
import org.telegram.ui.LaunchActivity;

public class QuickRepliesActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    private static AlertDialog currentDialog;
    private NumberTextView countText;
    private ActionBarMenuItem deleteItem;
    private ActionBarMenuItem editItem;
    private UniversalRecyclerView listView;
    private int repliesOrderId;
    public final ArrayList selected = new ArrayList();
    private boolean shownEditItem = true;

    public static boolean m1398$r8$lambda$ifxmYZdj0M51BTjeMLg3okpfY(View view, MotionEvent motionEvent) {
        return true;
    }

    @Override
    public boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public View createView(Context context) {
        this.actionBar.setBackButtonDrawable(new BackDrawable(false));
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessReplies));
        this.actionBar.setActionBarMenuOnItemClick(new AnonymousClass1());
        ActionBarMenu actionBarMenuCreateActionMode = this.actionBar.createActionMode();
        NumberTextView numberTextView = new NumberTextView(getContext());
        this.countText = numberTextView;
        numberTextView.setTextSize(18);
        this.countText.setTypeface(AndroidUtilities.bold());
        this.countText.setTextColor(Theme.getColor(Theme.key_actionBarActionModeDefaultIcon));
        actionBarMenuCreateActionMode.addView(this.countText, LayoutHelper.createLinear(0, -1, 1.0f, 72, 0, 0, 0));
        this.countText.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return QuickRepliesActivity.m1398$r8$lambda$ifxmYZdj0M51BTjeMLg3okpfY(view, motionEvent);
            }
        });
        ActionBarMenuItem actionBarMenuItemAddItem = actionBarMenuCreateActionMode.addItem(1, R.drawable.msg_edit);
        this.editItem = actionBarMenuItemAddItem;
        actionBarMenuItemAddItem.setContentDescription(LocaleController.getString(R.string.Edit));
        ActionBarMenuItem actionBarMenuItemAddItem2 = actionBarMenuCreateActionMode.addItem(2, R.drawable.msg_delete);
        this.deleteItem = actionBarMenuItemAddItem2;
        actionBarMenuItemAddItem2.setContentDescription(LocaleController.getString(R.string.Delete));
        SizeNotifierFrameLayout sizeNotifierFrameLayout = new SizeNotifierFrameLayout(context) {
            @Override
            protected void onMeasure(int i, int i2) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824));
            }
        };
        sizeNotifierFrameLayout.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundGray));
        UniversalRecyclerView universalRecyclerView = new UniversalRecyclerView(this, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                this.f$0.fillItems((ArrayList) obj, (UniversalAdapter) obj2);
            }
        }, new Utilities.Callback5() {
            @Override
            public final void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                this.f$0.onClick((UItem) obj, (View) obj2, ((Integer) obj3).intValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue());
            }
        }, new Utilities.Callback5Return() {
            @Override
            public final Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                return Boolean.valueOf(this.f$0.onLongClick((UItem) obj, (View) obj2, ((Integer) obj3).intValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue()));
            }
        });
        this.listView = universalRecyclerView;
        universalRecyclerView.setSections();
        this.listView.adapter.setApplyBackground(false);
        this.listView.listenReorder(new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                this.f$0.whenReordered(((Integer) obj).intValue(), (ArrayList) obj2);
            }
        });
        sizeNotifierFrameLayout.addView(this.listView, LayoutHelper.createFrame(-1, -1.0f));
        this.actionBar.setAdaptiveBackground(this.listView, true);
        this.fragmentView = sizeNotifierFrameLayout;
        return sizeNotifierFrameLayout;
    }

    class AnonymousClass1 extends ActionBar.ActionBarMenuOnItemClick {
        AnonymousClass1() {
        }

        @Override
        public void onItemClick(int i) {
            if (i == -1) {
                if (!QuickRepliesActivity.this.selected.isEmpty()) {
                    QuickRepliesActivity.this.clearSelection();
                    return;
                } else {
                    QuickRepliesActivity.this.finishFragment();
                    return;
                }
            }
            if (i != 1) {
                if (i == 2) {
                    QuickRepliesActivity quickRepliesActivity = QuickRepliesActivity.this;
                    quickRepliesActivity.showDialog(new AlertDialog.Builder(quickRepliesActivity.getContext(), QuickRepliesActivity.this.getResourceProvider()).setTitle(LocaleController.formatPluralString("BusinessRepliesDeleteTitle", QuickRepliesActivity.this.selected.size(), new Object[0])).setMessage(LocaleController.formatPluralString("BusinessRepliesDeleteMessage", QuickRepliesActivity.this.selected.size(), new Object[0])).setPositiveButton(LocaleController.getString(R.string.Remove), new AlertDialog.OnButtonClickListener() {
                        @Override
                        public final void onClick(AlertDialog alertDialog, int i2) {
                            QuickRepliesActivity.AnonymousClass1.$r8$lambda$ThS6Ap9puawPzRQdMw83QR0E82I(this.f$0, alertDialog, i2);
                        }
                    }).setNegativeButton(LocaleController.getString(R.string.Cancel), null).create());
                    return;
                }
                return;
            }
            if (QuickRepliesActivity.this.selected.size() != 1) {
                return;
            }
            final int iIntValue = ((Integer) QuickRepliesActivity.this.selected.get(0)).intValue();
            QuickRepliesController.QuickReply quickReplyFindReply = QuickRepliesController.getInstance(((BaseFragment) QuickRepliesActivity.this).currentAccount).findReply(iIntValue);
            if (quickReplyFindReply == null) {
                return;
            }
            QuickRepliesActivity.openRenameReplyAlert(QuickRepliesActivity.this.getContext(), ((BaseFragment) QuickRepliesActivity.this).currentAccount, null, quickReplyFindReply, ((BaseFragment) QuickRepliesActivity.this).resourceProvider, false, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    QuickRepliesActivity.AnonymousClass1.m1401$r8$lambda$n3SewBrXU1N7eqWWi1x8Slu0U(this.f$0, iIntValue, (String) obj);
                }
            });
        }

        public static void m1401$r8$lambda$n3SewBrXU1N7eqWWi1x8Slu0U(AnonymousClass1 anonymousClass1, int i, String str) {
            QuickRepliesActivity.this.clearSelection();
            QuickRepliesController.getInstance(((BaseFragment) QuickRepliesActivity.this).currentAccount).renameReply(i, str);
        }

        public static void $r8$lambda$ThS6Ap9puawPzRQdMw83QR0E82I(AnonymousClass1 anonymousClass1, AlertDialog alertDialog, int i) {
            QuickRepliesController.getInstance(((BaseFragment) QuickRepliesActivity.this).currentAccount).deleteReplies(QuickRepliesActivity.this.selected);
            QuickRepliesActivity.this.clearSelection();
        }
    }

    public void fillItems(ArrayList arrayList, UniversalAdapter universalAdapter) {
        arrayList.add(UItem.asTopView(LocaleController.getString(R.string.BusinessReplies), LocaleController.getString(R.string.BusinessRepliesInfo), "RestrictedEmoji", "📝"));
        universalAdapter.whiteSectionStart();
        if (QuickRepliesController.getInstance(this.currentAccount).canAddNew()) {
            arrayList.add(UItem.asButton(1, R.drawable.msg_viewintopic, LocaleController.getString(R.string.BusinessRepliesAdd)).accent());
        }
        this.repliesOrderId = universalAdapter.reorderSectionStart();
        ArrayList arrayList2 = QuickRepliesController.getInstance(this.currentAccount).replies;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            QuickRepliesController.QuickReply quickReply = (QuickRepliesController.QuickReply) obj;
            arrayList.add(UItem.asQuickReply(quickReply).setChecked(this.selected.contains(Integer.valueOf(quickReply.id))));
        }
        universalAdapter.reorderSectionEnd();
        universalAdapter.whiteSectionEnd();
        arrayList.add(UItem.asShadow(LocaleController.getString(R.string.BusinessRepliesAddInfo)));
    }

    public void whenReordered(int i, ArrayList arrayList) {
        if (i == this.repliesOrderId) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (((UItem) arrayList.get(i2)).object instanceof QuickRepliesController.QuickReply) {
                    ((QuickRepliesController.QuickReply) ((UItem) arrayList.get(i2)).object).order = i2;
                }
            }
            QuickRepliesController.getInstance(this.currentAccount).reorder();
        }
    }

    public void onClick(UItem uItem, View view, int i, float f, float f2) {
        if (uItem.id == 1) {
            openRenameReplyAlert(getContext(), this.currentAccount, null, null, getResourceProvider(), false, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    QuickRepliesActivity.$r8$lambda$OgeiK9N_KLKiq6OIE7u95f3VcfA(this.f$0, (String) obj);
                }
            });
            return;
        }
        if (uItem.viewType == 16 && (uItem.object instanceof QuickRepliesController.QuickReply)) {
            if (!this.selected.isEmpty()) {
                updateSelect(uItem, view);
                return;
            }
            QuickRepliesController.QuickReply quickReply = (QuickRepliesController.QuickReply) uItem.object;
            if (quickReply.local) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("chatMode", 5);
            bundle.putLong("user_id", getUserConfig().getClientUserId());
            bundle.putString("quick_reply", quickReply.name);
            ChatActivity chatActivity = new ChatActivity(bundle);
            chatActivity.setQuickReplyId(quickReply.id);
            presentFragment(chatActivity);
        }
    }

    public static void $r8$lambda$OgeiK9N_KLKiq6OIE7u95f3VcfA(QuickRepliesActivity quickRepliesActivity, String str) {
        quickRepliesActivity.getClass();
        Bundle bundle = new Bundle();
        bundle.putInt("chatMode", 5);
        bundle.putLong("user_id", quickRepliesActivity.getUserConfig().getClientUserId());
        bundle.putString("quick_reply", str);
        ChatActivity chatActivity = new ChatActivity(bundle);
        chatActivity.forceEmptyHistory();
        quickRepliesActivity.presentFragment(chatActivity);
    }

    private void updateSelect(UItem uItem, View view) {
        QuickRepliesController.QuickReply quickReply = (QuickRepliesController.QuickReply) uItem.object;
        QuickReplyView quickReplyView = (QuickReplyView) view;
        if (this.selected.contains(Integer.valueOf(quickReply.id))) {
            this.selected.remove(Integer.valueOf(quickReply.id));
        } else {
            this.selected.add(Integer.valueOf(quickReply.id));
        }
        this.listView.allowReorder(!this.selected.isEmpty());
        boolean zContains = this.selected.contains(Integer.valueOf(quickReply.id));
        uItem.checked = zContains;
        quickReplyView.setChecked(zContains, true);
        if (this.actionBar.isActionModeShowed() == this.selected.isEmpty()) {
            if (this.selected.isEmpty()) {
                this.actionBar.hideActionMode();
            } else {
                this.actionBar.showActionMode();
            }
        }
        this.countText.setNumber(Math.max(1, this.selected.size()), true);
        updateEditItem();
    }

    private void updateEditItem() {
        boolean z = false;
        boolean z2 = this.selected.size() == 1;
        if (z2) {
            QuickRepliesController.QuickReply quickReplyFindReply = QuickRepliesController.getInstance(this.currentAccount).findReply(((Integer) this.selected.get(0)).intValue());
            if (quickReplyFindReply != null && !quickReplyFindReply.isSpecial()) {
                z = true;
            }
        } else {
            z = z2;
        }
        if (this.shownEditItem != z) {
            this.shownEditItem = z;
            this.editItem.animate().alpha(this.shownEditItem ? 1.0f : 0.0f).scaleX(this.shownEditItem ? 1.0f : 0.7f).scaleY(this.shownEditItem ? 1.0f : 0.7f).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).setDuration(340L).start();
        }
    }

    public void clearSelection() {
        this.selected.clear();
        AndroidUtilities.forEachViews((RecyclerView) this.listView, new Consumer() {
            @Override
            public final void accept(Object obj) {
                QuickRepliesActivity.$r8$lambda$DXrWCH_IribtI7QI_T5ifywXdjU((View) obj);
            }
        });
        this.actionBar.hideActionMode();
        this.listView.allowReorder(false);
    }

    public static void $r8$lambda$DXrWCH_IribtI7QI_T5ifywXdjU(View view) {
        if (view instanceof QuickReplyView) {
            ((QuickReplyView) view).setChecked(false, true);
        }
    }

    public boolean onLongClick(UItem uItem, View view, int i, float f, float f2) {
        if (uItem.viewType != 16) {
            return false;
        }
        Object obj = uItem.object;
        if ((obj instanceof QuickRepliesController.QuickReply) && ((QuickRepliesController.QuickReply) obj).local) {
            return false;
        }
        updateSelect(uItem, view);
        return true;
    }

    public static void openRenameReplyAlert(Context context, final int i, String str, final QuickRepliesController.QuickReply quickReply, final Theme.ResourcesProvider resourcesProvider, boolean z, final Utilities.Callback callback) {
        Object builder;
        String str2;
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        Activity activityFindActivity = AndroidUtilities.findActivity(context);
        final View currentFocus = activityFindActivity != null ? activityFindActivity.getCurrentFocus() : null;
        boolean z2 = lastFragment != null && (lastFragment.getFragmentView() instanceof SizeNotifierFrameLayout) && ((SizeNotifierFrameLayout) lastFragment.getFragmentView()).measureKeyboardHeight() > AndroidUtilities.dp(20.0f) && !z;
        final AlertDialog[] alertDialogArr = new AlertDialog[1];
        if (z2) {
            builder = new AlertDialogDecor.Builder(context, resourcesProvider);
        } else {
            builder = new AlertDialog.Builder(context, resourcesProvider);
        }
        ?? r11 = builder;
        r11.setTitle(LocaleController.getString((quickReply == null && str == null) ? R.string.BusinessRepliesNewTitle : R.string.BusinessRepliesEditTitle));
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context) {
            AnimatedTextView.AnimatedTextDrawable limit;
            AnimatedColor limitColor = new AnimatedColor(this);
            private int limitCount;

            {
                AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable(false, true, true);
                this.limit = animatedTextDrawable;
                animatedTextDrawable.setAnimationProperties(0.2f, 0L, 160L, CubicBezierInterpolator.EASE_OUT_QUINT);
                this.limit.setTextSize(AndroidUtilities.dp(15.33f));
                this.limit.setCallback(this);
                this.limit.setGravity(5);
            }

            @Override
            protected boolean verifyDrawable(Drawable drawable) {
                return drawable == this.limit || super.verifyDrawable(drawable);
            }

            @Override
            protected void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                super.onTextChanged(charSequence, i2, i3, i4);
                if (this.limit != null) {
                    this.limitCount = 32 - charSequence.length();
                    this.limit.cancelAnimation();
                    AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.limit;
                    String str3 = "";
                    if (this.limitCount <= 4) {
                        str3 = "" + this.limitCount;
                    }
                    animatedTextDrawable.setText(str3);
                }
            }

            @Override
            protected void dispatchDraw(Canvas canvas) {
                super.dispatchDraw(canvas);
                this.limit.setTextColor(this.limitColor.set(Theme.getColor(this.limitCount < 0 ? Theme.key_text_RedRegular : Theme.key_dialogSearchHint, resourcesProvider)));
                this.limit.setBounds(getScrollX(), 0, getScrollX() + getWidth(), getHeight());
                this.limit.draw(canvas);
            }

            @Override
            protected void onMeasure(int i2, int i3) {
                super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(36.0f), 1073741824));
            }
        };
        MediaDataController.getInstance(i).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        editTextBoldCursor.setTextSize(1, 18.0f);
        if (quickReply == null) {
            str2 = str == null ? "" : str;
        } else {
            str2 = quickReply.name;
        }
        editTextBoldCursor.setText(str2);
        int i2 = Theme.key_dialogTextBlack;
        editTextBoldCursor.setTextColor(Theme.getColor(i2, resourcesProvider));
        editTextBoldCursor.setHintColor(Theme.getColor(Theme.key_groupcreate_hintText, resourcesProvider));
        editTextBoldCursor.setHintText(LocaleController.getString(R.string.BusinessRepliesNamePlaceholder));
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setFocusable(true);
        editTextBoldCursor.setLineColors(Theme.getColor(Theme.key_windowBackgroundWhiteInputField, resourcesProvider), Theme.getColor(Theme.key_windowBackgroundWhiteInputFieldActivated, resourcesProvider), Theme.getColor(Theme.key_text_RedRegular, resourcesProvider));
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setBackgroundDrawable(null);
        editTextBoldCursor.setPadding(0, 0, AndroidUtilities.dp(42.0f), 0);
        editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter() {
            @Override
            public CharSequence filter(CharSequence charSequence, int i3, int i4, Spanned spanned, int i5, int i6) {
                return String.valueOf(charSequence).replaceAll("[^\\d_\\p{L}\\x{200c}\\x{00b7}\\x{0d80}-\\x{0dff}]", "");
            }
        }});
        ?? linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        final TextView textView = new TextView(context);
        textView.setTextColor(Theme.getColor(i2, resourcesProvider));
        textView.setTextSize(1, 16.0f);
        textView.setText(LocaleController.getString((quickReply == null && str == null) ? R.string.BusinessRepliesNewMessage : R.string.BusinessRepliesEditMessage));
        frameLayout.addView(textView, LayoutHelper.createFrame(-1, -2, 83));
        final TextView textView2 = new TextView(context);
        textView2.setTextColor(Theme.getColor(Theme.key_text_RedBold, resourcesProvider));
        textView2.setTextSize(1, 16.0f);
        textView2.setText(LocaleController.getString(R.string.BusinessRepliesNameBusy));
        textView2.setAlpha(0.0f);
        frameLayout.addView(textView2, LayoutHelper.createFrame(-1, -2, 83));
        final ValueAnimator[] valueAnimatorArr = new ValueAnimator[1];
        final Runnable[] runnableArr = {new Runnable() {
            @Override
            public final void run() {
                callback.run(Boolean.FALSE);
            }
        }};
        final Utilities.Callback callback2 = new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                QuickRepliesActivity.m1396$r8$lambda$VHsMSvYMPiYKY5kqrnTah4CNd4(runnableArr, valueAnimatorArr, textView2, textView, (Boolean) obj);
            }
        };
        editTextBoldCursor.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (textView2.getAlpha() > 0.0f) {
                    AndroidUtilities.cancelRunOnUIThread(runnableArr[0]);
                    AndroidUtilities.runOnUIThread(runnableArr[0]);
                }
            }
        });
        linearLayout.addView(frameLayout, LayoutHelper.createLinear(-1, -2, 24.0f, 5.0f, 24.0f, 12.0f));
        linearLayout.addView(editTextBoldCursor, LayoutHelper.createLinear(-1, -2, 24.0f, 0.0f, 24.0f, 10.0f));
        r11.setView(linearLayout);
        r11.setWidth(AndroidUtilities.dp(292.0f));
        editTextBoldCursor.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView3, int i3, KeyEvent keyEvent) {
                if (i3 != 6) {
                    return false;
                }
                String string = editTextBoldCursor.getText().toString();
                if (string.length() <= 0 || string.length() > 32) {
                    AndroidUtilities.shakeView(editTextBoldCursor);
                    return true;
                }
                QuickRepliesController quickRepliesController = QuickRepliesController.getInstance(i);
                QuickRepliesController.QuickReply quickReply2 = quickReply;
                if (quickRepliesController.isNameBusy(string, quickReply2 == null ? -1 : quickReply2.id)) {
                    AndroidUtilities.shakeView(editTextBoldCursor);
                    textView2.setText(LocaleController.getString(R.string.BusinessRepliesNameBusy));
                    callback2.run(Boolean.TRUE);
                    return true;
                }
                Utilities.Callback callback3 = callback;
                if (callback3 != null) {
                    callback3.run(string);
                }
                AlertDialog alertDialog = alertDialogArr[0];
                if (alertDialog != null) {
                    alertDialog.dismiss();
                }
                if (alertDialogArr[0] == QuickRepliesActivity.currentDialog) {
                    AlertDialog unused = QuickRepliesActivity.currentDialog = null;
                }
                View view = currentFocus;
                if (view != null) {
                    view.requestFocus();
                }
                return true;
            }
        });
        r11.setPositiveButton(LocaleController.getString(R.string.Done), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i3) {
                QuickRepliesActivity.$r8$lambda$0pRxDBuy8ztEkr1uoTVgdmpUhUM(editTextBoldCursor, callback2, i, quickReply, textView2, callback, alertDialog, i3);
            }
        });
        r11.setNegativeButton(LocaleController.getString(R.string.Cancel), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i3) {
                alertDialog.dismiss();
            }
        });
        if (z2) {
            AlertDialog alertDialogCreate = r11.create();
            currentDialog = alertDialogCreate;
            alertDialogArr[0] = alertDialogCreate;
            alertDialogCreate.setOnDismissListener(new DialogInterface.OnDismissListener() {
                @Override
                public final void onDismiss(DialogInterface dialogInterface) {
                    QuickRepliesActivity.$r8$lambda$sF9FHqFkkH3wZHUsi6MiJxSdiw8(currentFocus, dialogInterface);
                }
            });
            currentDialog.setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    QuickRepliesActivity.$r8$lambda$mvxXaGaQpNH83o7El7LuGcpnyNA(editTextBoldCursor, dialogInterface);
                }
            });
            currentDialog.showDelayed(250L);
        } else {
            r11.overrideDismissListener(new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    QuickRepliesActivity.m1394$r8$lambda$QvBAgX4oJR40YLK8c3o2Ep4iU(editTextBoldCursor, (Runnable) obj);
                }
            });
            AlertDialog alertDialogCreate2 = r11.create();
            alertDialogArr[0] = alertDialogCreate2;
            alertDialogCreate2.setOnDismissListener(new DialogInterface.OnDismissListener() {
                @Override
                public final void onDismiss(DialogInterface dialogInterface) {
                    AndroidUtilities.hideKeyboard(editTextBoldCursor);
                }
            });
            alertDialogArr[0].setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    QuickRepliesActivity.$r8$lambda$ZSAcGoE2QDXJpND0A7RqwPPsXOI(editTextBoldCursor, dialogInterface);
                }
            });
            alertDialogArr[0].show();
        }
        alertDialogArr[0].setDismissDialogByButtons(false);
        editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
    }

    public static void m1396$r8$lambda$VHsMSvYMPiYKY5kqrnTah4CNd4(Runnable[] runnableArr, ValueAnimator[] valueAnimatorArr, final TextView textView, final TextView textView2, Boolean bool) {
        AndroidUtilities.cancelRunOnUIThread(runnableArr[0]);
        ValueAnimator valueAnimator = valueAnimatorArr[0];
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(textView.getAlpha(), bool.booleanValue() ? 1.0f : 0.0f);
        valueAnimatorArr[0] = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                QuickRepliesActivity.$r8$lambda$YvpIIRQr5jc8H4moXkzXFBpXttM(textView, textView2, valueAnimator2);
            }
        });
        valueAnimatorArr[0].setDuration(320L);
        valueAnimatorArr[0].setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        valueAnimatorArr[0].start();
        if (bool.booleanValue()) {
            AndroidUtilities.runOnUIThread(runnableArr[0], 5320L);
        }
    }

    public static void $r8$lambda$YvpIIRQr5jc8H4moXkzXFBpXttM(TextView textView, TextView textView2, ValueAnimator valueAnimator) {
        textView.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        textView2.setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static void $r8$lambda$0pRxDBuy8ztEkr1uoTVgdmpUhUM(EditTextBoldCursor editTextBoldCursor, Utilities.Callback callback, int i, QuickRepliesController.QuickReply quickReply, TextView textView, Utilities.Callback callback2, AlertDialog alertDialog, int i2) {
        String string = editTextBoldCursor.getText().toString();
        if (string.length() <= 0 || string.length() > 32) {
            AndroidUtilities.shakeView(editTextBoldCursor);
            callback.run(Boolean.FALSE);
            return;
        }
        if (QuickRepliesController.getInstance(i).isNameBusy(string, quickReply == null ? -1 : quickReply.id)) {
            AndroidUtilities.shakeView(editTextBoldCursor);
            textView.setText(LocaleController.getString(R.string.BusinessRepliesNameBusy));
            callback.run(Boolean.TRUE);
        } else {
            if (callback2 != null) {
                callback2.run(string);
            }
            alertDialog.dismiss();
        }
    }

    public static void $r8$lambda$sF9FHqFkkH3wZHUsi6MiJxSdiw8(View view, DialogInterface dialogInterface) {
        currentDialog = null;
        if (view != null) {
            view.requestFocus();
        }
    }

    public static void $r8$lambda$mvxXaGaQpNH83o7El7LuGcpnyNA(EditTextBoldCursor editTextBoldCursor, DialogInterface dialogInterface) {
        editTextBoldCursor.requestFocus();
        AndroidUtilities.showKeyboard(editTextBoldCursor);
    }

    public static void m1394$r8$lambda$QvBAgX4oJR40YLK8c3o2Ep4iU(EditTextBoldCursor editTextBoldCursor, Runnable runnable) {
        AndroidUtilities.hideKeyboard(editTextBoldCursor);
        AndroidUtilities.runOnUIThread(runnable, 80L);
    }

    public static void $r8$lambda$ZSAcGoE2QDXJpND0A7RqwPPsXOI(EditTextBoldCursor editTextBoldCursor, DialogInterface dialogInterface) {
        editTextBoldCursor.requestFocus();
        AndroidUtilities.showKeyboard(editTextBoldCursor);
    }

    @Override
    public boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.quickRepliesUpdated);
        QuickRepliesController.getInstance(this.currentAccount).load();
        return super.onFragmentCreate();
    }

    @Override
    public void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.quickRepliesUpdated);
        super.onFragmentDestroy();
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        UniversalRecyclerView universalRecyclerView;
        UniversalAdapter universalAdapter;
        if (i != NotificationCenter.quickRepliesUpdated || (universalRecyclerView = this.listView) == null || (universalAdapter = universalRecyclerView.adapter) == null) {
            return;
        }
        universalAdapter.update(true);
    }

    private static class MoreSpan extends ReplacementSpan {
        private final Paint backgroundPaint = new Paint(1);
        private final Text text;

        public MoreSpan(int i) {
            this.text = new Text(LocaleController.formatPluralString("BusinessRepliesMore", i, new Object[0]), 9.33f, AndroidUtilities.bold());
        }

        public static CharSequence of(int i, int[] iArr) {
            SpannableString spannableString = new SpannableString("+");
            MoreSpan moreSpan = new MoreSpan(i);
            iArr[0] = moreSpan.getSize();
            spannableString.setSpan(moreSpan, 0, spannableString.length(), 33);
            return spannableString;
        }

        public int getSize() {
            return (int) (this.text.getCurrentWidth() + AndroidUtilities.dp(10.0f));
        }

        @Override
        public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
            return getSize();
        }

        @Override
        public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
            float fDpf2 = AndroidUtilities.dpf2(14.66f);
            float f2 = (i3 + i5) / 2.0f;
            RectF rectF = AndroidUtilities.rectTmp;
            float f3 = fDpf2 / 2.0f;
            rectF.set(f, f2 - f3, getSize() + f, f3 + f2);
            Paint paint2 = this.backgroundPaint;
            int i6 = Theme.key_windowBackgroundWhiteGrayText2;
            paint2.setColor(Theme.multAlpha(Theme.getColor(i6), 0.15f));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), this.backgroundPaint);
            this.text.draw(canvas, f + AndroidUtilities.dp(5.0f), f2, Theme.getColor(i6), Utilities.clamp((paint.getAlpha() * 2) / 255.0f, 1.0f, 0.0f));
        }
    }

    public static class QuickReplyView extends FrameLayout {
        private final AvatarDrawable avatarDrawable;
        private final CheckBox2 checkBox;
        private final ImageReceiver imageReceiver;
        private boolean local;
        private boolean needDivider;
        private final ImageView orderView;
        private final Theme.ResourcesProvider resourcesProvider;
        private int[] spanWidth;
        private final TextView textView;

        public QuickReplyView(Context context, boolean z, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.avatarDrawable = new AvatarDrawable();
            this.imageReceiver = new ImageReceiver(this);
            this.spanWidth = new int[1];
            this.resourcesProvider = resourcesProvider;
            setWillNotDraw(false);
            int i = z ? 42 : 16;
            SpoilersTextView spoilersTextView = new SpoilersTextView(context);
            this.textView = spoilersTextView;
            spoilersTextView.setLines(2);
            spoilersTextView.setEllipsize(TextUtils.TruncateAt.END);
            spoilersTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider));
            spoilersTextView.setTextSize(1, 14.0f);
            boolean z2 = LocaleController.isRTL;
            addView(spoilersTextView, LayoutHelper.createFrame(-1, -2.0f, 7, z2 ? i : 64.0f, 7.0f, z2 ? 64.0f : i, 0.0f));
            if (z) {
                ImageView imageView = new ImageView(context);
                this.orderView = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setImageResource(R.drawable.list_reorder);
                imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_stickers_menu), PorterDuff.Mode.MULTIPLY));
                imageView.setAlpha(0.0f);
                addView(imageView, LayoutHelper.createFrame(50, 50, (LocaleController.isRTL ? 3 : 5) | 112));
            } else {
                this.orderView = null;
            }
            CheckBox2 checkBox2 = new CheckBox2(getContext(), 21, resourcesProvider);
            this.checkBox = checkBox2;
            checkBox2.setColor(-1, Theme.key_windowBackgroundWhite, Theme.key_checkboxCheck);
            checkBox2.setDrawUnchecked(false);
            checkBox2.setDrawBackgroundAsArc(3);
            addView(checkBox2, LayoutHelper.createFrameRelatively(24.0f, 24.0f, 8388659, 33.0f, 25.0f, 0.0f, 0.0f));
        }

        public void invalidateEmojis() {
            this.textView.invalidate();
        }

        public void setChecked(boolean z, boolean z2) {
            this.checkBox.setChecked(z, z2);
        }

        public void setReorder(boolean z) {
            this.orderView.animate().alpha((!z || this.local) ? 0.0f : 1.0f).start();
        }

        public void set(QuickRepliesController.QuickReply quickReply, String str, boolean z) {
            TLRPC.WebPage webPage;
            TLRPC.Photo photo;
            long j;
            String str2;
            ImageLocation imageLocation;
            TLRPC.Photo photo2;
            String str3 = str;
            this.local = quickReply != null ? quickReply.local : false;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (str3 != null && str3.length() > 0 && !str3.startsWith("/")) {
                str3 = "/" + str3;
            }
            spannableStringBuilder.append((CharSequence) "/").append((CharSequence) quickReply.name);
            spannableStringBuilder.setSpan(new TypefaceSpan(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, this.resourcesProvider)), 0, spannableStringBuilder.length(), 33);
            if (str3 != null) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(Theme.getColor(Theme.key_windowBackgroundWhiteBlueText2, this.resourcesProvider)), 0, Math.min(str3.length() <= 0 ? 1 : str3.length(), spannableStringBuilder.length()), 33);
            }
            if (quickReply.topMessage != null) {
                spannableStringBuilder.append((CharSequence) " ");
                CharSequence charSequence = quickReply.topMessage.caption;
                if (TextUtils.isEmpty(charSequence)) {
                    charSequence = quickReply.topMessage.messageText;
                }
                CharSequence charSequenceReplaceEmoji = Emoji.replaceEmoji(new SpannableStringBuilder(charSequence), this.textView.getPaint().getFontMetricsInt(), false);
                TLRPC.Message message = quickReply.topMessage.messageOwner;
                if (message != null) {
                    MessageObject.replaceAnimatedEmoji(charSequenceReplaceEmoji, message.entities, this.textView.getPaint().getFontMetricsInt());
                }
                spannableStringBuilder.append(charSequenceReplaceEmoji);
            }
            if (quickReply.getMessagesCount() > 1) {
                spannableStringBuilder.append((CharSequence) "  ");
                int iDp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(80.0f);
                CharSequence charSequenceOf = MoreSpan.of(quickReply.getMessagesCount() - 1, this.spanWidth);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(TextUtils.ellipsize(spannableStringBuilder, this.textView.getPaint(), (iDp * 1.5f) - this.spanWidth[0], TextUtils.TruncateAt.END));
                if (spannableStringBuilder2.length() > 0 && spannableStringBuilder2.charAt(spannableStringBuilder2.length() - 1) == 8230) {
                    spannableStringBuilder2.append((CharSequence) "  ");
                }
                spannableStringBuilder2.append(charSequenceOf);
                spannableStringBuilder = spannableStringBuilder2;
            }
            this.textView.setText(spannableStringBuilder);
            int i = UserConfig.selectedAccount;
            TLRPC.MessageMedia media = MessageObject.getMedia(quickReply.topMessage);
            if (media != null && (photo2 = media.photo) != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo2.sizes, AndroidUtilities.dp(36.0f), true, null, true);
                ImageReceiver imageReceiver = this.imageReceiver;
                ImageLocation forObject = ImageLocation.getForObject(closestPhotoSizeWithSize, media.photo);
                MessageObject messageObject = quickReply.topMessage;
                imageReceiver.setImage(forObject, "36_36", messageObject.strippedThumb, closestPhotoSizeWithSize != null ? closestPhotoSizeWithSize.size : 0L, (String) null, messageObject, 0);
                this.imageReceiver.setRoundRadius(AndroidUtilities.dp(4.0f));
            } else if (media != null && media.document != null && (quickReply.topMessage.isVideo() || quickReply.topMessage.isSticker())) {
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(media.document.thumbs, AndroidUtilities.dp(36.0f), true, null, true);
                if (closestPhotoSizeWithSize2 == null) {
                    ImageLocation forDocument = ImageLocation.getForDocument(media.document);
                    j = media.document.size;
                    imageLocation = forDocument;
                    str2 = "g";
                } else {
                    ImageLocation forObject2 = ImageLocation.getForObject(closestPhotoSizeWithSize2, media.document);
                    j = closestPhotoSizeWithSize2.size;
                    str2 = "36_36";
                    imageLocation = forObject2;
                }
                long j2 = j;
                ImageReceiver imageReceiver2 = this.imageReceiver;
                MessageObject messageObject2 = quickReply.topMessage;
                imageReceiver2.setImage(imageLocation, str2, messageObject2.strippedThumb, j2, (String) null, messageObject2, 0);
                this.imageReceiver.setRoundRadius(AndroidUtilities.dp(4.0f));
            } else if (media != null && (webPage = media.webpage) != null && (photo = webPage.photo) != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.dp(36.0f), true, null, true);
                this.imageReceiver.setImage(ImageLocation.getForObject(closestPhotoSizeWithSize3, media.webpage.photo), "36_36", quickReply.topMessage.strippedThumb, closestPhotoSizeWithSize3 != null ? closestPhotoSizeWithSize3.size : 0L, (String) null, media.webpage, 0);
                this.imageReceiver.setRoundRadius(AndroidUtilities.dp(4.0f));
            } else {
                this.avatarDrawable.setInfo(UserConfig.getInstance(i).getCurrentUser());
                this.imageReceiver.setForUserOrChat(UserConfig.getInstance(i).getCurrentUser(), this.avatarDrawable);
                this.imageReceiver.setRoundRadius(AndroidUtilities.dp(36.0f));
            }
            this.needDivider = z;
            invalidate();
        }

        @Override
        protected void onDraw(Canvas canvas) {
            this.imageReceiver.setImageCoords(LocaleController.isRTL ? getMeasuredWidth() - AndroidUtilities.dp(51.0f) : AndroidUtilities.dp(15.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f));
            this.imageReceiver.draw(canvas);
            super.onDraw(canvas);
            if (this.needDivider) {
                Paint themePaint = Theme.getThemePaint("paintDivider", this.resourcesProvider);
                if (themePaint == null) {
                    themePaint = Theme.dividerPaint;
                }
                canvas.drawRect(AndroidUtilities.dp(LocaleController.isRTL ? 0.0f : 64.0f), getMeasuredHeight() - 1, getWidth() - AndroidUtilities.dp(LocaleController.isRTL ? 64.0f : 0.0f), getMeasuredHeight(), themePaint);
            }
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f) + (this.needDivider ? 1 : 0), 1073741824));
        }
    }

    public static class LargeQuickReplyView extends FrameLayout {
        private final Paint arrowPaint;
        private final Path arrowPath;
        private final AvatarDrawable avatarDrawable;
        private final CheckBox2 checkBox;
        private final ImageReceiver imageReceiver;
        private boolean needDivider;
        private final Theme.ResourcesProvider resourcesProvider;
        private int[] spanWidth;
        private final TextView textView;
        private final TextView titleView;

        public LargeQuickReplyView(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.avatarDrawable = new AvatarDrawable();
            this.imageReceiver = new ImageReceiver(this);
            this.arrowPath = new Path();
            this.arrowPaint = new Paint(1);
            this.spanWidth = new int[1];
            this.resourcesProvider = resourcesProvider;
            setWillNotDraw(false);
            TextView textView = new TextView(context);
            this.titleView = textView;
            textView.setSingleLine();
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            textView.setEllipsize(truncateAt);
            textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextSize(1, 16.0f);
            boolean z = LocaleController.isRTL;
            addView(textView, LayoutHelper.createFrame(-1, -2.0f, 7, z ? 40.0f : 78.0f, 10.33f, z ? 78.0f : 40.0f, 0.0f));
            TextView textView2 = new TextView(context);
            this.textView = textView2;
            textView2.setLines(2);
            textView2.setEllipsize(truncateAt);
            textView2.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider));
            textView2.setTextSize(1, 15.0f);
            boolean z2 = LocaleController.isRTL;
            addView(textView2, LayoutHelper.createFrame(-1, -2.0f, 7, z2 ? 40.0f : 78.0f, 32.0f, z2 ? 78.0f : 40.0f, 0.0f));
            CheckBox2 checkBox2 = new CheckBox2(getContext(), 21, resourcesProvider);
            this.checkBox = checkBox2;
            checkBox2.setColor(-1, Theme.key_windowBackgroundWhite, Theme.key_checkboxCheck);
            checkBox2.setDrawUnchecked(false);
            checkBox2.setDrawBackgroundAsArc(3);
            addView(checkBox2, LayoutHelper.createFrameRelatively(24.0f, 24.0f, 8388659, 33.0f, 25.0f, 0.0f, 0.0f));
        }

        public void setChecked(boolean z, boolean z2) {
            this.checkBox.setChecked(z, z2);
        }

        public void set(QuickRepliesController.QuickReply quickReply, boolean z) {
            TLRPC.Document document;
            long j;
            String str;
            ImageLocation imageLocation;
            TLRPC.Photo photo;
            int i = UserConfig.selectedAccount;
            this.titleView.setText(MessagesController.getInstance(i).getPeerName(UserConfig.getInstance(i).getClientUserId()));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            MessageObject messageObject = quickReply.topMessage;
            if (messageObject != null) {
                spannableStringBuilder.append(Emoji.replaceEmoji(messageObject.messageText, this.textView.getPaint().getFontMetricsInt(), false));
            }
            if (quickReply.getMessagesCount() > 1) {
                spannableStringBuilder.append((CharSequence) "  ");
                int iDp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(80.0f);
                CharSequence charSequenceOf = MoreSpan.of(quickReply.getMessagesCount() - 1, this.spanWidth);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(TextUtils.ellipsize(spannableStringBuilder, this.textView.getPaint(), (iDp * 1.5f) - this.spanWidth[0], TextUtils.TruncateAt.END));
                if (spannableStringBuilder2.length() > 0 && spannableStringBuilder2.charAt(spannableStringBuilder2.length() - 1) == 8230) {
                    spannableStringBuilder2.append((CharSequence) "  ");
                }
                spannableStringBuilder2.append(charSequenceOf);
                spannableStringBuilder = spannableStringBuilder2;
            }
            this.textView.setText(spannableStringBuilder);
            TLRPC.MessageMedia media = MessageObject.getMedia(quickReply.topMessage);
            if (media != null && (photo = media.photo) != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.dp(36.0f), true, null, true);
                ImageReceiver imageReceiver = this.imageReceiver;
                ImageLocation forObject = ImageLocation.getForObject(closestPhotoSizeWithSize, media.photo);
                MessageObject messageObject2 = quickReply.topMessage;
                imageReceiver.setImage(forObject, "36_36", messageObject2.strippedThumb, closestPhotoSizeWithSize == null ? 0L : closestPhotoSizeWithSize.size, (String) null, messageObject2, 0);
                this.imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
            } else if (media != null && (document = media.document) != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(36.0f), true, null, true);
                if (closestPhotoSizeWithSize2 == null) {
                    ImageLocation forDocument = ImageLocation.getForDocument(media.document);
                    j = media.document.size;
                    imageLocation = forDocument;
                    str = "g";
                } else {
                    ImageLocation forObject2 = ImageLocation.getForObject(closestPhotoSizeWithSize2, media.document);
                    j = closestPhotoSizeWithSize2.size;
                    str = "36_36";
                    imageLocation = forObject2;
                }
                long j2 = j;
                ImageReceiver imageReceiver2 = this.imageReceiver;
                MessageObject messageObject3 = quickReply.topMessage;
                imageReceiver2.setImage(imageLocation, str, messageObject3.strippedThumb, j2, (String) null, messageObject3, 0);
                this.imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
            } else {
                this.avatarDrawable.setInfo(UserConfig.getInstance(i).getCurrentUser());
                this.imageReceiver.setForUserOrChat(UserConfig.getInstance(i).getCurrentUser(), this.avatarDrawable);
                this.imageReceiver.setRoundRadius(AndroidUtilities.dp(56.0f));
            }
            this.needDivider = z;
            invalidate();
        }

        @Override
        protected void onDraw(Canvas canvas) {
            this.imageReceiver.setImageCoords(LocaleController.isRTL ? getMeasuredWidth() - AndroidUtilities.dp(65.0f) : AndroidUtilities.dp(9.0f), AndroidUtilities.dp(11.33f), AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f));
            this.imageReceiver.draw(canvas);
            super.onDraw(canvas);
            canvas.drawPath(this.arrowPath, this.arrowPaint);
            if (this.needDivider) {
                Paint themePaint = Theme.getThemePaint("paintDivider", this.resourcesProvider);
                if (themePaint == null) {
                    themePaint = Theme.dividerPaint;
                }
                canvas.drawRect(AndroidUtilities.dp(LocaleController.isRTL ? 0.0f : 78.0f), getMeasuredHeight() - 1, getWidth() - AndroidUtilities.dp(LocaleController.isRTL ? 78.0f : 0.0f), getMeasuredHeight(), themePaint);
            }
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(78.0f) + (this.needDivider ? 1 : 0), 1073741824));
            this.arrowPaint.setStyle(Paint.Style.STROKE);
            this.arrowPaint.setStrokeCap(Paint.Cap.ROUND);
            this.arrowPaint.setStrokeJoin(Paint.Join.ROUND);
            this.arrowPaint.setStrokeWidth(AndroidUtilities.dpf2(1.66f));
            this.arrowPaint.setColor(Theme.multAlpha(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, this.resourcesProvider), 0.85f));
            this.arrowPath.rewind();
            float measuredHeight = getMeasuredHeight() / 2.0f;
            float fDpf2 = LocaleController.isRTL ? AndroidUtilities.dpf2(29.66f) : getMeasuredWidth() - AndroidUtilities.dpf2(24.33f);
            this.arrowPath.moveTo(fDpf2, measuredHeight - AndroidUtilities.dpf2(5.66f));
            this.arrowPath.lineTo(((LocaleController.isRTL ? -1 : 1) * AndroidUtilities.dpf2(5.33f)) + fDpf2, measuredHeight);
            this.arrowPath.lineTo(fDpf2, measuredHeight + AndroidUtilities.dpf2(5.66f));
        }
    }

    @Override
    public void onInsets(int i, int i2, int i3, int i4) {
        this.listView.setPadding(0, 0, 0, i4);
        this.listView.setClipToPadding(false);
    }
}
