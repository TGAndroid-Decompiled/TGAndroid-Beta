package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
public final class ha extends za0 {
    public final boolean f34170l0;
    public final boolean m0;
    public final na f34171n0;

    public ha(na naVar, Context context, boolean z9, boolean z10) {
        super(context);
        this.f34171n0 = naVar;
        this.f34170l0 = z9;
        this.m0 = z10;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        na naVar = this.f34171n0;
        naVar.W0(canvas, this);
        super.dispatchDraw(canvas);
        naVar.V0(canvas, this);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y10 = motionEvent.getY();
            na naVar = this.f34171n0;
            if (y10 < naVar.f28646r0.getBounds().top) {
                naVar.dismiss();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (!this.m0) {
            this.f34171n0.getClass();
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i10);
        na naVar = this.f34171n0;
        naVar.n1 = size;
        naVar.S0(i7, i10);
        if (this.f34170l0) {
            i10 = View.MeasureSpec.makeMeasureSpec(naVar.n1, 1073741824);
        }
        super.onMeasure(i7, i10);
    }
}
