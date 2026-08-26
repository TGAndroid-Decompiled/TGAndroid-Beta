package org.telegram.ui.Components.chat;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.core.view.WindowInsetsCompat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject$$ExternalSyntheticOutline0;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.blur3.BlurredBackgroundWithFadeDrawable;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.inset.InAppKeyboardInsetView;
import org.telegram.ui.Components.inset.WindowInsetsProvider;
import org.telegram.ui.Components.inset.WindowInsetsStateHolder;
import org.telegram.ui.Stories.MuteButton;
import org.telegram.ui.TON.TONIntroActivity;

public final class ChatInputViewsContainer extends FrameLayout {
    public BlurredBackgroundWithFadeDrawable backgroundWithFadeDrawable;
    public BlurredBackgroundDrawable blurredBackgroundDrawable;
    public float blurredBottomHeight;
    public float bubbleInputTranlationY;
    public boolean captured;
    public int currentBlurredHeight;
    public boolean drawInputBackground;
    public final MuteButton.AnonymousClass1 fadeView;
    public float imeBottomInset;
    public final TONIntroActivity.AnonymousClass2 inAppKeyboardBubbleContainer;
    public float inputBubbleHeight;
    public int inputBubbleHeightRound;
    public float inputBubbleOffsetLeft;
    public float inputBubbleOffsetRight;
    public final FrameLayout inputIslandBubbleContainer;
    public float maxBottomInset;
    public boolean needDrawInAppKeyboard;
    public final Rect tmpRect;
    public final RectF tmpRectF;
    public BlurredBackgroundDrawable underKeyboardBackgroundDrawable;
    public final Path underKeyboardPath;
    public WindowInsetsProvider windowInsetsProvider;

    public ChatInputViewsContainer(Context context) {
        super(context);
        this.drawInputBackground = true;
        this.underKeyboardPath = new Path();
        this.tmpRect = new Rect();
        this.tmpRectF = new RectF();
        FrameLayout frameLayout = new FrameLayout(context);
        this.inputIslandBubbleContainer = frameLayout;
        addView(frameLayout, LayoutHelper.createFrame(-1, -2, 80));
        TONIntroActivity.AnonymousClass2 anonymousClass2 = new TONIntroActivity.AnonymousClass2(this, context, 8);
        this.inAppKeyboardBubbleContainer = anonymousClass2;
        addView(anonymousClass2, LayoutHelper.createFrame(-1, -2, 80));
        this.fadeView = new MuteButton.AnonymousClass1(this, context, 3);
    }

    public final void checkBlurredHeight(boolean z) {
        checkViewsPositions();
        int iRound = Math.round(this.maxBottomInset) + AndroidUtilities.dp(9.0f) + this.inputBubbleHeightRound;
        if (this.currentBlurredHeight != iRound || z) {
            this.currentBlurredHeight = iRound;
            int iDp = AndroidUtilities.dp(29.0f);
            RectF rectF = this.tmpRectF;
            rectF.set(0.0f, getMeasuredHeight() - this.imeBottomInset, getMeasuredWidth(), getMeasuredHeight());
            Path path = this.underKeyboardPath;
            path.rewind();
            float f = iDp;
            path.addRoundRect(rectF, new float[]{f, f, f, f, 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CW);
            path.close();
            invalidate();
        }
    }

    public final void checkDrawableBounds() {
        int i;
        int measuredHeight;
        BlurredBackgroundWithFadeDrawable blurredBackgroundWithFadeDrawable = this.backgroundWithFadeDrawable;
        if (blurredBackgroundWithFadeDrawable == null || (i = blurredBackgroundWithFadeDrawable.getBounds().top) == (measuredHeight = getMeasuredHeight() - Math.round(this.blurredBottomHeight))) {
            return;
        }
        this.backgroundWithFadeDrawable.setBounds(0, measuredHeight, getMeasuredWidth(), getMeasuredHeight());
        this.fadeView.invalidate(0, Math.max(0, Math.min(i, measuredHeight)), getMeasuredWidth(), getMeasuredHeight());
        invalidate(0, Math.max(0, Math.min(i, measuredHeight)), getMeasuredWidth(), getMeasuredHeight());
    }

    public final void checkInAppKeyboardChild() {
        WindowInsetsCompat windowInsetsCompat = ((WindowInsetsStateHolder) this.windowInsetsProvider).lastInsets;
        int i = windowInsetsCompat != null ? windowInsetsCompat.mImpl.getInsets(2).bottom : 0;
        float animatedImeBottomInset = ((WindowInsetsStateHolder) this.windowInsetsProvider).getAnimatedImeBottomInset();
        TONIntroActivity.AnonymousClass2 anonymousClass2 = this.inAppKeyboardBubbleContainer;
        int childCount = anonymousClass2.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            KeyEvent.Callback childAt = anonymousClass2.getChildAt(i2);
            if (childAt instanceof InAppKeyboardInsetView) {
                InAppKeyboardInsetView inAppKeyboardInsetView = (InAppKeyboardInsetView) childAt;
                inAppKeyboardInsetView.applyNavigationBarHeight(i);
                inAppKeyboardInsetView.applyInAppKeyboardAnimatedHeight(animatedImeBottomInset);
            }
        }
    }

    public final void checkInsets() {
        int radius;
        WindowInsets rootWindowInsets;
        this.maxBottomInset = ((WindowInsetsStateHolder) this.windowInsetsProvider).getAnimatedMaxBottomInset();
        this.imeBottomInset = ((WindowInsetsStateHolder) this.windowInsetsProvider).getAnimatedImeBottomInset();
        int i = 0;
        this.needDrawInAppKeyboard = ((WindowInsetsStateHolder) this.windowInsetsProvider).inAppKeyboardState != 1;
        TONIntroActivity.AnonymousClass2 anonymousClass2 = this.inAppKeyboardBubbleContainer;
        boolean z = anonymousClass2.getVisibility() == 0;
        boolean z2 = this.needDrawInAppKeyboard;
        if (z != z2) {
            anonymousClass2.setVisibility(z2 ? 0 : 8);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) anonymousClass2.getLayoutParams();
        int i2 = layoutParams.height;
        int i3 = ((WindowInsetsStateHolder) this.windowInsetsProvider).inAppKeyboardViewHeight;
        if (i2 != i3) {
            layoutParams.height = i3;
            requestLayout();
        }
        checkBlurredHeight(false);
        checkInAppKeyboardChild();
        if (this.underKeyboardBackgroundDrawable != null) {
            if (Build.VERSION.SDK_INT < 31 || (rootWindowInsets = getRootWindowInsets()) == null) {
                radius = 0;
            } else {
                RoundedCorner roundedCorner = rootWindowInsets.getRoundedCorner(3);
                RoundedCorner roundedCorner2 = rootWindowInsets.getRoundedCorner(2);
                int radius2 = roundedCorner == null ? 0 : roundedCorner.getRadius();
                if (roundedCorner2 == null) {
                    i = radius2;
                    radius = 0;
                } else {
                    radius = roundedCorner2.getRadius();
                    i = radius2;
                }
            }
            this.underKeyboardBackgroundDrawable.setRadius$1(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), radius, i);
        }
    }

    public final void checkViewsPositions() {
        this.inputIslandBubbleContainer.setTranslationY((-this.maxBottomInset) - AndroidUtilities.dp(9.0f));
        TONIntroActivity.AnonymousClass2 anonymousClass2 = this.inAppKeyboardBubbleContainer;
        anonymousClass2.setTranslationY(anonymousClass2.getMeasuredHeight() - this.imeBottomInset);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        this.underKeyboardBackgroundDrawable.setBounds(0, getMeasuredHeight() - ((int) this.imeBottomInset), getMeasuredWidth(), MessageObject$$ExternalSyntheticOutline0.m(58.0f, getMeasuredHeight() - ((int) this.imeBottomInset), getMeasuredHeight()));
        int measuredHeight = getMeasuredHeight() - this.currentBlurredHeight;
        int iRound = Math.round(this.inputBubbleOffsetLeft);
        int measuredWidth = getMeasuredWidth() - Math.round(this.inputBubbleOffsetRight);
        int i = this.inputBubbleHeightRound;
        Rect rect = this.tmpRect;
        rect.set(iRound, 0, measuredWidth, i);
        rect.inset(0, -AndroidUtilities.dp(7.0f));
        rect.offset(0, measuredHeight + ((int) this.bubbleInputTranlationY));
        this.blurredBackgroundDrawable.setBounds(rect);
        if (this.drawInputBackground) {
            this.blurredBackgroundDrawable.draw(canvas);
        }
        if (this.needDrawInAppKeyboard) {
            this.underKeyboardBackgroundDrawable.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        boolean z = view == this.inAppKeyboardBubbleContainer;
        if (z) {
            canvas.save();
            canvas.clipPath(this.underKeyboardBackgroundDrawable.boundProps.path);
        }
        boolean zDrawChild = super.drawChild(canvas, view, j);
        if (z) {
            canvas.restore();
        }
        return zDrawChild;
    }

    public View getFadeView() {
        return this.fadeView;
    }

    public FrameLayout getInAppKeyboardBubbleContainer() {
        return this.inAppKeyboardBubbleContainer;
    }

    public float getInputBubbleBottom() {
        return (getMeasuredHeight() - this.maxBottomInset) - AndroidUtilities.dp(9.0f);
    }

    public float getInputBubbleHeight() {
        return this.inputBubbleHeight;
    }

    public float getInputBubbleTop() {
        return getInputBubbleBottom() - getInputBubbleHeight();
    }

    public FrameLayout getInputIslandBubbleContainer() {
        return this.inputIslandBubbleContainer;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        checkViewsPositions();
        checkInAppKeyboardChild();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        checkBlurredHeight(true);
        checkDrawableBounds();
        checkViewsPositions();
        checkInAppKeyboardChild();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        BlurredBackgroundDrawable blurredBackgroundDrawable;
        int action = motionEvent.getAction();
        if (action == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            BlurredBackgroundDrawable blurredBackgroundDrawable2 = this.blurredBackgroundDrawable;
            this.captured = (blurredBackgroundDrawable2 != null && blurredBackgroundDrawable2.alpha == 255 && blurredBackgroundDrawable2.getBounds().contains(x, y)) || ((blurredBackgroundDrawable = this.underKeyboardBackgroundDrawable) != null && blurredBackgroundDrawable.getBounds().contains(x, y));
        }
        if (action == 1 || action == 3) {
            this.captured = false;
        }
        return this.captured;
    }

    public void setBackgroundWithFadeDrawable(BlurredBackgroundWithFadeDrawable blurredBackgroundWithFadeDrawable) {
        this.backgroundWithFadeDrawable = blurredBackgroundWithFadeDrawable;
    }

    public void setBlurredBottomHeight(float f) {
        if (this.blurredBottomHeight != f) {
            this.blurredBottomHeight = f;
            checkDrawableBounds();
        }
    }

    public void setInputBubbleAlpha(int i) {
        BlurredBackgroundDrawable blurredBackgroundDrawable = this.blurredBackgroundDrawable;
        if (blurredBackgroundDrawable != null) {
            blurredBackgroundDrawable.setAlpha(i);
        }
    }

    public void setInputBubbleHeight(float f) {
        this.inputBubbleHeight = f;
        this.inputBubbleHeightRound = Math.round(f);
        checkBlurredHeight(false);
    }

    public void setInputBubbleTranslationY(float f) {
        this.bubbleInputTranlationY = f;
        invalidate();
    }

    public void setInputIslandBubbleDrawable(BlurredBackgroundDrawable blurredBackgroundDrawable) {
        this.blurredBackgroundDrawable = blurredBackgroundDrawable;
        blurredBackgroundDrawable.setPadding(AndroidUtilities.dp(7.0f));
        this.blurredBackgroundDrawable.setRadius(AndroidUtilities.dp(22.0f));
    }

    public void setUnderKeyboardBackgroundDrawable(BlurredBackgroundDrawable blurredBackgroundDrawable) {
        this.underKeyboardBackgroundDrawable = blurredBackgroundDrawable;
        blurredBackgroundDrawable.inAppKeyboardOptimization = true;
        blurredBackgroundDrawable.setRadius(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), 0.0f, 0.0f);
        BlurredBackgroundDrawable blurredBackgroundDrawable2 = this.underKeyboardBackgroundDrawable;
        blurredBackgroundDrawable2.boundProps.liquidThickness = AndroidUtilities.dp(32.0f);
        blurredBackgroundDrawable2.onBoundPropsChanged();
        BlurredBackgroundDrawable blurredBackgroundDrawable3 = this.underKeyboardBackgroundDrawable;
        blurredBackgroundDrawable3.boundProps.liquidIntensity = 0.4f;
        blurredBackgroundDrawable3.onBoundPropsChanged();
    }

    public void setWindowInsetsProvider(WindowInsetsProvider windowInsetsProvider) {
        this.windowInsetsProvider = windowInsetsProvider;
    }
}
