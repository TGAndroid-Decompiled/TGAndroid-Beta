package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
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
import java.util.ArrayList;
import java.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.XiaomiUtilities;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$InputStickerSet;
import org.telegram.tgnet.TLRPC$StickerSet;
import org.telegram.tgnet.TLRPC$StickerSetCovered;
import org.telegram.ui.ActionBar.AdjustPanLayoutHelper;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.EditTextEmoji;
import org.telegram.ui.Components.EmojiView;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
public class EditTextEmoji extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, SizeNotifierFrameLayout.SizeNotifierFrameLayoutDelegate {
    AdjustPanLayoutHelper adjustPanLayoutHelper;
    private boolean allowAnimatedEmoji;
    private int currentStyle;
    private EditTextEmojiDelegate delegate;
    private boolean destroyed;
    private EditTextCaption editText;
    private ImageView emojiButton;
    private ReplaceableIconDrawable emojiIconDrawable;
    private int emojiPadding;
    private EmojiView emojiView;
    private boolean emojiViewVisible;
    private ItemOptions formatOptions;
    public boolean includeNavigationBar;
    private int innerTextChange;
    private boolean isAnimatePopupClosing;
    private boolean isPaused;
    private int keyboardHeight;
    private int keyboardHeightLand;
    private boolean keyboardVisible;
    private int lastSizeChangeValue1;
    private boolean lastSizeChangeValue2;
    private Runnable openKeyboardRunnable;
    private BaseFragment parentFragment;
    private final Theme.ResourcesProvider resourcesProvider;
    private boolean showKeyboardOnResume;
    private boolean shownFormatButton;
    private SizeNotifierFrameLayout sizeNotifierLayout;
    private boolean waitingForKeyboardOpen;

    public interface EditTextEmojiDelegate {
        void onWindowSizeChanged(int i);
    }

    protected void bottomPanelTranslationY(float f) {
    }

    protected void closeParent() {
    }

    protected boolean customEmojiButtonDraw(Canvas canvas, View view, Drawable drawable) {
        return false;
    }

    protected void drawEmojiBackground(Canvas canvas, View view) {
    }

    protected void onEmojiKeyboardUpdate() {
    }

    protected void onLineCountChanged(int i, int i2) {
    }

    protected boolean onScrollYChange(int i) {
        return true;
    }

    protected void onWaitingForKeyboard() {
    }

    public boolean isPopupVisible() {
        EmojiView emojiView = this.emojiView;
        return emojiView != null && emojiView.getVisibility() == 0;
    }

    public boolean isWaitingForKeyboardOpen() {
        return this.waitingForKeyboardOpen;
    }

    public boolean isAnimatePopupClosing() {
        return this.isAnimatePopupClosing;
    }

    public void setAdjustPanLayoutHelper(AdjustPanLayoutHelper adjustPanLayoutHelper) {
        this.adjustPanLayoutHelper = adjustPanLayoutHelper;
    }

    public EditTextEmoji(Context context, SizeNotifierFrameLayout sizeNotifierFrameLayout, BaseFragment baseFragment, int i, boolean z) {
        this(context, sizeNotifierFrameLayout, baseFragment, i, z, null);
    }

    public EditTextEmoji(Context context, final SizeNotifierFrameLayout sizeNotifierFrameLayout, BaseFragment baseFragment, final int i, boolean z, final Theme.ResourcesProvider resourcesProvider) {
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
        this.allowAnimatedEmoji = z;
        this.resourcesProvider = resourcesProvider;
        this.currentStyle = i;
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        this.parentFragment = baseFragment;
        this.sizeNotifierLayout = sizeNotifierFrameLayout;
        sizeNotifierFrameLayout.setDelegate(this);
        EditTextCaption editTextCaption = new EditTextCaption(context, resourcesProvider) {
            private Drawable lastIcon = null;

            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                if (EditTextEmoji.this.isPopupShowing() && motionEvent.getAction() == 0) {
                    EditTextEmoji.this.onWaitingForKeyboard();
                    EditTextEmoji.this.showPopup(AndroidUtilities.usingHardwareInput ? 0 : 2);
                    EditTextEmoji.this.openKeyboardInternal();
                }
                if (motionEvent.getAction() == 0) {
                    requestFocus();
                    if (!AndroidUtilities.showKeyboard(this)) {
                        clearFocus();
                        requestFocus();
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
            protected void onLineCountChanged(int i2, int i3) {
                EditTextEmoji.this.onLineCountChanged(i2, i3);
            }

            @Override
            public int getActionModeStyle() {
                if (i == 2) {
                    return 2;
                }
                return super.getActionModeStyle();
            }

            @Override
            public void extendActionMode(ActionMode actionMode, Menu menu) {
                if (EditTextEmoji.this.allowEntities()) {
                    ChatActivity.fillActionModeMenu(menu, null);
                }
                super.extendActionMode(actionMode, menu);
            }

            @Override
            public void scrollTo(int i2, int i3) {
                if (EditTextEmoji.this.onScrollYChange(i3)) {
                    super.scrollTo(i2, i3);
                }
            }

            @Override
            public void onSelectionChanged(int i2, int i3) {
                super.onSelectionChanged(i2, i3);
                if (EditTextEmoji.this.emojiIconDrawable != null) {
                    boolean z2 = false;
                    boolean z3 = i3 != i2;
                    if (EditTextEmoji.this.allowEntities() && z3 && XiaomiUtilities.isMIUI()) {
                        z2 = true;
                    }
                    if (EditTextEmoji.this.shownFormatButton != z2) {
                        EditTextEmoji.this.shownFormatButton = z2;
                        if (z2) {
                            this.lastIcon = EditTextEmoji.this.emojiIconDrawable.getIcon();
                            EditTextEmoji.this.emojiIconDrawable.setIcon(R.drawable.msg_edit, true);
                            return;
                        }
                        EditTextEmoji.this.emojiIconDrawable.setIcon(this.lastIcon, true);
                        this.lastIcon = null;
                    }
                }
            }
        };
        this.editText = editTextCaption;
        editTextCaption.setImeOptions(268435456);
        EditTextCaption editTextCaption2 = this.editText;
        editTextCaption2.setInputType(editTextCaption2.getInputType() | LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD_NOT_PREMIUM);
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
            this.editText.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0, LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), AndroidUtilities.dp(8.0f));
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
            this.editText.setTextIsSelectable(true);
            addView(this.editText, LayoutHelper.createFrame(-1, -1.0f, 19, 40.0f, 0.0f, 24.0f, 0.0f));
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
            protected void dispatchDraw(Canvas canvas) {
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
            addView(this.emojiButton, LayoutHelper.createFrame(48, 48.0f, (LocaleController.isRTL ? 3 : 5) | 16, 0.0f, 0.0f, 0.0f, 7.0f));
        } else if (i == 2 || i == 3) {
            this.emojiIconDrawable.setColorFilter(new PorterDuffColorFilter(-1929379841, PorterDuff.Mode.MULTIPLY));
            this.emojiIconDrawable.setIcon(R.drawable.input_smile, false);
            addView(this.emojiButton, LayoutHelper.createFrame(40, 40.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        } else {
            this.emojiIconDrawable.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_chat_messagePanelIcons), PorterDuff.Mode.MULTIPLY));
            this.emojiIconDrawable.setIcon(R.drawable.input_smile, false);
            addView(this.emojiButton, LayoutHelper.createFrame(48, 48.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        if (Build.VERSION.SDK_INT >= 21) {
            this.emojiButton.setBackground(Theme.createSelectorDrawable(getThemedColor(Theme.key_listSelector)));
        }
        this.emojiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                EditTextEmoji.this.lambda$new$0(sizeNotifierFrameLayout, resourcesProvider, view);
            }
        });
        this.emojiButton.setContentDescription(LocaleController.getString("Emoji", R.string.Emoji));
    }

    public void lambda$new$0(SizeNotifierFrameLayout sizeNotifierFrameLayout, Theme.ResourcesProvider resourcesProvider, View view) {
        if (!this.emojiButton.isEnabled() || this.emojiButton.getAlpha() < 0.5f) {
            return;
        }
        AdjustPanLayoutHelper adjustPanLayoutHelper = this.adjustPanLayoutHelper;
        if (adjustPanLayoutHelper == null || !adjustPanLayoutHelper.animationInProgress()) {
            if (this.shownFormatButton) {
                ItemOptions itemOptions = this.formatOptions;
                if (itemOptions == null) {
                    this.editText.hideActionMode();
                    ItemOptions makeOptions = ItemOptions.makeOptions(sizeNotifierFrameLayout, resourcesProvider, this.emojiButton);
                    makeOptions.setMaxHeight(AndroidUtilities.dp(280.0f));
                    final EditTextCaption editTextCaption = this.editText;
                    Objects.requireNonNull(editTextCaption);
                    editTextCaption.extendActionMode(null, new MenuToItemOptions(makeOptions, new Utilities.Callback() {
                        @Override
                        public final void run(Object obj) {
                            EditTextCaption.this.performMenuAction(((Integer) obj).intValue());
                        }
                    }, this.editText.getOnPremiumMenuLockClickListener()));
                    makeOptions.forceTop(true);
                    makeOptions.show();
                    return;
                }
                itemOptions.dismiss();
                this.formatOptions = null;
            } else if (!isPopupShowing()) {
                showPopup(1);
                this.emojiView.onOpen(this.editText.length() > 0);
                this.editText.requestFocus();
            } else {
                openKeyboardInternal();
            }
        }
    }

    protected boolean allowEntities() {
        int i = this.currentStyle;
        return i == 2 || i == 3;
    }

    public void setSuggestionsEnabled(boolean z) {
        int inputType = this.editText.getInputType();
        int i = !z ? 524288 | inputType : (-524289) & inputType;
        if (this.editText.getInputType() != i) {
            this.editText.setInputType(i);
        }
    }

    public void setSizeNotifierLayout(SizeNotifierFrameLayout sizeNotifierFrameLayout) {
        this.sizeNotifierLayout = sizeNotifierFrameLayout;
        sizeNotifierFrameLayout.setDelegate(this);
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

    @Override
    public void setEnabled(boolean z) {
        this.editText.setEnabled(z);
        this.emojiButton.setVisibility(z ? 0 : 8);
        if (z) {
            this.editText.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0, LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), AndroidUtilities.dp(8.0f));
        } else {
            this.editText.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
        }
    }

    @Override
    public void setFocusable(boolean z) {
        this.editText.setFocusable(z);
    }

    public void hideEmojiView() {
        EmojiView emojiView;
        if (!this.emojiViewVisible && (emojiView = this.emojiView) != null && emojiView.getVisibility() != 8) {
            this.emojiView.setVisibility(8);
        }
        this.emojiPadding = 0;
    }

    public EmojiView getEmojiView() {
        return this.emojiView;
    }

    public void setDelegate(EditTextEmojiDelegate editTextEmojiDelegate) {
        this.delegate = editTextEmojiDelegate;
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

    public void onDestroy() {
        this.destroyed = true;
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        EmojiView emojiView = this.emojiView;
        if (emojiView != null) {
            emojiView.onDestroy();
        }
        SizeNotifierFrameLayout sizeNotifierFrameLayout = this.sizeNotifierLayout;
        if (sizeNotifierFrameLayout != null) {
            sizeNotifierFrameLayout.setDelegate(null);
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

    public void setMaxLines(int i) {
        this.editText.setMaxLines(i);
    }

    public int length() {
        return this.editText.length();
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        this.editText.setFilters(inputFilterArr);
    }

    public Editable getText() {
        return this.editText.getText();
    }

    public void setHint(CharSequence charSequence) {
        this.editText.setHint(charSequence);
    }

    public void setText(CharSequence charSequence) {
        this.editText.setText(charSequence);
    }

    public void setSelection(int i) {
        this.editText.setSelection(i);
    }

    public void hidePopup(boolean z) {
        if (isPopupShowing()) {
            showPopup(0);
        }
        if (z) {
            EmojiView emojiView = this.emojiView;
            if (emojiView != null && emojiView.getVisibility() == 0 && !this.waitingForKeyboardOpen) {
                final int measuredHeight = this.emojiView.getMeasuredHeight();
                if (this.emojiView.getParent() instanceof ViewGroup) {
                    measuredHeight += ((ViewGroup) this.emojiView.getParent()).getHeight() - this.emojiView.getBottom();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, measuredHeight);
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        EditTextEmoji.this.lambda$hidePopup$1(measuredHeight, valueAnimator);
                    }
                });
                this.isAnimatePopupClosing = true;
                ofFloat.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        EditTextEmoji.this.isAnimatePopupClosing = false;
                        EditTextEmoji.this.emojiView.setTranslationY(0.0f);
                        EditTextEmoji.this.emojiView.setAlpha(0.0f);
                        EditTextEmoji.this.bottomPanelTranslationY(0.0f);
                        EditTextEmoji.this.hideEmojiView();
                    }
                });
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(AdjustPanLayoutHelper.keyboardInterpolator);
                ofFloat.start();
                return;
            }
            hideEmojiView();
        }
    }

    public void lambda$hidePopup$1(int i, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.emojiView.setTranslationY(floatValue);
        if (i > 0 && this.currentStyle == 2) {
            this.emojiView.setAlpha(1.0f - (floatValue / i));
        }
        bottomPanelTranslationY(floatValue - i);
    }

    public void openKeyboard() {
        AndroidUtilities.showKeyboard(this.editText);
    }

    public void closeKeyboard() {
        AndroidUtilities.hideKeyboard(this.editText);
    }

    public boolean isPopupShowing() {
        return this.emojiViewVisible;
    }

    public boolean isKeyboardVisible() {
        return this.keyboardVisible;
    }

    protected void openKeyboardInternal() {
        onWaitingForKeyboard();
        showPopup((AndroidUtilities.usingHardwareInput || this.isPaused) ? 0 : 2);
        this.editText.requestFocus();
        AndroidUtilities.showKeyboard(this.editText);
        if (this.isPaused) {
            this.showKeyboardOnResume = true;
        } else if (AndroidUtilities.usingHardwareInput || this.keyboardVisible || AndroidUtilities.isInMultiwindow || AndroidUtilities.isTablet()) {
        } else {
            this.waitingForKeyboardOpen = true;
            AndroidUtilities.cancelRunOnUIThread(this.openKeyboardRunnable);
            AndroidUtilities.runOnUIThread(this.openKeyboardRunnable, 100L);
        }
    }

    public void showPopup(int i) {
        if (i == 1) {
            EmojiView emojiView = this.emojiView;
            boolean z = emojiView != null && emojiView.getVisibility() == 0;
            createEmojiView();
            this.emojiView.setVisibility(0);
            this.emojiViewVisible = true;
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
            android.graphics.Point point = AndroidUtilities.displaySize;
            int i2 = (point.x > point.y ? this.keyboardHeightLand : this.keyboardHeight) + (this.includeNavigationBar ? AndroidUtilities.navigationBarHeight : 0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) emojiView2.getLayoutParams();
            layoutParams.height = i2;
            emojiView2.setLayoutParams(layoutParams);
            if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                AndroidUtilities.hideKeyboard(this.editText);
            }
            SizeNotifierFrameLayout sizeNotifierFrameLayout = this.sizeNotifierLayout;
            if (sizeNotifierFrameLayout != null) {
                this.emojiPadding = i2;
                sizeNotifierFrameLayout.requestLayout();
                this.emojiIconDrawable.setIcon(R.drawable.input_keyboard, true);
                onWindowSizeChanged();
            }
            onEmojiKeyboardUpdate();
            if (!this.keyboardVisible && !z) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.emojiPadding, 0.0f);
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        EditTextEmoji.this.lambda$showPopup$2(valueAnimator);
                    }
                });
                ofFloat.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        EditTextEmoji.this.emojiView.setTranslationY(0.0f);
                        EditTextEmoji.this.emojiView.setAlpha(1.0f);
                        EditTextEmoji.this.bottomPanelTranslationY(0.0f);
                    }
                });
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(AdjustPanLayoutHelper.keyboardInterpolator);
                ofFloat.start();
                return;
            }
            this.emojiView.setAlpha(1.0f);
            return;
        }
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
            }
        }
        SizeNotifierFrameLayout sizeNotifierFrameLayout2 = this.sizeNotifierLayout;
        if (sizeNotifierFrameLayout2 != null) {
            if (i == 0) {
                this.emojiPadding = 0;
            }
            sizeNotifierFrameLayout2.requestLayout();
            onWindowSizeChanged();
        }
    }

    public void lambda$showPopup$2(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.emojiView.setTranslationY(floatValue);
        int i = this.emojiPadding;
        if (i > 0 && this.currentStyle == 2) {
            this.emojiView.setAlpha(1.0f - (floatValue / i));
        }
        bottomPanelTranslationY(floatValue);
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

    public void createEmojiView() {
        EmojiView emojiView = this.emojiView;
        if (emojiView != null && emojiView.currentAccount != UserConfig.selectedAccount) {
            this.sizeNotifierLayout.removeView(emojiView);
            this.emojiView = null;
        }
        if (this.emojiView != null) {
            return;
        }
        EmojiView emojiView2 = new EmojiView(this.parentFragment, this.allowAnimatedEmoji, false, false, getContext(), false, null, null, this.currentStyle != 2, this.resourcesProvider) {
            @Override
            protected void dispatchDraw(Canvas canvas) {
                if (EditTextEmoji.this.currentStyle == 2) {
                    EditTextEmoji.this.drawEmojiBackground(canvas, this);
                }
                super.dispatchDraw(canvas);
            }
        };
        this.emojiView = emojiView2;
        emojiView2.setVisibility(8);
        if (AndroidUtilities.isTablet()) {
            this.emojiView.setForseMultiwindowLayout(true);
        }
        this.emojiView.setDelegate(new AnonymousClass7());
        this.sizeNotifierLayout.addView(this.emojiView);
    }

    public class AnonymousClass7 implements EmojiView.EmojiViewDelegate {
        @Override
        public boolean canSchedule() {
            return EmojiView.EmojiViewDelegate.CC.$default$canSchedule(this);
        }

        @Override
        public long getDialogId() {
            return EmojiView.EmojiViewDelegate.CC.$default$getDialogId(this);
        }

        @Override
        public float getProgressToSearchOpened() {
            return EmojiView.EmojiViewDelegate.CC.$default$getProgressToSearchOpened(this);
        }

        @Override
        public int getThreadId() {
            return EmojiView.EmojiViewDelegate.CC.$default$getThreadId(this);
        }

        @Override
        public void invalidateEnterView() {
            EmojiView.EmojiViewDelegate.CC.$default$invalidateEnterView(this);
        }

        @Override
        public boolean isExpanded() {
            return EmojiView.EmojiViewDelegate.CC.$default$isExpanded(this);
        }

        @Override
        public boolean isInScheduleMode() {
            return EmojiView.EmojiViewDelegate.CC.$default$isInScheduleMode(this);
        }

        @Override
        public boolean isSearchOpened() {
            return EmojiView.EmojiViewDelegate.CC.$default$isSearchOpened(this);
        }

        @Override
        public boolean isUserSelf() {
            return EmojiView.EmojiViewDelegate.CC.$default$isUserSelf(this);
        }

        @Override
        public void onEmojiSettingsClick(ArrayList arrayList) {
            EmojiView.EmojiViewDelegate.CC.$default$onEmojiSettingsClick(this, arrayList);
        }

        @Override
        public void onGifSelected(View view, Object obj, String str, Object obj2, boolean z, int i) {
            EmojiView.EmojiViewDelegate.CC.$default$onGifSelected(this, view, obj, str, obj2, z, i);
        }

        @Override
        public void onSearchOpenClose(int i) {
            EmojiView.EmojiViewDelegate.CC.$default$onSearchOpenClose(this, i);
        }

        @Override
        public void onShowStickerSet(TLRPC$StickerSet tLRPC$StickerSet, TLRPC$InputStickerSet tLRPC$InputStickerSet) {
            EmojiView.EmojiViewDelegate.CC.$default$onShowStickerSet(this, tLRPC$StickerSet, tLRPC$InputStickerSet);
        }

        @Override
        public void onStickerSelected(View view, TLRPC$Document tLRPC$Document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z, int i) {
            EmojiView.EmojiViewDelegate.CC.$default$onStickerSelected(this, view, tLRPC$Document, str, obj, sendAnimationData, z, i);
        }

        @Override
        public void onStickerSetAdd(TLRPC$StickerSetCovered tLRPC$StickerSetCovered) {
            EmojiView.EmojiViewDelegate.CC.$default$onStickerSetAdd(this, tLRPC$StickerSetCovered);
        }

        @Override
        public void onStickerSetRemove(TLRPC$StickerSetCovered tLRPC$StickerSetCovered) {
            EmojiView.EmojiViewDelegate.CC.$default$onStickerSetRemove(this, tLRPC$StickerSetCovered);
        }

        @Override
        public void onStickersGroupClick(long j) {
            EmojiView.EmojiViewDelegate.CC.$default$onStickersGroupClick(this, j);
        }

        @Override
        public void onStickersSettingsClick() {
            EmojiView.EmojiViewDelegate.CC.$default$onStickersSettingsClick(this);
        }

        @Override
        public void onTabOpened(int i) {
            EmojiView.EmojiViewDelegate.CC.$default$onTabOpened(this, i);
        }

        @Override
        public void showTrendingStickersAlert(TrendingStickersLayout trendingStickersLayout) {
            EmojiView.EmojiViewDelegate.CC.$default$showTrendingStickersAlert(this, trendingStickersLayout);
        }

        AnonymousClass7() {
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
        public void onAnimatedEmojiUnlockClick() {
            BaseFragment baseFragment = EditTextEmoji.this.parentFragment;
            if (baseFragment == null) {
                new PremiumFeatureBottomSheet(new BaseFragment() {
                    @Override
                    public int getCurrentAccount() {
                        return this.currentAccount;
                    }

                    @Override
                    public Context getContext() {
                        return EditTextEmoji.this.getContext();
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
                }, 11, false).show();
            } else {
                baseFragment.showDialog(new PremiumFeatureBottomSheet(baseFragment, 11, false));
            }
        }

        @Override
        public void onEmojiSelected(String str) {
            int selectionEnd = EditTextEmoji.this.editText.getSelectionEnd();
            if (selectionEnd < 0) {
                selectionEnd = 0;
            }
            try {
                try {
                    EditTextEmoji.this.innerTextChange = 2;
                    CharSequence replaceEmoji = Emoji.replaceEmoji(str, EditTextEmoji.this.editText.getPaint().getFontMetricsInt(), AndroidUtilities.dp(20.0f), false);
                    EditTextEmoji.this.editText.setText(EditTextEmoji.this.editText.getText().insert(selectionEnd, replaceEmoji));
                    int length = selectionEnd + replaceEmoji.length();
                    EditTextEmoji.this.editText.setSelection(length, length);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            } finally {
                EditTextEmoji.this.innerTextChange = 0;
            }
        }

        @Override
        public void onCustomEmojiSelected(long j, TLRPC$Document tLRPC$Document, String str, boolean z) {
            AnimatedEmojiSpan animatedEmojiSpan;
            int selectionEnd = EditTextEmoji.this.editText.getSelectionEnd();
            if (selectionEnd < 0) {
                selectionEnd = 0;
            }
            try {
                try {
                    EditTextEmoji.this.innerTextChange = 2;
                    SpannableString spannableString = new SpannableString(str);
                    if (tLRPC$Document != null) {
                        animatedEmojiSpan = new AnimatedEmojiSpan(tLRPC$Document, EditTextEmoji.this.editText.getPaint().getFontMetricsInt());
                    } else {
                        animatedEmojiSpan = new AnimatedEmojiSpan(j, EditTextEmoji.this.editText.getPaint().getFontMetricsInt());
                    }
                    animatedEmojiSpan.cacheType = EditTextEmoji.this.emojiView.emojiCacheType;
                    spannableString.setSpan(animatedEmojiSpan, 0, spannableString.length(), 33);
                    EditTextEmoji.this.editText.setText(EditTextEmoji.this.editText.getText().insert(selectionEnd, spannableString));
                    int length = selectionEnd + spannableString.length();
                    EditTextEmoji.this.editText.setSelection(length, length);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            } finally {
                EditTextEmoji.this.innerTextChange = 0;
            }
        }

        @Override
        public void onClearEmojiRecent() {
            AlertDialog.Builder builder = new AlertDialog.Builder(EditTextEmoji.this.getContext(), EditTextEmoji.this.resourcesProvider);
            builder.setTitle(LocaleController.getString("ClearRecentEmojiTitle", R.string.ClearRecentEmojiTitle));
            builder.setMessage(LocaleController.getString("ClearRecentEmojiText", R.string.ClearRecentEmojiText));
            builder.setPositiveButton(LocaleController.getString("ClearButton", R.string.ClearButton), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i) {
                    EditTextEmoji.AnonymousClass7.this.lambda$onClearEmojiRecent$0(dialogInterface, i);
                }
            });
            builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
            if (EditTextEmoji.this.parentFragment != null) {
                EditTextEmoji.this.parentFragment.showDialog(builder.create());
            } else {
                builder.show();
            }
        }

        public void lambda$onClearEmojiRecent$0(DialogInterface dialogInterface, int i) {
            EditTextEmoji.this.emojiView.clearRecentEmoji();
        }
    }

    public boolean isPopupView(View view) {
        return view == this.emojiView;
    }

    public int getEmojiPadding() {
        return this.emojiPadding;
    }

    public int getKeyboardHeight() {
        android.graphics.Point point = AndroidUtilities.displaySize;
        return (point.x > point.y ? this.keyboardHeightLand : this.keyboardHeight) + (this.includeNavigationBar ? AndroidUtilities.navigationBarHeight : 0);
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
        if (isPopupShowing()) {
            int i3 = (z ? this.keyboardHeightLand : this.keyboardHeight) + (this.includeNavigationBar ? AndroidUtilities.navigationBarHeight : 0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.emojiView.getLayoutParams();
            int i4 = layoutParams.width;
            int i5 = AndroidUtilities.displaySize.x;
            if (i4 != i5 || layoutParams.height != i3) {
                layoutParams.width = i5;
                layoutParams.height = i3;
                this.emojiView.setLayoutParams(layoutParams);
                SizeNotifierFrameLayout sizeNotifierFrameLayout = this.sizeNotifierLayout;
                if (sizeNotifierFrameLayout != null) {
                    this.emojiPadding = layoutParams.height;
                    sizeNotifierFrameLayout.requestLayout();
                    onWindowSizeChanged();
                }
            }
        }
        if (this.lastSizeChangeValue1 == i && this.lastSizeChangeValue2 == z) {
            onWindowSizeChanged();
            return;
        }
        this.lastSizeChangeValue1 = i;
        this.lastSizeChangeValue2 = z;
        boolean z3 = this.keyboardVisible;
        boolean z4 = this.editText.isFocused() && i > 0;
        this.keyboardVisible = z4;
        if (z4 && isPopupShowing()) {
            showPopup(0);
        }
        if (this.emojiPadding != 0 && !(z2 = this.keyboardVisible) && z2 != z3 && !isPopupShowing()) {
            this.emojiPadding = 0;
            this.sizeNotifierLayout.requestLayout();
        }
        if (this.keyboardVisible && this.waitingForKeyboardOpen) {
            this.waitingForKeyboardOpen = false;
            AndroidUtilities.cancelRunOnUIThread(this.openKeyboardRunnable);
        }
        onWindowSizeChanged();
    }

    public EditTextCaption getEditText() {
        return this.editText;
    }

    public View getEmojiButton() {
        return this.emojiButton;
    }

    private int getThemedColor(int i) {
        return Theme.getColor(i, this.resourcesProvider);
    }
}
