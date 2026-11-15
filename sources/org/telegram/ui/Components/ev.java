package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class ev extends al0 {
    public long h;
    public boolean f34439n;
    public float f34440r;
    public final gv f34441s;

    public ev(gv gvVar, Context context) {
        super(context);
        float f10;
        this.f34441s = gvVar;
        boolean z10 = gvVar.f35068n;
        this.f34439n = z10;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.f34440r = f10;
        setSmoothScrollingEnabled(true);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setNestedScrollingEnabled(true);
        org.telegram.ui.z51 z51Var = new org.telegram.ui.z51(13, context, this);
        this.f33010b = z51Var;
        z51Var.setOrientation(0);
        addView(this.f33010b, new FrameLayout.LayoutParams(-2, -1));
        for (int i7 = 0; i7 < 8; i7++) {
            int i10 = gv.f35061f0[i7];
            dv dvVar = new dv(this, context, gv.f35062g0[i7]);
            dvVar.setContentDescription(gv.f(i7));
            this.f33010b.addView(dvVar);
        }
    }

    public final void d(MotionEvent motionEvent) {
        if (this.f34439n && !this.d) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        return;
                    }
                } else {
                    this.f33009a = false;
                    return;
                }
            }
            this.f33009a = true;
            if (!this.d) {
                this.f33012e = -1;
            }
            this.f34441s.requestDisallowInterceptTouchEvent(true);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.W1(this.f34440r, org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(Math.min(5.7f, this.f33010b.getChildCount()) * 32.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(30.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
