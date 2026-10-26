package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class iw extends tn0 {
    public long h;
    public boolean f29388n;
    public float f29389r;
    public final kw f29390s;

    public iw(kw kwVar, Context context) {
        super(context);
        float f7;
        this.f29390s = kwVar;
        boolean z10 = kwVar.f29994n;
        this.f29388n = z10;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.f29389r = f7;
        setSmoothScrollingEnabled(true);
        int i10 = 0;
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setNestedScrollingEnabled(true);
        org.telegram.ui.xa1 xa1Var = new org.telegram.ui.xa1(this, context, 9);
        this.f33114b = xa1Var;
        xa1Var.setOrientation(0);
        addView(this.f33114b, new FrameLayout.LayoutParams(-2, -1));
        while (true) {
            int[] iArr = kw.f29988e0;
            if (i10 < 8) {
                int i11 = iArr[i10];
                hw hwVar = new hw(this, context, kw.f29989f0[i10]);
                hwVar.setContentDescription(kw.f(i10));
                this.f33114b.addView(hwVar);
                i10++;
            } else {
                return;
            }
        }
    }

    public final void d(MotionEvent motionEvent) {
        if (this.f29388n && !this.d) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        return;
                    }
                } else {
                    this.f33113a = false;
                    return;
                }
            }
            this.f33113a = true;
            if (!this.d) {
                this.e = -1;
            }
            this.f29390s.requestDisallowInterceptTouchEvent(true);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.lerp(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(Math.min(5.7f, this.f33114b.getChildCount()) * 32.0f), this.f29389r), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
