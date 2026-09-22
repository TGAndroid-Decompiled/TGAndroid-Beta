package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class aq0 extends FrameLayout {
    public final int f22711a;
    public final wq0 f22712b;

    public aq0(wq0 wq0Var, Context context, int i10) {
        super(context);
        this.f22711a = i10;
        this.f22712b = wq0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f22711a) {
            case 0:
                wq0 wq0Var = this.f22712b;
                wq0Var.X0.setBounds(0, (int) wq0Var.f30122u0, getMeasuredWidth(), getMeasuredHeight());
                wq0Var.X0.draw(canvas);
                canvas.save();
                canvas.clipRect(0.0f, wq0Var.f30122u0, getMeasuredWidth(), getMeasuredHeight());
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
        switch (this.f22711a) {
            case 0:
                wq0 wq0Var = this.f22712b;
                aq0 aq0Var = wq0Var.f30100c;
                float f7 = wq0Var.f30123v0;
                if (f7 != 0.0f && f7 != aq0Var.getTop() + wq0Var.f30123v0) {
                    ValueAnimator valueAnimator = wq0Var.f30125w0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    float top = wq0Var.f30123v0 - (aq0Var.getTop() + wq0Var.f30122u0);
                    wq0Var.f30122u0 = top;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(top, 0.0f);
                    wq0Var.f30125w0 = ofFloat;
                    ofFloat.addUpdateListener(new s70(this, 17));
                    wq0Var.f30125w0.setInterpolator(qr.f27653f);
                    wq0Var.f30125w0.setDuration(200L);
                    wq0Var.f30125w0.start();
                    wq0Var.f30123v0 = 0.0f;
                }
                wq0Var.S[1].setTranslationY((-(aq0Var.getMeasuredHeight() - AndroidUtilities.dp(48.0f))) + wq0Var.f30122u0 + wq0Var.f30121t0 + ((1.0f - getAlpha()) * (aq0Var.getMeasuredHeight() - AndroidUtilities.dp(48.0f))));
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f22711a) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrShareInChats", this.f22712b.U.m(), new Object[0]));
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
        switch (this.f22711a) {
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
        switch (this.f22711a) {
            case 0:
                super.setVisibility(i10);
                if (i10 != 0) {
                    this.f22712b.S[1].setTranslationY(0.0f);
                    return;
                }
                return;
            default:
                super.setVisibility(i10);
                return;
        }
    }
}
