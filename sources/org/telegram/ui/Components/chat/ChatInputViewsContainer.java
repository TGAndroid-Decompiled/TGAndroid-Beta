package org.telegram.ui.Components.chat;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.blur3.BlurredBackgroundWithFadeDrawable;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.inset.InAppKeyboardInsetView;
import org.telegram.ui.Components.inset.WindowInsetsProvider;

public class ChatInputViewsContainer extends FrameLayout {
    private BlurredBackgroundDrawable blurredBackgroundDrawable;
    private float blurredBottomHeight;
    private int currentBlurredHeight;
    private float imeBottomInset;
    private final FrameLayout inAppKeyboardBubbleContainer;
    private float inputBubbleHeight;
    private int inputBubbleHeightRound;
    private float inputBubbleOffsetLeft;
    private float inputBubbleOffsetRight;
    private final FrameLayout inputIslandBubbleContainer;
    private float maxBottomInset;
    private boolean needDrawInAppKeyboard;
    private final Rect tmpRect;
    private final RectF tmpRectF;
    private BlurredBackgroundDrawable underKeyboardBackgroundDrawable;
    private final Path underKeyboardPath;
    private WindowInsetsProvider windowInsetsProvider;

    private void checkDrawableBounds() {
    }

    public void setBackgroundWithFadeDrawable(BlurredBackgroundWithFadeDrawable blurredBackgroundWithFadeDrawable) {
    }

    public ChatInputViewsContainer(Context context) {
        super(context);
        this.underKeyboardPath = new Path();
        this.tmpRect = new Rect();
        this.tmpRectF = new RectF();
        FrameLayout frameLayout = new FrameLayout(context);
        this.inputIslandBubbleContainer = frameLayout;
        addView(frameLayout, LayoutHelper.createFrame(-1, -2, 80));
        FrameLayout frameLayout2 = new FrameLayout(context) {
            @Override
            public void addView(View view, int i, int i2) {
                super.addView(view, i, i2);
                ChatInputViewsContainer.this.checkViewsPositions();
            }
        };
        this.inAppKeyboardBubbleContainer = frameLayout2;
        addView(frameLayout2, LayoutHelper.createFrame(-1, -2, 80));
    }

    public void setWindowInsetsProvider(WindowInsetsProvider windowInsetsProvider) {
        this.windowInsetsProvider = windowInsetsProvider;
    }

    public void setInputIslandBubbleDrawable(BlurredBackgroundDrawable blurredBackgroundDrawable) {
        this.blurredBackgroundDrawable = blurredBackgroundDrawable;
        blurredBackgroundDrawable.setPadding(AndroidUtilities.dp(7.0f));
        this.blurredBackgroundDrawable.setRadius(AndroidUtilities.dp(22.0f));
    }

    public void setUnderKeyboardBackgroundDrawable(BlurredBackgroundDrawable blurredBackgroundDrawable) {
        this.underKeyboardBackgroundDrawable = blurredBackgroundDrawable;
        blurredBackgroundDrawable.enableInAppKeyboardOptimization();
        this.underKeyboardBackgroundDrawable.setRadius(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), 0.0f, 0.0f);
    }

    public void updateColors() {
        this.blurredBackgroundDrawable.updateColors();
        this.underKeyboardBackgroundDrawable.updateColors();
        invalidate();
    }

    public FrameLayout getInputIslandBubbleContainer() {
        return this.inputIslandBubbleContainer;
    }

    public FrameLayout getInAppKeyboardBubbleContainer() {
        return this.inAppKeyboardBubbleContainer;
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        checkViewsPositions();
        checkInAppKeyboardChild();
    }

    private void checkInAppKeyboardViewHeight() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.inAppKeyboardBubbleContainer.getLayoutParams();
        int i = layoutParams.height;
        int inAppKeyboardRecommendedViewHeight = this.windowInsetsProvider.getInAppKeyboardRecommendedViewHeight();
        if (i != inAppKeyboardRecommendedViewHeight) {
            layoutParams.height = inAppKeyboardRecommendedViewHeight;
            requestLayout();
        }
    }

    private void checkBlurredHeight() {
        checkViewsPositions();
        int dp = this.inputBubbleHeightRound + AndroidUtilities.dp(9.0f) + Math.round(this.maxBottomInset);
        if (this.currentBlurredHeight != dp) {
            this.currentBlurredHeight = dp;
            int dp2 = AndroidUtilities.dp(29.0f);
            this.tmpRectF.set(0.0f, getMeasuredHeight() - this.imeBottomInset, getMeasuredWidth(), getMeasuredHeight());
            this.underKeyboardPath.rewind();
            float f = dp2;
            this.underKeyboardPath.addRoundRect(this.tmpRectF, new float[]{f, f, f, f, 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CW);
            this.underKeyboardPath.close();
            invalidate();
        }
    }

    public void checkInsets() {
        this.maxBottomInset = this.windowInsetsProvider.getAnimatedMaxBottomInset();
        this.imeBottomInset = this.windowInsetsProvider.getAnimatedImeBottomInset();
        this.needDrawInAppKeyboard = this.windowInsetsProvider.inAppViewIsVisible();
        boolean z = this.inAppKeyboardBubbleContainer.getVisibility() == 0;
        boolean z2 = this.needDrawInAppKeyboard;
        if (z != z2) {
            this.inAppKeyboardBubbleContainer.setVisibility(z2 ? 0 : 8);
        }
        checkInAppKeyboardViewHeight();
        checkBlurredHeight();
        checkInAppKeyboardChild();
    }

    public void checkViewsPositions() {
        this.inputIslandBubbleContainer.setTranslationY((-this.maxBottomInset) - AndroidUtilities.dp(9.0f));
        this.inAppKeyboardBubbleContainer.setTranslationY(r0.getMeasuredHeight() - this.imeBottomInset);
    }

    private void checkInAppKeyboardChild() {
        int currentNavigationBarInset = this.windowInsetsProvider.getCurrentNavigationBarInset();
        float animatedImeBottomInset = this.windowInsetsProvider.getAnimatedImeBottomInset();
        int childCount = this.inAppKeyboardBubbleContainer.getChildCount();
        for (int i = 0; i < childCount; i++) {
            KeyEvent.Callback childAt = this.inAppKeyboardBubbleContainer.getChildAt(i);
            if (childAt instanceof InAppKeyboardInsetView) {
                InAppKeyboardInsetView inAppKeyboardInsetView = (InAppKeyboardInsetView) childAt;
                inAppKeyboardInsetView.applyNavigationBarHeight(currentNavigationBarInset);
                inAppKeyboardInsetView.applyInAppKeyboardAnimatedHeight(animatedImeBottomInset);
            }
        }
    }

    public void setInputBubbleHeight(float f) {
        this.inputBubbleHeight = f;
        this.inputBubbleHeightRound = Math.round(f);
        checkBlurredHeight();
    }

    public void setInputBubbleOffsets(float f, float f2) {
        this.inputBubbleOffsetLeft = f;
        this.inputBubbleOffsetRight = f2;
        invalidate();
    }

    public float getInputBubbleHeight() {
        return this.inputBubbleHeight;
    }

    public float getInputBubbleTop() {
        return getInputBubbleBottom() - getInputBubbleHeight();
    }

    public float getInputBubbleBottom() {
        return (getMeasuredHeight() - this.maxBottomInset) - AndroidUtilities.dp(9.0f);
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        checkDrawableBounds();
        checkViewsPositions();
        checkInAppKeyboardChild();
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        this.underKeyboardBackgroundDrawable.setBounds(0, getMeasuredHeight() - ((int) this.imeBottomInset), getMeasuredWidth(), Math.max(getMeasuredHeight(), (getMeasuredHeight() - ((int) this.imeBottomInset)) + AndroidUtilities.dp(58.0f)));
        int measuredHeight = getMeasuredHeight() - this.currentBlurredHeight;
        this.tmpRect.set(Math.round(this.inputBubbleOffsetLeft), 0, getMeasuredWidth() - Math.round(this.inputBubbleOffsetRight), this.inputBubbleHeightRound);
        this.tmpRect.inset(0, -AndroidUtilities.dp(7.0f));
        this.tmpRect.offset(0, measuredHeight);
        this.blurredBackgroundDrawable.setBounds(this.tmpRect);
        this.blurredBackgroundDrawable.draw(canvas);
        if (this.needDrawInAppKeyboard) {
            this.underKeyboardBackgroundDrawable.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    protected boolean drawChild(Canvas canvas, View view, long j) {
        boolean z = view == this.inAppKeyboardBubbleContainer;
        if (z) {
            canvas.save();
            canvas.clipPath(this.underKeyboardPath);
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        if (z) {
            canvas.restore();
        }
        return drawChild;
    }

    public void setBlurredBottomHeight(float f) {
        if (this.blurredBottomHeight != f) {
            this.blurredBottomHeight = f;
            checkDrawableBounds();
        }
    }
}
