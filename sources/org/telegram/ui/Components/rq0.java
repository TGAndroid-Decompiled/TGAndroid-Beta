package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class rq0 extends FrameLayout {
    public final int f30549a;
    public final nr0 f30550b;

    public rq0(nr0 nr0Var, Context context, int i10) {
        super(context);
        this.f30549a = i10;
        this.f30550b = nr0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f30549a) {
            case 0:
                nr0 nr0Var = this.f30550b;
                nr0Var.X0.setBounds(0, (int) nr0Var.f29216u0, getMeasuredWidth(), getMeasuredHeight());
                nr0Var.X0.draw(canvas);
                canvas.save();
                canvas.clipRect(0.0f, nr0Var.f29216u0, getMeasuredWidth(), getMeasuredHeight());
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
        switch (this.f30549a) {
            case 0:
                nr0 nr0Var = this.f30550b;
                rq0 rq0Var = nr0Var.f29193c;
                float f7 = nr0Var.f29217v0;
                if (f7 != 0.0f && f7 != rq0Var.getTop() + nr0Var.f29217v0) {
                    ValueAnimator valueAnimator = nr0Var.f29219w0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    float top = nr0Var.f29217v0 - (rq0Var.getTop() + nr0Var.f29216u0);
                    nr0Var.f29216u0 = top;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(top, 0.0f);
                    nr0Var.f29219w0 = ofFloat;
                    ofFloat.addUpdateListener(new k80(this, 18));
                    nr0Var.f29219w0.setInterpolator(is.f27443f);
                    nr0Var.f29219w0.setDuration(200L);
                    nr0Var.f29219w0.start();
                    nr0Var.f29217v0 = 0.0f;
                }
                nr0Var.S[1].setTranslationY((-(rq0Var.getMeasuredHeight() - AndroidUtilities.dp(48.0f))) + nr0Var.f29216u0 + nr0Var.f29215t0 + ((1.0f - getAlpha()) * (rq0Var.getMeasuredHeight() - AndroidUtilities.dp(48.0f))));
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f30549a) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrShareInChats", this.f30550b.U.m(), new Object[0]));
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
        switch (this.f30549a) {
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
        switch (this.f30549a) {
            case 0:
                super.setVisibility(i10);
                if (i10 != 0) {
                    this.f30550b.S[1].setTranslationY(0.0f);
                    return;
                }
                return;
            default:
                super.setVisibility(i10);
                return;
        }
    }
}
