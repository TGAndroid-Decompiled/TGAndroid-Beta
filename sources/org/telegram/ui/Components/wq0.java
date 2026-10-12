package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class wq0 extends FrameLayout {
    public final int f32534a;
    public final sr0 f32535b;

    public wq0(sr0 sr0Var, Context context, int i10) {
        super(context);
        this.f32534a = i10;
        this.f32535b = sr0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f32534a) {
            case 0:
                sr0 sr0Var = this.f32535b;
                sr0Var.X0.setBounds(0, (int) sr0Var.f30656u0, getMeasuredWidth(), getMeasuredHeight());
                sr0Var.X0.draw(canvas);
                canvas.save();
                canvas.clipRect(0.0f, sr0Var.f30656u0, getMeasuredWidth(), getMeasuredHeight());
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
        switch (this.f32534a) {
            case 0:
                sr0 sr0Var = this.f32535b;
                wq0 wq0Var = sr0Var.f30633c;
                float f7 = sr0Var.f30657v0;
                if (f7 != 0.0f && f7 != wq0Var.getTop() + sr0Var.f30657v0) {
                    ValueAnimator valueAnimator = sr0Var.f30659w0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    float top = sr0Var.f30657v0 - (wq0Var.getTop() + sr0Var.f30656u0);
                    sr0Var.f30656u0 = top;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(top, 0.0f);
                    sr0Var.f30659w0 = ofFloat;
                    ofFloat.addUpdateListener(new m80(this, 18));
                    sr0Var.f30659w0.setInterpolator(js.f27627f);
                    sr0Var.f30659w0.setDuration(200L);
                    sr0Var.f30659w0.start();
                    sr0Var.f30657v0 = 0.0f;
                }
                sr0Var.S[1].setTranslationY((-(wq0Var.getMeasuredHeight() - AndroidUtilities.dp(48.0f))) + sr0Var.f30656u0 + sr0Var.f30655t0 + ((1.0f - getAlpha()) * (wq0Var.getMeasuredHeight() - AndroidUtilities.dp(48.0f))));
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f32534a) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrShareInChats", this.f32535b.U.m(), new Object[0]));
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
        switch (this.f32534a) {
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
        switch (this.f32534a) {
            case 0:
                super.setVisibility(i10);
                if (i10 != 0) {
                    this.f32535b.S[1].setTranslationY(0.0f);
                    return;
                }
                return;
            default:
                super.setVisibility(i10);
                return;
        }
    }
}
