package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class jv extends il0 {
    public long h;
    public boolean f36537n;
    public float f36538r;
    public final lv f36539s;

    public jv(lv lvVar, Context context) {
        super(context);
        float f10;
        this.f36539s = lvVar;
        boolean z10 = lvVar.f37250n;
        this.f36537n = z10;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.f36538r = f10;
        setSmoothScrollingEnabled(true);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setNestedScrollingEnabled(true);
        org.telegram.ui.d61 d61Var = new org.telegram.ui.d61(12, context, this);
        this.f36144b = d61Var;
        d61Var.setOrientation(0);
        addView(this.f36144b, new FrameLayout.LayoutParams(-2, -1));
        for (int i7 = 0; i7 < 8; i7++) {
            int i10 = lv.f37243f0[i7];
            iv ivVar = new iv(this, context, lv.f37244g0[i7]);
            ivVar.setContentDescription(lv.f(i7));
            this.f36144b.addView(ivVar);
        }
    }

    public final void d(MotionEvent motionEvent) {
        if (this.f36537n && !this.d) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        return;
                    }
                } else {
                    this.f36143a = false;
                    return;
                }
            }
            this.f36143a = true;
            if (!this.d) {
                this.f36146e = -1;
            }
            this.f36539s.requestDisallowInterceptTouchEvent(true);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.W1(this.f36538r, org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(Math.min(5.7f, this.f36144b.getChildCount()) * 32.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(30.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
