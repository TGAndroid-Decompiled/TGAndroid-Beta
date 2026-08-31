package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ib1;
public final class xv extends vm0 {
    public long h;
    public boolean f33182n;
    public float f33183r;
    public final zv f33184s;

    public xv(zv zvVar, Context context) {
        super(context);
        float f10;
        this.f33184s = zvVar;
        boolean z4 = zvVar.f34025n;
        this.f33182n = z4;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.f33183r = f10;
        setSmoothScrollingEnabled(true);
        int i10 = 0;
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setNestedScrollingEnabled(true);
        ib1 ib1Var = new ib1(this, context, 7);
        this.f31929b = ib1Var;
        ib1Var.setOrientation(0);
        addView(this.f31929b, new FrameLayout.LayoutParams(-2, -1));
        while (true) {
            int[] iArr = zv.f34022b0;
            if (i10 < 8) {
                wv wvVar = new wv(this, context, iArr[i10], zv.f34023c0[i10]);
                wvVar.setContentDescription(zv.f(i10));
                this.f31929b.addView(wvVar);
                i10++;
            } else {
                return;
            }
        }
    }

    public final void d(MotionEvent motionEvent) {
        if (this.f33182n && !this.d) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        return;
                    }
                } else {
                    this.f31928a = false;
                    return;
                }
            }
            this.f31928a = true;
            if (!this.d) {
                this.f31931e = -1;
            }
            this.f33184s.requestDisallowInterceptTouchEvent(true);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.lerp(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(Math.min(5.7f, this.f31929b.getChildCount()) * 32.0f), this.f33183r), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
