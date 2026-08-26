package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
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
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.AdjustPanLayoutHelper;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet$$ExternalSyntheticLambda3;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Cells.StickerEmojiCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda62;
import org.telegram.ui.ChatEditActivity;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Gifts.SendGiftSheet;
import org.telegram.ui.GroupCallActivity;
import org.telegram.ui.TwoStepVerificationSetupActivity;

public class EditTextEmoji extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, SizeNotifierFrameLayout.SizeNotifierFrameLayoutDelegate {
    public AdjustPanLayoutHelper adjustPanLayoutHelper;
    public final boolean allowAnimatedEmoji;
    public boolean allowEmojisForNonPremium;
    public final int currentStyle;
    public boolean destroyed;
    public final AnonymousClass2 editText;
    public final AnonymousClass3 emojiButton;
    public boolean emojiExpanded;
    public final ReplaceableIconDrawable emojiIconDrawable;
    public int emojiPadding;
    public AnonymousClass6 emojiView;
    public float emojiViewAlpha;
    public int emojiViewCacheType;
    public boolean emojiViewVisible;
    public boolean glassDesignForEmojiView;
    public boolean includeNavigationBar;
    public boolean isAnimatePopupClosing;
    public boolean isPaused;
    public int keyboardHeight;
    public int keyboardHeightLand;
    public boolean keyboardVisible;
    public boolean lastEmojiExpanded;
    public int lastSizeChangeValue1;
    public boolean lastSizeChangeValue2;
    public final BubbleActivity.AnonymousClass1 openKeyboardRunnable;
    public final BaseFragment parentFragment;
    public final Theme.ResourcesProvider resourcesProvider;
    public boolean showKeyboardOnResume;
    public boolean shownFormatButton;
    public SizeNotifierFrameLayout sizeNotifierLayout;
    public boolean waitingForKeyboardOpen;

    public final class AnonymousClass2 extends EditTextCaption {
        public Drawable lastIcon;
        public final int val$style;

        public AnonymousClass2(Context context, Theme.ResourcesProvider resourcesProvider, int i) {
            super(context, resourcesProvider);
            this.val$style = i;
            this.lastIcon = null;
        }

        @Override
        public final int emojiCacheType() {
            return EditTextEmoji.this.emojiCacheType();
        }

        @Override
        public final void extendActionMode(ActionMode actionMode, Menu menu) {
            EditTextEmoji editTextEmoji = EditTextEmoji.this;
            if (editTextEmoji.allowEntities()) {
                ChatActivity.fillActionModeMenu(menu, null, editTextEmoji.currentStyle == 3, true, true, true);
            } else {
                editTextEmoji.extendActionMode(menu);
            }
        }

        @Override
        public final int getActionModeStyle() {
            int i = this.val$style;
            if (i == 2 || i == 3) {
                return 2;
            }
            return super.getActionModeStyle();
        }

        @Override
        public final void onLineCountChanged(int i, int i2) {
            EditTextEmoji.this.onLineCountChanged(i, i2);
        }

        @Override
        public final void onSelectionChanged(int i, int i2) {
            super.onSelectionChanged(i, i2);
            EditTextEmoji editTextEmoji = EditTextEmoji.this;
            if (editTextEmoji.emojiIconDrawable != null) {
                boolean z = false;
                boolean z2 = i2 != i;
                if (editTextEmoji.allowEntities() && z2) {
                    XiaomiUtilities.isMIUI();
                    z = true;
                }
                if (editTextEmoji.shownFormatButton != z) {
                    editTextEmoji.shownFormatButton = z;
                    ReplaceableIconDrawable replaceableIconDrawable = editTextEmoji.emojiIconDrawable;
                    if (z) {
                        this.lastIcon = replaceableIconDrawable.currentDrawable;
                        replaceableIconDrawable.setIcon(R.drawable.msg_edit, true);
                    } else {
                        replaceableIconDrawable.setIcon(this.lastIcon, true);
                        this.lastIcon = null;
                    }
                }
            }
        }

        @Override
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            AnonymousClass6 anonymousClass6;
            EditTextEmoji editTextEmoji = EditTextEmoji.this;
            if (editTextEmoji.emojiViewVisible && motionEvent.getAction() == 0) {
                editTextEmoji.onWaitingForKeyboard();
                if (!editTextEmoji.emojiExpanded || (anonymousClass6 = editTextEmoji.emojiView) == null) {
                    editTextEmoji.showPopup(AndroidUtilities.usingHardwareInput ? 0 : 2);
                } else {
                    anonymousClass6.closeSearch(-1L, false);
                    editTextEmoji.emojiExpanded = false;
                    editTextEmoji.hidePopup(true);
                    AndroidUtilities.showKeyboard(this);
                }
                editTextEmoji.openKeyboardInternal();
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
        public final void scrollTo(int i, int i2) {
            if (EditTextEmoji.this.onScrollYChange(i2)) {
                super.scrollTo(i, i2);
            }
        }
    }

    public final class AnonymousClass3 extends ImageView {
        public final int $r8$classId;
        public final Object this$0;

        public AnonymousClass3(Object obj, Context context, int i) {
            super(context);
            this.$r8$classId = i;
            this.this$0 = obj;
        }

        @Override
        public void dispatchDraw(Canvas canvas) {
            switch (this.$r8$classId) {
                case 0:
                    AnonymousClass3 anonymousClass3 = ((EditTextEmoji) this.this$0).emojiButton;
                    super.dispatchDraw(canvas);
                    break;
                default:
                    super.dispatchDraw(canvas);
                    break;
            }
        }

        @Override
        public void draw(Canvas canvas) {
            switch (this.$r8$classId) {
                case 1:
                    getBackground().draw(canvas);
                    super.draw(canvas);
                    break;
                default:
                    super.draw(canvas);
                    break;
            }
        }

        @Override
        public void onDetachedFromWindow() {
            switch (this.$r8$classId) {
                case 1:
                    super.onDetachedFromWindow();
                    clearAnimation();
                    Object tag = getTag();
                    ActionBarMenuItem actionBarMenuItem = (ActionBarMenuItem) this.this$0;
                    if (tag != null) {
                        actionBarMenuItem.clearButton.setAlpha(1.0f);
                        actionBarMenuItem.clearButton.setRotation(0.0f);
                        actionBarMenuItem.clearButton.setScaleX(1.0f);
                        actionBarMenuItem.clearButton.setScaleY(1.0f);
                    } else {
                        actionBarMenuItem.clearButton.setVisibility(4);
                        actionBarMenuItem.clearButton.setAlpha(0.0f);
                        actionBarMenuItem.clearButton.setRotation(45.0f);
                        actionBarMenuItem.clearButton.setScaleX(0.0f);
                        actionBarMenuItem.clearButton.setScaleY(0.0f);
                    }
                    break;
                default:
                    super.onDetachedFromWindow();
                    break;
            }
        }

        @Override
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            switch (this.$r8$classId) {
                case 2:
                    super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                    accessibilityNodeInfo.setCheckable(true);
                    accessibilityNodeInfo.setChecked(((TwoStepVerificationSetupActivity) this.this$0).editTextFirstRow.getTransformationMethod() == null);
                    break;
                default:
                    super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                    break;
            }
        }
    }

    public final class AnonymousClass7 implements EmojiView.EmojiViewDelegate {
        public AnonymousClass7() {
        }

        @Override
        public final boolean canAddCaptionToGif() {
            return false;
        }

        @Override
        public final boolean canSchedule() {
            return false;
        }

        @Override
        public final long getDialogId() {
            return 0L;
        }

        @Override
        public final float getProgressToSearchOpened() {
            return 0.0f;
        }

        @Override
        public final int getThreadId() {
            return 0;
        }

        @Override
        public final void invalidateEnterView() {
        }

        @Override
        public final boolean isExpanded() {
            return false;
        }

        @Override
        public final boolean isInScheduleMode() {
            return false;
        }

        @Override
        public final boolean isSearchOpened() {
            return EditTextEmoji.this.emojiExpanded;
        }

        @Override
        public final boolean isUserSelf() {
            return false;
        }

        @Override
        public final void onAnimatedEmojiUnlockClick() {
            EditTextEmoji editTextEmoji = EditTextEmoji.this;
            BaseFragment baseFragment = editTextEmoji.parentFragment;
            if (baseFragment != null) {
                baseFragment.showDialog(new PremiumFeatureBottomSheet(baseFragment, baseFragment.getContext(), baseFragment.getCurrentAccount(), false, 11, false, null));
            } else {
                SendGiftSheet.AnonymousClass8 anonymousClass8 = new SendGiftSheet.AnonymousClass8(this, 1);
                new PremiumFeatureBottomSheet(anonymousClass8, editTextEmoji.getContext(), anonymousClass8.getCurrentAccount(), false, 11, false, null).show();
            }
        }

        @Override
        public final boolean onBackspace() {
            EditTextEmoji editTextEmoji = EditTextEmoji.this;
            if (editTextEmoji.editText.length() == 0) {
                return false;
            }
            editTextEmoji.editText.dispatchKeyEvent(new KeyEvent(0, 67));
            return true;
        }

        @Override
        public final void onClearEmojiRecent() {
            EditTextEmoji editTextEmoji = EditTextEmoji.this;
            AlertDialog.Builder builder = new AlertDialog.Builder(editTextEmoji.getContext(), 0, editTextEmoji.resourcesProvider);
            String string = LocaleController.getString(R.string.ClearRecentEmojiTitle);
            AlertDialog alertDialog = builder.alertDialog;
            alertDialog.title = string;
            alertDialog.message = LocaleController.getString(R.string.ClearRecentEmojiText);
            builder.setPositiveButton(LocaleController.getString(R.string.ClearButton), new ColorPicker$$ExternalSyntheticLambda6(this, 22));
            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            BaseFragment baseFragment = editTextEmoji.parentFragment;
            if (baseFragment != null) {
                baseFragment.showDialog(alertDialog);
            } else {
                builder.show();
            }
        }

        @Override
        public final void onCustomEmojiSelected(long j, TLRPC.Document document, String str, boolean z) {
            AnimatedEmojiSpan animatedEmojiSpan;
            EditTextEmoji editTextEmoji = EditTextEmoji.this;
            int selectionEnd = editTextEmoji.editText.getSelectionEnd();
            if (selectionEnd < 0) {
                selectionEnd = 0;
            }
            try {
                editTextEmoji.getClass();
                SpannableString spannableString = new SpannableString(str);
                if (document != null) {
                    animatedEmojiSpan = new AnimatedEmojiSpan(document.id, 1.2f, editTextEmoji.editText.getPaint().getFontMetricsInt());
                    animatedEmojiSpan.document = document;
                } else {
                    animatedEmojiSpan = new AnimatedEmojiSpan(j, 1.2f, editTextEmoji.editText.getPaint().getFontMetricsInt());
                }
                animatedEmojiSpan.cacheType = editTextEmoji.emojiView.emojiCacheType;
                spannableString.setSpan(animatedEmojiSpan, 0, spannableString.length(), 33);
                AnonymousClass2 anonymousClass2 = editTextEmoji.editText;
                anonymousClass2.setText(anonymousClass2.getText().insert(selectionEnd, spannableString));
                int length = selectionEnd + spannableString.length();
                editTextEmoji.editText.setSelection(length, length);
            } catch (Exception e) {
                FileLog.e(e);
            } finally {
                editTextEmoji.getClass();
            }
        }

        @Override
        public final void onEmojiSelected(String str) {
            EditTextEmoji editTextEmoji = EditTextEmoji.this;
            int selectionEnd = editTextEmoji.editText.getSelectionEnd();
            if (selectionEnd < 0) {
                selectionEnd = 0;
            }
            try {
                editTextEmoji.getClass();
                CharSequence charSequenceReplaceEmoji = Emoji.replaceEmoji(str, editTextEmoji.editText.getPaint().getFontMetricsInt(), false);
                AnonymousClass2 anonymousClass2 = editTextEmoji.editText;
                anonymousClass2.setText(anonymousClass2.getText().insert(selectionEnd, charSequenceReplaceEmoji));
                int length = selectionEnd + charSequenceReplaceEmoji.length();
                editTextEmoji.editText.setSelection(length, length);
            } catch (Exception e) {
                FileLog.e(e);
            } finally {
                editTextEmoji.getClass();
            }
        }

        @Override
        public final void onEmojiSettingsClick(ArrayList arrayList) {
        }

        @Override
        public final void onGifSelected(View view, Object obj, String str, Object obj2, boolean z, int i, int i2) {
        }

        @Override
        public final void onGifSelectedForAddCaption(TLObject tLObject, Object obj) {
        }

        @Override
        public final void onSearchOpenClose(int i) {
            EditTextEmoji editTextEmoji = EditTextEmoji.this;
            if (editTextEmoji.allowSearch()) {
                editTextEmoji.emojiExpanded = i != 0;
                editTextEmoji.updatedEmojiExpanded();
                SizeNotifierFrameLayout sizeNotifierFrameLayout = editTextEmoji.sizeNotifierLayout;
                if (sizeNotifierFrameLayout != null) {
                    sizeNotifierFrameLayout.notifyHeightChanged();
                }
            }
        }

        @Override
        public final void onShowStickerSet(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z) {
        }

        @Override
        public final void onStickerSelected(StickerEmojiCell stickerEmojiCell, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z, int i) {
        }

        @Override
        public final void onStickerSetAdd(TLRPC.StickerSetCovered stickerSetCovered) {
        }

        @Override
        public final void onStickerSetRemove(TLRPC.StickerSetCovered stickerSetCovered) {
        }

        @Override
        public final void onStickersGroupClick(long j) {
        }

        @Override
        public final void onStickersSettingsClick() {
        }

        @Override
        public final void onTabOpened(int i) {
        }

        @Override
        public final void showTrendingStickersAlert(TrendingStickersLayout trendingStickersLayout) {
        }
    }

    public interface EditTextEmojiDelegate {
    }

    public EditTextEmoji(Context context, ChatEditActivity.AnonymousClass3 anonymousClass3, ChatEditActivity chatEditActivity) {
        this(context, anonymousClass3, chatEditActivity, 0, false, null);
    }

    public boolean allowEntities() {
        int i = this.currentStyle;
        return i == 2 || i == 3 || i == 5;
    }

    public boolean allowSearch() {
        return this instanceof GroupCallActivity.AnonymousClass36;
    }

    public void bottomPanelTranslationY(float f) {
    }

    public void closeParent() {
    }

    public void createEmojiView() {
        AnonymousClass6 anonymousClass6 = this.emojiView;
        if (anonymousClass6 != null && anonymousClass6.currentAccount != UserConfig.selectedAccount) {
            this.sizeNotifierLayout.removeView(anonymousClass6);
            this.emojiView = null;
        }
        if (this.emojiView != null) {
            return;
        }
        Context context = getContext();
        boolean zAllowSearch = allowSearch();
        int i = this.currentStyle;
        ?? r1 = new EmojiView(this.parentFragment, this.allowAnimatedEmoji, context, zAllowSearch, (i == 2 || i == 3 || i == 5) ? false : true, this.resourcesProvider, this.glassDesignForEmojiView) {
            public boolean changedExpanded;
            public boolean lastExpanded;
            public int lastHeight;

            @Override
            public final void dispatchDraw(Canvas canvas) {
                EditTextEmoji editTextEmoji = EditTextEmoji.this;
                int i2 = editTextEmoji.currentStyle;
                if (i2 == 2 || i2 == 3) {
                    editTextEmoji.drawEmojiBackground(canvas, this);
                }
                super.dispatchDraw(canvas);
            }

            @Override
            public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
                int i6;
                super.onLayout(z, i2, i3, i4, i5);
                EditTextEmoji editTextEmoji = EditTextEmoji.this;
                if (editTextEmoji.allowSearch()) {
                    int i7 = i5 - i3;
                    if (!this.lastExpanded && editTextEmoji.emojiExpanded) {
                        this.changedExpanded = true;
                    }
                    if (this.changedExpanded && (i6 = this.lastHeight) > 0 && i7 > 0 && i7 != i6) {
                        setTranslationY(i7 - i6);
                        OKLCH.m(animate().translationY(0.0f), AdjustPanLayoutHelper.keyboardInterpolator, 250L);
                        this.changedExpanded = false;
                    }
                    this.lastExpanded = editTextEmoji.emojiExpanded;
                    this.lastHeight = i7;
                }
            }
        };
        this.emojiView = r1;
        r1.emojiCacheType = this.emojiViewCacheType;
        r1.allowEmojisForNonPremium = this.allowEmojisForNonPremium;
        r1.setVisibility(8);
        this.emojiViewAlpha = 0.0f;
        if (AndroidUtilities.isTablet()) {
            setForseMultiwindowLayout(true);
        }
        setDelegate(new AnonymousClass7());
        this.sizeNotifierLayout.addView(this.emojiView);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.emojiLoaded) {
            AnonymousClass6 anonymousClass6 = this.emojiView;
            if (anonymousClass6 != null) {
                anonymousClass6.emojiGridView.invalidateViews();
            }
            AnonymousClass2 anonymousClass2 = this.editText;
            if (anonymousClass2 != null) {
                int currentTextColor = anonymousClass2.getCurrentTextColor();
                anonymousClass2.setTextColor(-1);
                anonymousClass2.setTextColor(currentTextColor);
            }
        }
    }

    public void drawEmojiBackground(Canvas canvas, AnonymousClass6 anonymousClass6) {
    }

    public int emojiCacheType() {
        return AnimatedEmojiDrawable.getCacheTypeForEnterView();
    }

    public void extendActionMode(Menu menu) {
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

    public final void hideEmojiView() {
        AnonymousClass6 anonymousClass6;
        if (!this.emojiViewVisible && (anonymousClass6 = this.emojiView) != null && anonymousClass6.getVisibility() != 8) {
            setVisibility(8);
            this.emojiViewAlpha = 0.0f;
        }
        this.emojiPadding = 0;
        boolean z = this.emojiExpanded;
        this.emojiExpanded = false;
        if (z) {
            AnonymousClass6 anonymousClass7 = this.emojiView;
            if (anonymousClass7 != null) {
                anonymousClass7.closeSearch(-1L, false);
            }
            updatedEmojiExpanded();
        }
    }

    public final void hidePopup(boolean z) {
        int i = 2;
        if (this.emojiViewVisible) {
            showPopup(0);
        }
        if (z) {
            AnonymousClass6 anonymousClass6 = this.emojiView;
            if (anonymousClass6 == null || anonymousClass6.getVisibility() != 0 || this.waitingForKeyboardOpen) {
                hideEmojiView();
            } else {
                int measuredHeight = getMeasuredHeight();
                if (getParent() instanceof ViewGroup) {
                    measuredHeight += ((ViewGroup) getParent()).getHeight() - getBottom();
                }
                this.emojiViewAlpha = 1.0f;
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, measuredHeight);
                valueAnimatorOfFloat.addUpdateListener(new BottomSheet$$ExternalSyntheticLambda3(this, measuredHeight, i));
                this.isAnimatePopupClosing = true;
                valueAnimatorOfFloat.addListener(new CheckBox.AnonymousClass1(this, 25));
                valueAnimatorOfFloat.setDuration(250L);
                valueAnimatorOfFloat.setInterpolator(AdjustPanLayoutHelper.keyboardInterpolator);
                valueAnimatorOfFloat.start();
            }
        }
        boolean z2 = this.emojiExpanded;
        this.emojiExpanded = false;
        if (z2) {
            AnonymousClass6 anonymousClass7 = this.emojiView;
            if (anonymousClass7 != null) {
                anonymousClass7.closeSearch(-1L, false);
            }
            updatedEmojiExpanded();
        }
    }

    public final boolean isPopupView(View view) {
        return view == this.emojiView;
    }

    public final boolean isPopupVisible() {
        AnonymousClass6 anonymousClass6 = this.emojiView;
        return anonymousClass6 != null && anonymousClass6.getVisibility() == 0;
    }

    public final int length() {
        return this.editText.length();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
    }

    public final void onDestroy() {
        this.destroyed = true;
        AnonymousClass6 anonymousClass6 = this.emojiView;
        if (anonymousClass6 != null) {
            anonymousClass6.onDestroy();
        }
        SizeNotifierFrameLayout sizeNotifierFrameLayout = this.sizeNotifierLayout;
        if (sizeNotifierFrameLayout != null) {
            sizeNotifierFrameLayout.delegates.remove(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
    }

    public void onEmojiKeyboardUpdate() {
    }

    public void onLineCountChanged(int i, int i2) {
    }

    public final void onPause() {
        this.isPaused = true;
        AndroidUtilities.hideKeyboard(this.editText);
    }

    public final void onResume() {
        this.isPaused = false;
        if (this.showKeyboardOnResume) {
            this.showKeyboardOnResume = false;
            AnonymousClass2 anonymousClass2 = this.editText;
            anonymousClass2.requestFocus();
            AndroidUtilities.showKeyboard(anonymousClass2);
            if (AndroidUtilities.usingHardwareInput || this.keyboardVisible || AndroidUtilities.isInMultiwindow || AndroidUtilities.isTablet()) {
                return;
            }
            this.waitingForKeyboardOpen = true;
            onWaitingForKeyboard();
            BubbleActivity.AnonymousClass1 anonymousClass1 = this.openKeyboardRunnable;
            AndroidUtilities.cancelRunOnUIThread(anonymousClass1);
            AndroidUtilities.runOnUIThread(anonymousClass1, 100L);
        }
    }

    public boolean onScrollYChange(int i) {
        return true;
    }

    @Override
    public final void onSizeChanged(int i, boolean z) {
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
        if (this.emojiViewVisible) {
            int iMin = (z ? this.keyboardHeightLand : this.keyboardHeight) + (this.includeNavigationBar ? AndroidUtilities.navigationBarHeight : 0);
            if (this.emojiExpanded) {
                iMin = Math.min(AndroidUtilities.dp(200.0f) + iMin, AndroidUtilities.displaySize.y);
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
            int i3 = layoutParams.width;
            int i4 = AndroidUtilities.displaySize.x;
            if (i3 != i4 || layoutParams.height != iMin) {
                layoutParams.width = i4;
                layoutParams.height = iMin;
                setLayoutParams(layoutParams);
                SizeNotifierFrameLayout sizeNotifierFrameLayout = this.sizeNotifierLayout;
                if (sizeNotifierFrameLayout != null) {
                    this.emojiPadding = layoutParams.height;
                    sizeNotifierFrameLayout.requestLayout();
                    this.sizeNotifierLayout.getHeight();
                    if (this.lastEmojiExpanded != this.emojiExpanded) {
                        onEmojiKeyboardUpdate();
                    }
                }
            }
        }
        this.lastEmojiExpanded = this.emojiExpanded;
        int i5 = this.lastSizeChangeValue1;
        AnonymousClass2 anonymousClass2 = this.editText;
        if (i5 == i && this.lastSizeChangeValue2 == z) {
            if (allowSearch()) {
                if (anonymousClass2.isFocused() && i > 0) {
                    z3 = true;
                }
                this.keyboardVisible = z3;
            }
            this.sizeNotifierLayout.getHeight();
            return;
        }
        this.lastSizeChangeValue1 = i;
        this.lastSizeChangeValue2 = z;
        boolean z4 = this.keyboardVisible;
        boolean z5 = anonymousClass2.isFocused() && i > 0;
        this.keyboardVisible = z5;
        if (z5 && this.emojiViewVisible) {
            showPopup(0);
        }
        if (this.emojiPadding != 0 && !(z2 = this.keyboardVisible) && z2 != z4 && !this.emojiViewVisible) {
            this.emojiPadding = 0;
            this.sizeNotifierLayout.requestLayout();
        }
        if (this.keyboardVisible && this.waitingForKeyboardOpen) {
            this.waitingForKeyboardOpen = false;
            AndroidUtilities.cancelRunOnUIThread(this.openKeyboardRunnable);
        }
        this.sizeNotifierLayout.getHeight();
    }

    public void onWaitingForKeyboard() {
    }

    public final void openKeyboardInternal() {
        onWaitingForKeyboard();
        showPopup((AndroidUtilities.usingHardwareInput || this.isPaused) ? 0 : 2);
        AnonymousClass2 anonymousClass2 = this.editText;
        anonymousClass2.requestFocus();
        AndroidUtilities.showKeyboard(anonymousClass2);
        if (this.isPaused) {
            this.showKeyboardOnResume = true;
            return;
        }
        if (AndroidUtilities.usingHardwareInput || this.keyboardVisible || AndroidUtilities.isInMultiwindow || AndroidUtilities.isTablet()) {
            return;
        }
        this.waitingForKeyboardOpen = true;
        BubbleActivity.AnonymousClass1 anonymousClass1 = this.openKeyboardRunnable;
        AndroidUtilities.cancelRunOnUIThread(anonymousClass1);
        AndroidUtilities.runOnUIThread(anonymousClass1, 100L);
    }

    public void setAdjustPanLayoutHelper(AdjustPanLayoutHelper adjustPanLayoutHelper) {
        this.adjustPanLayoutHelper = adjustPanLayoutHelper;
    }

    public void setDelegate(EditTextEmojiDelegate editTextEmojiDelegate) {
    }

    public void setEmojiViewCacheType(int i) {
        this.emojiViewCacheType = i;
        AnonymousClass6 anonymousClass6 = this.emojiView;
        if (anonymousClass6 != null) {
            anonymousClass6.emojiCacheType = i;
        }
    }

    @Override
    public void setEnabled(boolean z) {
        AnonymousClass2 anonymousClass2 = this.editText;
        anonymousClass2.setEnabled(z);
        this.emojiButton.setVisibility(z ? 0 : 8);
        int iDp = AndroidUtilities.dp(this.currentStyle == 0 ? 11.0f : 8.0f);
        if (z) {
            anonymousClass2.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0, LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), iDp);
        } else {
            anonymousClass2.setPadding(0, 0, 0, iDp);
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
            sizeNotifierFrameLayout2.delegates.remove(this);
        }
        this.sizeNotifierLayout = sizeNotifierFrameLayout;
        sizeNotifierFrameLayout.delegates.add(this);
    }

    public void setSuggestionsEnabled(boolean z) {
        AnonymousClass2 anonymousClass2 = this.editText;
        int inputType = anonymousClass2.getInputType();
        int i = !z ? 524288 | inputType : (-524289) & inputType;
        if (anonymousClass2.getInputType() != i) {
            anonymousClass2.setInputType(i);
        }
    }

    public void setText(CharSequence charSequence) {
        this.editText.setText(charSequence);
    }

    public final void showPopup(int i) {
        ReplaceableIconDrawable replaceableIconDrawable = this.emojiIconDrawable;
        if (i != 1) {
            if (this.emojiButton != null) {
                if (this.currentStyle == 0) {
                    replaceableIconDrawable.setIcon(R.drawable.smiles_tab_smiles, true);
                } else {
                    replaceableIconDrawable.setIcon(R.drawable.input_smile, true);
                }
            }
            if (this.emojiView != null) {
                this.emojiViewVisible = false;
                onEmojiKeyboardUpdate();
                if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                    setVisibility(8);
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
                this.sizeNotifierLayout.getHeight();
                return;
            }
            return;
        }
        AnonymousClass6 anonymousClass6 = this.emojiView;
        if (anonymousClass6 != null) {
            anonymousClass6.getVisibility();
        }
        createEmojiView();
        setVisibility(0);
        this.emojiViewVisible = true;
        this.emojiViewAlpha = 1.0f;
        AnonymousClass6 anonymousClass7 = this.emojiView;
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
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) anonymousClass7.getLayoutParams();
        layoutParams.height = iMin;
        anonymousClass7.setLayoutParams(layoutParams);
        if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
            AndroidUtilities.hideKeyboard(this.editText);
        }
        SizeNotifierFrameLayout sizeNotifierFrameLayout2 = this.sizeNotifierLayout;
        if (sizeNotifierFrameLayout2 != null) {
            this.emojiPadding = iMin;
            sizeNotifierFrameLayout2.requestLayout();
            replaceableIconDrawable.setIcon(R.drawable.input_keyboard, true);
            this.sizeNotifierLayout.getHeight();
        }
        onEmojiKeyboardUpdate();
        setAlpha(1.0f);
        this.emojiViewAlpha = 1.0f;
        bottomPanelTranslationY(0.0f);
    }

    public void updatedEmojiExpanded() {
    }

    public EditTextEmoji(Context context, SizeNotifierFrameLayout sizeNotifierFrameLayout, BaseFragment baseFragment, int i, boolean z, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.isPaused = true;
        this.openKeyboardRunnable = new BubbleActivity.AnonymousClass1(this, 16);
        this.emojiViewCacheType = 2;
        this.allowAnimatedEmoji = z;
        this.resourcesProvider = resourcesProvider;
        this.currentStyle = i;
        this.parentFragment = baseFragment;
        this.sizeNotifierLayout = sizeNotifierFrameLayout;
        sizeNotifierFrameLayout.delegates.add(this);
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(context, resourcesProvider, i);
        this.editText = anonymousClass2;
        anonymousClass2.setImeOptions(268435456);
        anonymousClass2.setInputType(anonymousClass2.getInputType() | 16384);
        anonymousClass2.setFocusable(anonymousClass2.isEnabled());
        anonymousClass2.setCursorSize(AndroidUtilities.dp(20.0f));
        anonymousClass2.setCursorWidth(1.5f);
        int i2 = Theme.key_windowBackgroundWhiteBlackText;
        anonymousClass2.setCursorColor(Theme.getColor(i2, resourcesProvider));
        if (i == 0) {
            anonymousClass2.setTextSize(1, 18.0f);
            anonymousClass2.setMaxLines(4);
            anonymousClass2.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            anonymousClass2.setBackground(null);
            anonymousClass2.setLineColors(Theme.getColor(Theme.key_windowBackgroundWhiteInputField, resourcesProvider), Theme.getColor(Theme.key_windowBackgroundWhiteInputFieldActivated, resourcesProvider), Theme.getColor(Theme.key_text_RedRegular, resourcesProvider));
            anonymousClass2.setHintTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteHintText, resourcesProvider));
            anonymousClass2.setTextColor(Theme.getColor(i2, resourcesProvider));
            anonymousClass2.setHandlesColor(Theme.getColor(Theme.key_chat_TextSelectionCursor, resourcesProvider));
            anonymousClass2.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0, LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), AndroidUtilities.dp(11.0f));
            boolean z2 = LocaleController.isRTL;
            addView(anonymousClass2, LayoutHelper.createFrame(-1, -2.0f, 19, z2 ? 11.0f : 0.0f, 1.0f, z2 ? 0.0f : 11.0f, 0.0f));
        } else if (i == 2 || i == 3) {
            anonymousClass2.setTextSize(1, 16.0f);
            anonymousClass2.setMaxLines(8);
            anonymousClass2.setGravity(19);
            anonymousClass2.setAllowTextEntitiesIntersection(true);
            anonymousClass2.setHintTextColor(-1929379841);
            anonymousClass2.setTextColor(-1);
            anonymousClass2.setCursorColor(-1);
            anonymousClass2.setBackground(null);
            anonymousClass2.setClipToPadding(false);
            anonymousClass2.setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
            anonymousClass2.setHandlesColor(-1);
            anonymousClass2.setHighlightColor(822083583);
            anonymousClass2.setLinkTextColor(-12147733);
            anonymousClass2.quoteColor = -1;
            anonymousClass2.setTextIsSelectable(true);
            setClipChildren(false);
            setClipToPadding(false);
            addView(anonymousClass2, LayoutHelper.createFrame(-1, -1.0f, 19, 40.0f, 0.0f, 24.0f, 0.0f));
        } else if (i == 4) {
            anonymousClass2.setTextSize(1, 18.0f);
            anonymousClass2.setMaxLines(4);
            anonymousClass2.setGravity(19);
            anonymousClass2.setHintTextColor(Theme.getColor(Theme.key_dialogTextHint, resourcesProvider));
            anonymousClass2.setTextColor(Theme.getColor(Theme.key_dialogTextBlack, resourcesProvider));
            anonymousClass2.setBackground(null);
            anonymousClass2.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(12.0f));
            addView(anonymousClass2, LayoutHelper.createFrame(-1, -1.0f, 19, 14.0f, 0.0f, 48.0f, 0.0f));
        } else {
            anonymousClass2.setTextSize(1, 18.0f);
            anonymousClass2.setMaxLines(4);
            anonymousClass2.setGravity(19);
            anonymousClass2.setHintTextColor(Theme.getColor(Theme.key_dialogTextHint, resourcesProvider));
            anonymousClass2.setTextColor(Theme.getColor(Theme.key_dialogTextBlack, resourcesProvider));
            anonymousClass2.setBackground(null);
            anonymousClass2.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(12.0f));
            addView(anonymousClass2, LayoutHelper.createFrame(-1, -1.0f, 19, 48.0f, 0.0f, 0.0f, 0.0f));
        }
        AnonymousClass3 anonymousClass3 = new AnonymousClass3(this, context, 0);
        this.emojiButton = anonymousClass3;
        anonymousClass3.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        ReplaceableIconDrawable replaceableIconDrawable = new ReplaceableIconDrawable(context);
        this.emojiIconDrawable = replaceableIconDrawable;
        anonymousClass3.setImageDrawable(replaceableIconDrawable);
        if (i == 0) {
            replaceableIconDrawable.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_chat_messagePanelIcons, resourcesProvider), PorterDuff.Mode.MULTIPLY));
            replaceableIconDrawable.setIcon(R.drawable.smiles_tab_smiles, false);
            addView(anonymousClass3, LayoutHelper.createFrame(48, 48.0f, (LocaleController.isRTL ? 3 : 5) | 16, 0.0f, 0.0f, 0.0f, 5.0f));
        } else if (i == 2 || i == 3) {
            replaceableIconDrawable.setColorFilter(new PorterDuffColorFilter(-1929379841, PorterDuff.Mode.MULTIPLY));
            replaceableIconDrawable.setIcon(R.drawable.input_smile, false);
            addView(anonymousClass3, LayoutHelper.createFrame(40, 40.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        } else if (i == 4) {
            replaceableIconDrawable.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_chat_messagePanelIcons, resourcesProvider), PorterDuff.Mode.MULTIPLY));
            replaceableIconDrawable.setIcon(R.drawable.input_smile, false);
            addView(anonymousClass3, LayoutHelper.createFrame(48, 48.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        } else if (i == 5) {
            replaceableIconDrawable.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_graySectionText, resourcesProvider), PorterDuff.Mode.MULTIPLY));
            replaceableIconDrawable.setIcon(R.drawable.input_smile, false);
            addView(anonymousClass3, LayoutHelper.createFrame(48, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        } else {
            replaceableIconDrawable.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_chat_messagePanelIcons, resourcesProvider), PorterDuff.Mode.MULTIPLY));
            replaceableIconDrawable.setIcon(R.drawable.input_smile, false);
            addView(anonymousClass3, LayoutHelper.createFrame(48, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        anonymousClass3.setBackground(Theme.createSelectorDrawable(Theme.getColor(Theme.key_listSelector, resourcesProvider), 1, -1));
        anonymousClass3.setOnClickListener(new ChatActivity$$ExternalSyntheticLambda62(this, sizeNotifierFrameLayout, resourcesProvider, 21));
        anonymousClass3.setContentDescription(LocaleController.getString(R.string.Emoji));
    }
}
