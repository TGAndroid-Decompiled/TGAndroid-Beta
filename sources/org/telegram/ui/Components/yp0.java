package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class yp0 extends FrameLayout {
    public final int f30592a;
    public final uq0 f30593b;

    public yp0(uq0 uq0Var, Context context, int i10) {
        super(context);
        this.f30592a = i10;
        this.f30593b = uq0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f30592a) {
            case 0:
                uq0 uq0Var = this.f30593b;
                uq0Var.X0.setBounds(0, (int) uq0Var.f28829u0, getMeasuredWidth(), getMeasuredHeight());
                uq0Var.X0.draw(canvas);
                canvas.save();
                canvas.clipRect(0.0f, uq0Var.f28829u0, getMeasuredWidth(), getMeasuredHeight());
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
        switch (this.f30592a) {
            case 0:
                uq0 uq0Var = this.f30593b;
                yp0 yp0Var = uq0Var.f28807c;
                float f7 = uq0Var.f28830v0;
                if (f7 != 0.0f && f7 != yp0Var.getTop() + uq0Var.f28830v0) {
                    ValueAnimator valueAnimator = uq0Var.f28832w0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    float top = uq0Var.f28830v0 - (yp0Var.getTop() + uq0Var.f28829u0);
                    uq0Var.f28829u0 = top;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(top, 0.0f);
                    uq0Var.f28832w0 = ofFloat;
                    ofFloat.addUpdateListener(new p70(this, 17));
                    uq0Var.f28832w0.setInterpolator(qr.f27642f);
                    uq0Var.f28832w0.setDuration(200L);
                    uq0Var.f28832w0.start();
                    uq0Var.f28830v0 = 0.0f;
                }
                uq0Var.S[1].setTranslationY((-(yp0Var.getMeasuredHeight() - AndroidUtilities.dp(48.0f))) + uq0Var.f28829u0 + uq0Var.f28828t0 + ((1.0f - getAlpha()) * (yp0Var.getMeasuredHeight() - AndroidUtilities.dp(48.0f))));
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f30592a) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrShareInChats", this.f30593b.U.m(), new Object[0]));
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
        switch (this.f30592a) {
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
        switch (this.f30592a) {
            case 0:
                super.setVisibility(i10);
                if (i10 != 0) {
                    this.f30593b.S[1].setTranslationY(0.0f);
                    return;
                }
                return;
            default:
                super.setVisibility(i10);
                return;
        }
    }
}
