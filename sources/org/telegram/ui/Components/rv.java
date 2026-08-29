package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ua1;
public final class rv extends km0 {
    public long h;
    public boolean f32388n;
    public float f32389r;
    public final tv f32390s;

    public rv(tv tvVar, Context context) {
        super(context);
        float f9;
        this.f32390s = tvVar;
        boolean z10 = tvVar.f33043n;
        this.f32388n = z10;
        if (z10) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        this.f32389r = f9;
        setSmoothScrollingEnabled(true);
        int i10 = 0;
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setNestedScrollingEnabled(true);
        ua1 ua1Var = new ua1(this, context, 8);
        this.f30108b = ua1Var;
        ua1Var.setOrientation(0);
        addView(this.f30108b, new FrameLayout.LayoutParams(-2, -1));
        while (true) {
            int[] iArr = tv.f33041a0;
            if (i10 < 8) {
                qv qvVar = new qv(this, context, iArr[i10], tv.f33042b0[i10]);
                qvVar.setContentDescription(tv.f(i10));
                this.f30108b.addView(qvVar);
                i10++;
            } else {
                return;
            }
        }
    }

    public final void d(MotionEvent motionEvent) {
        if (this.f32388n && !this.d) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        return;
                    }
                } else {
                    this.f30107a = false;
                    return;
                }
            }
            this.f30107a = true;
            if (!this.d) {
                this.f30110e = -1;
            }
            this.f32390s.requestDisallowInterceptTouchEvent(true);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.lerp(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(Math.min(5.7f, this.f30108b.getChildCount()) * 32.0f), this.f32389r), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
