package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;
public final class do0 extends FrameLayout {
    public final int f34471a;
    public final yo0 f34472b;

    public do0(yo0 yo0Var, Context context, int i7) {
        super(context);
        this.f34471a = i7;
        this.f34472b = yo0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f34471a) {
            case 0:
                yo0 yo0Var = this.f34472b;
                yo0Var.S2.setBounds(0, (int) yo0Var.f42572q2, getMeasuredWidth(), getMeasuredHeight());
                yo0Var.S2.draw(canvas);
                canvas.save();
                canvas.clipRect(0.0f, yo0Var.f42572q2, getMeasuredWidth(), getMeasuredHeight());
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
        switch (this.f34471a) {
            case 0:
                yo0 yo0Var = this.f34472b;
                do0 do0Var = yo0Var.n1;
                float f10 = yo0Var.f42574r2;
                if (f10 != 0.0f && f10 != do0Var.getTop() + yo0Var.f42574r2) {
                    ValueAnimator valueAnimator = yo0Var.f42576s2;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    float top = yo0Var.f42574r2 - (do0Var.getTop() + yo0Var.f42572q2);
                    yo0Var.f42572q2 = top;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(top, 0.0f);
                    yo0Var.f42576s2 = ofFloat;
                    ofFloat.addUpdateListener(new e60(this, 18));
                    yo0Var.f42576s2.setInterpolator(lr.f37208f);
                    yo0Var.f42576s2.setDuration(200L);
                    yo0Var.f42576s2.start();
                    yo0Var.f42574r2 = 0.0f;
                }
                yo0Var.O1[1].setTranslationY((-(do0Var.getMeasuredHeight() - org.telegram.messenger.g0.L(48.0f))) + yo0Var.f42572q2 + yo0Var.f42570p2 + ((1.0f - getAlpha()) * (do0Var.getMeasuredHeight() - org.telegram.messenger.g0.L(48.0f))));
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f34471a) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(org.telegram.messenger.gd.G(this.f34472b.Q1.m(), "AccDescrShareInChats", new Object[0]));
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
        switch (this.f34471a) {
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
        switch (this.f34471a) {
            case 0:
                super.setVisibility(i7);
                if (i7 != 0) {
                    this.f34472b.O1[1].setTranslationY(0.0f);
                    return;
                }
                return;
            default:
                super.setVisibility(i7);
                return;
        }
    }
}
