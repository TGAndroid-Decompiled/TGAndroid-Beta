package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class pp0 extends FrameLayout {
    public final int f30163a;
    public final mq0 f30164b;

    public pp0(mq0 mq0Var, Context context, int i10) {
        super(context);
        this.f30163a = i10;
        this.f30164b = mq0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f30163a) {
            case 0:
                mq0 mq0Var = this.f30164b;
                mq0Var.U0.setBounds(0, (int) mq0Var.f29218r0, getMeasuredWidth(), getMeasuredHeight());
                mq0Var.U0.draw(canvas);
                canvas.save();
                canvas.clipRect(0.0f, mq0Var.f29218r0, getMeasuredWidth(), getMeasuredHeight());
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
        switch (this.f30163a) {
            case 0:
                mq0 mq0Var = this.f30164b;
                pp0 pp0Var = mq0Var.f29199c;
                float f10 = mq0Var.f29220s0;
                if (f10 != 0.0f && f10 != pp0Var.getTop() + mq0Var.f29220s0) {
                    ValueAnimator valueAnimator = mq0Var.f29221t0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    float top = mq0Var.f29220s0 - (pp0Var.getTop() + mq0Var.f29218r0);
                    mq0Var.f29218r0 = top;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(top, 0.0f);
                    mq0Var.f29221t0 = ofFloat;
                    ofFloat.addUpdateListener(new k70(this, 17));
                    mq0Var.f29221t0.setInterpolator(pr.f30183f);
                    mq0Var.f29221t0.setDuration(200L);
                    mq0Var.f29221t0.start();
                    mq0Var.f29220s0 = 0.0f;
                }
                mq0Var.P[1].setTranslationY((-(pp0Var.getMeasuredHeight() - AndroidUtilities.dp(48.0f))) + mq0Var.f29218r0 + mq0Var.f29216q0 + ((1.0f - getAlpha()) * (pp0Var.getMeasuredHeight() - AndroidUtilities.dp(48.0f))));
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f30163a) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrShareInChats", this.f30164b.R.m(), new Object[0]));
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
    public void setAlpha(float f10) {
        switch (this.f30163a) {
            case 0:
                super.setAlpha(f10);
                invalidate();
                return;
            default:
                super.setAlpha(f10);
                return;
        }
    }

    @Override
    public void setVisibility(int i10) {
        switch (this.f30163a) {
            case 0:
                super.setVisibility(i10);
                if (i10 != 0) {
                    this.f30164b.P[1].setTranslationY(0.0f);
                    return;
                }
                return;
            default:
                super.setVisibility(i10);
                return;
        }
    }
}
