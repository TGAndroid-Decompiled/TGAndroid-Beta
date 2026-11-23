package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class lv extends kl0 {
    public long h;
    public boolean f37248n;
    public float f37249r;
    public final nv f37250s;

    public lv(nv nvVar, Context context) {
        super(context);
        float f10;
        this.f37250s = nvVar;
        boolean z10 = nvVar.f37953n;
        this.f37248n = z10;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.f37249r = f10;
        setSmoothScrollingEnabled(true);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setNestedScrollingEnabled(true);
        org.telegram.ui.d61 d61Var = new org.telegram.ui.d61(12, context, this);
        this.f36895b = d61Var;
        d61Var.setOrientation(0);
        addView(this.f36895b, new FrameLayout.LayoutParams(-2, -1));
        for (int i7 = 0; i7 < 8; i7++) {
            int i10 = nv.f37946f0[i7];
            kv kvVar = new kv(this, context, nv.f37947g0[i7]);
            kvVar.setContentDescription(nv.f(i7));
            this.f36895b.addView(kvVar);
        }
    }

    public final void d(MotionEvent motionEvent) {
        if (this.f37248n && !this.d) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        return;
                    }
                } else {
                    this.f36894a = false;
                    return;
                }
            }
            this.f36894a = true;
            if (!this.d) {
                this.f36897e = -1;
            }
            this.f37250s.requestDisallowInterceptTouchEvent(true);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.W1(this.f37249r, org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(Math.min(5.7f, this.f36895b.getChildCount()) * 32.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(30.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
