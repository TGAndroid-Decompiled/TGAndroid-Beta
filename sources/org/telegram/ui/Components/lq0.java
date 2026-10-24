package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class lq0 extends FrameLayout {
    public final int f28431a;
    public final hr0 f28432b;

    public lq0(hr0 hr0Var, Context context, int i10) {
        super(context);
        this.f28431a = i10;
        this.f28432b = hr0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f28431a) {
            case 0:
                hr0 hr0Var = this.f28432b;
                hr0Var.Z0.setBounds(0, (int) hr0Var.f27147v0, getMeasuredWidth(), getMeasuredHeight());
                hr0Var.Z0.draw(canvas);
                canvas.save();
                canvas.clipRect(0.0f, hr0Var.f27147v0, getMeasuredWidth(), getMeasuredHeight());
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
        switch (this.f28431a) {
            case 0:
                hr0 hr0Var = this.f28432b;
                lq0 lq0Var = hr0Var.f27123c;
                float f7 = hr0Var.f27149w0;
                if (f7 != 0.0f && f7 != lq0Var.getTop() + hr0Var.f27149w0) {
                    ValueAnimator valueAnimator = hr0Var.f27151x0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    float top = hr0Var.f27149w0 - (lq0Var.getTop() + hr0Var.f27147v0);
                    hr0Var.f27147v0 = top;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(top, 0.0f);
                    hr0Var.f27151x0 = ofFloat;
                    ofFloat.addUpdateListener(new b80(this, 18));
                    hr0Var.f27151x0.setInterpolator(zr.f33337f);
                    hr0Var.f27151x0.setDuration(200L);
                    hr0Var.f27151x0.start();
                    hr0Var.f27149w0 = 0.0f;
                }
                hr0Var.T[1].setTranslationY((-(lq0Var.getMeasuredHeight() - AndroidUtilities.dp(48.0f))) + hr0Var.f27147v0 + hr0Var.f27146u0 + ((1.0f - getAlpha()) * (lq0Var.getMeasuredHeight() - AndroidUtilities.dp(48.0f))));
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f28431a) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrShareInChats", this.f28432b.V.m(), new Object[0]));
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
        switch (this.f28431a) {
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
        switch (this.f28431a) {
            case 0:
                super.setVisibility(i10);
                if (i10 != 0) {
                    this.f28432b.T[1].setTranslationY(0.0f);
                    return;
                }
                return;
            default:
                super.setVisibility(i10);
                return;
        }
    }
}
