package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class yu extends vk0 {
    public long h;
    public boolean f40730n;
    public float f40731r;
    public final av f40732s;

    public yu(av avVar, Context context) {
        super(context);
        float f10;
        this.f40732s = avVar;
        boolean z9 = avVar.f32013n;
        this.f40730n = z9;
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.f40731r = f10;
        setSmoothScrollingEnabled(true);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setNestedScrollingEnabled(true);
        org.telegram.ui.e61 e61Var = new org.telegram.ui.e61(11, context, this);
        this.f39048b = e61Var;
        e61Var.setOrientation(0);
        addView(this.f39048b, new FrameLayout.LayoutParams(-2, -1));
        for (int i7 = 0; i7 < 8; i7++) {
            int i10 = av.f32007e0[i7];
            xu xuVar = new xu(this, context, av.f32008f0[i7]);
            xuVar.setContentDescription(av.f(i7));
            this.f39048b.addView(xuVar);
        }
    }

    public final void d(MotionEvent motionEvent) {
        if (this.f40730n && !this.d) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        return;
                    }
                } else {
                    this.f39047a = false;
                    return;
                }
            }
            this.f39047a = true;
            if (!this.d) {
                this.f39050e = -1;
            }
            this.f40732s.requestDisallowInterceptTouchEvent(true);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.W1(this.f40731r, org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(Math.min(5.7f, this.f39048b.getChildCount()) * 32.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(30.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
