package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.cc1;
public final class aw extends mm0 {
    public long h;
    public boolean f22488n;
    public float f22489r;
    public final cw f22490s;

    public aw(cw cwVar, Context context) {
        super(context);
        float f7;
        this.f22490s = cwVar;
        boolean z10 = cwVar.f23149n;
        this.f22488n = z10;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.f22489r = f7;
        setSmoothScrollingEnabled(true);
        int i10 = 0;
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setNestedScrollingEnabled(true);
        cc1 cc1Var = new cc1(this, context, 6);
        this.f26179b = cc1Var;
        cc1Var.setOrientation(0);
        addView(this.f26179b, new FrameLayout.LayoutParams(-2, -1));
        while (true) {
            int[] iArr = cw.f23143e0;
            if (i10 < 8) {
                zv zvVar = new zv(this, context, iArr[i10], cw.f23144f0[i10]);
                zvVar.setContentDescription(cw.f(i10));
                this.f26179b.addView(zvVar);
                i10++;
            } else {
                return;
            }
        }
    }

    public final void d(MotionEvent motionEvent) {
        if (this.f22488n && !this.d) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        return;
                    }
                } else {
                    this.f26178a = false;
                    return;
                }
            }
            this.f26178a = true;
            if (!this.d) {
                this.e = -1;
            }
            this.f22490s.requestDisallowInterceptTouchEvent(true);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.lerp(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(Math.min(5.7f, this.f26179b.getChildCount()) * 32.0f), this.f22489r), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
