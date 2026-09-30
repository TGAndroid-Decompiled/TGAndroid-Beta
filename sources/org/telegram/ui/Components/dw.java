package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ub1;
public final class dw extends an0 {
    public long h;
    public boolean f23726n;
    public float f23727r;
    public final fw f23728s;

    public dw(fw fwVar, Context context) {
        super(context);
        float f7;
        this.f23728s = fwVar;
        boolean z10 = fwVar.f24341n;
        this.f23726n = z10;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.f23727r = f7;
        setSmoothScrollingEnabled(true);
        int i10 = 0;
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setNestedScrollingEnabled(true);
        ub1 ub1Var = new ub1(this, context, 6);
        this.f22697b = ub1Var;
        ub1Var.setOrientation(0);
        addView(this.f22697b, new FrameLayout.LayoutParams(-2, -1));
        while (true) {
            int[] iArr = fw.f24335e0;
            if (i10 < 8) {
                cw cwVar = new cw(this, context, iArr[i10], fw.f24336f0[i10]);
                cwVar.setContentDescription(fw.f(i10));
                this.f22697b.addView(cwVar);
                i10++;
            } else {
                return;
            }
        }
    }

    public final void d(MotionEvent motionEvent) {
        if (this.f23726n && !this.d) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        return;
                    }
                } else {
                    this.f22696a = false;
                    return;
                }
            }
            this.f22696a = true;
            if (!this.d) {
                this.e = -1;
            }
            this.f23728s.requestDisallowInterceptTouchEvent(true);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.lerp(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(Math.min(5.7f, this.f22697b.getChildCount()) * 32.0f), this.f23727r), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
