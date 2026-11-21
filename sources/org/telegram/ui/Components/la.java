package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
public final class la extends lb0 {
    public final boolean m0;
    public final boolean f37145n0;
    public final sa f37146o0;

    public la(sa saVar, Context context, boolean z10, boolean z11) {
        super(context);
        this.f37146o0 = saVar;
        this.m0 = z10;
        this.f37145n0 = z11;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        sa saVar = this.f37146o0;
        saVar.X0(canvas, this);
        super.dispatchDraw(canvas);
        saVar.W0(canvas, this);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y10 = motionEvent.getY();
            sa saVar = this.f37146o0;
            if (y10 < saVar.f30206s0.getBounds().top) {
                saVar.dismiss();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (!this.f37145n0) {
            this.f37146o0.getClass();
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i10);
        sa saVar = this.f37146o0;
        saVar.f39542r1 = size;
        saVar.T0(i7, i10);
        if (this.m0) {
            i10 = View.MeasureSpec.makeMeasureSpec(saVar.f39542r1, 1073741824);
        }
        super.onMeasure(i7, i10);
    }
}
