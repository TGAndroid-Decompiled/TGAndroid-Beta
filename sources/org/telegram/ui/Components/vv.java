package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.hb1;
public final class vv extends um0 {
    public long h;
    public boolean f30095n;
    public float f30096r;
    public final xv f30097s;

    public vv(xv xvVar, Context context) {
        super(context);
        float f10;
        this.f30097s = xvVar;
        boolean z4 = xvVar.f30734n;
        this.f30095n = z4;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.f30096r = f10;
        setSmoothScrollingEnabled(true);
        int i10 = 0;
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setNestedScrollingEnabled(true);
        hb1 hb1Var = new hb1(this, context, 7);
        this.f29253b = hb1Var;
        hb1Var.setOrientation(0);
        addView(this.f29253b, new FrameLayout.LayoutParams(-2, -1));
        while (true) {
            int[] iArr = xv.f30731b0;
            if (i10 < 8) {
                uv uvVar = new uv(this, context, iArr[i10], xv.f30732c0[i10]);
                uvVar.setContentDescription(xv.f(i10));
                this.f29253b.addView(uvVar);
                i10++;
            } else {
                return;
            }
        }
    }

    public final void d(MotionEvent motionEvent) {
        if (this.f30095n && !this.d) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        return;
                    }
                } else {
                    this.f29252a = false;
                    return;
                }
            }
            this.f29252a = true;
            if (!this.d) {
                this.e = -1;
            }
            this.f30097s.requestDisallowInterceptTouchEvent(true);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.lerp(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(Math.min(5.7f, this.f29253b.getChildCount()) * 32.0f), this.f30096r), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
