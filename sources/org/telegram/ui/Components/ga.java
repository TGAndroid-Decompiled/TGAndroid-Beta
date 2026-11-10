package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
public final class ga extends za0 {
    public final boolean f33857l0;
    public final boolean m0;
    public final ma f33858n0;

    public ga(ma maVar, Context context, boolean z9, boolean z10) {
        super(context);
        this.f33858n0 = maVar;
        this.f33857l0 = z9;
        this.m0 = z10;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ma maVar = this.f33858n0;
        maVar.W0(canvas, this);
        super.dispatchDraw(canvas);
        maVar.V0(canvas, this);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y10 = motionEvent.getY();
            ma maVar = this.f33858n0;
            if (y10 < maVar.f28702r0.getBounds().top) {
                maVar.dismiss();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (!this.m0) {
            this.f33858n0.getClass();
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i10);
        ma maVar = this.f33858n0;
        maVar.f35904q1 = size;
        maVar.S0(i7, i10);
        if (this.f33857l0) {
            i10 = View.MeasureSpec.makeMeasureSpec(maVar.f35904q1, 1073741824);
        }
        super.onMeasure(i7, i10);
    }
}
