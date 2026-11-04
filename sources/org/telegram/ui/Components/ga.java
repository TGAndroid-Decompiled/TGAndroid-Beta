package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
public final class ga extends ua0 {
    public final boolean m0;
    public final boolean f34028n0;
    public final ma f34029o0;

    public ga(ma maVar, Context context, boolean z10, boolean z11) {
        super(context);
        this.f34029o0 = maVar;
        this.m0 = z10;
        this.f34028n0 = z11;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ma maVar = this.f34029o0;
        maVar.W0(canvas, this);
        super.dispatchDraw(canvas);
        maVar.V0(canvas, this);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y9 = motionEvent.getY();
            ma maVar = this.f34029o0;
            if (y9 < maVar.f28616s0.getBounds().top) {
                maVar.dismiss();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (!this.f34028n0) {
            this.f34029o0.getClass();
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int size = View.MeasureSpec.getSize(i10);
        ma maVar = this.f34029o0;
        maVar.f36104o1 = size;
        maVar.S0(i3, i10);
        if (this.m0) {
            i10 = View.MeasureSpec.makeMeasureSpec(maVar.f36104o1, 1073741824);
        }
        super.onMeasure(i3, i10);
    }
}
