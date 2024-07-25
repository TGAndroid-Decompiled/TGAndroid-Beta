package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.core.math.MathUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EmojiTabsStrip;
public class ScrollableHorizontalScrollView extends HorizontalScrollView {
    public LinearLayout contentView;
    private ValueAnimator scrollAnimator;
    protected boolean scrollingAnimation;
    private int scrollingTo;
    ValueAnimator showAnimator;
    boolean touching;

    public ScrollableHorizontalScrollView(Context context) {
        super(context);
        this.scrollingTo = -1;
    }

    public boolean scrollToVisible(int i, int i2) {
        int measuredWidth;
        if (getChildCount() <= 0) {
            return false;
        }
        int dp = AndroidUtilities.dp(50.0f);
        if (i < getScrollX() + dp) {
            measuredWidth = i - dp;
        } else if (i2 <= getScrollX() + (getMeasuredWidth() - dp)) {
            return false;
        } else {
            measuredWidth = (i2 - getMeasuredWidth()) + dp;
        }
        scrollTo(MathUtils.clamp(measuredWidth, 0, getChildAt(0).getMeasuredWidth() - getMeasuredWidth()));
        return true;
    }

    public void scrollTo(int i) {
        if (this.scrollingTo == i) {
            return;
        }
        this.scrollingTo = i;
        ValueAnimator valueAnimator = this.scrollAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (getScrollX() == i) {
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(getScrollX(), i);
        this.scrollAnimator = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ScrollableHorizontalScrollView.this.lambda$scrollTo$0(valueAnimator2);
            }
        });
        this.scrollAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.scrollAnimator.setDuration(250L);
        this.scrollAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                ScrollableHorizontalScrollView.this.scrollingAnimation = false;
            }

            @Override
            public void onAnimationStart(Animator animator) {
                ScrollableHorizontalScrollView scrollableHorizontalScrollView = ScrollableHorizontalScrollView.this;
                scrollableHorizontalScrollView.scrollingAnimation = true;
                if (scrollableHorizontalScrollView.getParent() instanceof HorizontalScrollView) {
                    ((HorizontalScrollView) ScrollableHorizontalScrollView.this.getParent()).requestDisallowInterceptTouchEvent(false);
                }
            }
        });
        this.scrollAnimator.start();
    }

    public void lambda$scrollTo$0(ValueAnimator valueAnimator) {
        setScrollX((int) ((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public void resetScrollTo() {
        this.scrollingTo = -1;
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        updateButtonsVisibility();
    }

    @Override
    protected void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if ((Math.abs(i2 - i4) < 2 || i2 >= getMeasuredHeight() || i2 == 0) && !this.touching) {
            requestDisallowInterceptTouchEvent(false);
        }
        updateButtonsVisibility();
    }

    public void updateButtonsVisibility() {
        ValueAnimator valueAnimator;
        int childCount = this.contentView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.contentView.getChildAt(i);
            if (childAt instanceof EmojiTabsStrip.EmojiTabButton) {
                EmojiTabsStrip.EmojiTabButton emojiTabButton = (EmojiTabsStrip.EmojiTabButton) childAt;
                boolean z = true;
                boolean z2 = childAt.getRight() - getScrollX() > 0 && childAt.getLeft() - getScrollX() < getMeasuredWidth();
                if (!this.scrollingAnimation || ((valueAnimator = this.showAnimator) != null && valueAnimator.isRunning())) {
                    z = false;
                }
                emojiTabButton.updateVisibilityInbounds(z2, z);
            }
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 && motionEvent.getAction() != 1) {
            motionEvent.getAction();
        }
        return super.onTouchEvent(motionEvent);
    }
}
