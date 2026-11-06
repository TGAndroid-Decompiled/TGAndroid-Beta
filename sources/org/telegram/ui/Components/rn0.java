package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;
public final class rn0 extends FrameLayout {
    public final int f37752a;
    public final mo0 f37753b;

    public rn0(mo0 mo0Var, Context context, int i7) {
        super(context);
        this.f37752a = i7;
        this.f37753b = mo0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f37752a) {
            case 0:
                mo0 mo0Var = this.f37753b;
                mo0Var.O2.setBounds(0, (int) mo0Var.f36007m2, getMeasuredWidth(), getMeasuredHeight());
                mo0Var.O2.draw(canvas);
                canvas.save();
                canvas.clipRect(0.0f, mo0Var.f36007m2, getMeasuredWidth(), getMeasuredHeight());
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
        switch (this.f37752a) {
            case 0:
                mo0 mo0Var = this.f37753b;
                rn0 rn0Var = mo0Var.f36001j1;
                float f10 = mo0Var.f36008n2;
                if (f10 != 0.0f && f10 != rn0Var.getTop() + mo0Var.f36008n2) {
                    ValueAnimator valueAnimator = mo0Var.f36010o2;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    float top = mo0Var.f36008n2 - (rn0Var.getTop() + mo0Var.f36007m2);
                    mo0Var.f36007m2 = top;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(top, 0.0f);
                    mo0Var.f36010o2 = ofFloat;
                    ofFloat.addUpdateListener(new c60(this, 16));
                    mo0Var.f36010o2.setInterpolator(xq.f40329f);
                    mo0Var.f36010o2.setDuration(200L);
                    mo0Var.f36010o2.start();
                    mo0Var.f36008n2 = 0.0f;
                }
                mo0Var.K1[1].setTranslationY((-(rn0Var.getMeasuredHeight() - org.telegram.messenger.g0.L(48.0f))) + mo0Var.f36007m2 + mo0Var.f36005l2 + ((1.0f - getAlpha()) * (rn0Var.getMeasuredHeight() - org.telegram.messenger.g0.L(48.0f))));
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f37752a) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(org.telegram.messenger.hd.G(this.f37753b.M1.m(), "AccDescrShareInChats", new Object[0]));
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
        switch (this.f37752a) {
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
        switch (this.f37752a) {
            case 0:
                super.setVisibility(i7);
                if (i7 != 0) {
                    this.f37753b.K1[1].setTranslationY(0.0f);
                    return;
                }
                return;
            default:
                super.setVisibility(i7);
                return;
        }
    }
}
