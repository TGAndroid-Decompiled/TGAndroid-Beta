package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import androidx.recyclerview.widget.DiffUtil;
import org.telegram.ui.Cells.BotButton$$ExternalSyntheticLambda0;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Stories.recorder.PaintView;

public class ButtonBounce {
    public Runnable additionalInvalidate;
    public ValueAnimator animator;
    public final float durationPressMultiplier;
    public final float durationReleaseMultiplier;
    public boolean isPressed;
    public final float overshoot;
    public float pressedT;
    public long releaseDelay;
    public View view;

    public ButtonBounce(ChatMessageCell chatMessageCell) {
        this(chatMessageCell, 1.0f, 5.0f);
    }

    public final float getScale(float f) {
        return DiffUtil.m(1.0f, this.pressedT, f, 1.0f - f);
    }

    public void invalidate() {
        View view = this.view;
        if (view != null) {
            view.invalidate();
        }
        Runnable runnable = this.additionalInvalidate;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void setPressed(boolean z) {
        if (this.isPressed != z) {
            this.isPressed = z;
            ValueAnimator valueAnimator = this.animator;
            this.animator = null;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.pressedT, z ? 1.0f : 0.0f);
            this.animator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new BotButton$$ExternalSyntheticLambda0(this, 25));
            this.animator.addListener(new ChatActivity.AnonymousClass77(14, this, z));
            if (this.isPressed) {
                this.animator.setInterpolator(CubicBezierInterpolator.DEFAULT);
                this.animator.setDuration((long) (this.durationPressMultiplier * 60.0f));
                this.animator.setStartDelay(0L);
            } else {
                this.animator.setInterpolator(new OvershootInterpolator(this.overshoot));
                this.animator.setDuration((long) (this.durationReleaseMultiplier * 350.0f));
                this.animator.setStartDelay(this.releaseDelay);
            }
            this.animator.start();
        }
    }

    public ButtonBounce(View view, float f, float f2) {
        this.releaseDelay = 0L;
        this.view = view;
        this.durationReleaseMultiplier = f;
        this.durationPressMultiplier = f;
        this.overshoot = f2;
    }

    public ButtonBounce(PaintView.PopupWindowLayout popupWindowLayout) {
        this.releaseDelay = 0L;
        this.view = popupWindowLayout;
        this.durationPressMultiplier = 1.5f;
        this.durationReleaseMultiplier = 1.0f;
        this.overshoot = 2.0f;
    }
}
