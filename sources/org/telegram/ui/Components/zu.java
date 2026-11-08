package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class zu extends vk0 {
    public long h;
    public boolean f41148n;
    public float f41149r;
    public final bv f41150s;

    public zu(bv bvVar, Context context) {
        super(context);
        float f10;
        this.f41150s = bvVar;
        boolean z9 = bvVar.f32367n;
        this.f41148n = z9;
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.f41149r = f10;
        setSmoothScrollingEnabled(true);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setNestedScrollingEnabled(true);
        org.telegram.ui.c61 c61Var = new org.telegram.ui.c61(11, context, this);
        this.f39027b = c61Var;
        c61Var.setOrientation(0);
        addView(this.f39027b, new FrameLayout.LayoutParams(-2, -1));
        for (int i7 = 0; i7 < 8; i7++) {
            int i10 = bv.f32361e0[i7];
            yu yuVar = new yu(this, context, bv.f32362f0[i7]);
            yuVar.setContentDescription(bv.f(i7));
            this.f39027b.addView(yuVar);
        }
    }

    public final void d(MotionEvent motionEvent) {
        if (this.f41148n && !this.d) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        return;
                    }
                } else {
                    this.f39026a = false;
                    return;
                }
            }
            this.f39026a = true;
            if (!this.d) {
                this.f39029e = -1;
            }
            this.f41150s.requestDisallowInterceptTouchEvent(true);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.W1(this.f41149r, org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(Math.min(5.7f, this.f39027b.getChildCount()) * 32.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(30.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
