package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;
public final class fo0 extends FrameLayout {
    public final int f35247a;
    public final ap0 f35248b;

    public fo0(ap0 ap0Var, Context context, int i7) {
        super(context);
        this.f35247a = i7;
        this.f35248b = ap0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f35247a) {
            case 0:
                ap0 ap0Var = this.f35248b;
                ap0Var.S2.setBounds(0, (int) ap0Var.f33565q2, getMeasuredWidth(), getMeasuredHeight());
                ap0Var.S2.draw(canvas);
                canvas.save();
                canvas.clipRect(0.0f, ap0Var.f33565q2, getMeasuredWidth(), getMeasuredHeight());
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
        switch (this.f35247a) {
            case 0:
                ap0 ap0Var = this.f35248b;
                fo0 fo0Var = ap0Var.n1;
                float f10 = ap0Var.f33567r2;
                if (f10 != 0.0f && f10 != fo0Var.getTop() + ap0Var.f33567r2) {
                    ValueAnimator valueAnimator = ap0Var.f33569s2;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    float top = ap0Var.f33567r2 - (fo0Var.getTop() + ap0Var.f33565q2);
                    ap0Var.f33565q2 = top;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(top, 0.0f);
                    ap0Var.f33569s2 = ofFloat;
                    ofFloat.addUpdateListener(new h60(this, 18));
                    ap0Var.f33569s2.setInterpolator(nr.f37917f);
                    ap0Var.f33569s2.setDuration(200L);
                    ap0Var.f33569s2.start();
                    ap0Var.f33567r2 = 0.0f;
                }
                ap0Var.O1[1].setTranslationY((-(fo0Var.getMeasuredHeight() - org.telegram.messenger.g0.L(48.0f))) + ap0Var.f33565q2 + ap0Var.f33563p2 + ((1.0f - getAlpha()) * (fo0Var.getMeasuredHeight() - org.telegram.messenger.g0.L(48.0f))));
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f35247a) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(org.telegram.messenger.hd.G(this.f35248b.Q1.m(), "AccDescrShareInChats", new Object[0]));
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
        switch (this.f35247a) {
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
        switch (this.f35247a) {
            case 0:
                super.setVisibility(i7);
                if (i7 != 0) {
                    this.f35248b.O1[1].setTranslationY(0.0f);
                    return;
                }
                return;
            default:
                super.setVisibility(i7);
                return;
        }
    }
}
