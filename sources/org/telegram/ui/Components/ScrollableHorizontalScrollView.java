package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.core.math.MathUtils;
import org.telegram.messenger.AndroidUtilities;

public abstract class ScrollableHorizontalScrollView extends HorizontalScrollView {
    public LinearLayout contentView;
    public ValueAnimator scrollAnimator;
    public boolean scrollingAnimation;
    public int scrollingTo;
    public ValueAnimator showAnimator;
    public boolean touching;

    public ScrollableHorizontalScrollView(Context context) {
        super(context);
        this.scrollingTo = -1;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        updateButtonsVisibility();
    }

    @Override
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if ((Math.abs(i2 - i4) < 2 || i2 >= getMeasuredHeight() || i2 == 0) && !this.touching) {
            requestDisallowInterceptTouchEvent(false);
        }
        updateButtonsVisibility();
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 && motionEvent.getAction() != 1) {
            motionEvent.getAction();
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void scrollTo(int i) {
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
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(getScrollX(), i);
        this.scrollAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ScrimOptions$$ExternalSyntheticLambda2(this, 13));
        this.scrollAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.scrollAnimator.setDuration(250L);
        this.scrollAnimator.addListener(new ItemOptions.AnonymousClass3(this, 29));
        this.scrollAnimator.start();
    }

    public final void scrollToVisible(int i, int i2) {
        int measuredWidth;
        if (getChildCount() <= 0) {
            return;
        }
        int iDp = AndroidUtilities.dp(50.0f);
        if (i < getScrollX() + iDp) {
            measuredWidth = i - iDp;
        } else {
            if (i2 <= (getMeasuredWidth() - iDp) + getScrollX()) {
                return;
            } else {
                measuredWidth = (i2 - getMeasuredWidth()) + iDp;
            }
        }
        scrollTo(MathUtils.clamp(measuredWidth, 0, getChildAt(0).getMeasuredWidth() - getMeasuredWidth()));
    }

    public final void updateButtonsVisibility() {
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
}
