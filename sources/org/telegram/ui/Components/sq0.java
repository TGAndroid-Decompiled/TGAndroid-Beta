package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class sq0 extends FrameLayout {
    public final int f30844a;
    public final or0 f30845b;

    public sq0(or0 or0Var, Context context, int i10) {
        super(context);
        this.f30844a = i10;
        this.f30845b = or0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f30844a) {
            case 0:
                or0 or0Var = this.f30845b;
                or0Var.X0.setBounds(0, (int) or0Var.f29501u0, getMeasuredWidth(), getMeasuredHeight());
                or0Var.X0.draw(canvas);
                canvas.save();
                canvas.clipRect(0.0f, or0Var.f29501u0, getMeasuredWidth(), getMeasuredHeight());
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
        switch (this.f30844a) {
            case 0:
                or0 or0Var = this.f30845b;
                sq0 sq0Var = or0Var.f29478c;
                float f7 = or0Var.f29502v0;
                if (f7 != 0.0f && f7 != sq0Var.getTop() + or0Var.f29502v0) {
                    ValueAnimator valueAnimator = or0Var.f29504w0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    float top = or0Var.f29502v0 - (sq0Var.getTop() + or0Var.f29501u0);
                    or0Var.f29501u0 = top;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(top, 0.0f);
                    or0Var.f29504w0 = ofFloat;
                    ofFloat.addUpdateListener(new k80(this, 18));
                    or0Var.f29504w0.setInterpolator(is.f27451f);
                    or0Var.f29504w0.setDuration(200L);
                    or0Var.f29504w0.start();
                    or0Var.f29502v0 = 0.0f;
                }
                or0Var.S[1].setTranslationY((-(sq0Var.getMeasuredHeight() - AndroidUtilities.dp(48.0f))) + or0Var.f29501u0 + or0Var.f29500t0 + ((1.0f - getAlpha()) * (sq0Var.getMeasuredHeight() - AndroidUtilities.dp(48.0f))));
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f30844a) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrShareInChats", this.f30845b.U.m(), new Object[0]));
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
        switch (this.f30844a) {
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
        switch (this.f30844a) {
            case 0:
                super.setVisibility(i10);
                if (i10 != 0) {
                    this.f30845b.S[1].setTranslationY(0.0f);
                    return;
                }
                return;
            default:
                super.setVisibility(i10);
                return;
        }
    }
}
