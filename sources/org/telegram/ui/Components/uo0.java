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

    public final int f33161a;

    public final sp0 f33162b;

    public uo0(sp0 sp0Var, Context context, int i10) {
        super(context);
        this.f33161a = i10;
        this.f33162b = sp0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f33161a) {
            case 0:
                sp0 sp0Var = this.f33162b;
                sp0Var.T0.setBounds(0, (int) sp0Var.f32539q0, getMeasuredWidth(), getMeasuredHeight());
                sp0Var.T0.draw(canvas);
                canvas.save();
                canvas.clipRect(0.0f, sp0Var.f32539q0, getMeasuredWidth(), getMeasuredHeight());
                super.dispatchDraw(canvas);
                canvas.restore();
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f33161a) {
            case 0:
                sp0 sp0Var = this.f33162b;
                uo0 uo0Var = sp0Var.f32522c;
                float f10 = sp0Var.f32541r0;
                if (f10 != 0.0f && f10 != uo0Var.getTop() + sp0Var.f32541r0) {
                    ValueAnimator valueAnimator = sp0Var.f32543s0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    float top = sp0Var.f32541r0 - (uo0Var.getTop() + sp0Var.f32539q0);
                    sp0Var.f32539q0 = top;
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(top, 0.0f);
                    sp0Var.f32543s0 = valueAnimatorOfFloat;
                    valueAnimatorOfFloat.addUpdateListener(new v60(this, 17));
                    sp0Var.f32543s0.setInterpolator(er.f28122f);
                    sp0Var.f32543s0.setDuration(200L);
                    sp0Var.f32543s0.start();
                    sp0Var.f32541r0 = 0.0f;
                }
                sp0Var.O[1].setTranslationY((-(uo0Var.getMeasuredHeight() - AndroidUtilities.dp(48.0f))) + sp0Var.f32539q0 + sp0Var.f32538p0 + ((1.0f - getAlpha()) * (uo0Var.getMeasuredHeight() - AndroidUtilities.dp(48.0f))));
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f33161a) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrShareInChats", this.f33162b.Q.m(), new Object[0]));
                accessibilityNodeInfo.setClassName(Button.class.getName());
                accessibilityNodeInfo.setLongClickable(true);
                accessibilityNodeInfo.setClickable(true);
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                break;
        }
    }

    @Override
    public void setAlpha(float f10) {
        switch (this.f33161a) {
            case 0:
                super.setAlpha(f10);
                invalidate();
                break;
            default:
                super.setAlpha(f10);
                break;
        }
    }

    @Override
    public void setVisibility(int i10) {
        switch (this.f33161a) {
            case 0:
                super.setVisibility(i10);
                if (i10 != 0) {
                    this.f33162b.O[1].setTranslationY(0.0f);
                }
                break;
            default:
                super.setVisibility(i10);
                break;
        }
    }
}
