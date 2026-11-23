package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
public final class ka extends ib0 {
    public final boolean m0;
    public final boolean f36695n0;
    public final ra f36696o0;

    public ka(ra raVar, Context context, boolean z10, boolean z11) {
        super(context);
        this.f36696o0 = raVar;
        this.m0 = z10;
        this.f36695n0 = z11;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ra raVar = this.f36696o0;
        raVar.X0(canvas, this);
        super.dispatchDraw(canvas);
        raVar.W0(canvas, this);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y10 = motionEvent.getY();
            ra raVar = this.f36696o0;
            if (y10 < raVar.f30259s0.getBounds().top) {
                raVar.dismiss();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (!this.f36695n0) {
            this.f36696o0.getClass();
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i10);
        ra raVar = this.f36696o0;
        raVar.f39249r1 = size;
        raVar.T0(i7, i10);
        if (this.m0) {
            i10 = View.MeasureSpec.makeMeasureSpec(raVar.f39249r1, 1073741824);
        }
        super.onMeasure(i7, i10);
    }
}
