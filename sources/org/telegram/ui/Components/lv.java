package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ta1;
public final class lv extends xl0 {
    public long h;
    public boolean f30560n;
    public float f30561r;
    public final nv f30562s;

    public lv(nv nvVar, Context context) {
        super(context);
        float f10;
        this.f30562s = nvVar;
        boolean z10 = nvVar.f31184n;
        this.f30560n = z10;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.f30561r = f10;
        setSmoothScrollingEnabled(true);
        int i9 = 0;
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setNestedScrollingEnabled(true);
        ta1 ta1Var = new ta1(this, context, 7);
        this.f34720b = ta1Var;
        ta1Var.setOrientation(0);
        addView(this.f34720b, new FrameLayout.LayoutParams(-2, -1));
        while (true) {
            int[] iArr = nv.f31182a0;
            if (i9 < 8) {
                kv kvVar = new kv(this, context, iArr[i9], nv.f31183b0[i9]);
                kvVar.setContentDescription(nv.f(i9));
                this.f34720b.addView(kvVar);
                i9++;
            } else {
                return;
            }
        }
    }

    public final void d(MotionEvent motionEvent) {
        if (this.f30560n && !this.d) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        return;
                    }
                } else {
                    this.f34719a = false;
                    return;
                }
            }
            this.f34719a = true;
            if (!this.d) {
                this.f34722e = -1;
            }
            this.f30562s.requestDisallowInterceptTouchEvent(true);
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.lerp(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(Math.min(5.7f, this.f34720b.getChildCount()) * 32.0f), this.f30561r), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
