package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ic1;
public final class mw extends on0 {
    public long h;
    public boolean f27231n;
    public float f27232r;
    public final ow f27233s;

    public mw(ow owVar, Context context) {
        super(context);
        float f7;
        this.f27233s = owVar;
        boolean z10 = owVar.f27756n;
        this.f27231n = z10;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.f27232r = f7;
        setSmoothScrollingEnabled(true);
        int i10 = 0;
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setNestedScrollingEnabled(true);
        ic1 ic1Var = new ic1(this, context, 6);
        this.f27691b = ic1Var;
        ic1Var.setOrientation(0);
        addView(this.f27691b, new FrameLayout.LayoutParams(-2, -1));
        while (true) {
            int[] iArr = ow.f27750e0;
            if (i10 < 8) {
                int i11 = iArr[i10];
                lw lwVar = new lw(this, context, ow.f27751f0[i10]);
                lwVar.setContentDescription(ow.f(i10));
                this.f27691b.addView(lwVar);
                i10++;
            } else {
                return;
            }
        }
    }

    public final void d(MotionEvent motionEvent) {
        if (this.f27231n && !this.d) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        return;
                    }
                } else {
                    this.f27690a = false;
                    return;
                }
            }
            this.f27690a = true;
            if (!this.d) {
                this.e = -1;
            }
            this.f27233s.requestDisallowInterceptTouchEvent(true);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.lerp(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(Math.min(5.7f, this.f27691b.getChildCount()) * 32.0f), this.f27232r), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
