package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class rq0 extends FrameLayout {
    public final int f32323a;
    public final nr0 f32324b;

    public rq0(nr0 nr0Var, Context context, int i10) {
        super(context);
        this.f32323a = i10;
        this.f32324b = nr0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f32323a) {
            case 0:
                nr0 nr0Var = this.f32324b;
                nr0Var.X0.setBounds(0, (int) nr0Var.f31056v0, getMeasuredWidth(), getMeasuredHeight());
                nr0Var.X0.draw(canvas);
                canvas.save();
                canvas.clipRect(0.0f, nr0Var.f31056v0, getMeasuredWidth(), getMeasuredHeight());
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
        switch (this.f32323a) {
            case 0:
                nr0 nr0Var = this.f32324b;
                rq0 rq0Var = nr0Var.f31033c;
                float f7 = nr0Var.f31058w0;
                if (f7 != 0.0f && f7 != rq0Var.getTop() + nr0Var.f31058w0) {
                    ValueAnimator valueAnimator = nr0Var.f31060x0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    float top = nr0Var.f31058w0 - (rq0Var.getTop() + nr0Var.f31056v0);
                    nr0Var.f31056v0 = top;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(top, 0.0f);
                    nr0Var.f31060x0 = ofFloat;
                    ofFloat.addUpdateListener(new f80(this, 18));
                    nr0Var.f31060x0.setInterpolator(ds.f27530f);
                    nr0Var.f31060x0.setDuration(200L);
                    nr0Var.f31060x0.start();
                    nr0Var.f31058w0 = 0.0f;
                }
                nr0Var.T[1].setTranslationY((-(rq0Var.getMeasuredHeight() - AndroidUtilities.dp(48.0f))) + nr0Var.f31056v0 + nr0Var.f31055u0 + ((1.0f - getAlpha()) * (rq0Var.getMeasuredHeight() - AndroidUtilities.dp(48.0f))));
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f32323a) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrShareInChats", this.f32324b.V.m(), new Object[0]));
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
        switch (this.f32323a) {
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
        switch (this.f32323a) {
            case 0:
                super.setVisibility(i10);
                if (i10 != 0) {
                    this.f32324b.T[1].setTranslationY(0.0f);
                    return;
                }
                return;
            default:
                super.setVisibility(i10);
                return;
        }
    }
}
