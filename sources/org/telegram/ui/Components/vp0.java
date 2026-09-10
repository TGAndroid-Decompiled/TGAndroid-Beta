package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class vp0 extends FrameLayout {
    public final int f28571a;
    public final sq0 f28572b;

    public vp0(sq0 sq0Var, Context context, int i10) {
        super(context);
        this.f28571a = i10;
        this.f28572b = sq0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f28571a) {
            case 0:
                sq0 sq0Var = this.f28572b;
                sq0Var.X0.setBounds(0, (int) sq0Var.f27191u0, getMeasuredWidth(), getMeasuredHeight());
                sq0Var.X0.draw(canvas);
                canvas.save();
                canvas.clipRect(0.0f, sq0Var.f27191u0, getMeasuredWidth(), getMeasuredHeight());
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
        switch (this.f28571a) {
            case 0:
                sq0 sq0Var = this.f28572b;
                vp0 vp0Var = sq0Var.f27169c;
                float f7 = sq0Var.f27192v0;
                if (f7 != 0.0f && f7 != vp0Var.getTop() + sq0Var.f27192v0) {
                    ValueAnimator valueAnimator = sq0Var.f27194w0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    float top = sq0Var.f27192v0 - (vp0Var.getTop() + sq0Var.f27191u0);
                    sq0Var.f27191u0 = top;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(top, 0.0f);
                    sq0Var.f27194w0 = ofFloat;
                    ofFloat.addUpdateListener(new q70(this, 17));
                    sq0Var.f27194w0.setInterpolator(wr.f28819f);
                    sq0Var.f27194w0.setDuration(200L);
                    sq0Var.f27194w0.start();
                    sq0Var.f27192v0 = 0.0f;
                }
                sq0Var.S[1].setTranslationY((-(vp0Var.getMeasuredHeight() - AndroidUtilities.dp(48.0f))) + sq0Var.f27191u0 + sq0Var.f27190t0 + ((1.0f - getAlpha()) * (vp0Var.getMeasuredHeight() - AndroidUtilities.dp(48.0f))));
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f28571a) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrShareInChats", this.f28572b.U.m(), new Object[0]));
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
        switch (this.f28571a) {
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
        switch (this.f28571a) {
            case 0:
                super.setVisibility(i10);
                if (i10 != 0) {
                    this.f28572b.S[1].setTranslationY(0.0f);
                    return;
                }
                return;
            default:
                super.setVisibility(i10);
                return;
        }
    }
}
