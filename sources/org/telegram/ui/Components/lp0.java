package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class lp0 extends FrameLayout {
    public final int f28300a;
    public final hq0 f28301b;

    public lp0(hq0 hq0Var, Context context, int i10) {
        super(context);
        this.f28300a = i10;
        this.f28301b = hq0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f28300a) {
            case 0:
                hq0 hq0Var = this.f28301b;
                hq0Var.X0.setBounds(0, (int) hq0Var.f26840u0, getMeasuredWidth(), getMeasuredHeight());
                hq0Var.X0.draw(canvas);
                canvas.save();
                canvas.clipRect(0.0f, hq0Var.f26840u0, getMeasuredWidth(), getMeasuredHeight());
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
        switch (this.f28300a) {
            case 0:
                hq0 hq0Var = this.f28301b;
                lp0 lp0Var = hq0Var.f26817c;
                float f7 = hq0Var.f26841v0;
                if (f7 != 0.0f && f7 != lp0Var.getTop() + hq0Var.f26841v0) {
                    ValueAnimator valueAnimator = hq0Var.f26843w0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    float top = hq0Var.f26841v0 - (lp0Var.getTop() + hq0Var.f26840u0);
                    hq0Var.f26840u0 = top;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(top, 0.0f);
                    hq0Var.f26843w0 = ofFloat;
                    ofFloat.addUpdateListener(new h70(this, 17));
                    hq0Var.f26843w0.setInterpolator(pr.f29493f);
                    hq0Var.f26843w0.setDuration(200L);
                    hq0Var.f26843w0.start();
                    hq0Var.f26841v0 = 0.0f;
                }
                hq0Var.S[1].setTranslationY((-(lp0Var.getMeasuredHeight() - AndroidUtilities.dp(48.0f))) + hq0Var.f26840u0 + hq0Var.f26839t0 + ((1.0f - getAlpha()) * (lp0Var.getMeasuredHeight() - AndroidUtilities.dp(48.0f))));
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f28300a) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrShareInChats", this.f28301b.U.m(), new Object[0]));
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
        switch (this.f28300a) {
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
        switch (this.f28300a) {
            case 0:
                super.setVisibility(i10);
                if (i10 != 0) {
                    this.f28301b.S[1].setTranslationY(0.0f);
                    return;
                }
                return;
            default:
                super.setVisibility(i10);
                return;
        }
    }
}
