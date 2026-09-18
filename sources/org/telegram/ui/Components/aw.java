package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.bc1;
public final class aw extends zm0 {
    public long h;
    public boolean f22747n;
    public float f22748r;
    public final cw f22749s;

    public aw(cw cwVar, Context context) {
        super(context);
        float f7;
        this.f22749s = cwVar;
        boolean z10 = cwVar.f23346n;
        this.f22747n = z10;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.f22748r = f7;
        setSmoothScrollingEnabled(true);
        int i10 = 0;
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setNestedScrollingEnabled(true);
        bc1 bc1Var = new bc1(this, context, 6);
        this.f30846b = bc1Var;
        bc1Var.setOrientation(0);
        addView(this.f30846b, new FrameLayout.LayoutParams(-2, -1));
        while (true) {
            int[] iArr = cw.f23340e0;
            if (i10 < 8) {
                zv zvVar = new zv(this, context, iArr[i10], cw.f23341f0[i10]);
                zvVar.setContentDescription(cw.f(i10));
                this.f30846b.addView(zvVar);
                i10++;
            } else {
                return;
            }
        }
    }

    public final void d(MotionEvent motionEvent) {
        if (this.f22747n && !this.d) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        return;
                    }
                } else {
                    this.f30845a = false;
                    return;
                }
            }
            this.f30845a = true;
            if (!this.d) {
                this.e = -1;
            }
            this.f22749s.requestDisallowInterceptTouchEvent(true);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.lerp(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(Math.min(5.7f, this.f30846b.getChildCount()) * 32.0f), this.f22748r), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
