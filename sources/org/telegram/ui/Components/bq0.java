package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class bq0 extends FrameLayout {
    public final int f22992a;
    public final xq0 f22993b;

    public bq0(xq0 xq0Var, Context context, int i10) {
        super(context);
        this.f22992a = i10;
        this.f22993b = xq0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f22992a) {
            case 0:
                xq0 xq0Var = this.f22993b;
                xq0Var.X0.setBounds(0, (int) xq0Var.f30479u0, getMeasuredWidth(), getMeasuredHeight());
                xq0Var.X0.draw(canvas);
                canvas.save();
                canvas.clipRect(0.0f, xq0Var.f30479u0, getMeasuredWidth(), getMeasuredHeight());
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
        switch (this.f22992a) {
            case 0:
                xq0 xq0Var = this.f22993b;
                bq0 bq0Var = xq0Var.f30457c;
                float f7 = xq0Var.f30480v0;
                if (f7 != 0.0f && f7 != bq0Var.getTop() + xq0Var.f30480v0) {
                    ValueAnimator valueAnimator = xq0Var.f30482w0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    float top = xq0Var.f30480v0 - (bq0Var.getTop() + xq0Var.f30479u0);
                    xq0Var.f30479u0 = top;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(top, 0.0f);
                    xq0Var.f30482w0 = ofFloat;
                    ofFloat.addUpdateListener(new v70(this, 17));
                    xq0Var.f30482w0.setInterpolator(tr.f28636f);
                    xq0Var.f30482w0.setDuration(200L);
                    xq0Var.f30482w0.start();
                    xq0Var.f30480v0 = 0.0f;
                }
                xq0Var.S[1].setTranslationY((-(bq0Var.getMeasuredHeight() - AndroidUtilities.dp(48.0f))) + xq0Var.f30479u0 + xq0Var.f30478t0 + ((1.0f - getAlpha()) * (bq0Var.getMeasuredHeight() - AndroidUtilities.dp(48.0f))));
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f22992a) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrShareInChats", this.f22993b.U.m(), new Object[0]));
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
        switch (this.f22992a) {
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
        switch (this.f22992a) {
            case 0:
                super.setVisibility(i10);
                if (i10 != 0) {
                    this.f22993b.S[1].setTranslationY(0.0f);
                    return;
                }
                return;
            default:
                super.setVisibility(i10);
                return;
        }
    }
}
