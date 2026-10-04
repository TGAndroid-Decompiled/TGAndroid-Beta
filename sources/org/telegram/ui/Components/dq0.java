package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class dq0 extends FrameLayout {
    public final int f25801a;
    public final zq0 f25802b;

    public dq0(zq0 zq0Var, Context context, int i10) {
        super(context);
        this.f25801a = i10;
        this.f25802b = zq0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f25801a) {
            case 0:
                zq0 zq0Var = this.f25802b;
                zq0Var.V0.setBounds(0, (int) zq0Var.f33622u0, getMeasuredWidth(), getMeasuredHeight());
                zq0Var.V0.draw(canvas);
                canvas.save();
                canvas.clipRect(0.0f, zq0Var.f33622u0, getMeasuredWidth(), getMeasuredHeight());
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
        switch (this.f25801a) {
            case 0:
                zq0 zq0Var = this.f25802b;
                dq0 dq0Var = zq0Var.f33599c;
                float f7 = zq0Var.f33623v0;
                if (f7 != 0.0f && f7 != dq0Var.getTop() + zq0Var.f33623v0) {
                    ValueAnimator valueAnimator = zq0Var.f33625w0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    float top = zq0Var.f33623v0 - (dq0Var.getTop() + zq0Var.f33622u0);
                    zq0Var.f33622u0 = top;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(top, 0.0f);
                    zq0Var.f33625w0 = ofFloat;
                    ofFloat.addUpdateListener(new v70(this, 17));
                    zq0Var.f33625w0.setInterpolator(tr.f31141f);
                    zq0Var.f33625w0.setDuration(200L);
                    zq0Var.f33625w0.start();
                    zq0Var.f33623v0 = 0.0f;
                }
                zq0Var.S[1].setTranslationY((-(dq0Var.getMeasuredHeight() - AndroidUtilities.dp(48.0f))) + zq0Var.f33622u0 + zq0Var.f33621t0 + ((1.0f - getAlpha()) * (dq0Var.getMeasuredHeight() - AndroidUtilities.dp(48.0f))));
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f25801a) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrShareInChats", this.f25802b.U.m(), new Object[0]));
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
        switch (this.f25801a) {
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
        switch (this.f25801a) {
            case 0:
                super.setVisibility(i10);
                if (i10 != 0) {
                    this.f25802b.S[1].setTranslationY(0.0f);
                    return;
                }
                return;
            default:
                super.setVisibility(i10);
                return;
        }
    }
}
