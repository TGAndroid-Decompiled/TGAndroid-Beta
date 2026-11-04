package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class xu extends zk0 {
    public long h;
    public boolean f40480n;
    public float f40481r;
    public final zu f40482s;

    public xu(zu zuVar, Context context) {
        super(context);
        float f10;
        this.f40482s = zuVar;
        boolean z10 = zuVar.f41119n;
        this.f40480n = z10;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.f40481r = f10;
        setSmoothScrollingEnabled(true);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setNestedScrollingEnabled(true);
        org.telegram.ui.s51 s51Var = new org.telegram.ui.s51(12, context, this);
        this.f41058b = s51Var;
        s51Var.setOrientation(0);
        addView(this.f41058b, new FrameLayout.LayoutParams(-2, -1));
        for (int i3 = 0; i3 < 8; i3++) {
            int i10 = zu.f41112f0[i3];
            wu wuVar = new wu(this, context, zu.f41113g0[i3]);
            wuVar.setContentDescription(zu.f(i3));
            this.f41058b.addView(wuVar);
        }
    }

    public final void d(MotionEvent motionEvent) {
        if (this.f40480n && !this.d) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        return;
                    }
                } else {
                    this.f41057a = false;
                    return;
                }
            }
            this.f41057a = true;
            if (!this.d) {
                this.f41060e = -1;
            }
            this.f40482s.requestDisallowInterceptTouchEvent(true);
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.W1(this.f40481r, org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(Math.min(5.7f, this.f41058b.getChildCount()) * 32.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(30.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
