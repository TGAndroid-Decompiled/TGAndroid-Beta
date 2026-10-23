package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class mq0 extends FrameLayout {
    public final int f28746a;
    public final ir0 f28747b;

    public mq0(ir0 ir0Var, Context context, int i10) {
        super(context);
        this.f28746a = i10;
        this.f28747b = ir0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f28746a) {
            case 0:
                ir0 ir0Var = this.f28747b;
                ir0Var.Z0.setBounds(0, (int) ir0Var.f27435v0, getMeasuredWidth(), getMeasuredHeight());
                ir0Var.Z0.draw(canvas);
                canvas.save();
                canvas.clipRect(0.0f, ir0Var.f27435v0, getMeasuredWidth(), getMeasuredHeight());
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
        switch (this.f28746a) {
            case 0:
                ir0 ir0Var = this.f28747b;
                mq0 mq0Var = ir0Var.f27411c;
                float f7 = ir0Var.f27437w0;
                if (f7 != 0.0f && f7 != mq0Var.getTop() + ir0Var.f27437w0) {
                    ValueAnimator valueAnimator = ir0Var.f27439x0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    float top = ir0Var.f27437w0 - (mq0Var.getTop() + ir0Var.f27435v0);
                    ir0Var.f27435v0 = top;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(top, 0.0f);
                    ir0Var.f27439x0 = ofFloat;
                    ofFloat.addUpdateListener(new d80(this, 18));
                    ir0Var.f27439x0.setInterpolator(bs.f25133f);
                    ir0Var.f27439x0.setDuration(200L);
                    ir0Var.f27439x0.start();
                    ir0Var.f27437w0 = 0.0f;
                }
                ir0Var.T[1].setTranslationY((-(mq0Var.getMeasuredHeight() - AndroidUtilities.dp(48.0f))) + ir0Var.f27435v0 + ir0Var.f27434u0 + ((1.0f - getAlpha()) * (mq0Var.getMeasuredHeight() - AndroidUtilities.dp(48.0f))));
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f28746a) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrShareInChats", this.f28747b.V.m(), new Object[0]));
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
        switch (this.f28746a) {
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
        switch (this.f28746a) {
            case 0:
                super.setVisibility(i10);
                if (i10 != 0) {
                    this.f28747b.T[1].setTranslationY(0.0f);
                    return;
                }
                return;
            default:
                super.setVisibility(i10);
                return;
        }
    }
}
