package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.dc1;
public final class qw extends sn0 {
    public long h;
    public boolean f30295n;
    public float f30296r;
    public final sw f30297s;

    public qw(sw swVar, Context context) {
        super(context);
        float f7;
        this.f30297s = swVar;
        boolean z10 = swVar.f30908n;
        this.f30295n = z10;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.f30296r = f7;
        setSmoothScrollingEnabled(true);
        int i10 = 0;
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setNestedScrollingEnabled(true);
        dc1 dc1Var = new dc1(this, context, 6);
        this.f30856b = dc1Var;
        dc1Var.setOrientation(0);
        addView(this.f30856b, new FrameLayout.LayoutParams(-2, -1));
        while (true) {
            int[] iArr = sw.f30902e0;
            if (i10 < 8) {
                int i11 = iArr[i10];
                pw pwVar = new pw(this, context, sw.f30903f0[i10]);
                pwVar.setContentDescription(sw.f(i10));
                this.f30856b.addView(pwVar);
                i10++;
            } else {
                return;
            }
        }
    }

    public final void d(MotionEvent motionEvent) {
        if (this.f30295n && !this.d) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        return;
                    }
                } else {
                    this.f30855a = false;
                    return;
                }
            }
            this.f30855a = true;
            if (!this.d) {
                this.f30858e = -1;
            }
            this.f30297s.requestDisallowInterceptTouchEvent(true);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.lerp(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(Math.min(5.7f, this.f30856b.getChildCount()) * 32.0f), this.f30296r), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
