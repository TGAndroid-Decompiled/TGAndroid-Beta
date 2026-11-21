package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class mv extends kl0 {
    public long h;
    public boolean f37648n;
    public float f37649r;
    public final ov f37650s;

    public mv(ov ovVar, Context context) {
        super(context);
        float f10;
        this.f37650s = ovVar;
        boolean z10 = ovVar.f38380n;
        this.f37648n = z10;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.f37649r = f10;
        setSmoothScrollingEnabled(true);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setNestedScrollingEnabled(true);
        org.telegram.ui.d61 d61Var = new org.telegram.ui.d61(12, context, this);
        this.f36926b = d61Var;
        d61Var.setOrientation(0);
        addView(this.f36926b, new FrameLayout.LayoutParams(-2, -1));
        for (int i7 = 0; i7 < 8; i7++) {
            int i10 = ov.f38373f0[i7];
            lv lvVar = new lv(this, context, ov.f38374g0[i7]);
            lvVar.setContentDescription(ov.f(i7));
            this.f36926b.addView(lvVar);
        }
    }

    public final void d(MotionEvent motionEvent) {
        if (this.f37648n && !this.d) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        return;
                    }
                } else {
                    this.f36925a = false;
                    return;
                }
            }
            this.f36925a = true;
            if (!this.d) {
                this.f36928e = -1;
            }
            this.f37650s.requestDisallowInterceptTouchEvent(true);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.W1(this.f37649r, org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(Math.min(5.7f, this.f36926b.getChildCount()) * 32.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(30.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
