package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;
public final class un0 extends FrameLayout {
    public final int f40133a;
    public final po0 f40134b;

    public un0(po0 po0Var, Context context, int i7) {
        super(context);
        this.f40133a = i7;
        this.f40134b = po0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f40133a) {
            case 0:
                po0 po0Var = this.f40134b;
                po0Var.S2.setBounds(0, (int) po0Var.f38359q2, getMeasuredWidth(), getMeasuredHeight());
                po0Var.S2.draw(canvas);
                canvas.save();
                canvas.clipRect(0.0f, po0Var.f38359q2, getMeasuredWidth(), getMeasuredHeight());
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
        switch (this.f40133a) {
            case 0:
                po0 po0Var = this.f40134b;
                un0 un0Var = po0Var.n1;
                float f10 = po0Var.f38361r2;
                if (f10 != 0.0f && f10 != un0Var.getTop() + po0Var.f38361r2) {
                    ValueAnimator valueAnimator = po0Var.f38363s2;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    float top = po0Var.f38361r2 - (un0Var.getTop() + po0Var.f38359q2);
                    po0Var.f38359q2 = top;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(top, 0.0f);
                    po0Var.f38363s2 = ofFloat;
                    ofFloat.addUpdateListener(new f60(this, 16));
                    po0Var.f38363s2.setInterpolator(er.f34419f);
                    po0Var.f38363s2.setDuration(200L);
                    po0Var.f38363s2.start();
                    po0Var.f38361r2 = 0.0f;
                }
                po0Var.O1[1].setTranslationY((-(un0Var.getMeasuredHeight() - org.telegram.messenger.g0.L(48.0f))) + po0Var.f38359q2 + po0Var.f38357p2 + ((1.0f - getAlpha()) * (un0Var.getMeasuredHeight() - org.telegram.messenger.g0.L(48.0f))));
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f40133a) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(org.telegram.messenger.hd.G(this.f40134b.Q1.m(), "AccDescrShareInChats", new Object[0]));
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
        switch (this.f40133a) {
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
        switch (this.f40133a) {
            case 0:
                super.setVisibility(i7);
                if (i7 != 0) {
                    this.f40134b.O1[1].setTranslationY(0.0f);
                    return;
                }
                return;
            default:
                super.setVisibility(i7);
                return;
        }
    }
}
