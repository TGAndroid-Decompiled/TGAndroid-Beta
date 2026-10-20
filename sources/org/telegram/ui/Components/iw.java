package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.qa1;
public final class iw extends ln0 {
    public long h;
    public boolean f27342n;
    public float f27343r;
    public final kw f27344s;

    public iw(kw kwVar, Context context) {
        super(context);
        float f7;
        this.f27344s = kwVar;
        boolean z10 = kwVar.f27971n;
        this.f27342n = z10;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.f27343r = f7;
        setSmoothScrollingEnabled(true);
        int i10 = 0;
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setNestedScrollingEnabled(true);
        qa1 qa1Var = new qa1(this, context, 8);
        this.f28231b = qa1Var;
        qa1Var.setOrientation(0);
        addView(this.f28231b, new FrameLayout.LayoutParams(-2, -1));
        while (true) {
            int[] iArr = kw.f27965e0;
            if (i10 < 8) {
                int i11 = iArr[i10];
                hw hwVar = new hw(this, context, kw.f27966f0[i10]);
                hwVar.setContentDescription(kw.f(i10));
                this.f28231b.addView(hwVar);
                i10++;
            } else {
                return;
            }
        }
    }

    public final void d(MotionEvent motionEvent) {
        if (this.f27342n && !this.d) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        return;
                    }
                } else {
                    this.f28230a = false;
                    return;
                }
            }
            this.f28230a = true;
            if (!this.d) {
                this.e = -1;
            }
            this.f27344s.requestDisallowInterceptTouchEvent(true);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.lerp(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(Math.min(5.7f, this.f28231b.getChildCount()) * 32.0f), this.f27343r), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
