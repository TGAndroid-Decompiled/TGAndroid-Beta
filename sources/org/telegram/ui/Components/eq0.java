package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class eq0 extends FrameLayout {
    public final int f26199a;
    public final br0 f26200b;

    public eq0(br0 br0Var, Context context, int i10) {
        super(context);
        this.f26199a = i10;
        this.f26200b = br0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f26199a) {
            case 0:
                br0 br0Var = this.f26200b;
                br0Var.V0.setBounds(0, (int) br0Var.f25077u0, getMeasuredWidth(), getMeasuredHeight());
                br0Var.V0.draw(canvas);
                canvas.save();
                canvas.clipRect(0.0f, br0Var.f25077u0, getMeasuredWidth(), getMeasuredHeight());
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
        switch (this.f26199a) {
            case 0:
                br0 br0Var = this.f26200b;
                eq0 eq0Var = br0Var.f25054c;
                float f7 = br0Var.f25078v0;
                if (f7 != 0.0f && f7 != eq0Var.getTop() + br0Var.f25078v0) {
                    ValueAnimator valueAnimator = br0Var.f25080w0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    float top = br0Var.f25078v0 - (eq0Var.getTop() + br0Var.f25077u0);
                    br0Var.f25077u0 = top;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(top, 0.0f);
                    br0Var.f25080w0 = ofFloat;
                    ofFloat.addUpdateListener(new v70(this, 17));
                    br0Var.f25080w0.setInterpolator(tr.f31215f);
                    br0Var.f25080w0.setDuration(200L);
                    br0Var.f25080w0.start();
                    br0Var.f25078v0 = 0.0f;
                }
                br0Var.S[1].setTranslationY((-(eq0Var.getMeasuredHeight() - AndroidUtilities.dp(48.0f))) + br0Var.f25077u0 + br0Var.f25076t0 + ((1.0f - getAlpha()) * (eq0Var.getMeasuredHeight() - AndroidUtilities.dp(48.0f))));
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f26199a) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrShareInChats", this.f26200b.U.m(), new Object[0]));
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
        switch (this.f26199a) {
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
        switch (this.f26199a) {
            case 0:
                super.setVisibility(i10);
                if (i10 != 0) {
                    this.f26200b.S[1].setTranslationY(0.0f);
                    return;
                }
                return;
            default:
                super.setVisibility(i10);
                return;
        }
    }
}
