package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;

public final class la extends xb0 {
    public final boolean A0;
    public final qa B0;

    public final boolean f30329z0;

    public la(qa qaVar, Context context, boolean z10, boolean z11) {
        super(context);
        this.B0 = qaVar;
        this.f30329z0 = z10;
        this.A0 = z11;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        qa qaVar = this.B0;
        qaVar.I(canvas, this);
        super.dispatchDraw(canvas);
        qaVar.H(canvas, this);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y10 = motionEvent.getY();
            qa qaVar = this.B0;
            if (y10 < ((org.telegram.ui.ActionBar.e3) qaVar).shadowDrawable.getBounds().top) {
                qaVar.dismiss();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (!this.A0) {
            this.B0.getClass();
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i11);
        qa qaVar = this.B0;
        qaVar.h = size;
        qaVar.E(i10, i11);
        if (this.f30329z0) {
            i11 = View.MeasureSpec.makeMeasureSpec(qaVar.h, 1073741824);
        }
        super.onMeasure(i10, i11);
    }
}
