package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class zu extends wk0 {
    public long h;
    public boolean f41138n;
    public float f41139r;
    public final bv f41140s;

    public zu(bv bvVar, Context context) {
        super(context);
        float f10;
        this.f41140s = bvVar;
        boolean z9 = bvVar.f32430n;
        this.f41138n = z9;
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.f41139r = f10;
        setSmoothScrollingEnabled(true);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setNestedScrollingEnabled(true);
        org.telegram.ui.d61 d61Var = new org.telegram.ui.d61(11, context, this);
        this.f40097b = d61Var;
        d61Var.setOrientation(0);
        addView(this.f40097b, new FrameLayout.LayoutParams(-2, -1));
        for (int i7 = 0; i7 < 8; i7++) {
            int i10 = bv.f32424e0[i7];
            yu yuVar = new yu(this, context, bv.f32425f0[i7]);
            yuVar.setContentDescription(bv.f(i7));
            this.f40097b.addView(yuVar);
        }
    }

    public final void d(MotionEvent motionEvent) {
        if (this.f41138n && !this.d) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        return;
                    }
                } else {
                    this.f40096a = false;
                    return;
                }
            }
            this.f40096a = true;
            if (!this.d) {
                this.f40099e = -1;
            }
            this.f41140s.requestDisallowInterceptTouchEvent(true);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.W1(this.f41139r, org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(Math.min(5.7f, this.f40097b.getChildCount()) * 32.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(30.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
