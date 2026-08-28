package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class uo0 extends FrameLayout {
    public final int f33099a;
    public final rp0 f33100b;

    public uo0(rp0 rp0Var, Context context, int i9) {
        super(context);
        this.f33099a = i9;
        this.f33100b = rp0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f33099a) {
            case 0:
                rp0 rp0Var = this.f33100b;
                rp0Var.T0.setBounds(0, (int) rp0Var.f32261q0, getMeasuredWidth(), getMeasuredHeight());
                rp0Var.T0.draw(canvas);
                canvas.save();
                canvas.clipRect(0.0f, rp0Var.f32261q0, getMeasuredWidth(), getMeasuredHeight());
                super.dispatchDraw(canvas);
                canvas.restore();
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f33099a) {
            case 0:
                rp0 rp0Var = this.f33100b;
                uo0 uo0Var = rp0Var.f32244c;
                float f10 = rp0Var.f32263r0;
                if (f10 != 0.0f && f10 != uo0Var.getTop() + rp0Var.f32263r0) {
                    ValueAnimator valueAnimator = rp0Var.f32265s0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    float top = rp0Var.f32263r0 - (uo0Var.getTop() + rp0Var.f32261q0);
                    rp0Var.f32261q0 = top;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(top, 0.0f);
                    rp0Var.f32265s0 = ofFloat;
                    ofFloat.addUpdateListener(new q60(this, 17));
                    rp0Var.f32265s0.setInterpolator(gr.f28844f);
                    rp0Var.f32265s0.setDuration(200L);
                    rp0Var.f32265s0.start();
                    rp0Var.f32263r0 = 0.0f;
                }
                rp0Var.O[1].setTranslationY((-(uo0Var.getMeasuredHeight() - AndroidUtilities.dp(48.0f))) + rp0Var.f32261q0 + rp0Var.f32260p0 + ((1.0f - getAlpha()) * (uo0Var.getMeasuredHeight() - AndroidUtilities.dp(48.0f))));
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f33099a) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrShareInChats", this.f33100b.Q.m(), new Object[0]));
                accessibilityNodeInfo.setClassName(Button.class.getName());
                accessibilityNodeInfo.setLongClickable(true);
                accessibilityNodeInfo.setClickable(true);
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                return;
        }
    }

    @Override
    public void setAlpha(float f10) {
        switch (this.f33099a) {
            case 0:
                super.setAlpha(f10);
                invalidate();
                return;
            default:
                super.setAlpha(f10);
                return;
        }
    }

    @Override
    public void setVisibility(int i9) {
        switch (this.f33099a) {
            case 0:
                super.setVisibility(i9);
                if (i9 != 0) {
                    this.f33100b.O[1].setTranslationY(0.0f);
                    return;
                }
                return;
            default:
                super.setVisibility(i9);
                return;
        }
    }
}
