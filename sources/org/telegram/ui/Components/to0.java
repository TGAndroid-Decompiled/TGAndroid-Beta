package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;
public final class to0 extends FrameLayout {
    public final int f30685a;
    public final pp0 f30686b;

    public to0(pp0 pp0Var, Context context, int i10) {
        super(context);
        this.f30685a = i10;
        this.f30686b = pp0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f30685a) {
            case 0:
                pp0 pp0Var = this.f30686b;
                pp0Var.O2.setBounds(0, (int) pp0Var.f29483m2, getMeasuredWidth(), getMeasuredHeight());
                pp0Var.O2.draw(canvas);
                canvas.save();
                canvas.clipRect(0.0f, pp0Var.f29483m2, getMeasuredWidth(), getMeasuredHeight());
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
        switch (this.f30685a) {
            case 0:
                pp0 pp0Var = this.f30686b;
                to0 to0Var = pp0Var.f29477j1;
                float f7 = pp0Var.f29485n2;
                if (f7 != 0.0f && f7 != to0Var.getTop() + pp0Var.f29485n2) {
                    ValueAnimator valueAnimator = pp0Var.f29487o2;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    float top = pp0Var.f29485n2 - (to0Var.getTop() + pp0Var.f29483m2);
                    pp0Var.f29483m2 = top;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(top, 0.0f);
                    pp0Var.f29487o2 = ofFloat;
                    ofFloat.addUpdateListener(new r60(this, 17));
                    pp0Var.f29487o2.setInterpolator(gr.f26523f);
                    pp0Var.f29487o2.setDuration(200L);
                    pp0Var.f29487o2.start();
                    pp0Var.f29485n2 = 0.0f;
                }
                pp0Var.K1[1].setTranslationY((-(to0Var.getMeasuredHeight() - org.telegram.messenger.i0.L(48.0f))) + pp0Var.f29483m2 + pp0Var.f29481l2 + ((1.0f - getAlpha()) * (to0Var.getMeasuredHeight() - org.telegram.messenger.i0.L(48.0f))));
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f30685a) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(org.telegram.messenger.dd.G(this.f30686b.M1.m(), "AccDescrShareInChats", new Object[0]));
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
        switch (this.f30685a) {
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
        switch (this.f30685a) {
            case 0:
                super.setVisibility(i10);
                if (i10 != 0) {
                    this.f30686b.K1[1].setTranslationY(0.0f);
                    return;
                }
                return;
            default:
                super.setVisibility(i10);
                return;
        }
    }
}
