package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class hq0 extends FrameLayout {
    public final int f26922a;
    public final dr0 f26923b;

    public hq0(dr0 dr0Var, Context context, int i10) {
        super(context);
        this.f26922a = i10;
        this.f26923b = dr0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f26922a) {
            case 0:
                dr0 dr0Var = this.f26923b;
                dr0Var.X0.setBounds(0, (int) dr0Var.f25684u0, getMeasuredWidth(), getMeasuredHeight());
                dr0Var.X0.draw(canvas);
                canvas.save();
                canvas.clipRect(0.0f, dr0Var.f25684u0, getMeasuredWidth(), getMeasuredHeight());
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
        switch (this.f26922a) {
            case 0:
                dr0 dr0Var = this.f26923b;
                hq0 hq0Var = dr0Var.f25662c;
                float f7 = dr0Var.f25685v0;
                if (f7 != 0.0f && f7 != hq0Var.getTop() + dr0Var.f25685v0) {
                    ValueAnimator valueAnimator = dr0Var.f25687w0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    float top = dr0Var.f25685v0 - (hq0Var.getTop() + dr0Var.f25684u0);
                    dr0Var.f25684u0 = top;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(top, 0.0f);
                    dr0Var.f25687w0 = ofFloat;
                    ofFloat.addUpdateListener(new b80(this, 18));
                    dr0Var.f25687w0.setInterpolator(bs.f25037f);
                    dr0Var.f25687w0.setDuration(200L);
                    dr0Var.f25687w0.start();
                    dr0Var.f25685v0 = 0.0f;
                }
                dr0Var.S[1].setTranslationY((-(hq0Var.getMeasuredHeight() - AndroidUtilities.dp(48.0f))) + dr0Var.f25684u0 + dr0Var.f25683t0 + ((1.0f - getAlpha()) * (hq0Var.getMeasuredHeight() - AndroidUtilities.dp(48.0f))));
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f26922a) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrShareInChats", this.f26923b.U.m(), new Object[0]));
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
        switch (this.f26922a) {
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
        switch (this.f26922a) {
            case 0:
                super.setVisibility(i10);
                if (i10 != 0) {
                    this.f26923b.S[1].setTranslationY(0.0f);
                    return;
                }
                return;
            default:
                super.setVisibility(i10);
                return;
        }
    }
}
