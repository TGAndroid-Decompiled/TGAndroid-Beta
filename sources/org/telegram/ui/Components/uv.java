package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.pb1;
public final class uv extends tm0 {
    public long h;
    public boolean f29298n;
    public float f29299r;
    public final wv f29300s;

    public uv(wv wvVar, Context context) {
        super(context);
        float f10;
        this.f29300s = wvVar;
        boolean z4 = wvVar.f30355n;
        this.f29298n = z4;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.f29299r = f10;
        setSmoothScrollingEnabled(true);
        int i10 = 0;
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setNestedScrollingEnabled(true);
        pb1 pb1Var = new pb1(this, context, 7);
        this.f28998b = pb1Var;
        pb1Var.setOrientation(0);
        addView(this.f28998b, new FrameLayout.LayoutParams(-2, -1));
        while (true) {
            int[] iArr = wv.f30352b0;
            if (i10 < 8) {
                tv tvVar = new tv(this, context, iArr[i10], wv.f30353c0[i10]);
                tvVar.setContentDescription(wv.f(i10));
                this.f28998b.addView(tvVar);
                i10++;
            } else {
                return;
            }
        }
    }

    public final void d(MotionEvent motionEvent) {
        if (this.f29298n && !this.d) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        return;
                    }
                } else {
                    this.f28997a = false;
                    return;
                }
            }
            this.f28997a = true;
            if (!this.d) {
                this.e = -1;
            }
            this.f29300s.requestDisallowInterceptTouchEvent(true);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.lerp(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(Math.min(5.7f, this.f28998b.getChildCount()) * 32.0f), this.f29299r), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
