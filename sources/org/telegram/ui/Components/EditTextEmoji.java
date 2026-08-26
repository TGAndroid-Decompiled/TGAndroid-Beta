package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableString;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.XiaomiUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AdjustPanLayoutHelper;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;

public class EditTextEmoji extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, SizeNotifierFrameLayout.SizeNotifierFrameLayoutDelegate {
    public static final int STYLE_CALL = 5;
    public static final int STYLE_DIALOG = 1;
    public static final int STYLE_FRAGMENT = 0;
    public static final int STYLE_GIFT = 4;
    public static final int STYLE_PHOTOVIEWER = 3;
    public static final int STYLE_STORY = 2;
    AdjustPanLayoutHelper adjustPanLayoutHelper;
    private boolean allowAnimatedEmoji;
    private boolean allowEmojisForNonPremium;
    private int currentStyle;
    private EditTextEmojiDelegate delegate;
    private boolean destroyed;
    private EditTextCaption editText;
    private ImageView emojiButton;
    public boolean emojiExpanded;
    private ReplaceableIconDrawable emojiIconDrawable;
    private int emojiPadding;
    private EmojiView emojiView;
    private float emojiViewAlpha;
    private int emojiViewCacheType;
    private boolean emojiViewVisible;
    private ItemOptions formatOptions;
    public boolean glassDesignForEmojiView;
    public boolean includeNavigationBar;
    private int innerTextChange;
    private boolean isAnimatePopupClosing;
    private boolean isPaused;
    private int keyboardHeight;
    private int keyboardHeightLand;
    private boolean keyboardVisible;
    private boolean lastEmojiExpanded;
    private int lastSizeChangeValue1;
    private boolean lastSizeChangeValue2;
    private Runnable openKeyboardRunnable;
    private BaseFragment parentFragment;
    private final Theme.ResourcesProvider resourcesProvider;
    private boolean showKeyboardOnResume;
    private boolean shownFormatButton;
    private SizeNotifierFrameLayout sizeNotifierLayout;
    private boolean waitingForKeyboardOpen;

    public class AnonymousClass7 implements EmojiView.EmojiViewDelegate {
        public AnonymousClass7() {
        }

        public void lambda$onClearEmojiRecent$0(AlertDialog alertDialog, int i) {
            EditTextEmoji.this.emojiView.clearRecentEmoji();
        }

        @Override
        public final boolean canAddCaptionToGif(TLRPC.Document document) {
            return EmojiView.EmojiViewDelegate.CC.$default$canAddCaptionToGif(this, document);
        }

        @Override
        public final boolean canSchedule() {
            return EmojiView.EmojiViewDelegate.CC.$default$canSchedule(this);
        }

        @Override
        public final long getDialogId() {
            return EmojiView.EmojiViewDelegate.CC.$default$getDialogId(this);
        }

        @Override
        public final float getProgressToSearchOpened() {
            return EmojiView.EmojiViewDelegate.CC.$default$getProgressToSearchOpened(this);
        }

        @Override
        public final int getThreadId() {
            return EmojiView.EmojiViewDelegate.CC.$default$getThreadId(this);
        }

        @Override
        public final void invalidateEnterView() {
            EmojiView.EmojiViewDelegate.CC.$default$invalidateEnterView(this);
        }

        @Override
        public final boolean isExpanded() {
            return EmojiView.EmojiViewDelegate.CC.$default$isExpanded(this);
        }

        @Override
        public final boolean isInScheduleMode() {
            return EmojiView.EmojiViewDelegate.CC.$default$isInScheduleMode(this);
        }

        @Override
        public boolean isSearchOpened() {
            return EditTextEmoji.this.emojiExpanded;
        }

        @Override
        public final boolean isUserSelf() {
            return EmojiView.EmojiViewDelegate.CC.$default$isUserSelf(this);
        }

        @Override
        public void onAnimatedEmojiUnlockClick() {
            BaseFragment baseFragment = EditTextEmoji.this.parentFragment;
            if (baseFragment != null) {
                baseFragment.showDialog(new PremiumFeatureBottomSheet(baseFragment, baseFragment.getContext(), baseFragment.getCurrentAccount(), false, 11, false, null));
            } else {
                BaseFragment baseFragment2 = new BaseFragment() {
                    @Override
                    public Context getContext() {
                        return EditTextEmoji.this.getContext();
                    }

                    @Override
                    public int getCurrentAccount() {
                        return this.currentAccount;
                    }

                    @Override
                    public Activity getParentActivity() {
                        for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                            if (context instanceof Activity) {
                                return (Activity) context;
                            }
                        }
                        return null;
                    }

                    @Override
                    public Dialog getVisibleDialog() {
                        return new Dialog(EditTextEmoji.this.getContext()) {
                            @Override
                            public void dismiss() {
                                EditTextEmoji.this.hidePopup(false);
                                EditTextEmoji.this.closeParent();
                            }
                        };
                    }
                };
                new PremiumFeatureBottomSheet(baseFragment2, baseFragment2.getContext(), baseFragment2.getCurrentAccount(), false, 11, false, null).show();
            }
        }

        @Override
        public boolean onBackspace() {
            if (EditTextEmoji.this.editText.length() == 0) {
                return false;
            }
            EditTextEmoji.this.editText.dispatchKeyEvent(new KeyEvent(0, 67));
            return true;
        }

        @Override
        public void onClearEmojiRecent() {
            AlertDialog.Builder builder = new AlertDialog.Builder(EditTextEmoji.this.getContext(), 0, EditTextEmoji.this.resourcesProvider);
            builder.setTitle(LocaleController.getString(R.string.ClearRecentEmojiTitle));
            builder.setMessage(LocaleController.getString(R.string.ClearRecentEmojiText));
            builder.setPositiveButton(LocaleController.getString(R.string.ClearButton), new EmojiView$$ExternalSyntheticLambda21(this, 7));
            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            if (EditTextEmoji.this.parentFragment != null) {
                EditTextEmoji.this.parentFragment.showDialog(builder.create());
            } else {
                builder.show();
            }
        }

        @Override
        public void onCustomEmojiSelected(long j, TLRPC.Document document, String str, boolean z) {
            int selectionEnd = EditTextEmoji.this.editText.getSelectionEnd();
            if (selectionEnd < 0) {
                selectionEnd = 0;
            }
            try {
                EditTextEmoji.this.innerTextChange = 2;
                SpannableString spannableString = new SpannableString(str);
                AnimatedEmojiSpan animatedEmojiSpan = document != null ? new AnimatedEmojiSpan(document, EditTextEmoji.this.editText.getPaint().getFontMetricsInt()) : new AnimatedEmojiSpan(j, EditTextEmoji.this.editText.getPaint().getFontMetricsInt());
                animatedEmojiSpan.cacheType = EditTextEmoji.this.emojiView.emojiCacheType;
                spannableString.setSpan(animatedEmojiSpan, 0, spannableString.length(), 33);
                EditTextEmoji.this.editText.setText(EditTextEmoji.this.editText.getText().insert(selectionEnd, spannableString));
                int length = selectionEnd + spannableString.length();
                EditTextEmoji.this.editText.setSelection(length, length);
            } catch (Exception e) {
                FileLog.e(e);
            } finally {
                EditTextEmoji.this.innerTextChange = 0;
            }
        }

        @Override
        public void onEmojiSelected(String str) {
            int selectionEnd = EditTextEmoji.this.editText.getSelectionEnd();
            if (selectionEnd < 0) {
                selectionEnd = 0;
            }
            try {
                EditTextEmoji.this.innerTextChange = 2;
                CharSequence charSequenceReplaceEmoji = Emoji.replaceEmoji(str, EditTextEmoji.this.editText.getPaint().getFontMetricsInt(), false);
                EditTextEmoji.this.editText.setText(EditTextEmoji.this.editText.getText().insert(selectionEnd, charSequenceReplaceEmoji));
                int length = selectionEnd + charSequenceReplaceEmoji.length();
                EditTextEmoji.this.editText.setSelection(length, length);
            } catch (Exception e) {
                FileLog.e(e);
            } finally {
                EditTextEmoji.this.innerTextChange = 0;
            }
        }

        @Override
        public final void onEmojiSettingsClick(ArrayList arrayList) {
            EmojiView.EmojiViewDelegate.CC.$default$onEmojiSettingsClick(this, arrayList);
        }

        @Override
        public final void onGifSelected(View view, Object obj, String str, Object obj2, boolean z, int i, int i2) {
            EmojiView.EmojiViewDelegate.CC.$default$onGifSelected(this, view, obj, str, obj2, z, i, i2);
        }

        @Override
        public final void onGifSelectedForAddCaption(View view, Object obj, String str, Object obj2, boolean z, int i, int i2) {
            EmojiView.EmojiViewDelegate.CC.$default$onGifSelectedForAddCaption(this, view, obj, str, obj2, z, i, i2);
        }

        @Override
        public void onSearchOpenClose(int i) {
            if (EditTextEmoji.this.allowSearch()) {
                EditTextEmoji editTextEmoji = EditTextEmoji.this;
                editTextEmoji.emojiExpanded = i != 0;
                editTextEmoji.updatedEmojiExpanded();
                if (EditTextEmoji.this.sizeNotifierLayout != null) {
                    EditTextEmoji.this.sizeNotifierLayout.notifyHeightChanged();
                }
            }
        }

        @Override
        public final void onShowStickerSet(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z) {
            EmojiView.EmojiViewDelegate.CC.$default$onShowStickerSet(this, stickerSet, inputStickerSet, z);
        }

        @Override
        public final void onStickerSelected(View view, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z, int i, int i2) {
            EmojiView.EmojiViewDelegate.CC.$default$onStickerSelected(this, view, document, str, obj, sendAnimationData, z, i, i2);
        }

        @Override
        public final void onStickerSetAdd(TLRPC.StickerSetCovered stickerSetCovered) {
            EmojiView.EmojiViewDelegate.CC.$default$onStickerSetAdd(this, stickerSetCovered);
        }

        @Override
        public final void onStickerSetRemove(TLRPC.StickerSetCovered stickerSetCovered) {
            EmojiView.EmojiViewDelegate.CC.$default$onStickerSetRemove(this, stickerSetCovered);
        }

        @Override
        public final void onStickersGroupClick(long j) {
            EmojiView.EmojiViewDelegate.CC.$default$onStickersGroupClick(this, j);
        }

        @Override
        public final void onStickersSettingsClick() {
            EmojiView.EmojiViewDelegate.CC.$default$onStickersSettingsClick(this);
        }

        @Override
        public final void onTabOpened(int i) {
            EmojiView.EmojiViewDelegate.CC.$default$onTabOpened(this, i);
        }

        @Override
        public final void showTrendingStickersAlert(TrendingStickersLayout trendingStickersLayout) {
            EmojiView.EmojiViewDelegate.CC.$default$showTrendingStickersAlert(this, trendingStickersLayout);
        }
    }

    public interface EditTextEmojiDelegate {
        void onWindowSizeChanged(int i);
    }

    public EditTextEmoji(Context context, SizeNotifierFrameLayout sizeNotifierFrameLayout, BaseFragment baseFragment, int i, boolean z) {
        this(context, sizeNotifierFrameLayout, baseFragment, i, z, null);
    }

    private int getThemedColor(int i) {
        return Theme.getColor(i, this.resourcesProvider);
    }

    public void lambda$hidePopup$1(int i, ValueAnimator valueAnimator) {
        int i2;
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.emojiView.setTranslationY(fFloatValue);
        float f = i;
        float f2 = 1.0f - (fFloatValue / f);
        this.emojiViewAlpha = f2;
        if (i > 0 && ((i2 = this.currentStyle) == 2 || i2 == 3)) {
            this.emojiView.setAlpha(f2);
        }
        bottomPanelTranslationY(fFloatValue - f);
    }

    public void lambda$new$0(SizeNotifierFrameLayout sizeNotifierFrameLayout, Theme.ResourcesProvider resourcesProvider, View view) {
        if (!this.emojiButton.isEnabled() || this.emojiButton.getAlpha() < 0.5f) {
            return;
        }
        AdjustPanLayoutHelper adjustPanLayoutHelper = this.adjustPanLayoutHelper;
        if (adjustPanLayoutHelper == null || !adjustPanLayoutHelper.animationInProgress()) {
            if (this.shownFormatButton) {
                ItemOptions itemOptions = this.formatOptions;
                if (itemOptions != null) {
                    itemOptions.dismiss();
                    this.formatOptions = null;
                    return;
                }
                this.editText.hideActionMode();
                ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(sizeNotifierFrameLayout, resourcesProvider, this.emojiButton, false, false, true);
                itemOptionsMakeOptions.setMaxHeight(AndroidUtilities.dp(280.0f));
                EditTextCaption editTextCaption = this.editText;
                Objects.requireNonNull(editTextCaption);
                editTextCaption.extendActionMode(null, new MenuToItemOptions(itemOptionsMakeOptions, new PasscodeView$$ExternalSyntheticLambda8(editTextCaption, 5), this.editText.getOnPremiumMenuLockClickListener()));
                itemOptionsMakeOptions.forceTop(true);
                itemOptionsMakeOptions.show();
                return;
            }
            if (isPopupShowing()) {
                if (this.emojiExpanded) {
                    hidePopup(true);
                    this.emojiExpanded = false;
                    onEmojiKeyboardUpdate();
                }
                openKeyboardInternal();
                return;
            }
            showPopup(1);
            boolean zIsFocused = this.editText.isFocused();
            this.emojiView.onOpen(this.editText.length() > 0, false);
            this.editText.requestFocus();
            if (zIsFocused) {
                return;
            }
            EditTextCaption editTextCaption2 = this.editText;
            editTextCaption2.setSelection(editTextCaption2.length());
        }
    }

    public void lambda$showPopup$2(ValueAnimator valueAnimator) {
        int i;
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.emojiView.setTranslationY(fFloatValue);
        int i2 = this.emojiPadding;
        float f = 1.0f - (fFloatValue / i2);
        this.emojiViewAlpha = f;
        if (i2 > 0 && ((i = this.currentStyle) == 2 || i == 3)) {
            this.emojiView.setAlpha(f);
        }
        bottomPanelTranslationY(fFloatValue);
    }

    private void onWindowSizeChanged() {
        int height = this.sizeNotifierLayout.getHeight();
        if (!this.keyboardVisible) {
            height -= this.emojiPadding;
        }
        EditTextEmojiDelegate editTextEmojiDelegate = this.delegate;
        if (editTextEmojiDelegate != null) {
            editTextEmojiDelegate.onWindowSizeChanged(height);
        }
    }

    public void allowEmojisForNonPremium(boolean z) {
        this.allowEmojisForNonPremium = z;
    }

    public boolean allowEntities() {
        int i = this.currentStyle;
        return i == 2 || i == 3 || i == 5;
    }

    public boolean allowSearch() {
        return false;
    }

    public boolean allowSearchAnimation() {
        return false;
    }

    public void bottomPanelTranslationY(float f) {
    }

    public void closeKeyboard() {
        AndroidUtilities.hideKeyboard(this.editText);
    }

    public void closeParent() {
    }

    public void collapseEmojiView() {
        EmojiView emojiView = this.emojiView;
        if (emojiView != null) {
            emojiView.hideSearchKeyboard();
            this.emojiView.closeSearch(false);
        }
    }

    public void createEmojiView() {
        EmojiView emojiView = this.emojiView;
        if (emojiView != null && emojiView.currentAccount != UserConfig.selectedAccount) {
            this.sizeNotifierLayout.removeView(emojiView);
            this.emojiView = null;
        }
        if (this.emojiView != null) {
            return;
        }
        BaseFragment baseFragment = this.parentFragment;
        boolean z = this.allowAnimatedEmoji;
        Context context = getContext();
        boolean zAllowSearch = allowSearch();
        int i = this.currentStyle;
        boolean z2 = (i == 2 || i == 3 || i == 5) ? false : true;
        EmojiView emojiView2 = new EmojiView(baseFragment, z, false, false, context, zAllowSearch, null, null, z2, this.resourcesProvider, false, this.glassDesignForEmojiView) {
            private boolean changedExpanded;
            private boolean lastExpanded;
            private int lastHeight;

            @Override
            public void dispatchDraw(Canvas canvas) {
                if (EditTextEmoji.this.currentStyle == 2 || EditTextEmoji.this.currentStyle == 3) {
                    EditTextEmoji.this.drawEmojiBackground(canvas, this);
                }
                super.dispatchDraw(canvas);
            }

            @Override
            public void onLayout(boolean z3, int i2, int i3, int i4, int i5) {
                int i6;
                super.onLayout(z3, i2, i3, i4, i5);
                if (EditTextEmoji.this.allowSearch()) {
                    int i7 = i5 - i3;
                    if (!this.lastExpanded && EditTextEmoji.this.emojiExpanded) {
                        this.changedExpanded = true;
                    }
                    if (this.changedExpanded && (i6 = this.lastHeight) > 0 && i7 > 0 && i7 != i6) {
                        setTranslationY(i7 - i6);
                        animate().translationY(0.0f).setInterpolator(AdjustPanLayoutHelper.keyboardInterpolator).setDuration(250L).start();
                        this.changedExpanded = false;
                    }
                    this.lastExpanded = EditTextEmoji.this.emojiExpanded;
                    this.lastHeight = i7;
                }
            }
        };
        this.emojiView = emojiView2;
        emojiView2.emojiCacheType = this.emojiViewCacheType;
        emojiView2.allowEmojisForNonPremium(this.allowEmojisForNonPremium);
        this.emojiView.setVisibility(8);
        this.emojiViewAlpha = 0.0f;
        if (AndroidUtilities.isTablet()) {
            this.emojiView.setForseMultiwindowLayout(true);
        }
        this.emojiView.setDelegate(new AnonymousClass7());
        this.sizeNotifierLayout.addView(this.emojiView);
    }

    public boolean customEmojiButtonDraw(Canvas canvas, View view, Drawable drawable) {
        return false;
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.emojiLoaded) {
            EmojiView emojiView = this.emojiView;
            if (emojiView != null) {
                emojiView.invalidateViews();
            }
            EditTextCaption editTextCaption = this.editText;
            if (editTextCaption != null) {
                int currentTextColor = editTextCaption.getCurrentTextColor();
                this.editText.setTextColor(-1);
                this.editText.setTextColor(currentTextColor);
            }
        }
    }

    public void drawEmojiBackground(Canvas canvas, View view) {
    }

    public int emojiCacheType() {
        return AnimatedEmojiDrawable.getCacheTypeForEnterView();
    }

    public void extendActionMode(ActionMode actionMode, Menu menu) {
    }

    public EditTextCaption getEditText() {
        return this.editText;
    }

    public View getEmojiButton() {
        return this.emojiButton;
    }

    public int getEmojiPadding() {
        return this.emojiPadding;
    }

    public float getEmojiPaddingShown() {
        return this.emojiViewAlpha;
    }

    public EmojiView getEmojiView() {
        return this.emojiView;
    }

    public int getKeyboardHeight() {
        Point point = AndroidUtilities.displaySize;
        int i = (point.x > point.y ? this.keyboardHeightLand : this.keyboardHeight) + (this.includeNavigationBar ? AndroidUtilities.navigationBarHeight : 0);
        return this.emojiExpanded ? Math.min(AndroidUtilities.dp(200.0f) + i, AndroidUtilities.displaySize.y) : i;
    }

    public Editable getText() {
        return this.editText.getText();
    }

    public void hideEmojiView() {
        EmojiView emojiView;
        if (!this.emojiViewVisible && (emojiView = this.emojiView) != null && emojiView.getVisibility() != 8) {
            this.emojiView.setVisibility(8);
            this.emojiViewAlpha = 0.0f;
        }
        this.emojiPadding = 0;
        boolean z = this.emojiExpanded;
        this.emojiExpanded = false;
        if (z) {
            EmojiView emojiView2 = this.emojiView;
            if (emojiView2 != null) {
                emojiView2.closeSearch(false);
            }
            updatedEmojiExpanded();
        }
    }

    public void hidePopup(boolean z) {
        int i = 2;
        if (isPopupShowing()) {
            showPopup(0);
        }
        if (z) {
            EmojiView emojiView = this.emojiView;
            if (emojiView == null || emojiView.getVisibility() != 0 || this.waitingForKeyboardOpen) {
                hideEmojiView();
            } else {
                int measuredHeight = this.emojiView.getMeasuredHeight();
                if (this.emojiView.getParent() instanceof ViewGroup) {
                    measuredHeight += ((ViewGroup) this.emojiView.getParent()).getHeight() - this.emojiView.getBottom();
                }
                this.emojiViewAlpha = 1.0f;
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, measuredHeight);
                valueAnimatorOfFloat.addUpdateListener(new EmojiView$$ExternalSyntheticLambda7(this, measuredHeight, i));
                this.isAnimatePopupClosing = true;
                valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        EditTextEmoji.this.isAnimatePopupClosing = false;
                        EditTextEmoji.this.emojiView.setTranslationY(0.0f);
                        EditTextEmoji.this.emojiView.setAlpha(0.0f);
                        EditTextEmoji.this.bottomPanelTranslationY(0.0f);
                        EditTextEmoji.this.emojiViewAlpha = 0.0f;
                        EditTextEmoji.this.hideEmojiView();
                    }
                });
                valueAnimatorOfFloat.setDuration(250L);
                valueAnimatorOfFloat.setInterpolator(AdjustPanLayoutHelper.keyboardInterpolator);
                valueAnimatorOfFloat.start();
            }
        }
        boolean z2 = this.emojiExpanded;
        this.emojiExpanded = false;
        if (z2) {
            EmojiView emojiView2 = this.emojiView;
            if (emojiView2 != null) {
                emojiView2.closeSearch(false);
            }
            updatedEmojiExpanded();
        }
    }

    public boolean isAnimatePopupClosing() {
        return this.isAnimatePopupClosing;
    }

    public boolean isKeyboardVisible() {
        return this.keyboardVisible;
    }

    public boolean isPopupShowing() {
        return this.emojiViewVisible;
    }

    public boolean isPopupView(View view) {
        return view == this.emojiView;
    }

    public boolean isPopupVisible() {
        EmojiView emojiView = this.emojiView;
        return emojiView != null && emojiView.getVisibility() == 0;
    }

    public boolean isWaitingForKeyboardOpen() {
        return this.waitingForKeyboardOpen;
    }

    public int length() {
        return this.editText.length();
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
    }

    public void onDestroy() {
        this.destroyed = true;
        EmojiView emojiView = this.emojiView;
        if (emojiView != null) {
            emojiView.onDestroy();
        }
        SizeNotifierFrameLayout sizeNotifierFrameLayout = this.sizeNotifierLayout;
        if (sizeNotifierFrameLayout != null) {
            sizeNotifierFrameLayout.removeDelegate(this);
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
    }

    public void onEmojiKeyboardUpdate() {
    }

    public void onLineCountChanged(int i, int i2) {
    }

    public void onPause() {
        this.isPaused = true;
        closeKeyboard();
    }

    public void onResume() {
        this.isPaused = false;
        if (this.showKeyboardOnResume) {
            this.showKeyboardOnResume = false;
            this.editText.requestFocus();
            AndroidUtilities.showKeyboard(this.editText);
            if (AndroidUtilities.usingHardwareInput || this.keyboardVisible || AndroidUtilities.isInMultiwindow || AndroidUtilities.isTablet()) {
                return;
            }
            this.waitingForKeyboardOpen = true;
            onWaitingForKeyboard();
            AndroidUtilities.cancelRunOnUIThread(this.openKeyboardRunnable);
            AndroidUtilities.runOnUIThread(this.openKeyboardRunnable, 100L);
        }
    }

    public boolean onScrollYChange(int i) {
        return true;
    }

    @Override
    public void onSizeChanged(int i, boolean z) {
        boolean z2;
        int i2;
        if (i > AndroidUtilities.dp(50.0f) && ((this.keyboardVisible || (i2 = this.currentStyle) == 2 || i2 == 3) && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet())) {
            if (z) {
                this.keyboardHeightLand = i;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.keyboardHeightLand).commit();
            } else {
                this.keyboardHeight = i;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.keyboardHeight).commit();
            }
        }
        boolean z3 = false;
        if (isPopupShowing()) {
            int iMin = (z ? this.keyboardHeightLand : this.keyboardHeight) + (this.includeNavigationBar ? AndroidUtilities.navigationBarHeight : 0);
            if (this.emojiExpanded) {
                iMin = Math.min(AndroidUtilities.dp(200.0f) + iMin, AndroidUtilities.displaySize.y);
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.emojiView.getLayoutParams();
            int i3 = layoutParams.width;
            int i4 = AndroidUtilities.displaySize.x;
            if (i3 != i4 || layoutParams.height != iMin) {
                layoutParams.width = i4;
                layoutParams.height = iMin;
                this.emojiView.setLayoutParams(layoutParams);
                SizeNotifierFrameLayout sizeNotifierFrameLayout = this.sizeNotifierLayout;
                if (sizeNotifierFrameLayout != null) {
                    this.emojiPadding = layoutParams.height;
                    sizeNotifierFrameLayout.requestLayout();
                    onWindowSizeChanged();
                    if (this.lastEmojiExpanded != this.emojiExpanded) {
                        onEmojiKeyboardUpdate();
                    }
                }
            }
        }
        this.lastEmojiExpanded = this.emojiExpanded;
        if (this.lastSizeChangeValue1 == i && this.lastSizeChangeValue2 == z) {
            if (allowSearch()) {
                if (this.editText.isFocused() && i > 0) {
                    z3 = true;
                }
                this.keyboardVisible = z3;
            }
            onWindowSizeChanged();
            return;
        }
        this.lastSizeChangeValue1 = i;
        this.lastSizeChangeValue2 = z;
        boolean z4 = this.keyboardVisible;
        boolean z5 = this.editText.isFocused() && i > 0;
        this.keyboardVisible = z5;
        if (z5 && isPopupShowing()) {
            showPopup(0);
        }
        if (this.emojiPadding != 0 && !(z2 = this.keyboardVisible) && z2 != z4 && !isPopupShowing()) {
            this.emojiPadding = 0;
            this.sizeNotifierLayout.requestLayout();
        }
        if (this.keyboardVisible && this.waitingForKeyboardOpen) {
            this.waitingForKeyboardOpen = false;
            AndroidUtilities.cancelRunOnUIThread(this.openKeyboardRunnable);
        }
        onWindowSizeChanged();
    }

    public void onWaitingForKeyboard() {
    }

    public void openKeyboard() {
        this.editText.requestFocus();
        AndroidUtilities.showKeyboard(this.editText);
    }

    public void openKeyboardInternal() {
        onWaitingForKeyboard();
        showPopup((AndroidUtilities.usingHardwareInput || this.isPaused) ? 0 : 2);
        this.editText.requestFocus();
        AndroidUtilities.showKeyboard(this.editText);
        if (this.isPaused) {
            this.showKeyboardOnResume = true;
            return;
        }
        if (AndroidUtilities.usingHardwareInput || this.keyboardVisible || AndroidUtilities.isInMultiwindow || AndroidUtilities.isTablet()) {
            return;
        }
        this.waitingForKeyboardOpen = true;
        AndroidUtilities.cancelRunOnUIThread(this.openKeyboardRunnable);
        AndroidUtilities.runOnUIThread(this.openKeyboardRunnable, 100L);
    }

    public void setAdjustPanLayoutHelper(AdjustPanLayoutHelper adjustPanLayoutHelper) {
        this.adjustPanLayoutHelper = adjustPanLayoutHelper;
    }

    public void setDelegate(EditTextEmojiDelegate editTextEmojiDelegate) {
        this.delegate = editTextEmojiDelegate;
    }

    public void setEmojiViewCacheType(int i) {
        this.emojiViewCacheType = i;
        EmojiView emojiView = this.emojiView;
        if (emojiView != null) {
            emojiView.emojiCacheType = i;
        }
    }

    @Override
    public void setEnabled(boolean z) {
        this.editText.setEnabled(z);
        this.emojiButton.setVisibility(z ? 0 : 8);
        int iDp = AndroidUtilities.dp(this.currentStyle == 0 ? 11.0f : 8.0f);
        if (z) {
            this.editText.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0, LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), iDp);
        } else {
            this.editText.setPadding(0, 0, 0, iDp);
        }
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        this.editText.setFilters(inputFilterArr);
    }

    @Override
    public void setFocusable(boolean z) {
        this.editText.setFocusable(z);
    }

    public void setHint(CharSequence charSequence) {
        this.editText.setHint(charSequence);
    }

    public void setMaxLines(int i) {
        this.editText.setMaxLines(i);
    }

    public void setSelection(int i) {
        this.editText.setSelection(i);
    }

    public void setSizeNotifierLayout(SizeNotifierFrameLayout sizeNotifierFrameLayout) {
        SizeNotifierFrameLayout sizeNotifierFrameLayout2 = this.sizeNotifierLayout;
        if (sizeNotifierFrameLayout2 != null) {
            sizeNotifierFrameLayout2.removeDelegate(this);
        }
        this.sizeNotifierLayout = sizeNotifierFrameLayout;
        sizeNotifierFrameLayout.addDelegate(this);
    }

    public void setSuggestionsEnabled(boolean z) {
        int inputType = this.editText.getInputType();
        int i = !z ? 524288 | inputType : (-524289) & inputType;
        if (this.editText.getInputType() != i) {
            this.editText.setInputType(i);
        }
    }

    public void setText(CharSequence charSequence) {
        this.editText.setText(charSequence);
    }

    public void showPopup(int i) {
        if (i != 1) {
            if (this.emojiButton != null) {
                if (this.currentStyle == 0) {
                    this.emojiIconDrawable.setIcon(R.drawable.smiles_tab_smiles, true);
                } else {
                    this.emojiIconDrawable.setIcon(R.drawable.input_smile, true);
                }
            }
            if (this.emojiView != null) {
                this.emojiViewVisible = false;
                onEmojiKeyboardUpdate();
                if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                    this.emojiView.setVisibility(8);
                    this.emojiViewAlpha = 0.0f;
                }
            }
            SizeNotifierFrameLayout sizeNotifierFrameLayout = this.sizeNotifierLayout;
            if (sizeNotifierFrameLayout != null) {
                if (i == 0) {
                    this.emojiPadding = 0;
                    this.emojiViewAlpha = 0.0f;
                }
                sizeNotifierFrameLayout.requestLayout();
                onWindowSizeChanged();
                return;
            }
            return;
        }
        EmojiView emojiView = this.emojiView;
        boolean z = emojiView != null && emojiView.getVisibility() == 0;
        createEmojiView();
        this.emojiView.setVisibility(0);
        this.emojiViewVisible = true;
        this.emojiViewAlpha = 1.0f;
        EmojiView emojiView2 = this.emojiView;
        if (this.keyboardHeight <= 0) {
            if (AndroidUtilities.isTablet()) {
                this.keyboardHeight = AndroidUtilities.dp(150.0f);
            } else {
                this.keyboardHeight = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
            }
        }
        if (this.keyboardHeightLand <= 0) {
            if (AndroidUtilities.isTablet()) {
                this.keyboardHeightLand = AndroidUtilities.dp(150.0f);
            } else {
                this.keyboardHeightLand = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
            }
        }
        Point point = AndroidUtilities.displaySize;
        int iMin = (point.x > point.y ? this.keyboardHeightLand : this.keyboardHeight) + (this.includeNavigationBar ? AndroidUtilities.navigationBarHeight : 0);
        if (this.emojiExpanded) {
            iMin = Math.min(AndroidUtilities.dp(200.0f) + iMin, AndroidUtilities.displaySize.y);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) emojiView2.getLayoutParams();
        layoutParams.height = iMin;
        emojiView2.setLayoutParams(layoutParams);
        if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
            AndroidUtilities.hideKeyboard(this.editText);
        }
        SizeNotifierFrameLayout sizeNotifierFrameLayout2 = this.sizeNotifierLayout;
        if (sizeNotifierFrameLayout2 != null) {
            this.emojiPadding = iMin;
            sizeNotifierFrameLayout2.requestLayout();
            this.emojiIconDrawable.setIcon(R.drawable.input_keyboard, true);
            onWindowSizeChanged();
        }
        onEmojiKeyboardUpdate();
        if (this.keyboardVisible || z || !allowSearchAnimation()) {
            this.emojiView.setAlpha(1.0f);
            this.emojiViewAlpha = 1.0f;
            bottomPanelTranslationY(0.0f);
        } else {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.emojiPadding, 0.0f);
            valueAnimatorOfFloat.addUpdateListener(new ItemOptions$$ExternalSyntheticLambda6(this, 4));
            valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    EditTextEmoji.this.emojiView.setTranslationY(0.0f);
                    EditTextEmoji.this.emojiView.setAlpha(1.0f);
                    EditTextEmoji.this.emojiViewAlpha = 1.0f;
                    EditTextEmoji.this.bottomPanelTranslationY(0.0f);
                }
            });
            valueAnimatorOfFloat.setDuration(250L);
            valueAnimatorOfFloat.setInterpolator(AdjustPanLayoutHelper.keyboardInterpolator);
            valueAnimatorOfFloat.start();
        }
    }

    public void updateColors() {
        int i = this.currentStyle;
        if (i == 0) {
            this.editText.setHintTextColor(getThemedColor(Theme.key_windowBackgroundWhiteHintText));
            EditTextCaption editTextCaption = this.editText;
            int i2 = Theme.key_windowBackgroundWhiteBlackText;
            editTextCaption.setCursorColor(getThemedColor(i2));
            this.editText.setTextColor(getThemedColor(i2));
        } else if (i == 2 || i == 3) {
            this.editText.setHintTextColor(-1929379841);
            this.editText.setTextColor(-1);
            this.editText.setCursorColor(-1);
            this.editText.setHandlesColor(-1);
            this.editText.setHighlightColor(822083583);
            this.editText.quoteColor = -1;
        } else {
            this.editText.setHintTextColor(getThemedColor(Theme.key_dialogTextHint));
            this.editText.setTextColor(getThemedColor(Theme.key_dialogTextBlack));
        }
        this.emojiIconDrawable.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_chat_messagePanelIcons), PorterDuff.Mode.MULTIPLY));
        EmojiView emojiView = this.emojiView;
        if (emojiView != null) {
            emojiView.updateColors();
        }
    }

    public void updatedEmojiExpanded() {
    }

    public EditTextEmoji(Context context, SizeNotifierFrameLayout sizeNotifierFrameLayout, BaseFragment baseFragment, final int i, boolean z, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.isPaused = true;
        this.openKeyboardRunnable = new Runnable() {
            @Override
            public void run() {
                if (EditTextEmoji.this.destroyed || EditTextEmoji.this.editText == null || !EditTextEmoji.this.waitingForKeyboardOpen || EditTextEmoji.this.keyboardVisible || AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow || !AndroidUtilities.isTablet()) {
                    return;
                }
                EditTextEmoji.this.editText.requestFocus();
                AndroidUtilities.showKeyboard(EditTextEmoji.this.editText);
                AndroidUtilities.cancelRunOnUIThread(EditTextEmoji.this.openKeyboardRunnable);
                AndroidUtilities.runOnUIThread(EditTextEmoji.this.openKeyboardRunnable, 100L);
            }
        };
        this.emojiViewCacheType = 2;
        this.allowAnimatedEmoji = z;
        this.resourcesProvider = resourcesProvider;
        this.currentStyle = i;
        this.parentFragment = baseFragment;
        this.sizeNotifierLayout = sizeNotifierFrameLayout;
        sizeNotifierFrameLayout.addDelegate(this);
        EditTextCaption editTextCaption = new EditTextCaption(context, resourcesProvider) {
            private Drawable lastIcon = null;

            @Override
            public int emojiCacheType() {
                return EditTextEmoji.this.emojiCacheType();
            }

            @Override
            public void extendActionMode(ActionMode actionMode, Menu menu) {
                if (EditTextEmoji.this.allowEntities()) {
                    ChatActivity.fillActionModeMenu(menu, null, EditTextEmoji.this.currentStyle == 3, true);
                } else {
                    EditTextEmoji.this.extendActionMode(actionMode, menu);
                }
                super.extendActionMode(actionMode, menu);
            }

            @Override
            public int getActionModeStyle() {
                int i2 = i;
                if (i2 == 2 || i2 == 3) {
                    return 2;
                }
                return super.getActionModeStyle();
            }

            @Override
            public void onLineCountChanged(int i2, int i3) {
                EditTextEmoji.this.onLineCountChanged(i2, i3);
            }

            @Override
            public void onSelectionChanged(int i2, int i3) {
                super.onSelectionChanged(i2, i3);
                if (EditTextEmoji.this.emojiIconDrawable != null) {
                    boolean z2 = false;
                    boolean z3 = i3 != i2;
                    if (EditTextEmoji.this.allowEntities() && z3) {
                        XiaomiUtilities.isMIUI();
                        z2 = true;
                    }
                    if (EditTextEmoji.this.shownFormatButton != z2) {
                        EditTextEmoji.this.shownFormatButton = z2;
                        if (z2) {
                            this.lastIcon = EditTextEmoji.this.emojiIconDrawable.getIcon();
                            EditTextEmoji.this.emojiIconDrawable.setIcon(R.drawable.msg_edit, true);
                        } else {
                            EditTextEmoji.this.emojiIconDrawable.setIcon(this.lastIcon, true);
                            this.lastIcon = null;
                        }
                    }
                }
            }

            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                if (EditTextEmoji.this.isPopupShowing() && motionEvent.getAction() == 0) {
                    EditTextEmoji.this.onWaitingForKeyboard();
                    EditTextEmoji editTextEmoji = EditTextEmoji.this;
                    if (!editTextEmoji.emojiExpanded || editTextEmoji.emojiView == null) {
                        EditTextEmoji.this.showPopup(AndroidUtilities.usingHardwareInput ? 0 : 2);
                    } else {
                        EditTextEmoji.this.emojiView.closeSearch(false);
                        EditTextEmoji editTextEmoji2 = EditTextEmoji.this;
                        editTextEmoji2.emojiExpanded = false;
                        editTextEmoji2.hidePopup(true);
                        AndroidUtilities.showKeyboard(this);
                    }
                    EditTextEmoji.this.openKeyboardInternal();
                }
                if (motionEvent.getAction() == 0) {
                    boolean zIsFocused = isFocused();
                    requestFocus();
                    if (!AndroidUtilities.showKeyboard(this)) {
                        clearFocus();
                        requestFocus();
                    }
                    if (!zIsFocused) {
                        setSelection(getText().length());
                    }
                }
                try {
                    return super.onTouchEvent(motionEvent);
                } catch (Exception e) {
                    FileLog.e(e);
                    return false;
                }
            }

            @Override
            public void scrollTo(int i2, int i3) {
                if (EditTextEmoji.this.onScrollYChange(i3)) {
                    super.scrollTo(i2, i3);
                }
            }
        };
        this.editText = editTextCaption;
        editTextCaption.setImeOptions(268435456);
        EditTextCaption editTextCaption2 = this.editText;
        editTextCaption2.setInputType(editTextCaption2.getInputType() | 16384);
        EditTextCaption editTextCaption3 = this.editText;
        editTextCaption3.setFocusable(editTextCaption3.isEnabled());
        this.editText.setCursorSize(AndroidUtilities.dp(20.0f));
        this.editText.setCursorWidth(1.5f);
        EditTextCaption editTextCaption4 = this.editText;
        int i2 = Theme.key_windowBackgroundWhiteBlackText;
        editTextCaption4.setCursorColor(getThemedColor(i2));
        if (i == 0) {
            this.editText.setTextSize(1, 18.0f);
            this.editText.setMaxLines(4);
            this.editText.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            this.editText.setBackground(null);
            this.editText.setLineColors(getThemedColor(Theme.key_windowBackgroundWhiteInputField), getThemedColor(Theme.key_windowBackgroundWhiteInputFieldActivated), getThemedColor(Theme.key_text_RedRegular));
            this.editText.setHintTextColor(getThemedColor(Theme.key_windowBackgroundWhiteHintText));
            this.editText.setTextColor(getThemedColor(i2));
            this.editText.setHandlesColor(getThemedColor(Theme.key_chat_TextSelectionCursor));
            this.editText.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0, LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), AndroidUtilities.dp(11.0f));
            EditTextCaption editTextCaption5 = this.editText;
            boolean z2 = LocaleController.isRTL;
            addView(editTextCaption5, LayoutHelper.createFrame(-1, -2.0f, 19, z2 ? 11.0f : 0.0f, 1.0f, z2 ? 0.0f : 11.0f, 0.0f));
        } else if (i == 2 || i == 3) {
            this.editText.setTextSize(1, 16.0f);
            this.editText.setMaxLines(8);
            this.editText.setGravity(19);
            this.editText.setAllowTextEntitiesIntersection(true);
            this.editText.setHintTextColor(-1929379841);
            this.editText.setTextColor(-1);
            this.editText.setCursorColor(-1);
            this.editText.setBackground(null);
            this.editText.setClipToPadding(false);
            this.editText.setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
            this.editText.setHandlesColor(-1);
            this.editText.setHighlightColor(822083583);
            this.editText.setLinkTextColor(-12147733);
            EditTextCaption editTextCaption6 = this.editText;
            editTextCaption6.quoteColor = -1;
            editTextCaption6.setTextIsSelectable(true);
            setClipChildren(false);
            setClipToPadding(false);
            addView(this.editText, LayoutHelper.createFrame(-1, -1.0f, 19, 40.0f, 0.0f, 24.0f, 0.0f));
        } else if (i == 4) {
            this.editText.setTextSize(1, 18.0f);
            this.editText.setMaxLines(4);
            this.editText.setGravity(19);
            this.editText.setHintTextColor(getThemedColor(Theme.key_dialogTextHint));
            this.editText.setTextColor(getThemedColor(Theme.key_dialogTextBlack));
            this.editText.setBackground(null);
            this.editText.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(12.0f));
            addView(this.editText, LayoutHelper.createFrame(-1, -1.0f, 19, 14.0f, 0.0f, 48.0f, 0.0f));
        } else {
            this.editText.setTextSize(1, 18.0f);
            this.editText.setMaxLines(4);
            this.editText.setGravity(19);
            this.editText.setHintTextColor(getThemedColor(Theme.key_dialogTextHint));
            this.editText.setTextColor(getThemedColor(Theme.key_dialogTextBlack));
            this.editText.setBackground(null);
            this.editText.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(12.0f));
            addView(this.editText, LayoutHelper.createFrame(-1, -1.0f, 19, 48.0f, 0.0f, 0.0f, 0.0f));
        }
        ImageView imageView = new ImageView(context) {
            @Override
            public void dispatchDraw(Canvas canvas) {
                EditTextEmoji editTextEmoji = EditTextEmoji.this;
                if (editTextEmoji.customEmojiButtonDraw(canvas, editTextEmoji.emojiButton, EditTextEmoji.this.emojiIconDrawable)) {
                    return;
                }
                super.dispatchDraw(canvas);
            }
        };
        this.emojiButton = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        ImageView imageView2 = this.emojiButton;
        ReplaceableIconDrawable replaceableIconDrawable = new ReplaceableIconDrawable(context);
        this.emojiIconDrawable = replaceableIconDrawable;
        imageView2.setImageDrawable(replaceableIconDrawable);
        if (i == 0) {
            this.emojiIconDrawable.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_chat_messagePanelIcons), PorterDuff.Mode.MULTIPLY));
            this.emojiIconDrawable.setIcon(R.drawable.smiles_tab_smiles, false);
            addView(this.emojiButton, LayoutHelper.createFrame(48, 48.0f, (LocaleController.isRTL ? 3 : 5) | 16, 0.0f, 0.0f, 0.0f, 5.0f));
        } else if (i == 2 || i == 3) {
            this.emojiIconDrawable.setColorFilter(new PorterDuffColorFilter(-1929379841, PorterDuff.Mode.MULTIPLY));
            this.emojiIconDrawable.setIcon(R.drawable.input_smile, false);
            addView(this.emojiButton, LayoutHelper.createFrame(40, 40.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        } else if (i == 4) {
            this.emojiIconDrawable.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_chat_messagePanelIcons), PorterDuff.Mode.MULTIPLY));
            this.emojiIconDrawable.setIcon(R.drawable.input_smile, false);
            addView(this.emojiButton, LayoutHelper.createFrame(48, 48.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        } else if (i == 5) {
            this.emojiIconDrawable.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_graySectionText), PorterDuff.Mode.MULTIPLY));
            this.emojiIconDrawable.setIcon(R.drawable.input_smile, false);
            addView(this.emojiButton, LayoutHelper.createFrame(48, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        } else {
            this.emojiIconDrawable.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_chat_messagePanelIcons), PorterDuff.Mode.MULTIPLY));
            this.emojiIconDrawable.setIcon(R.drawable.input_smile, false);
            addView(this.emojiButton, LayoutHelper.createFrame(48, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        this.emojiButton.setBackground(Theme.createSelectorDrawable(getThemedColor(Theme.key_listSelector), 1, -1));
        this.emojiButton.setOnClickListener(new EditTextEmoji$$ExternalSyntheticLambda0(this, sizeNotifierFrameLayout, resourcesProvider, 0));
        this.emojiButton.setContentDescription(LocaleController.getString(R.string.Emoji));
    }

    public void setSelection(int i, int i2) {
        this.editText.setSelection(i, i2);
    }
}
