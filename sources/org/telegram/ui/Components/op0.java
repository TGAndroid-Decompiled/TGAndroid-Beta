package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class op0 extends FrameLayout {
    public final int f27640a;
    public final lq0 f27641b;

    public op0(lq0 lq0Var, Context context, int i10) {
        super(context);
        this.f27640a = i10;
        this.f27641b = lq0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f27640a) {
            case 0:
                lq0 lq0Var = this.f27641b;
                lq0Var.U0.setBounds(0, (int) lq0Var.f26863r0, getMeasuredWidth(), getMeasuredHeight());
                lq0Var.U0.draw(canvas);
                canvas.save();
                canvas.clipRect(0.0f, lq0Var.f26863r0, getMeasuredWidth(), getMeasuredHeight());
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
        switch (this.f27640a) {
            case 0:
                lq0 lq0Var = this.f27641b;
                op0 op0Var = lq0Var.f26845c;
                float f10 = lq0Var.f26865s0;
                if (f10 != 0.0f && f10 != op0Var.getTop() + lq0Var.f26865s0) {
                    ValueAnimator valueAnimator = lq0Var.f26866t0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    float top = lq0Var.f26865s0 - (op0Var.getTop() + lq0Var.f26863r0);
                    lq0Var.f26863r0 = top;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(top, 0.0f);
                    lq0Var.f26866t0 = ofFloat;
                    ofFloat.addUpdateListener(new i70(this, 17));
                    lq0Var.f26866t0.setInterpolator(nr.f27346f);
                    lq0Var.f26866t0.setDuration(200L);
                    lq0Var.f26866t0.start();
                    lq0Var.f26865s0 = 0.0f;
                }
                lq0Var.P[1].setTranslationY((-(op0Var.getMeasuredHeight() - AndroidUtilities.dp(48.0f))) + lq0Var.f26863r0 + lq0Var.f26861q0 + ((1.0f - getAlpha()) * (op0Var.getMeasuredHeight() - AndroidUtilities.dp(48.0f))));
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f27640a) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrShareInChats", this.f27641b.R.m(), new Object[0]));
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
        switch (this.f27640a) {
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
    public void setVisibility(int i10) {
        switch (this.f27640a) {
            case 0:
                super.setVisibility(i10);
                if (i10 != 0) {
                    this.f27641b.P[1].setTranslationY(0.0f);
                    return;
                }
                return;
            default:
                super.setVisibility(i10);
                return;
        }
    }
}
