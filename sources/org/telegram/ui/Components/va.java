package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
public final class va extends nc0 {
    public final boolean D0;
    public final boolean E0;
    public final bb F0;

    public va(bb bbVar, Context context, boolean z10, boolean z11) {
        super(context);
        this.F0 = bbVar;
        this.D0 = z10;
        this.E0 = z11;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        bb bbVar = this.F0;
        bbVar.I(canvas, this);
        super.dispatchDraw(canvas);
        bbVar.H(canvas, this);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Drawable drawable;
        if (motionEvent.getAction() == 0) {
            float y3 = motionEvent.getY();
            bb bbVar = this.F0;
            drawable = ((org.telegram.ui.ActionBar.f3) bbVar).shadowDrawable;
            if (y3 < drawable.getBounds().top) {
                bbVar.dismiss();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (!this.E0) {
            this.F0.getClass();
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i11);
        bb bbVar = this.F0;
        bbVar.h = size;
        bbVar.D(i10, i11);
        if (this.D0) {
            i11 = View.MeasureSpec.makeMeasureSpec(bbVar.h, 1073741824);
        }
        super.onMeasure(i10, i11);
    }
}
