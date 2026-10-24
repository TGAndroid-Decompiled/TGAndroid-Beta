package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ua1;
public final class gw extends nn0 {
    public long h;
    public boolean f26801n;
    public float f26802r;
    public final iw f26803s;

    public gw(iw iwVar, Context context) {
        super(context);
        float f7;
        this.f26803s = iwVar;
        boolean z10 = iwVar.f27502n;
        this.f26801n = z10;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.f26802r = f7;
        setSmoothScrollingEnabled(true);
        int i10 = 0;
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setNestedScrollingEnabled(true);
        ua1 ua1Var = new ua1(this, context, 8);
        this.f28979b = ua1Var;
        ua1Var.setOrientation(0);
        addView(this.f28979b, new FrameLayout.LayoutParams(-2, -1));
        while (true) {
            int[] iArr = iw.f27496e0;
            if (i10 < 8) {
                int i11 = iArr[i10];
                fw fwVar = new fw(this, context, iw.f27497f0[i10]);
                fwVar.setContentDescription(iw.f(i10));
                this.f28979b.addView(fwVar);
                i10++;
            } else {
                return;
            }
        }
    }

    public final void d(MotionEvent motionEvent) {
        if (this.f26801n && !this.d) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        return;
                    }
                } else {
                    this.f28978a = false;
                    return;
                }
            }
            this.f28978a = true;
            if (!this.d) {
                this.e = -1;
            }
            this.f26803s.requestDisallowInterceptTouchEvent(true);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.lerp(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(Math.min(5.7f, this.f28979b.getChildCount()) * 32.0f), this.f26802r), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
