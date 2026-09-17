package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.cc1;
public final class zv extends mm0 {
    public long h;
    public boolean f33236n;
    public float f33237r;
    public final bw f33238s;

    public zv(bw bwVar, Context context) {
        super(context);
        float f7;
        this.f33238s = bwVar;
        boolean z10 = bwVar.f24811n;
        this.f33236n = z10;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.f33237r = f7;
        setSmoothScrollingEnabled(true);
        int i10 = 0;
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setNestedScrollingEnabled(true);
        cc1 cc1Var = new cc1(this, context, 6);
        this.f28471b = cc1Var;
        cc1Var.setOrientation(0);
        addView(this.f28471b, new FrameLayout.LayoutParams(-2, -1));
        while (true) {
            int[] iArr = bw.f24805e0;
            if (i10 < 8) {
                yv yvVar = new yv(this, context, iArr[i10], bw.f24806f0[i10]);
                yvVar.setContentDescription(bw.f(i10));
                this.f28471b.addView(yvVar);
                i10++;
            } else {
                return;
            }
        }
    }

    public final void d(MotionEvent motionEvent) {
        if (this.f33236n && !this.d) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        return;
                    }
                } else {
                    this.f28470a = false;
                    return;
                }
            }
            this.f28470a = true;
            if (!this.d) {
                this.f28473e = -1;
            }
            this.f33238s.requestDisallowInterceptTouchEvent(true);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.lerp(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(Math.min(5.7f, this.f28471b.getChildCount()) * 32.0f), this.f33237r), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
