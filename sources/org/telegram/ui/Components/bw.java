package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.dc1;
public final class bw extends an0 {
    public long h;
    public boolean f23111n;
    public float f23112r;
    public final dw f23113s;

    public bw(dw dwVar, Context context) {
        super(context);
        float f7;
        this.f23113s = dwVar;
        boolean z10 = dwVar.f23764n;
        this.f23111n = z10;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.f23112r = f7;
        setSmoothScrollingEnabled(true);
        int i10 = 0;
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setNestedScrollingEnabled(true);
        dc1 dc1Var = new dc1(this, context, 6);
        this.f22703b = dc1Var;
        dc1Var.setOrientation(0);
        addView(this.f22703b, new FrameLayout.LayoutParams(-2, -1));
        while (true) {
            int[] iArr = dw.f23758e0;
            if (i10 < 8) {
                aw awVar = new aw(this, context, iArr[i10], dw.f23759f0[i10]);
                awVar.setContentDescription(dw.f(i10));
                this.f22703b.addView(awVar);
                i10++;
            } else {
                return;
            }
        }
    }

    public final void d(MotionEvent motionEvent) {
        if (this.f23111n && !this.d) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        return;
                    }
                } else {
                    this.f22702a = false;
                    return;
                }
            }
            this.f22702a = true;
            if (!this.d) {
                this.e = -1;
            }
            this.f23113s.requestDisallowInterceptTouchEvent(true);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.lerp(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(Math.min(5.7f, this.f22703b.getChildCount()) * 32.0f), this.f23112r), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
