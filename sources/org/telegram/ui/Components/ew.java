package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.xb1;
public final class ew extends en0 {
    public long h;
    public boolean f26165n;
    public float f26166r;
    public final gw f26167s;

    public ew(gw gwVar, Context context) {
        super(context);
        float f7;
        this.f26167s = gwVar;
        boolean z10 = gwVar.f26940n;
        this.f26165n = z10;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.f26166r = f7;
        setSmoothScrollingEnabled(true);
        int i10 = 0;
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setNestedScrollingEnabled(true);
        xb1 xb1Var = new xb1(this, context, 6);
        this.f26095b = xb1Var;
        xb1Var.setOrientation(0);
        addView(this.f26095b, new FrameLayout.LayoutParams(-2, -1));
        while (true) {
            int[] iArr = gw.f26934e0;
            if (i10 < 8) {
                dw dwVar = new dw(this, context, iArr[i10], gw.f26935f0[i10]);
                dwVar.setContentDescription(gw.f(i10));
                this.f26095b.addView(dwVar);
                i10++;
            } else {
                return;
            }
        }
    }

    public final void d(MotionEvent motionEvent) {
        if (this.f26165n && !this.d) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        return;
                    }
                } else {
                    this.f26094a = false;
                    return;
                }
            }
            this.f26094a = true;
            if (!this.d) {
                this.f26097e = -1;
            }
            this.f26167s.requestDisallowInterceptTouchEvent(true);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.lerp(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(Math.min(5.7f, this.f26095b.getChildCount()) * 32.0f), this.f26166r), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
