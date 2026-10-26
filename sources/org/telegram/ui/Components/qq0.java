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
    public final int f32001a;
    public final mr0 f32002b;

    public qq0(mr0 mr0Var, Context context, int i10) {
        super(context);
        this.f32001a = i10;
        this.f32002b = mr0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f32001a) {
            case 0:
                mr0 mr0Var = this.f32002b;
                mr0Var.X0.setBounds(0, (int) mr0Var.f30725v0, getMeasuredWidth(), getMeasuredHeight());
                mr0Var.X0.draw(canvas);
                canvas.save();
                canvas.clipRect(0.0f, mr0Var.f30725v0, getMeasuredWidth(), getMeasuredHeight());
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
        switch (this.f32001a) {
            case 0:
                mr0 mr0Var = this.f32002b;
                qq0 qq0Var = mr0Var.f30702c;
                float f7 = mr0Var.f30727w0;
                if (f7 != 0.0f && f7 != qq0Var.getTop() + mr0Var.f30727w0) {
                    ValueAnimator valueAnimator = mr0Var.f30729x0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    float top = mr0Var.f30727w0 - (qq0Var.getTop() + mr0Var.f30725v0);
                    mr0Var.f30725v0 = top;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(top, 0.0f);
                    mr0Var.f30729x0 = ofFloat;
                    ofFloat.addUpdateListener(new e80(this, 18));
                    mr0Var.f30729x0.setInterpolator(ds.f27586f);
                    mr0Var.f30729x0.setDuration(200L);
                    mr0Var.f30729x0.start();
                    mr0Var.f30727w0 = 0.0f;
                }
                mr0Var.T[1].setTranslationY((-(qq0Var.getMeasuredHeight() - AndroidUtilities.dp(48.0f))) + mr0Var.f30725v0 + mr0Var.f30724u0 + ((1.0f - getAlpha()) * (qq0Var.getMeasuredHeight() - AndroidUtilities.dp(48.0f))));
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f32001a) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrShareInChats", this.f32002b.V.m(), new Object[0]));
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
        switch (this.f32001a) {
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
        switch (this.f32001a) {
            case 0:
                super.setVisibility(i10);
                if (i10 != 0) {
                    this.f32002b.T[1].setTranslationY(0.0f);
                    return;
                }
                return;
            default:
                super.setVisibility(i10);
                return;
        }
    }
}
