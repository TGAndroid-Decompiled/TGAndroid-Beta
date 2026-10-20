package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class iq0 extends FrameLayout {
    public final int f27310a;
    public final fr0 f27311b;

    public iq0(fr0 fr0Var, Context context, int i10) {
        super(context);
        this.f27310a = i10;
        this.f27311b = fr0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f27310a) {
            case 0:
                fr0 fr0Var = this.f27311b;
                fr0Var.Y0.setBounds(0, (int) fr0Var.f26390v0, getMeasuredWidth(), getMeasuredHeight());
                fr0Var.Y0.draw(canvas);
                canvas.save();
                canvas.clipRect(0.0f, fr0Var.f26390v0, getMeasuredWidth(), getMeasuredHeight());
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
        switch (this.f27310a) {
            case 0:
                fr0 fr0Var = this.f27311b;
                iq0 iq0Var = fr0Var.f26367c;
                float f7 = fr0Var.f26392w0;
                if (f7 != 0.0f && f7 != iq0Var.getTop() + fr0Var.f26392w0) {
                    ValueAnimator valueAnimator = fr0Var.f26394x0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    float top = fr0Var.f26392w0 - (iq0Var.getTop() + fr0Var.f26390v0);
                    fr0Var.f26390v0 = top;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(top, 0.0f);
                    fr0Var.f26394x0 = ofFloat;
                    ofFloat.addUpdateListener(new b80(this, 18));
                    fr0Var.f26394x0.setInterpolator(bs.f25021f);
                    fr0Var.f26394x0.setDuration(200L);
                    fr0Var.f26394x0.start();
                    fr0Var.f26392w0 = 0.0f;
                }
                fr0Var.T[1].setTranslationY((-(iq0Var.getMeasuredHeight() - AndroidUtilities.dp(48.0f))) + fr0Var.f26390v0 + fr0Var.f26389u0 + ((1.0f - getAlpha()) * (iq0Var.getMeasuredHeight() - AndroidUtilities.dp(48.0f))));
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f27310a) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrShareInChats", this.f27311b.V.m(), new Object[0]));
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
        switch (this.f27310a) {
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
        switch (this.f27310a) {
            case 0:
                super.setVisibility(i10);
                if (i10 != 0) {
                    this.f27311b.T[1].setTranslationY(0.0f);
                    return;
                }
                return;
            default:
                super.setVisibility(i10);
                return;
        }
    }
}
