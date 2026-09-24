package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ub1;
public final class cw extends ym0 {
    public long h;
    public boolean f23397n;
    public float f23398r;
    public final ew f23399s;

    public cw(ew ewVar, Context context) {
        super(context);
        float f7;
        this.f23399s = ewVar;
        boolean z10 = ewVar.f23986n;
        this.f23397n = z10;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.f23398r = f7;
        setSmoothScrollingEnabled(true);
        int i10 = 0;
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setNestedScrollingEnabled(true);
        ub1 ub1Var = new ub1(this, context, 6);
        this.f30640b = ub1Var;
        ub1Var.setOrientation(0);
        addView(this.f30640b, new FrameLayout.LayoutParams(-2, -1));
        while (true) {
            int[] iArr = ew.f23980e0;
            if (i10 < 8) {
                bw bwVar = new bw(this, context, iArr[i10], ew.f23981f0[i10]);
                bwVar.setContentDescription(ew.f(i10));
                this.f30640b.addView(bwVar);
                i10++;
            } else {
                return;
            }
        }
    }

    public final void d(MotionEvent motionEvent) {
        if (this.f23397n && !this.d) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        return;
                    }
                } else {
                    this.f30639a = false;
                    return;
                }
            }
            this.f30639a = true;
            if (!this.d) {
                this.e = -1;
            }
            this.f23399s.requestDisallowInterceptTouchEvent(true);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.lerp(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(Math.min(5.7f, this.f30640b.getChildCount()) * 32.0f), this.f23398r), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
