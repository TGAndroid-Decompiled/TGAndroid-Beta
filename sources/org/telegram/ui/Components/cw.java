package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ub1;
public final class cw extends an0 {
    public long h;
    public boolean f23407n;
    public float f23408r;
    public final ew f23409s;

    public cw(ew ewVar, Context context) {
        super(context);
        float f7;
        this.f23409s = ewVar;
        boolean z10 = ewVar.f24081n;
        this.f23407n = z10;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.f23408r = f7;
        setSmoothScrollingEnabled(true);
        int i10 = 0;
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setNestedScrollingEnabled(true);
        ub1 ub1Var = new ub1(this, context, 6);
        this.f22700b = ub1Var;
        ub1Var.setOrientation(0);
        addView(this.f22700b, new FrameLayout.LayoutParams(-2, -1));
        while (true) {
            int[] iArr = ew.f24075e0;
            if (i10 < 8) {
                bw bwVar = new bw(this, context, iArr[i10], ew.f24076f0[i10]);
                bwVar.setContentDescription(ew.f(i10));
                this.f22700b.addView(bwVar);
                i10++;
            } else {
                return;
            }
        }
    }

    public final void d(MotionEvent motionEvent) {
        if (this.f23407n && !this.d) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        return;
                    }
                } else {
                    this.f22699a = false;
                    return;
                }
            }
            this.f22699a = true;
            if (!this.d) {
                this.e = -1;
            }
            this.f23409s.requestDisallowInterceptTouchEvent(true);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.lerp(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(Math.min(5.7f, this.f22700b.getChildCount()) * 32.0f), this.f23408r), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
