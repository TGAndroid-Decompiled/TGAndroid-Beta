package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class kv extends yl0 {
    public long h;
    public boolean f27928n;
    public float f27929r;
    public final mv f27930s;

    public kv(mv mvVar, Context context) {
        super(context);
        float f7;
        this.f27930s = mvVar;
        boolean z10 = mvVar.f28604n;
        this.f27928n = z10;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.f27929r = f7;
        setSmoothScrollingEnabled(true);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setNestedScrollingEnabled(true);
        org.telegram.ui.u71 u71Var = new org.telegram.ui.u71(this, context, 7);
        this.f32758b = u71Var;
        u71Var.setOrientation(0);
        addView(this.f32758b, new FrameLayout.LayoutParams(-2, -1));
        for (int i10 = 0; i10 < 8; i10++) {
            int i11 = mv.f28598e0[i10];
            jv jvVar = new jv(this, context, mv.f28599f0[i10]);
            jvVar.setContentDescription(mv.f(i10));
            this.f32758b.addView(jvVar);
        }
    }

    public final void d(MotionEvent motionEvent) {
        if (this.f27928n && !this.d) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        return;
                    }
                } else {
                    this.f32757a = false;
                    return;
                }
            }
            this.f32757a = true;
            if (!this.d) {
                this.e = -1;
            }
            this.f27930s.requestDisallowInterceptTouchEvent(true);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.W1(this.f27929r, org.telegram.messenger.i0.L(30.0f), org.telegram.messenger.i0.L(Math.min(5.7f, this.f32758b.getChildCount()) * 32.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(30.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
