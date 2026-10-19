package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class hq0 extends FrameLayout {
    public final int f26910a;
    public final er0 f26911b;

    public hq0(er0 er0Var, Context context, int i10) {
        super(context);
        this.f26910a = i10;
        this.f26911b = er0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f26910a) {
            case 0:
                er0 er0Var = this.f26911b;
                er0Var.Y0.setBounds(0, (int) er0Var.f26004v0, getMeasuredWidth(), getMeasuredHeight());
                er0Var.Y0.draw(canvas);
                canvas.save();
                canvas.clipRect(0.0f, er0Var.f26004v0, getMeasuredWidth(), getMeasuredHeight());
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
        switch (this.f26910a) {
            case 0:
                er0 er0Var = this.f26911b;
                hq0 hq0Var = er0Var.f25981c;
                float f7 = er0Var.f26006w0;
                if (f7 != 0.0f && f7 != hq0Var.getTop() + er0Var.f26006w0) {
                    ValueAnimator valueAnimator = er0Var.f26008x0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    float top = er0Var.f26006w0 - (hq0Var.getTop() + er0Var.f26004v0);
                    er0Var.f26004v0 = top;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(top, 0.0f);
                    er0Var.f26008x0 = ofFloat;
                    ofFloat.addUpdateListener(new b80(this, 18));
                    er0Var.f26008x0.setInterpolator(bs.f25014f);
                    er0Var.f26008x0.setDuration(200L);
                    er0Var.f26008x0.start();
                    er0Var.f26006w0 = 0.0f;
                }
                er0Var.T[1].setTranslationY((-(hq0Var.getMeasuredHeight() - AndroidUtilities.dp(48.0f))) + er0Var.f26004v0 + er0Var.f26003u0 + ((1.0f - getAlpha()) * (hq0Var.getMeasuredHeight() - AndroidUtilities.dp(48.0f))));
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f26910a) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrShareInChats", this.f26911b.V.m(), new Object[0]));
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
        switch (this.f26910a) {
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
        switch (this.f26910a) {
            case 0:
                super.setVisibility(i10);
                if (i10 != 0) {
                    this.f26911b.T[1].setTranslationY(0.0f);
                    return;
                }
                return;
            default:
                super.setVisibility(i10);
                return;
        }
    }
}
