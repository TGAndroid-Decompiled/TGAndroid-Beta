package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ub1;
public final class dw extends bn0 {
    public long h;
    public boolean f23741n;
    public float f23742r;
    public final fw f23743s;

    public dw(fw fwVar, Context context) {
        super(context);
        float f7;
        this.f23743s = fwVar;
        boolean z10 = fwVar.f24367n;
        this.f23741n = z10;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.f23742r = f7;
        setSmoothScrollingEnabled(true);
        int i10 = 0;
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setNestedScrollingEnabled(true);
        ub1 ub1Var = new ub1(this, context, 6);
        this.f22984b = ub1Var;
        ub1Var.setOrientation(0);
        addView(this.f22984b, new FrameLayout.LayoutParams(-2, -1));
        while (true) {
            int[] iArr = fw.f24361e0;
            if (i10 < 8) {
                cw cwVar = new cw(this, context, iArr[i10], fw.f24362f0[i10]);
                cwVar.setContentDescription(fw.f(i10));
                this.f22984b.addView(cwVar);
                i10++;
            } else {
                return;
            }
        }
    }

    public final void d(MotionEvent motionEvent) {
        if (this.f23741n && !this.d) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        return;
                    }
                } else {
                    this.f22983a = false;
                    return;
                }
            }
            this.f22983a = true;
            if (!this.d) {
                this.e = -1;
            }
            this.f23743s.requestDisallowInterceptTouchEvent(true);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.lerp(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(Math.min(5.7f, this.f22984b.getChildCount()) * 32.0f), this.f23742r), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
