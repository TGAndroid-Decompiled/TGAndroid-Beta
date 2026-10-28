package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class iw extends un0 {
    public long h;
    public boolean f29427n;
    public float f29428r;
    public final kw f29429s;

    public iw(kw kwVar, Context context) {
        super(context);
        float f7;
        this.f29429s = kwVar;
        boolean z10 = kwVar.f30040n;
        this.f29427n = z10;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.f29428r = f7;
        setSmoothScrollingEnabled(true);
        int i10 = 0;
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setNestedScrollingEnabled(true);
        org.telegram.ui.za1 za1Var = new org.telegram.ui.za1(this, context, 9);
        this.f33435b = za1Var;
        za1Var.setOrientation(0);
        addView(this.f33435b, new FrameLayout.LayoutParams(-2, -1));
        while (true) {
            int[] iArr = kw.f30034e0;
            if (i10 < 8) {
                int i11 = iArr[i10];
                hw hwVar = new hw(this, context, kw.f30035f0[i10]);
                hwVar.setContentDescription(kw.f(i10));
                this.f33435b.addView(hwVar);
                i10++;
            } else {
                return;
            }
        }
    }

    public final void d(MotionEvent motionEvent) {
        if (this.f29427n && !this.d) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        return;
                    }
                } else {
                    this.f33434a = false;
                    return;
                }
            }
            this.f33434a = true;
            if (!this.d) {
                this.e = -1;
            }
            this.f29429s.requestDisallowInterceptTouchEvent(true);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.lerp(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(Math.min(5.7f, this.f33435b.getChildCount()) * 32.0f), this.f29428r), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
