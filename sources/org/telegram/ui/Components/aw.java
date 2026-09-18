package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.dc1;
public final class aw extends nm0 {
    public long h;
    public boolean f22495n;
    public float f22496r;
    public final cw f22497s;

    public aw(cw cwVar, Context context) {
        super(context);
        float f7;
        this.f22497s = cwVar;
        boolean z10 = cwVar.f23143n;
        this.f22495n = z10;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.f22496r = f7;
        setSmoothScrollingEnabled(true);
        int i10 = 0;
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setNestedScrollingEnabled(true);
        dc1 dc1Var = new dc1(this, context, 6);
        this.f26505b = dc1Var;
        dc1Var.setOrientation(0);
        addView(this.f26505b, new FrameLayout.LayoutParams(-2, -1));
        while (true) {
            int[] iArr = cw.f23137e0;
            if (i10 < 8) {
                zv zvVar = new zv(this, context, iArr[i10], cw.f23138f0[i10]);
                zvVar.setContentDescription(cw.f(i10));
                this.f26505b.addView(zvVar);
                i10++;
            } else {
                return;
            }
        }
    }

    public final void d(MotionEvent motionEvent) {
        if (this.f22495n && !this.d) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        return;
                    }
                } else {
                    this.f26504a = false;
                    return;
                }
            }
            this.f26504a = true;
            if (!this.d) {
                this.e = -1;
            }
            this.f22497s.requestDisallowInterceptTouchEvent(true);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.lerp(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(Math.min(5.7f, this.f26505b.getChildCount()) * 32.0f), this.f22496r), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
