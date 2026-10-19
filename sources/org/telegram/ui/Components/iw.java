package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.qa1;
public final class iw extends kn0 {
    public long h;
    public boolean f27383n;
    public float f27384r;
    public final kw f27385s;

    public iw(kw kwVar, Context context) {
        super(context);
        float f7;
        this.f27385s = kwVar;
        boolean z10 = kwVar.f27987n;
        this.f27383n = z10;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.f27384r = f7;
        setSmoothScrollingEnabled(true);
        int i10 = 0;
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setNestedScrollingEnabled(true);
        qa1 qa1Var = new qa1(this, context, 8);
        this.f27924b = qa1Var;
        qa1Var.setOrientation(0);
        addView(this.f27924b, new FrameLayout.LayoutParams(-2, -1));
        while (true) {
            int[] iArr = kw.f27981e0;
            if (i10 < 8) {
                int i11 = iArr[i10];
                hw hwVar = new hw(this, context, kw.f27982f0[i10]);
                hwVar.setContentDescription(kw.f(i10));
                this.f27924b.addView(hwVar);
                i10++;
            } else {
                return;
            }
        }
    }

    public final void d(MotionEvent motionEvent) {
        if (this.f27383n && !this.d) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        return;
                    }
                } else {
                    this.f27923a = false;
                    return;
                }
            }
            this.f27923a = true;
            if (!this.d) {
                this.e = -1;
            }
            this.f27385s.requestDisallowInterceptTouchEvent(true);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.lerp(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(Math.min(5.7f, this.f27924b.getChildCount()) * 32.0f), this.f27384r), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
