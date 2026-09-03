package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ob1;
public final class xv extends um0 {
    public long h;
    public boolean f33181n;
    public float f33182r;
    public final zv f33183s;

    public xv(zv zvVar, Context context) {
        super(context);
        float f10;
        this.f33183s = zvVar;
        boolean z4 = zvVar.f34021n;
        this.f33181n = z4;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.f33182r = f10;
        setSmoothScrollingEnabled(true);
        int i10 = 0;
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setNestedScrollingEnabled(true);
        ob1 ob1Var = new ob1(this, context, 7);
        this.f31649b = ob1Var;
        ob1Var.setOrientation(0);
        addView(this.f31649b, new FrameLayout.LayoutParams(-2, -1));
        while (true) {
            int[] iArr = zv.f34018b0;
            if (i10 < 8) {
                wv wvVar = new wv(this, context, iArr[i10], zv.f34019c0[i10]);
                wvVar.setContentDescription(zv.f(i10));
                this.f31649b.addView(wvVar);
                i10++;
            } else {
                return;
            }
        }
    }

    public final void d(MotionEvent motionEvent) {
        if (this.f33181n && !this.d) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        return;
                    }
                } else {
                    this.f31648a = false;
                    return;
                }
            }
            this.f31648a = true;
            if (!this.d) {
                this.f31651e = -1;
            }
            this.f33183s.requestDisallowInterceptTouchEvent(true);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.lerp(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(Math.min(5.7f, this.f31649b.getChildCount()) * 32.0f), this.f33182r), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
