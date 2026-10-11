package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.cc1;
public final class rw extends tn0 {
    public long h;
    public boolean f30658n;
    public float f30659r;
    public final tw f30660s;

    public rw(tw twVar, Context context) {
        super(context);
        float f7;
        this.f30660s = twVar;
        boolean z10 = twVar.f31353n;
        this.f30658n = z10;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.f30659r = f7;
        setSmoothScrollingEnabled(true);
        int i10 = 0;
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setNestedScrollingEnabled(true);
        cc1 cc1Var = new cc1(this, context, 6);
        this.f31306b = cc1Var;
        cc1Var.setOrientation(0);
        addView(this.f31306b, new FrameLayout.LayoutParams(-2, -1));
        while (true) {
            int[] iArr = tw.f31347e0;
            if (i10 < 8) {
                int i11 = iArr[i10];
                qw qwVar = new qw(this, context, tw.f31348f0[i10]);
                qwVar.setContentDescription(tw.f(i10));
                this.f31306b.addView(qwVar);
                i10++;
            } else {
                return;
            }
        }
    }

    public final void d(MotionEvent motionEvent) {
        if (this.f30658n && !this.d) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        return;
                    }
                } else {
                    this.f31305a = false;
                    return;
                }
            }
            this.f31305a = true;
            if (!this.d) {
                this.f31308e = -1;
            }
            this.f30660s.requestDisallowInterceptTouchEvent(true);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.lerp(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(Math.min(5.7f, this.f31306b.getChildCount()) * 32.0f), this.f30659r), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
