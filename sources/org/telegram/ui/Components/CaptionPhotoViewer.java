package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.ChatActivity$16$$ExternalSyntheticLambda4;
import org.telegram.ui.ChatLinkActivity$$ExternalSyntheticLambda9;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.blur3.drawable.color.impl.BlurredBackgroundProviderImpl;
import org.telegram.ui.LoginActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PhotoViewer$$ExternalSyntheticLambda83;
import org.telegram.ui.Stories.recorder.CaptionContainerView;
import org.telegram.ui.Stories.recorder.HintView2;

public abstract class CaptionPhotoViewer extends CaptionContainerView {
    public final ImageView addPhotoButton;
    public boolean addPhotoVisible;
    public final ImageView aiButton;
    public final AiButtonDrawable aiButtonIcon;
    public HintView2 aiHint;
    public final Runnable applyCaption;
    public BlurredBackgroundDrawable backgroundForCaptionButton;
    public final PhotoViewer$$ExternalSyntheticLambda83 collapseMoveButton;
    public final HintView2 hint;
    public boolean isVideo;
    public final AnimatedFloat lineCountAnimated;
    public final AnimatedFloat moveButtonAnimated;
    public final ButtonBounce moveButtonBounce;
    public final RectF moveButtonBounds;
    public boolean moveButtonExpanded;
    public final AnimatedFloat moveButtonExpandedAnimated;
    public final Drawable moveButtonIcon;
    public final AnimatedTextView.AnimatedTextDrawable moveButtonText;
    public boolean moveButtonVisible;
    public Utilities.Callback onTTLChange;
    public boolean shownAiButton;
    public int timer;
    public final ImageView timerButton;
    public final CaptionContainerView.PeriodDrawable timerDrawable;
    public ItemOptions timerPopup;
    public boolean timerVisible;
    public final int[] values;

    public CaptionPhotoViewer(Context context, LoginActivity.AnonymousClass4 anonymousClass4, SizeNotifierFrameLayout sizeNotifierFrameLayout, FrameLayout frameLayout, Theme.ResourcesProvider resourcesProvider, BlurringShader.BlurManager blurManager, Runnable runnable) {
        super(context, anonymousClass4, sizeNotifierFrameLayout, frameLayout, resourcesProvider, blurManager);
        this.timer = 0;
        this.values = new int[]{Integer.MAX_VALUE, 3, 10, 30, 0};
        this.moveButtonBounds = new RectF();
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable(false, false, false, false);
        this.moveButtonText = animatedTextDrawable;
        this.moveButtonBounce = new ButtonBounce(this, 1.0f, 5.0f);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.lineCountAnimated = new AnimatedFloat(this, 0L, 350L, cubicBezierInterpolator);
        this.moveButtonAnimated = new AnimatedFloat(this, 0L, 350L, cubicBezierInterpolator);
        this.moveButtonExpandedAnimated = new AnimatedFloat(this, 0L, 350L, cubicBezierInterpolator);
        this.collapseMoveButton = new PhotoViewer$$ExternalSyntheticLambda83(this, 1);
        this.applyCaption = runnable;
        animatedTextDrawable.setTextSize(AndroidUtilities.dp(14.0f));
        animatedTextDrawable.overrideFullWidth = AndroidUtilities.displaySize.x;
        animatedTextDrawable.textPaint.setColor(-1);
        animatedTextDrawable.alpha = Color.alpha(-1);
        boolean z = this instanceof PhotoViewer.AnonymousClass31;
        if (z) {
            animatedTextDrawable.setText(LocaleController.getString(R.string.MoveCaptionDown), true, true);
            this.moveButtonIcon = context.getResources().getDrawable(R.drawable.menu_link_below);
        } else {
            animatedTextDrawable.setText(LocaleController.getString(R.string.MoveCaptionUp), true, true);
            this.moveButtonIcon = context.getResources().getDrawable(R.drawable.menu_link_above);
        }
        ImageView imageView = new ImageView(context);
        this.addPhotoButton = imageView;
        imageView.setImageResource(R.drawable.filled_add_photo);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setBackground(Theme.createSelectorDrawable(1090519039, 1, AndroidUtilities.dp(18.0f)));
        setAddPhotoVisible(false);
        addView(imageView, LayoutHelper.createFrame(44, 44.0f, (z ? 48 : 80) | 3, 14.0f, z ? 6.0f : 0.0f, 0.0f, z ? 0.0f : 6.0f));
        ImageView imageView2 = new ImageView(context);
        this.timerButton = imageView2;
        CaptionContainerView.PeriodDrawable periodDrawable = new CaptionContainerView.PeriodDrawable(5);
        this.timerDrawable = periodDrawable;
        imageView2.setImageDrawable(periodDrawable);
        imageView2.setBackground(Theme.createSelectorDrawable(1090519039, 1, AndroidUtilities.dp(18.0f)));
        imageView2.setScaleType(scaleType);
        setTimerVisible(false, false);
        addView(imageView2, LayoutHelper.createFrame(44, 44.0f, (z ? 48 : 80) | 5, 0.0f, z ? 6.0f : 0.0f, 10.0f, z ? 0.0f : 6.0f));
        HintView2 hintView2 = new HintView2(context, z ? 1 : 3);
        this.hint = hintView2;
        hintView2.setRounding(12.0f);
        hintView2.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(z ? 8.0f : 0.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(z ? 0.0f : 8.0f));
        hintView2.setJoint(1.0f, -21.0f);
        hintView2.setMultilineText(true);
        addView(hintView2, LayoutHelper.createFrame(-1, 80, (z ? 48 : 80) | 5));
        ImageView imageView3 = new ImageView(context);
        this.aiButton = imageView3;
        AiButtonDrawable aiButtonDrawable = new AiButtonDrawable(context);
        this.aiButtonIcon = aiButtonDrawable;
        imageView3.setImageDrawable(aiButtonDrawable);
        imageView3.setScaleType(scaleType);
        imageView3.setColorFilter(new PorterDuffColorFilter(-1140850689, PorterDuff.Mode.MULTIPLY));
        imageView3.setBackground(Theme.createSelectorDrawable(1090519039, 1, AndroidUtilities.dp(16.0f)));
        addView(imageView3, LayoutHelper.createFrame(44, 44.0f, 53, 8.0f, 0.0f, 8.0f, 0.0f));
        imageView3.setContentDescription(LocaleController.getString(R.string.AIEditor));
        ScaleStateListAnimator.apply(imageView3, 0.1f, 1.5f);
        this.editText.getEditText().addTextChangedListener(new ArticleViewer.AnonymousClass16(this, 9));
        imageView3.setVisibility(8);
        imageView3.setAlpha(0.0f);
        imageView3.setScaleX(0.6f);
        imageView3.setScaleY(0.6f);
        imageView3.setOnClickListener(new ChatActivity$16$$ExternalSyntheticLambda4(this, 10));
        imageView2.setOnClickListener(new ItemOptions$$ExternalSyntheticLambda7(12, this, anonymousClass4));
    }

    @Override
    public final int additionalKeyboardHeight() {
        return 0;
    }

    @Override
    public final void afterUpdateShownKeyboard(boolean z) {
        ImageView imageView = this.timerButton;
        imageView.setVisibility((z || !this.timerVisible) ? 8 : 0);
        ImageView imageView2 = this.addPhotoButton;
        imageView2.setVisibility((z || !this.addPhotoVisible) ? 8 : 0);
        if (z) {
            imageView.setVisibility(8);
            imageView2.setVisibility(8);
        }
    }

    @Override
    public final void beforeUpdateShownKeyboard(boolean z) {
        if (!z) {
            this.timerButton.setVisibility(this.timerVisible ? 0 : 8);
            this.addPhotoButton.setVisibility(this.addPhotoVisible ? 0 : 8);
        }
        HintView2 hintView2 = this.hint;
        if (hintView2 != null) {
            hintView2.hide(true);
        }
    }

    @Override
    public final boolean clipChild(View view) {
        return view != this.hint;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        ImageView imageView = this.aiButton;
        RectF rectF = this.bounds;
        if (imageView != null) {
            imageView.setTranslationX(-AndroidUtilities.dp((1.0f - this.keyboardT) * 4.0f));
            boolean z = this instanceof PhotoViewer.AnonymousClass31;
            imageView.setTranslationY((Utilities.clamp01((-this.lineCountAnimated.set(this.editText.getEditText().getLineCount(), false)) + 4.0f) * AndroidUtilities.dp(3.0f) * (z ? 1 : -1)) + (z ? this.bounds.bottom - AndroidUtilities.dp(44.0f) : rectF.top));
        }
        float f = this.moveButtonAnimated.set(this.moveButtonVisible, true ^ showMoveButton());
        float f2 = this.moveButtonExpandedAnimated.set(this.moveButtonExpanded);
        if (f > 0.0f) {
            float scale = this.moveButtonBounce.getScale(0.03f);
            int iDp = AndroidUtilities.dp((1.0f - this.keyboardT) * 4.0f);
            boolean z2 = this instanceof PhotoViewer.AnonymousClass31;
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.moveButtonText;
            RectF rectF2 = this.moveButtonBounds;
            if (z2) {
                float fDp = AndroidUtilities.dp(7.0f) + iDp;
                RectF rectF3 = this.bounds;
                rectF2.set(fDp, rectF3.bottom + AndroidUtilities.dp(10.0f), ((this.moveButtonText.getCurrentWidth() + AndroidUtilities.dp(11.0f)) * f2) + AndroidUtilities.dp(44.0f) + iDp, rectF3.bottom + AndroidUtilities.dp(42.0f));
            } else {
                rectF2.set(AndroidUtilities.dp(7.0f) + iDp, rectF.top - AndroidUtilities.dp(42.0f), ((animatedTextDrawable.getCurrentWidth() + AndroidUtilities.dp(11.0f)) * f2) + AndroidUtilities.dp(44.0f) + iDp, rectF.top - AndroidUtilities.dp(10.0f));
            }
            if (f < 1.0f) {
                canvas.saveLayerAlpha(rectF2, (int) (f * 255.0f), 31);
            } else {
                canvas.save();
            }
            canvas.scale(scale, scale, rectF2.centerX(), rectF2.centerY());
            canvas.clipRect(rectF2);
            AndroidUtilities.dpf2(16.0f);
            BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory = this.factoryForMentions;
            if (blurredBackgroundDrawableViewFactory != null) {
                if (this.backgroundForCaptionButton == null) {
                    BlurredBackgroundDrawable blurredBackgroundDrawableCreate = blurredBackgroundDrawableViewFactory.create(this, null, false);
                    blurredBackgroundDrawableCreate.setColorProvider(BlurredBackgroundProviderImpl.photoViewer(this.resourcesProvider));
                    blurredBackgroundDrawableCreate.setPadding(AndroidUtilities.dp(5.0f));
                    blurredBackgroundDrawableCreate.setRadius(AndroidUtilities.dp(16.0f));
                    this.backgroundForCaptionButton = blurredBackgroundDrawableCreate;
                }
                Rect rect = AndroidUtilities.rectTmp2;
                rectF2.round(rect);
                rect.inset(-AndroidUtilities.dp(5.0f), -AndroidUtilities.dp(5.0f));
                this.backgroundForCaptionButton.setBounds(rect);
                this.backgroundForCaptionButton.draw(canvas);
            }
            int iDp2 = (int) (rectF2.left + AndroidUtilities.dp(9.0f));
            int iCenterY = (int) (rectF2.centerY() - AndroidUtilities.dp(10.0f));
            int iDp3 = (int) (rectF2.left + AndroidUtilities.dp(29.0f));
            int iCenterY2 = (int) (rectF2.centerY() + AndroidUtilities.dp(10.0f));
            Drawable drawable = this.moveButtonIcon;
            drawable.setBounds(iDp2, iCenterY, iDp3, iCenterY2);
            drawable.draw(canvas);
            animatedTextDrawable.setBounds(rectF2.left + AndroidUtilities.dp(37.0f), rectF2.top, rectF2.right, rectF2.bottom);
            animatedTextDrawable.alpha = (int) (f2 * 255.0f);
            animatedTextDrawable.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        RectF rectF = this.moveButtonBounds;
        ButtonBounce buttonBounce = this.moveButtonBounce;
        AnimatedFloat animatedFloat = this.moveButtonAnimated;
        if (action == 0) {
            buttonBounce.setPressed(animatedFloat.value > 0.0f && rectF.contains(motionEvent.getX(), motionEvent.getY()));
        } else if (motionEvent.getAction() == 2) {
            if (buttonBounce.isPressed && (animatedFloat.value <= 0.0f || !rectF.contains(motionEvent.getX(), motionEvent.getY()))) {
                buttonBounce.setPressed(false);
            }
        } else if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && buttonBounce.isPressed) {
            if (motionEvent.getAction() == 1) {
                onMoveButtonClick();
                this.moveButtonText.setText(LocaleController.getString(this instanceof PhotoViewer.AnonymousClass31 ? R.string.MoveCaptionDown : R.string.MoveCaptionUp), true, true);
            }
            buttonBounce.setPressed(false);
            return true;
        }
        return buttonBounce.isPressed || super.dispatchTouchEvent(motionEvent);
    }

    public final void expandMoveButton() {
        PhotoViewer$$ExternalSyntheticLambda83 photoViewer$$ExternalSyntheticLambda83 = this.collapseMoveButton;
        AndroidUtilities.cancelRunOnUIThread(photoViewer$$ExternalSyntheticLambda83);
        boolean zShouldShowMoveCaptionHint = MessagesController.getInstance(this.currentAccount).shouldShowMoveCaptionHint();
        this.moveButtonExpanded = zShouldShowMoveCaptionHint;
        if (zShouldShowMoveCaptionHint) {
            MessagesController.getInstance(this.currentAccount).incrementMoveCaptionHint();
            invalidate();
            AndroidUtilities.runOnUIThread(photoViewer$$ExternalSyntheticLambda83, 5000L);
        }
    }

    @Override
    public int getCaptionDefaultLimit() {
        return MessagesController.getInstance(this.currentAccount).captionLengthLimitDefault;
    }

    @Override
    public int getCaptionLimit() {
        return UserConfig.getInstance(this.currentAccount).isPremium() ? getCaptionPremiumLimit() : getCaptionDefaultLimit();
    }

    @Override
    public int getCaptionPremiumLimit() {
        return MessagesController.getInstance(this.currentAccount).captionLengthLimitPremium;
    }

    @Override
    public int getEditTextHeight() {
        return super.getEditTextHeight();
    }

    @Override
    public int getEditTextLeft() {
        if (this.addPhotoVisible) {
            return AndroidUtilities.dp(31.0f);
        }
        return 0;
    }

    @Override
    public int getEditTextStyle() {
        return 3;
    }

    @Override
    public final void onEditHeightChange(int i) {
        this.hint.setTranslationY(((-Math.min(AndroidUtilities.dp(34.0f), i)) - AndroidUtilities.dp(10.0f)) * (this instanceof PhotoViewer.AnonymousClass31 ? -1.0f : 1.0f));
    }

    @Override
    public final void onLineCountChanged(int i, int i2) {
        CharSequence text = getText();
        showAiButton((i2 <= 2 || text == null || TextUtils.isEmpty(text.toString().trim())) ? false : true);
        if (this.shownAiButton) {
            if ((i < 3) != (i2 < 3)) {
                invalidate();
            }
        }
    }

    public abstract void onMoveButtonClick();

    @Override
    public final void onTextChange() {
        Runnable runnable = this.applyCaption;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public void onUpdateShowKeyboard(float f) {
        float f2 = 1.0f - f;
        this.timerButton.setAlpha(f2);
        this.addPhotoButton.setAlpha(f2);
    }

    public abstract void openedKeyboard();

    public final void setAddPhotoVisible(boolean z) {
        this.addPhotoVisible = z;
        ImageView imageView = this.addPhotoButton;
        imageView.animate().cancel();
        int i = 0;
        imageView.setVisibility(z ? 0 : 8);
        imageView.setAlpha(z ? 1.0f : 0.0f);
        imageView.setTranslationX(z ? 0.0f : AndroidUtilities.dp(-8.0f));
        CaptionContainerView.AnonymousClass3 anonymousClass3 = this.editText;
        anonymousClass3.getEditText().setTranslationX(AndroidUtilities.lerp(getEditTextLeft() + AndroidUtilities.dp(-26.0f), AndroidUtilities.dp(2.0f), this.keyboardT));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) anonymousClass3.getLayoutParams();
        if (this.addPhotoVisible && this.timerVisible) {
            i = 33;
        }
        marginLayoutParams.rightMargin = AndroidUtilities.dp(32 + i);
        anonymousClass3.setLayoutParams(marginLayoutParams);
    }

    public void setIsVideo(boolean z) {
        this.isVideo = z;
    }

    public void setOnAddPhotoClick(View.OnClickListener onClickListener) {
        this.addPhotoButton.setOnClickListener(onClickListener);
    }

    public void setOnTimerChange(Utilities.Callback<Integer> callback) {
        this.onTTLChange = callback;
    }

    @Override
    public void setText(CharSequence charSequence) {
        super.setText(charSequence);
    }

    public void setTimer(int i) {
        this.timer = i;
        this.timerDrawable.setValue(i == Integer.MAX_VALUE ? 1 : Math.max(1, i), this.timer > 0, true);
        HintView2 hintView2 = this.hint;
        if (hintView2 != null) {
            hintView2.hide(true);
        }
    }

    public final void setTimerVisible(boolean z, boolean z2) {
        this.timerVisible = z;
        ImageView imageView = this.timerButton;
        imageView.animate().cancel();
        int i = 0;
        if (z2) {
            imageView.setVisibility(0);
            imageView.animate().alpha(z ? 1.0f : 0.0f).translationX(z ? 0.0f : AndroidUtilities.dp(8.0f)).withEndAction(new CaptionPhotoViewer$$ExternalSyntheticLambda3(this, z, 1)).start();
        } else {
            imageView.setVisibility(z ? 0 : 8);
            imageView.setAlpha(z ? 1.0f : 0.0f);
            imageView.setTranslationX(z ? 0.0f : AndroidUtilities.dp(8.0f));
        }
        CaptionContainerView.AnonymousClass3 anonymousClass3 = this.editText;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) anonymousClass3.getLayoutParams();
        if (this.addPhotoVisible && this.timerVisible) {
            i = 33;
        }
        marginLayoutParams.rightMargin = AndroidUtilities.dp(32 + i);
        anonymousClass3.setLayoutParams(marginLayoutParams);
    }

    public final void showAiButton(boolean z) {
        if (this.shownAiButton == z) {
            return;
        }
        if (z) {
            MessagesController.getInstance(this.currentAccount).getTonesController().load();
        }
        this.shownAiButton = z;
        ImageView imageView = this.aiButton;
        imageView.setVisibility(0);
        imageView.animate().alpha(z ? 1.0f : 0.0f).scaleX(z ? 1.0f : 0.6f).scaleY(z ? 1.0f : 0.6f).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).setDuration(420L).withEndAction(new CaptionPhotoViewer$$ExternalSyntheticLambda3(this, z, 0)).start();
        if (!z) {
            HintView2 hintView2 = this.aiHint;
            if (hintView2 != null) {
                hintView2.hide(true);
                this.aiHint = null;
                return;
            }
            return;
        }
        AiButtonDrawable aiButtonDrawable = this.aiButtonIcon;
        Objects.requireNonNull(aiButtonDrawable);
        imageView.postDelayed(new AiButtonDrawable$$ExternalSyntheticLambda0(aiButtonDrawable, 1), 220L);
        HintView2 hintView3 = this.aiHint;
        if (hintView3 != null) {
            hintView3.hide(true);
            this.aiHint = null;
        }
        if (MessagesController.getGlobalMainSettings().getInt("aihintshown", 0) < 3) {
            HintView2 hintView4 = new HintView2(getContext(), 3);
            this.aiHint = hintView4;
            hintView4.setMultilineText(true);
            this.aiHint.setText(LocaleController.getString(R.string.AIEditorHint));
            this.aiHint.setJointPx(1.0f, ((-imageView.getWidth()) / 2.0f) + AndroidUtilities.dp(4.0f));
            addView(this.aiHint, LayoutHelper.createFrame(-1, 200.0f, 48, 0.0f, -196.0f, 0.0f, 0.0f));
            HintView2 hintView5 = this.aiHint;
            hintView5.onHidden = new ChatLinkActivity$$ExternalSyntheticLambda9(20, this, hintView4);
            hintView5.duration = 4000L;
            hintView5.show();
            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", MessagesController.getGlobalMainSettings().getInt("aihintshown", 0) + 1).apply();
        }
    }

    public abstract boolean showMoveButton();

    public final void updateColors(Theme.ResourcesProvider resourcesProvider) {
        this.resourcesProvider = resourcesProvider;
        this.applyButtonCheck.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_dialogFloatingIcon, false), PorterDuff.Mode.SRC_IN));
        CombinedDrawable combinedDrawable = this.applyButtonDrawable;
        int iDp = AndroidUtilities.dp(16.0f);
        int i = Theme.key_chat_editMediaButton;
        combinedDrawable.background = Theme.createCircleDrawable(iDp, Theme.getColor(i, resourcesProvider));
        combinedDrawable.invalidateSelf();
        this.timerDrawable.updateColors(-1, Theme.getColor(i, resourcesProvider), -1);
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
}
