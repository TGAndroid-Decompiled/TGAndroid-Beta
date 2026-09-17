package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class mp0 extends FrameLayout {
    public final int f26237a;
    public final iq0 f26238b;

    public mp0(iq0 iq0Var, Context context, int i10) {
        super(context);
        this.f26237a = i10;
        this.f26238b = iq0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f26237a) {
            case 0:
                iq0 iq0Var = this.f26238b;
                iq0Var.X0.setBounds(0, (int) iq0Var.f25009u0, getMeasuredWidth(), getMeasuredHeight());
                iq0Var.X0.draw(canvas);
                canvas.save();
                canvas.clipRect(0.0f, iq0Var.f25009u0, getMeasuredWidth(), getMeasuredHeight());
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
        switch (this.f26237a) {
            case 0:
                iq0 iq0Var = this.f26238b;
                mp0 mp0Var = iq0Var.f24987c;
                float f7 = iq0Var.f25010v0;
                if (f7 != 0.0f && f7 != mp0Var.getTop() + iq0Var.f25010v0) {
                    ValueAnimator valueAnimator = iq0Var.f25012w0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    float top = iq0Var.f25010v0 - (mp0Var.getTop() + iq0Var.f25009u0);
                    iq0Var.f25009u0 = top;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(top, 0.0f);
                    iq0Var.f25012w0 = ofFloat;
                    ofFloat.addUpdateListener(new h70(this, 17));
                    iq0Var.f25012w0.setInterpolator(qr.f27380f);
                    iq0Var.f25012w0.setDuration(200L);
                    iq0Var.f25012w0.start();
                    iq0Var.f25010v0 = 0.0f;
                }
                iq0Var.S[1].setTranslationY((-(mp0Var.getMeasuredHeight() - AndroidUtilities.dp(48.0f))) + iq0Var.f25009u0 + iq0Var.f25008t0 + ((1.0f - getAlpha()) * (mp0Var.getMeasuredHeight() - AndroidUtilities.dp(48.0f))));
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f26237a) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrShareInChats", this.f26238b.U.m(), new Object[0]));
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
        switch (this.f26237a) {
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
        switch (this.f26237a) {
            case 0:
                super.setVisibility(i10);
                if (i10 != 0) {
                    this.f26238b.S[1].setTranslationY(0.0f);
                    return;
                }
                return;
            default:
                super.setVisibility(i10);
                return;
        }
    }
}
