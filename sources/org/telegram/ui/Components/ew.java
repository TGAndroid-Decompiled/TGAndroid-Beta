package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.gc1;
public final class ew extends wm0 {
    public long h;
    public boolean f22763n;
    public float f22764r;
    public final gw f22765s;

    public ew(gw gwVar, Context context) {
        super(context);
        float f7;
        this.f22765s = gwVar;
        boolean z10 = gwVar.f23443n;
        this.f22763n = z10;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.f22764r = f7;
        setSmoothScrollingEnabled(true);
        int i10 = 0;
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setNestedScrollingEnabled(true);
        gc1 gc1Var = new gc1(this, context, 6);
        this.f28802b = gc1Var;
        gc1Var.setOrientation(0);
        addView(this.f28802b, new FrameLayout.LayoutParams(-2, -1));
        while (true) {
            int[] iArr = gw.f23437e0;
            if (i10 < 8) {
                dw dwVar = new dw(this, context, iArr[i10], gw.f23438f0[i10]);
                dwVar.setContentDescription(gw.f(i10));
                this.f28802b.addView(dwVar);
                i10++;
            } else {
                return;
            }
        }
    }

    public final void d(MotionEvent motionEvent) {
        if (this.f22763n && !this.d) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        return;
                    }
                } else {
                    this.f28801a = false;
                    return;
                }
            }
            this.f28801a = true;
            if (!this.d) {
                this.e = -1;
            }
            this.f22765s.requestDisallowInterceptTouchEvent(true);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.lerp(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(Math.min(5.7f, this.f28802b.getChildCount()) * 32.0f), this.f22764r), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
