package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ub1;
public final class cw extends an0 {
    public long h;
    public boolean f23420n;
    public float f23421r;
    public final ew f23422s;

    public cw(ew ewVar, Context context) {
        super(context);
        float f7;
        this.f23422s = ewVar;
        boolean z10 = ewVar.f24140n;
        this.f23420n = z10;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.f23421r = f7;
        setSmoothScrollingEnabled(true);
        int i10 = 0;
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setNestedScrollingEnabled(true);
        ub1 ub1Var = new ub1(this, context, 6);
        this.f22722b = ub1Var;
        ub1Var.setOrientation(0);
        addView(this.f22722b, new FrameLayout.LayoutParams(-2, -1));
        while (true) {
            int[] iArr = ew.f24134e0;
            if (i10 < 8) {
                bw bwVar = new bw(this, context, iArr[i10], ew.f24135f0[i10]);
                bwVar.setContentDescription(ew.f(i10));
                this.f22722b.addView(bwVar);
                i10++;
            } else {
                return;
            }
        }
    }

    public final void d(MotionEvent motionEvent) {
        if (this.f23420n && !this.d) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        return;
                    }
                } else {
                    this.f22721a = false;
                    return;
                }
            }
            this.f22721a = true;
            if (!this.d) {
                this.e = -1;
            }
            this.f23422s.requestDisallowInterceptTouchEvent(true);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.lerp(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(Math.min(5.7f, this.f22722b.getChildCount()) * 32.0f), this.f23421r), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
