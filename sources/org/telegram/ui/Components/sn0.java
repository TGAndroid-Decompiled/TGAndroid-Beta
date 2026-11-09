package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;
public final class sn0 extends FrameLayout {
    public final int f38129a;
    public final no0 f38130b;

    public sn0(no0 no0Var, Context context, int i7) {
        super(context);
        this.f38129a = i7;
        this.f38130b = no0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f38129a) {
            case 0:
                no0 no0Var = this.f38130b;
                no0Var.O2.setBounds(0, (int) no0Var.f36445m2, getMeasuredWidth(), getMeasuredHeight());
                no0Var.O2.draw(canvas);
                canvas.save();
                canvas.clipRect(0.0f, no0Var.f36445m2, getMeasuredWidth(), getMeasuredHeight());
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
        switch (this.f38129a) {
            case 0:
                no0 no0Var = this.f38130b;
                sn0 sn0Var = no0Var.f36439j1;
                float f10 = no0Var.f36446n2;
                if (f10 != 0.0f && f10 != sn0Var.getTop() + no0Var.f36446n2) {
                    ValueAnimator valueAnimator = no0Var.f36448o2;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    float top = no0Var.f36446n2 - (sn0Var.getTop() + no0Var.f36445m2);
                    no0Var.f36445m2 = top;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(top, 0.0f);
                    no0Var.f36448o2 = ofFloat;
                    ofFloat.addUpdateListener(new d60(this, 16));
                    no0Var.f36448o2.setInterpolator(xq.f40458f);
                    no0Var.f36448o2.setDuration(200L);
                    no0Var.f36448o2.start();
                    no0Var.f36446n2 = 0.0f;
                }
                no0Var.K1[1].setTranslationY((-(sn0Var.getMeasuredHeight() - org.telegram.messenger.g0.L(48.0f))) + no0Var.f36445m2 + no0Var.f36443l2 + ((1.0f - getAlpha()) * (sn0Var.getMeasuredHeight() - org.telegram.messenger.g0.L(48.0f))));
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f38129a) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(org.telegram.messenger.id.G(this.f38130b.M1.m(), "AccDescrShareInChats", new Object[0]));
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
        switch (this.f38129a) {
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
        switch (this.f38129a) {
            case 0:
                super.setVisibility(i7);
                if (i7 != 0) {
                    this.f38130b.K1[1].setTranslationY(0.0f);
                    return;
                }
                return;
            default:
                super.setVisibility(i7);
                return;
        }
    }
}
