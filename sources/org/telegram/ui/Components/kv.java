package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class kv extends zl0 {
    public long h;
    public boolean f27961n;
    public float f27962r;
    public final mv f27963s;

    public kv(mv mvVar, Context context) {
        super(context);
        float f7;
        this.f27963s = mvVar;
        boolean z10 = mvVar.f28579n;
        this.f27961n = z10;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.f27962r = f7;
        setSmoothScrollingEnabled(true);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setNestedScrollingEnabled(true);
        org.telegram.ui.s71 s71Var = new org.telegram.ui.s71(this, context, 7);
        this.f33184b = s71Var;
        s71Var.setOrientation(0);
        addView(this.f33184b, new FrameLayout.LayoutParams(-2, -1));
        for (int i10 = 0; i10 < 8; i10++) {
            int i11 = mv.f28573e0[i10];
            jv jvVar = new jv(this, context, mv.f28574f0[i10]);
            jvVar.setContentDescription(mv.f(i10));
            this.f33184b.addView(jvVar);
        }
    }

    public final void d(MotionEvent motionEvent) {
        if (this.f27961n && !this.d) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        return;
                    }
                } else {
                    this.f33183a = false;
                    return;
                }
            }
            this.f33183a = true;
            if (!this.d) {
                this.e = -1;
            }
            this.f27963s.requestDisallowInterceptTouchEvent(true);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.W1(this.f27962r, org.telegram.messenger.i0.L(30.0f), org.telegram.messenger.i0.L(Math.min(5.7f, this.f33184b.getChildCount()) * 32.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(30.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
