package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class qq0 extends FrameLayout {
    public final int f31999a;
    public final mr0 f32000b;

    public qq0(mr0 mr0Var, Context context, int i10) {
        super(context);
        this.f31999a = i10;
        this.f32000b = mr0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f31999a) {
            case 0:
                mr0 mr0Var = this.f32000b;
                mr0Var.X0.setBounds(0, (int) mr0Var.f30723v0, getMeasuredWidth(), getMeasuredHeight());
                mr0Var.X0.draw(canvas);
                canvas.save();
                canvas.clipRect(0.0f, mr0Var.f30723v0, getMeasuredWidth(), getMeasuredHeight());
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
        switch (this.f31999a) {
            case 0:
                mr0 mr0Var = this.f32000b;
                qq0 qq0Var = mr0Var.f30700c;
                float f7 = mr0Var.f30725w0;
                if (f7 != 0.0f && f7 != qq0Var.getTop() + mr0Var.f30725w0) {
                    ValueAnimator valueAnimator = mr0Var.f30727x0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    float top = mr0Var.f30725w0 - (qq0Var.getTop() + mr0Var.f30723v0);
                    mr0Var.f30723v0 = top;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(top, 0.0f);
                    mr0Var.f30727x0 = ofFloat;
                    ofFloat.addUpdateListener(new e80(this, 18));
                    mr0Var.f30727x0.setInterpolator(ds.f27584f);
                    mr0Var.f30727x0.setDuration(200L);
                    mr0Var.f30727x0.start();
                    mr0Var.f30725w0 = 0.0f;
                }
                mr0Var.T[1].setTranslationY((-(qq0Var.getMeasuredHeight() - AndroidUtilities.dp(48.0f))) + mr0Var.f30723v0 + mr0Var.f30722u0 + ((1.0f - getAlpha()) * (qq0Var.getMeasuredHeight() - AndroidUtilities.dp(48.0f))));
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f31999a) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrShareInChats", this.f32000b.V.m(), new Object[0]));
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
        switch (this.f31999a) {
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
        switch (this.f31999a) {
            case 0:
                super.setVisibility(i10);
                if (i10 != 0) {
                    this.f32000b.T[1].setTranslationY(0.0f);
                    return;
                }
                return;
            default:
                super.setVisibility(i10);
                return;
        }
    }
}
