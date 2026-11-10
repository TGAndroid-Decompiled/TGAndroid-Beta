package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;
public final class rn0 extends FrameLayout {
    public final int f37715a;
    public final mo0 f37716b;

    public rn0(mo0 mo0Var, Context context, int i7) {
        super(context);
        this.f37715a = i7;
        this.f37716b = mo0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f37715a) {
            case 0:
                mo0 mo0Var = this.f37716b;
                mo0Var.R2.setBounds(0, (int) mo0Var.f36044p2, getMeasuredWidth(), getMeasuredHeight());
                mo0Var.R2.draw(canvas);
                canvas.save();
                canvas.clipRect(0.0f, mo0Var.f36044p2, getMeasuredWidth(), getMeasuredHeight());
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
        switch (this.f37715a) {
            case 0:
                mo0 mo0Var = this.f37716b;
                rn0 rn0Var = mo0Var.f36038m1;
                float f10 = mo0Var.f36046q2;
                if (f10 != 0.0f && f10 != rn0Var.getTop() + mo0Var.f36046q2) {
                    ValueAnimator valueAnimator = mo0Var.f36048r2;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    float top = mo0Var.f36046q2 - (rn0Var.getTop() + mo0Var.f36044p2);
                    mo0Var.f36044p2 = top;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(top, 0.0f);
                    mo0Var.f36048r2 = ofFloat;
                    ofFloat.addUpdateListener(new c60(this, 16));
                    mo0Var.f36048r2.setInterpolator(wq.f40046f);
                    mo0Var.f36048r2.setDuration(200L);
                    mo0Var.f36048r2.start();
                    mo0Var.f36046q2 = 0.0f;
                }
                mo0Var.N1[1].setTranslationY((-(rn0Var.getMeasuredHeight() - org.telegram.messenger.g0.L(48.0f))) + mo0Var.f36044p2 + mo0Var.f36042o2 + ((1.0f - getAlpha()) * (rn0Var.getMeasuredHeight() - org.telegram.messenger.g0.L(48.0f))));
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f37715a) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(org.telegram.messenger.id.G(this.f37716b.P1.m(), "AccDescrShareInChats", new Object[0]));
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
        switch (this.f37715a) {
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
        switch (this.f37715a) {
            case 0:
                super.setVisibility(i7);
                if (i7 != 0) {
                    this.f37716b.N1[1].setTranslationY(0.0f);
                    return;
                }
                return;
            default:
                super.setVisibility(i7);
                return;
        }
    }
}
