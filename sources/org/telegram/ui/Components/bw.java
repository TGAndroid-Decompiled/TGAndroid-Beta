package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.dc1;
public final class bw extends ym0 {
    public long h;
    public boolean f23067n;
    public float f23068r;
    public final dw f23069s;

    public bw(dw dwVar, Context context) {
        super(context);
        float f7;
        this.f23069s = dwVar;
        boolean z10 = dwVar.f23654n;
        this.f23067n = z10;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.f23068r = f7;
        setSmoothScrollingEnabled(true);
        int i10 = 0;
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setNestedScrollingEnabled(true);
        dc1 dc1Var = new dc1(this, context, 6);
        this.f30584b = dc1Var;
        dc1Var.setOrientation(0);
        addView(this.f30584b, new FrameLayout.LayoutParams(-2, -1));
        while (true) {
            int[] iArr = dw.f23648e0;
            if (i10 < 8) {
                aw awVar = new aw(this, context, iArr[i10], dw.f23649f0[i10]);
                awVar.setContentDescription(dw.f(i10));
                this.f30584b.addView(awVar);
                i10++;
            } else {
                return;
            }
        }
    }

    public final void d(MotionEvent motionEvent) {
        if (this.f23067n && !this.d) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        return;
                    }
                } else {
                    this.f30583a = false;
                    return;
                }
            }
            this.f30583a = true;
            if (!this.d) {
                this.e = -1;
            }
            this.f23069s.requestDisallowInterceptTouchEvent(true);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.lerp(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(Math.min(5.7f, this.f30584b.getChildCount()) * 32.0f), this.f23068r), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
