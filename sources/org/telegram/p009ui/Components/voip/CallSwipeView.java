package org.telegram.p009ui.Components.voip;

import android.animation.AnimatorSet;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.Keep;
import org.telegram.messenger.AndroidUtilities;

public class CallSwipeView extends View {
    private boolean animatingArrows;
    private Path arrow;
    private int[] arrowAlphas;
    private AnimatorSet arrowAnim;
    private Paint arrowsPaint;
    private boolean dragFromRight;
    private float dragStartX;
    private boolean dragging;
    private Listener listener;
    private Paint pullBgPaint;
    private RectF tmpRect;
    private View viewToDrag;

    public interface Listener {
        void onDragCancel();

        void onDragComplete();

        void onDragStart();
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatorSet animatorSet = this.arrowAnim;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.arrowAnim = null;
        }
    }

    public void setColor(int i) {
        this.pullBgPaint.setColor(i);
        this.pullBgPaint.setAlpha(178);
    }

    public void setListener(Listener listener) {
        this.listener = listener;
    }

    private int getDraggedViewWidth() {
        return getHeight();
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        if (!isEnabled() || accessibilityManager.isTouchExplorationEnabled()) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 0) {
            if ((!this.dragFromRight && motionEvent.getX() < getDraggedViewWidth()) || (this.dragFromRight && motionEvent.getX() > getWidth() - getDraggedViewWidth())) {
                this.dragging = true;
                this.dragStartX = motionEvent.getX();
                getParent().requestDisallowInterceptTouchEvent(true);
                this.listener.onDragStart();
                stopAnimatingArrows();
            }
        } else {
            if (motionEvent.getAction() == 2) {
                this.viewToDrag.setTranslationX(Math.max(this.dragFromRight ? -(getWidth() - getDraggedViewWidth()) : 0.0f, Math.min(motionEvent.getX() - this.dragStartX, this.dragFromRight ? 0.0f : getWidth() - getDraggedViewWidth())));
                invalidate();
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (Math.abs(this.viewToDrag.getTranslationX()) >= getWidth() - getDraggedViewWidth() && motionEvent.getAction() == 1) {
                    this.listener.onDragComplete();
                } else {
                    this.listener.onDragCancel();
                    this.viewToDrag.animate().translationX(0.0f).setDuration(200L).start();
                    invalidate();
                    startAnimatingArrows();
                    this.dragging = false;
                }
            }
        }
        return this.dragging;
    }

    public void stopAnimatingArrows() {
        this.animatingArrows = false;
    }

    public void startAnimatingArrows() {
        AnimatorSet animatorSet;
        if (this.animatingArrows || (animatorSet = this.arrowAnim) == null) {
            return;
        }
        this.animatingArrows = true;
        if (animatorSet != null) {
            animatorSet.start();
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if (this.viewToDrag.getTranslationX() != 0.0f) {
            if (this.dragFromRight) {
                this.tmpRect.set((getWidth() + this.viewToDrag.getTranslationX()) - getDraggedViewWidth(), 0.0f, getWidth(), getHeight());
            } else {
                this.tmpRect.set(0.0f, 0.0f, this.viewToDrag.getTranslationX() + getDraggedViewWidth(), getHeight());
            }
            canvas.drawRoundRect(this.tmpRect, getHeight() / 2, getHeight() / 2, this.pullBgPaint);
        }
        canvas.save();
        if (this.dragFromRight) {
            canvas.translate((getWidth() - getHeight()) - AndroidUtilities.m36dp(18.0f), getHeight() / 2);
        } else {
            canvas.translate(getHeight() + AndroidUtilities.m36dp(12.0f), getHeight() / 2);
        }
        float abs = Math.abs(this.viewToDrag.getTranslationX());
        for (int i = 0; i < 3; i++) {
            float f = 16.0f;
            this.arrowsPaint.setAlpha(Math.round(this.arrowAlphas[i] * (abs > ((float) AndroidUtilities.m36dp((float) (i * 16))) ? 1.0f - Math.min(1.0f, Math.max(0.0f, (abs - (AndroidUtilities.m36dp(16.0f) * i)) / AndroidUtilities.m36dp(16.0f))) : 1.0f)));
            canvas.drawPath(this.arrow, this.arrowsPaint);
            if (this.dragFromRight) {
                f = -16.0f;
            }
            canvas.translate(AndroidUtilities.m36dp(f), 0.0f);
        }
        canvas.restore();
        invalidate();
    }

    @Override
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (isEnabled() && accessibilityEvent.getEventType() == 1) {
            this.listener.onDragComplete();
        }
        super.onPopulateAccessibilityEvent(accessibilityEvent);
    }

    private class ArrowAnimWrapper {
        private int index;
        final CallSwipeView this$0;

        @Keep
        public int getArrowAlpha() {
            return this.this$0.arrowAlphas[this.index];
        }

        @Keep
        public void setArrowAlpha(int i) {
            this.this$0.arrowAlphas[this.index] = i;
        }
    }
}
