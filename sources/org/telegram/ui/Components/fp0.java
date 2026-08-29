package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class fp0 extends FrameLayout {
    public final int f28516a;
    public final dq0 f28517b;

    public fp0(dq0 dq0Var, Context context, int i10) {
        super(context);
        this.f28516a = i10;
        this.f28517b = dq0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f28516a) {
            case 0:
                dq0 dq0Var = this.f28517b;
                dq0Var.T0.setBounds(0, (int) dq0Var.f27847q0, getMeasuredWidth(), getMeasuredHeight());
                dq0Var.T0.draw(canvas);
                canvas.save();
                canvas.clipRect(0.0f, dq0Var.f27847q0, getMeasuredWidth(), getMeasuredHeight());
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
        switch (this.f28516a) {
            case 0:
                dq0 dq0Var = this.f28517b;
                fp0 fp0Var = dq0Var.f27830c;
                float f9 = dq0Var.f27849r0;
                if (f9 != 0.0f && f9 != fp0Var.getTop() + dq0Var.f27849r0) {
                    ValueAnimator valueAnimator = dq0Var.f27851s0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    float top = dq0Var.f27849r0 - (fp0Var.getTop() + dq0Var.f27847q0);
                    dq0Var.f27847q0 = top;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(top, 0.0f);
                    dq0Var.f27851s0 = ofFloat;
                    ofFloat.addUpdateListener(new d70(this, 17));
                    dq0Var.f27851s0.setInterpolator(jr.f29800f);
                    dq0Var.f27851s0.setDuration(200L);
                    dq0Var.f27851s0.start();
                    dq0Var.f27849r0 = 0.0f;
                }
                dq0Var.O[1].setTranslationY((-(fp0Var.getMeasuredHeight() - AndroidUtilities.dp(48.0f))) + dq0Var.f27847q0 + dq0Var.f27846p0 + ((1.0f - getAlpha()) * (fp0Var.getMeasuredHeight() - AndroidUtilities.dp(48.0f))));
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f28516a) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrShareInChats", this.f28517b.Q.m(), new Object[0]));
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
    public void setAlpha(float f9) {
        switch (this.f28516a) {
            case 0:
                super.setAlpha(f9);
                invalidate();
                return;
            default:
                super.setAlpha(f9);
                return;
        }
    }

    @Override
    public void setVisibility(int i10) {
        switch (this.f28516a) {
            case 0:
                super.setVisibility(i10);
                if (i10 != 0) {
                    this.f28517b.O[1].setTranslationY(0.0f);
                    return;
                }
                return;
            default:
                super.setVisibility(i10);
                return;
        }
    }
}
