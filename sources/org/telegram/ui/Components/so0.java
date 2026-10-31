package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;
public final class so0 extends FrameLayout {
    public final int f30305a;
    public final op0 f30306b;

    public so0(op0 op0Var, Context context, int i10) {
        super(context);
        this.f30305a = i10;
        this.f30306b = op0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f30305a) {
            case 0:
                op0 op0Var = this.f30306b;
                op0Var.O2.setBounds(0, (int) op0Var.f29128m2, getMeasuredWidth(), getMeasuredHeight());
                op0Var.O2.draw(canvas);
                canvas.save();
                canvas.clipRect(0.0f, op0Var.f29128m2, getMeasuredWidth(), getMeasuredHeight());
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
        switch (this.f30305a) {
            case 0:
                op0 op0Var = this.f30306b;
                so0 so0Var = op0Var.f29122j1;
                float f7 = op0Var.f29130n2;
                if (f7 != 0.0f && f7 != so0Var.getTop() + op0Var.f29130n2) {
                    ValueAnimator valueAnimator = op0Var.f29132o2;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    float top = op0Var.f29130n2 - (so0Var.getTop() + op0Var.f29128m2);
                    op0Var.f29128m2 = top;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(top, 0.0f);
                    op0Var.f29132o2 = ofFloat;
                    ofFloat.addUpdateListener(new r60(this, 17));
                    op0Var.f29132o2.setInterpolator(gr.f26495f);
                    op0Var.f29132o2.setDuration(200L);
                    op0Var.f29132o2.start();
                    op0Var.f29130n2 = 0.0f;
                }
                op0Var.K1[1].setTranslationY((-(so0Var.getMeasuredHeight() - org.telegram.messenger.i0.L(48.0f))) + op0Var.f29128m2 + op0Var.f29126l2 + ((1.0f - getAlpha()) * (so0Var.getMeasuredHeight() - org.telegram.messenger.i0.L(48.0f))));
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f30305a) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(org.telegram.messenger.cd.G(this.f30306b.M1.m(), "AccDescrShareInChats", new Object[0]));
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
    public void setAlpha(float f7) {
        switch (this.f30305a) {
            case 0:
                super.setAlpha(f7);
                invalidate();
                return;
            default:
                super.setAlpha(f7);
                return;
        }
    }

    @Override
    public void setVisibility(int i10) {
        switch (this.f30305a) {
            case 0:
                super.setVisibility(i10);
                if (i10 != 0) {
                    this.f30306b.K1[1].setTranslationY(0.0f);
                    return;
                }
                return;
            default:
                super.setVisibility(i10);
                return;
        }
    }
}
