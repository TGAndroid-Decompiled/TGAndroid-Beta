package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class yu extends vk0 {
    public long h;
    public boolean f40713n;
    public float f40714r;
    public final av f40715s;

    public yu(av avVar, Context context) {
        super(context);
        float f10;
        this.f40715s = avVar;
        boolean z9 = avVar.f31920n;
        this.f40713n = z9;
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.f40714r = f10;
        setSmoothScrollingEnabled(true);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setNestedScrollingEnabled(true);
        org.telegram.ui.c61 c61Var = new org.telegram.ui.c61(11, context, this);
        this.f38971b = c61Var;
        c61Var.setOrientation(0);
        addView(this.f38971b, new FrameLayout.LayoutParams(-2, -1));
        for (int i7 = 0; i7 < 8; i7++) {
            int i10 = av.f31914e0[i7];
            xu xuVar = new xu(this, context, av.f31915f0[i7]);
            xuVar.setContentDescription(av.f(i7));
            this.f38971b.addView(xuVar);
        }
    }

    public final void d(MotionEvent motionEvent) {
        if (this.f40713n && !this.d) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        return;
                    }
                } else {
                    this.f38970a = false;
                    return;
                }
            }
            this.f38970a = true;
            if (!this.d) {
                this.f38973e = -1;
            }
            this.f40715s.requestDisallowInterceptTouchEvent(true);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.W1(this.f40714r, org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(Math.min(5.7f, this.f38971b.getChildCount()) * 32.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(30.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
