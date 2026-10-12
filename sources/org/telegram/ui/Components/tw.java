package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.fc1;
public final class tw extends yn0 {
    public long h;
    public boolean f30988n;
    public float f30989r;
    public final vw f30990s;

    public tw(vw vwVar, Context context) {
        super(context);
        float f7;
        this.f30990s = vwVar;
        boolean z10 = vwVar.f32201n;
        this.f30988n = z10;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.f30989r = f7;
        setSmoothScrollingEnabled(true);
        int i10 = 0;
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setNestedScrollingEnabled(true);
        fc1 fc1Var = new fc1(this, context, 6);
        this.f33139b = fc1Var;
        fc1Var.setOrientation(0);
        addView(this.f33139b, new FrameLayout.LayoutParams(-2, -1));
        while (true) {
            int[] iArr = vw.f32195e0;
            if (i10 < 8) {
                int i11 = iArr[i10];
                sw swVar = new sw(this, context, vw.f32196f0[i10]);
                swVar.setContentDescription(vw.f(i10));
                this.f33139b.addView(swVar);
                i10++;
            } else {
                return;
            }
        }
    }

    public final void d(MotionEvent motionEvent) {
        if (this.f30988n && !this.d) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        return;
                    }
                } else {
                    this.f33138a = false;
                    return;
                }
            }
            this.f33138a = true;
            if (!this.d) {
                this.f33141e = -1;
            }
            this.f30990s.requestDisallowInterceptTouchEvent(true);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.lerp(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(Math.min(5.7f, this.f33139b.getChildCount()) * 32.0f), this.f30989r), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
