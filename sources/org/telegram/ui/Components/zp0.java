package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class zp0 extends FrameLayout {
    public final int f30937a;
    public final vq0 f30938b;

    public zp0(vq0 vq0Var, Context context, int i10) {
        super(context);
        this.f30937a = i10;
        this.f30938b = vq0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f30937a) {
            case 0:
                vq0 vq0Var = this.f30938b;
                vq0Var.X0.setBounds(0, (int) vq0Var.f29740u0, getMeasuredWidth(), getMeasuredHeight());
                vq0Var.X0.draw(canvas);
                canvas.save();
                canvas.clipRect(0.0f, vq0Var.f29740u0, getMeasuredWidth(), getMeasuredHeight());
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
        switch (this.f30937a) {
            case 0:
                vq0 vq0Var = this.f30938b;
                zp0 zp0Var = vq0Var.f29718c;
                float f7 = vq0Var.f29741v0;
                if (f7 != 0.0f && f7 != zp0Var.getTop() + vq0Var.f29741v0) {
                    ValueAnimator valueAnimator = vq0Var.f29743w0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    float top = vq0Var.f29741v0 - (zp0Var.getTop() + vq0Var.f29740u0);
                    vq0Var.f29740u0 = top;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(top, 0.0f);
                    vq0Var.f29743w0 = ofFloat;
                    ofFloat.addUpdateListener(new t70(this, 17));
                    vq0Var.f29743w0.setInterpolator(sr.f28339f);
                    vq0Var.f29743w0.setDuration(200L);
                    vq0Var.f29743w0.start();
                    vq0Var.f29741v0 = 0.0f;
                }
                vq0Var.S[1].setTranslationY((-(zp0Var.getMeasuredHeight() - AndroidUtilities.dp(48.0f))) + vq0Var.f29740u0 + vq0Var.f29739t0 + ((1.0f - getAlpha()) * (zp0Var.getMeasuredHeight() - AndroidUtilities.dp(48.0f))));
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f30937a) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrShareInChats", this.f30938b.U.m(), new Object[0]));
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
        switch (this.f30937a) {
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
        switch (this.f30937a) {
            case 0:
                super.setVisibility(i10);
                if (i10 != 0) {
                    this.f30938b.S[1].setTranslationY(0.0f);
                    return;
                }
                return;
            default:
                super.setVisibility(i10);
                return;
        }
    }
}
