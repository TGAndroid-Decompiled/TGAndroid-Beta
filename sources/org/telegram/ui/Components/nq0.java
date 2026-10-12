package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class nq0 extends FrameLayout {
    public final int f27697a;
    public final jr0 f27698b;

    public nq0(jr0 jr0Var, Context context, int i10) {
        super(context);
        this.f27697a = i10;
        this.f27698b = jr0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f27697a) {
            case 0:
                jr0 jr0Var = this.f27698b;
                jr0Var.X0.setBounds(0, (int) jr0Var.f26482u0, getMeasuredWidth(), getMeasuredHeight());
                jr0Var.X0.draw(canvas);
                canvas.save();
                canvas.clipRect(0.0f, jr0Var.f26482u0, getMeasuredWidth(), getMeasuredHeight());
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
        switch (this.f27697a) {
            case 0:
                jr0 jr0Var = this.f27698b;
                nq0 nq0Var = jr0Var.f26460c;
                float f7 = jr0Var.f26483v0;
                if (f7 != 0.0f && f7 != nq0Var.getTop() + jr0Var.f26483v0) {
                    ValueAnimator valueAnimator = jr0Var.f26485w0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    float top = jr0Var.f26483v0 - (nq0Var.getTop() + jr0Var.f26482u0);
                    jr0Var.f26482u0 = top;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(top, 0.0f);
                    jr0Var.f26485w0 = ofFloat;
                    ofFloat.addUpdateListener(new g80(this, 18));
                    jr0Var.f26485w0.setInterpolator(es.f24771f);
                    jr0Var.f26485w0.setDuration(200L);
                    jr0Var.f26485w0.start();
                    jr0Var.f26483v0 = 0.0f;
                }
                jr0Var.S[1].setTranslationY((-(nq0Var.getMeasuredHeight() - AndroidUtilities.dp(48.0f))) + jr0Var.f26482u0 + jr0Var.f26481t0 + ((1.0f - getAlpha()) * (nq0Var.getMeasuredHeight() - AndroidUtilities.dp(48.0f))));
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f27697a) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrShareInChats", this.f27698b.U.m(), new Object[0]));
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
        switch (this.f27697a) {
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
        switch (this.f27697a) {
            case 0:
                super.setVisibility(i10);
                if (i10 != 0) {
                    this.f27698b.S[1].setTranslationY(0.0f);
                    return;
                }
                return;
            default:
                super.setVisibility(i10);
                return;
        }
    }
}
