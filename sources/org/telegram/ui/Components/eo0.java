package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;
public final class eo0 extends FrameLayout {
    public final int f34829a;
    public final zo0 f34830b;

    public eo0(zo0 zo0Var, Context context, int i7) {
        super(context);
        this.f34829a = i7;
        this.f34830b = zo0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f34829a) {
            case 0:
                zo0 zo0Var = this.f34830b;
                zo0Var.S2.setBounds(0, (int) zo0Var.f42989q2, getMeasuredWidth(), getMeasuredHeight());
                zo0Var.S2.draw(canvas);
                canvas.save();
                canvas.clipRect(0.0f, zo0Var.f42989q2, getMeasuredWidth(), getMeasuredHeight());
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
        switch (this.f34829a) {
            case 0:
                zo0 zo0Var = this.f34830b;
                eo0 eo0Var = zo0Var.n1;
                float f10 = zo0Var.f42991r2;
                if (f10 != 0.0f && f10 != eo0Var.getTop() + zo0Var.f42991r2) {
                    ValueAnimator valueAnimator = zo0Var.f42993s2;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    float top = zo0Var.f42991r2 - (eo0Var.getTop() + zo0Var.f42989q2);
                    zo0Var.f42989q2 = top;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(top, 0.0f);
                    zo0Var.f42993s2 = ofFloat;
                    ofFloat.addUpdateListener(new e60(this, 18));
                    zo0Var.f42993s2.setInterpolator(kr.f36858f);
                    zo0Var.f42993s2.setDuration(200L);
                    zo0Var.f42993s2.start();
                    zo0Var.f42991r2 = 0.0f;
                }
                zo0Var.O1[1].setTranslationY((-(eo0Var.getMeasuredHeight() - org.telegram.messenger.g0.L(48.0f))) + zo0Var.f42989q2 + zo0Var.f42987p2 + ((1.0f - getAlpha()) * (eo0Var.getMeasuredHeight() - org.telegram.messenger.g0.L(48.0f))));
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f34829a) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(org.telegram.messenger.gd.G(this.f34830b.Q1.m(), "AccDescrShareInChats", new Object[0]));
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
        switch (this.f34829a) {
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
    public void setVisibility(int i7) {
        switch (this.f34829a) {
            case 0:
                super.setVisibility(i7);
                if (i7 != 0) {
                    this.f34830b.O1[1].setTranslationY(0.0f);
                    return;
                }
                return;
            default:
                super.setVisibility(i7);
                return;
        }
    }
}
