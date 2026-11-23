package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class jv extends kl0 {
    public long h;
    public boolean f36521n;
    public float f36522r;
    public final lv f36523s;

    public jv(lv lvVar, Context context) {
        super(context);
        float f10;
        this.f36523s = lvVar;
        boolean z10 = lvVar.f37236n;
        this.f36521n = z10;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.f36522r = f10;
        setSmoothScrollingEnabled(true);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setNestedScrollingEnabled(true);
        org.telegram.ui.b61 b61Var = new org.telegram.ui.b61(12, context, this);
        this.f36804b = b61Var;
        b61Var.setOrientation(0);
        addView(this.f36804b, new FrameLayout.LayoutParams(-2, -1));
        for (int i7 = 0; i7 < 8; i7++) {
            int i10 = lv.f37229f0[i7];
            iv ivVar = new iv(this, context, lv.f37230g0[i7]);
            ivVar.setContentDescription(lv.f(i7));
            this.f36804b.addView(ivVar);
        }
    }

    public final void d(MotionEvent motionEvent) {
        if (this.f36521n && !this.d) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        return;
                    }
                } else {
                    this.f36803a = false;
                    return;
                }
            }
            this.f36803a = true;
            if (!this.d) {
                this.f36806e = -1;
            }
            this.f36523s.requestDisallowInterceptTouchEvent(true);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.W1(this.f36522r, org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(Math.min(5.7f, this.f36804b.getChildCount()) * 32.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(30.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
