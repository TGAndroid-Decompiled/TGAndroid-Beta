package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.BlurringShader;
import org.telegram.ui.Stories.DarkThemeResourceProvider;
import org.telegram.ui.Stories.recorder.CaptionContainerView;
import org.telegram.ui.Stories.recorder.HintView2;

public abstract class CaptionPhotoViewer extends CaptionContainerView {
    private final int SHOW_ONCE;
    private final ImageView addPhotoButton;
    private boolean addPhotoVisible;
    private final Runnable applyCaption;
    private final Runnable collapseMoveButton;
    private final HintView2 hint;
    private boolean isVideo;
    private final AnimatedFloat moveButtonAnimated;
    private final ButtonBounce moveButtonBounce;
    private final RectF moveButtonBounds;
    private boolean moveButtonExpanded;
    private final AnimatedFloat moveButtonExpandedAnimated;
    private Drawable moveButtonIcon;
    private final AnimatedTextView.AnimatedTextDrawable moveButtonText;
    private boolean moveButtonVisible;
    private Utilities.Callback onTTLChange;
    private int timer;
    private final ImageView timerButton;
    private final CaptionContainerView.PeriodDrawable timerDrawable;
    private ItemOptions timerPopup;
    private boolean timerVisible;
    private final int[] values;

    @Override
    protected int additionalKeyboardHeight() {
        return 0;
    }

    @Override
    protected int getEditTextStyle() {
        return 3;
    }

    protected abstract void onMoveButtonClick();

    protected abstract void openedKeyboard();

    protected abstract boolean showMoveButton();

    public CaptionPhotoViewer(Context context, final FrameLayout frameLayout, SizeNotifierFrameLayout sizeNotifierFrameLayout, FrameLayout frameLayout2, Theme.ResourcesProvider resourcesProvider, BlurringShader.BlurManager blurManager, Runnable runnable) {
        super(context, frameLayout, sizeNotifierFrameLayout, frameLayout2, resourcesProvider, blurManager);
        this.timer = 0;
        this.SHOW_ONCE = Integer.MAX_VALUE;
        this.values = new int[]{Integer.MAX_VALUE, 3, 10, 30, 0};
        this.moveButtonBounds = new RectF();
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable();
        this.moveButtonText = animatedTextDrawable;
        this.moveButtonBounce = new ButtonBounce(this);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.moveButtonAnimated = new AnimatedFloat(this, 0L, 350L, cubicBezierInterpolator);
        this.moveButtonExpandedAnimated = new AnimatedFloat(this, 0L, 350L, cubicBezierInterpolator);
        this.collapseMoveButton = new Runnable() {
            @Override
            public final void run() {
                CaptionPhotoViewer.this.lambda$new$2();
            }
        };
        this.applyCaption = runnable;
        animatedTextDrawable.setTextSize(AndroidUtilities.dp(14.0f));
        animatedTextDrawable.setOverrideFullWidth(AndroidUtilities.displaySize.x);
        animatedTextDrawable.setTextColor(-1);
        if (isAtTop()) {
            animatedTextDrawable.setText(LocaleController.getString(R.string.MoveCaptionDown));
            this.moveButtonIcon = context.getResources().getDrawable(R.drawable.menu_link_below);
        } else {
            animatedTextDrawable.setText(LocaleController.getString(R.string.MoveCaptionUp));
            this.moveButtonIcon = context.getResources().getDrawable(R.drawable.menu_link_above);
        }
        ImageView imageView = new ImageView(context);
        this.addPhotoButton = imageView;
        imageView.setImageResource(R.drawable.filled_add_photo);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setBackground(Theme.createSelectorDrawable(1090519039, 1, AndroidUtilities.dp(18.0f)));
        setAddPhotoVisible(false, false);
        addView(imageView, LayoutHelper.createFrame(44, 44.0f, (isAtTop() ? 48 : 80) | 3, 14.0f, isAtTop() ? 10.0f : 0.0f, 0.0f, isAtTop() ? 0.0f : 10.0f));
        ImageView imageView2 = new ImageView(context);
        this.timerButton = imageView2;
        CaptionContainerView.PeriodDrawable periodDrawable = new CaptionContainerView.PeriodDrawable();
        this.timerDrawable = periodDrawable;
        imageView2.setImageDrawable(periodDrawable);
        imageView2.setBackground(Theme.createSelectorDrawable(1090519039, 1, AndroidUtilities.dp(18.0f)));
        imageView2.setScaleType(scaleType);
        setTimerVisible(false, false);
        addView(imageView2, LayoutHelper.createFrame(44, 44.0f, (isAtTop() ? 48 : 80) | 5, 0.0f, isAtTop() ? 10.0f : 0.0f, 11.0f, isAtTop() ? 0.0f : 10.0f));
        HintView2 hintView2 = new HintView2(context, isAtTop() ? 1 : 3);
        this.hint = hintView2;
        hintView2.setRounding(12.0f);
        hintView2.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(isAtTop() ? 8.0f : 0.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(isAtTop() ? 0.0f : 8.0f));
        hintView2.setJoint(1.0f, -21.0f);
        hintView2.setMultilineText(true);
        addView(hintView2, LayoutHelper.createFrame(-1, 80, (isAtTop() ? 48 : 80) | 5));
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                CaptionPhotoViewer.this.lambda$new$1(frameLayout, view);
            }
        });
    }

    public void lambda$new$1(FrameLayout frameLayout, View view) {
        String formatPluralString;
        ItemOptions itemOptions = this.timerPopup;
        if (itemOptions != null && itemOptions.isShown()) {
            this.timerPopup.dismiss();
            this.timerPopup = null;
            return;
        }
        this.hint.hide();
        ItemOptions makeOptions = ItemOptions.makeOptions(frameLayout, new DarkThemeResourceProvider(), this.timerButton);
        this.timerPopup = makeOptions;
        makeOptions.setDimAlpha(0);
        this.timerPopup.addText(LocaleController.getString(R.string.TimerPeriodHint), 13, AndroidUtilities.dp(200.0f));
        this.timerPopup.addGap();
        for (final int i : this.values) {
            if (i == 0) {
                formatPluralString = LocaleController.getString(R.string.TimerPeriodDoNotDelete);
            } else if (i == Integer.MAX_VALUE) {
                formatPluralString = LocaleController.getString(R.string.TimerPeriodOnce);
            } else {
                formatPluralString = LocaleController.formatPluralString("Seconds", i, new Object[0]);
            }
            this.timerPopup.add(0, formatPluralString, new Runnable() {
                @Override
                public final void run() {
                    CaptionPhotoViewer.this.lambda$new$0(i);
                }
            });
            if (this.timer == i) {
                this.timerPopup.putCheck();
            }
        }
        this.timerPopup.show();
    }

    public void expandMoveButton() {
        AndroidUtilities.cancelRunOnUIThread(this.collapseMoveButton);
        boolean shouldShowMoveCaptionHint = MessagesController.getInstance(this.currentAccount).shouldShowMoveCaptionHint();
        this.moveButtonExpanded = shouldShowMoveCaptionHint;
        if (shouldShowMoveCaptionHint) {
            MessagesController.getInstance(this.currentAccount).incrementMoveCaptionHint();
            invalidate();
            AndroidUtilities.runOnUIThread(this.collapseMoveButton, 5000L);
        }
    }

    public void lambda$new$2() {
        if (this.moveButtonExpanded) {
            this.moveButtonExpanded = false;
            invalidate();
        }
    }

    @Override
    public void updateKeyboard(int i) {
        boolean z = this.toKeyboardShow;
        super.updateKeyboard(i);
        if (z || !this.keyboardNotifier.keyboardVisible()) {
            return;
        }
        openedKeyboard();
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float f = this.moveButtonAnimated.set(this.moveButtonVisible, !showMoveButton());
        float f2 = this.moveButtonExpandedAnimated.set(this.moveButtonExpanded);
        if (f > 0.0f) {
            float scale = this.moveButtonBounce.getScale(0.03f);
            if (isAtTop()) {
                this.moveButtonBounds.set(AndroidUtilities.dp(10.0f), this.bounds.bottom + AndroidUtilities.dp(10.0f), AndroidUtilities.dp(44.0f) + ((this.moveButtonText.getCurrentWidth() + AndroidUtilities.dp(11.0f)) * f2), this.bounds.bottom + AndroidUtilities.dp(42.0f));
            } else {
                this.moveButtonBounds.set(AndroidUtilities.dp(10.0f), this.bounds.top - AndroidUtilities.dp(42.0f), AndroidUtilities.dp(44.0f) + ((this.moveButtonText.getCurrentWidth() + AndroidUtilities.dp(11.0f)) * f2), this.bounds.top - AndroidUtilities.dp(10.0f));
            }
            if (f < 1.0f) {
                canvas.saveLayerAlpha(this.moveButtonBounds, (int) (f * 255.0f), 31);
            } else {
                canvas.save();
            }
            canvas.scale(scale, scale, this.moveButtonBounds.centerX(), this.moveButtonBounds.centerY());
            canvas.clipRect(this.moveButtonBounds);
            float dpf2 = AndroidUtilities.dpf2(8.33f);
            if (customBlur()) {
                drawBlur(this.backgroundBlur, canvas, this.moveButtonBounds, dpf2, false, 0.0f, 0.0f, true, 1.0f);
                this.backgroundPaint.setAlpha(AndroidUtilities.lerp(0, 64, f));
                canvas.drawRoundRect(this.moveButtonBounds, dpf2, dpf2, this.backgroundPaint);
            } else {
                Paint[] paints = this.backgroundBlur.getPaints(f, 0.0f, 0.0f);
                if (paints == null || paints[1] == null) {
                    this.backgroundPaint.setAlpha(AndroidUtilities.lerp(0, 128, f));
                    canvas.drawRoundRect(this.moveButtonBounds, dpf2, dpf2, this.backgroundPaint);
                } else {
                    Paint paint = paints[0];
                    if (paint != null) {
                        canvas.drawRoundRect(this.moveButtonBounds, dpf2, dpf2, paint);
                    }
                    Paint paint2 = paints[1];
                    if (paint2 != null) {
                        canvas.drawRoundRect(this.moveButtonBounds, dpf2, dpf2, paint2);
                    }
                    this.backgroundPaint.setAlpha(AndroidUtilities.lerp(0, 51, f));
                    canvas.drawRoundRect(this.moveButtonBounds, dpf2, dpf2, this.backgroundPaint);
                }
            }
            this.moveButtonIcon.setBounds((int) (this.moveButtonBounds.left + AndroidUtilities.dp(9.0f)), (int) (this.moveButtonBounds.centerY() - AndroidUtilities.dp(9.0f)), (int) (this.moveButtonBounds.left + AndroidUtilities.dp(27.0f)), (int) (this.moveButtonBounds.centerY() + AndroidUtilities.dp(9.0f)));
            this.moveButtonIcon.draw(canvas);
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.moveButtonText;
            float dp = this.moveButtonBounds.left + AndroidUtilities.dp(34.0f);
            RectF rectF = this.moveButtonBounds;
            animatedTextDrawable.setBounds(dp, rectF.top, rectF.right, rectF.bottom);
            this.moveButtonText.setAlpha((int) (f2 * 255.0f));
            this.moveButtonText.draw(canvas);
            canvas.restore();
        }
    }

    public void setOnAddPhotoClick(View.OnClickListener onClickListener) {
        this.addPhotoButton.setOnClickListener(onClickListener);
    }

    public void setAddPhotoVisible(final boolean z, boolean z2) {
        this.addPhotoVisible = z;
        this.addPhotoButton.animate().cancel();
        int i = 0;
        if (z2) {
            this.addPhotoButton.setVisibility(0);
            this.addPhotoButton.animate().alpha(z ? 1.0f : 0.0f).translationX(z ? 0.0f : AndroidUtilities.dp(-8.0f)).withEndAction(new Runnable() {
                @Override
                public final void run() {
                    CaptionPhotoViewer.this.lambda$setAddPhotoVisible$3(z);
                }
            }).start();
        } else {
            this.addPhotoButton.setVisibility(z ? 0 : 8);
            this.addPhotoButton.setAlpha(z ? 1.0f : 0.0f);
            this.addPhotoButton.setTranslationX(z ? 0.0f : AndroidUtilities.dp(-8.0f));
        }
        updateEditTextLeft();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.editText.getLayoutParams();
        if (this.addPhotoVisible && this.timerVisible) {
            i = 33;
        }
        marginLayoutParams.rightMargin = AndroidUtilities.dp(12 + i);
        this.editText.setLayoutParams(marginLayoutParams);
    }

    public void lambda$setAddPhotoVisible$3(boolean z) {
        if (z) {
            return;
        }
        this.timerButton.setVisibility(8);
    }

    @Override
    protected int getEditTextLeft() {
        if (this.addPhotoVisible) {
            return AndroidUtilities.dp(31.0f);
        }
        return 0;
    }

    public void setIsVideo(boolean z) {
        this.isVideo = z;
    }

    @Override
    public void lambda$new$1() {
        Runnable runnable = this.applyCaption;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void setTimerVisible(final boolean z, boolean z2) {
        this.timerVisible = z;
        this.timerButton.animate().cancel();
        int i = 0;
        if (z2) {
            this.timerButton.setVisibility(0);
            this.timerButton.animate().alpha(z ? 1.0f : 0.0f).translationX(z ? 0.0f : AndroidUtilities.dp(8.0f)).withEndAction(new Runnable() {
                @Override
                public final void run() {
                    CaptionPhotoViewer.this.lambda$setTimerVisible$4(z);
                }
            }).start();
        } else {
            this.timerButton.setVisibility(z ? 0 : 8);
            this.timerButton.setAlpha(z ? 1.0f : 0.0f);
            this.timerButton.setTranslationX(z ? 0.0f : AndroidUtilities.dp(8.0f));
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.editText.getLayoutParams();
        if (this.addPhotoVisible && this.timerVisible) {
            i = 33;
        }
        marginLayoutParams.rightMargin = AndroidUtilities.dp(12 + i);
        this.editText.setLayoutParams(marginLayoutParams);
    }

    public void lambda$setTimerVisible$4(boolean z) {
        if (z) {
            return;
        }
        this.timerButton.setVisibility(8);
    }

    public boolean hasTimer() {
        return this.timerVisible && this.timer > 0;
    }

    public void setTimer(int i) {
        this.timer = i;
        this.timerDrawable.setValue(i == Integer.MAX_VALUE ? 1 : Math.max(1, i), this.timer > 0, true);
        HintView2 hintView2 = this.hint;
        if (hintView2 != null) {
            hintView2.hide();
        }
    }

    public void lambda$new$0(int i) {
        CharSequence replaceTags;
        if (this.timer == i) {
            return;
        }
        setTimer(i);
        Utilities.Callback callback = this.onTTLChange;
        if (callback != null) {
            callback.run(Integer.valueOf(i));
        }
        if (i == 0) {
            replaceTags = LocaleController.getString(this.isVideo ? R.string.TimerPeriodVideoKeep : R.string.TimerPeriodPhotoKeep);
            this.hint.setMaxWidthPx(getMeasuredWidth());
            this.hint.setMultilineText(false);
            this.hint.setInnerPadding(13.0f, 4.0f, 10.0f, 4.0f);
            this.hint.setIconMargin(0);
            this.hint.setIconTranslate(0.0f, -AndroidUtilities.dp(1.0f));
        } else if (i == Integer.MAX_VALUE) {
            replaceTags = LocaleController.getString(this.isVideo ? R.string.TimerPeriodVideoSetOnce : R.string.TimerPeriodPhotoSetOnce);
            this.hint.setMaxWidthPx(getMeasuredWidth());
            this.hint.setMultilineText(false);
            this.hint.setInnerPadding(13.0f, 4.0f, 10.0f, 4.0f);
            this.hint.setIconMargin(0);
            this.hint.setIconTranslate(0.0f, -AndroidUtilities.dp(1.0f));
        } else {
            if (i <= 0) {
                return;
            }
            replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString(this.isVideo ? "TimerPeriodVideoSetSeconds" : "TimerPeriodPhotoSetSeconds", i, new Object[0]));
            this.hint.setMultilineText(true);
            HintView2 hintView2 = this.hint;
            hintView2.setMaxWidthPx(HintView2.cutInFancyHalf(replaceTags, hintView2.getTextPaint()));
            this.hint.setInnerPadding(12.0f, 7.0f, 11.0f, 7.0f);
            this.hint.setIconMargin(2);
            this.hint.setIconTranslate(0.0f, 0.0f);
        }
        this.hint.setTranslationY(((-Math.min(AndroidUtilities.dp(34.0f), getEditTextHeight())) - AndroidUtilities.dp(14.0f)) * (isAtTop() ? -1.0f : 1.0f));
        this.hint.setText(replaceTags);
        int i2 = i > 0 ? R.raw.fire_on : R.raw.fire_off;
        RLottieDrawable rLottieDrawable = new RLottieDrawable(i2, "" + i2, AndroidUtilities.dp(34.0f), AndroidUtilities.dp(34.0f));
        rLottieDrawable.start();
        this.hint.setIcon(rLottieDrawable);
        this.hint.show();
        this.moveButtonExpanded = false;
        AndroidUtilities.cancelRunOnUIThread(this.collapseMoveButton);
        invalidate();
    }

    @Override
    protected void onEditHeightChange(int i) {
        this.hint.setTranslationY(((-Math.min(AndroidUtilities.dp(34.0f), i)) - AndroidUtilities.dp(10.0f)) * (isAtTop() ? -1.0f : 1.0f));
    }

    @Override
    protected boolean clipChild(View view) {
        return view != this.hint;
    }

    public void setOnTimerChange(Utilities.Callback<Integer> callback) {
        this.onTTLChange = callback;
    }

    @Override
    protected int getCaptionLimit() {
        return UserConfig.getInstance(this.currentAccount).isPremium() ? getCaptionPremiumLimit() : getCaptionDefaultLimit();
    }

    @Override
    protected int getCaptionDefaultLimit() {
        return MessagesController.getInstance(this.currentAccount).captionLengthLimitDefault;
    }

    @Override
    protected int getCaptionPremiumLimit() {
        return MessagesController.getInstance(this.currentAccount).captionLengthLimitPremium;
    }

    @Override
    protected void beforeUpdateShownKeyboard(boolean z) {
        if (!z) {
            this.timerButton.setVisibility(this.timerVisible ? 0 : 8);
            this.addPhotoButton.setVisibility(this.addPhotoVisible ? 0 : 8);
        }
        HintView2 hintView2 = this.hint;
        if (hintView2 != null) {
            hintView2.hide();
        }
    }

    @Override
    public void onUpdateShowKeyboard(float f) {
        float f2 = 1.0f - f;
        this.timerButton.setAlpha(f2);
        this.addPhotoButton.setAlpha(f2);
    }

    @Override
    protected void afterUpdateShownKeyboard(boolean z) {
        this.timerButton.setVisibility((z || !this.timerVisible) ? 8 : 0);
        this.addPhotoButton.setVisibility((z || !this.addPhotoVisible) ? 8 : 0);
        if (z) {
            this.timerButton.setVisibility(8);
            this.addPhotoButton.setVisibility(8);
        }
    }

    @Override
    public void updateColors(Theme.ResourcesProvider resourcesProvider) {
        super.updateColors(resourcesProvider);
        this.timerDrawable.updateColors(-1, Theme.getColor(Theme.key_chat_editMediaButton, resourcesProvider), -1);
    }

    public void setShowMoveButtonVisible(boolean z, boolean z2) {
        if (this.moveButtonVisible == z && z2) {
            return;
        }
        this.moveButtonVisible = z;
        if (!z2) {
            this.moveButtonAnimated.set(z, true);
        }
        invalidate();
    }

    @Override
    public int getEditTextHeight() {
        return super.getEditTextHeight();
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.moveButtonBounce.setPressed(this.moveButtonAnimated.get() > 0.0f && this.moveButtonBounds.contains(motionEvent.getX(), motionEvent.getY()));
        } else if (motionEvent.getAction() == 2) {
            if (this.moveButtonBounce.isPressed() && (this.moveButtonAnimated.get() <= 0.0f || !this.moveButtonBounds.contains(motionEvent.getX(), motionEvent.getY()))) {
                this.moveButtonBounce.setPressed(false);
            }
        } else if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.moveButtonBounce.isPressed()) {
            if (motionEvent.getAction() == 1) {
                onMoveButtonClick();
                this.moveButtonText.setText(LocaleController.getString(isAtTop() ? R.string.MoveCaptionDown : R.string.MoveCaptionUp), true);
            }
            this.moveButtonBounce.setPressed(false);
            return true;
        }
        return this.moveButtonBounce.isPressed() || super.dispatchTouchEvent(motionEvent);
    }
}
