package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
public final class na extends qc0 {
    public final boolean A0;
    public final boolean B0;
    public final sa C0;

    public na(sa saVar, Context context, boolean z4, boolean z10) {
        super(context);
        this.C0 = saVar;
        this.A0 = z4;
        this.B0 = z10;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        sa saVar = this.C0;
        saVar.H(canvas, this);
        super.dispatchDraw(canvas);
        saVar.G(canvas, this);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Drawable drawable;
        if (motionEvent.getAction() == 0) {
            float y10 = motionEvent.getY();
            sa saVar = this.C0;
            drawable = ((org.telegram.ui.ActionBar.h3) saVar).shadowDrawable;
            if (y10 < drawable.getBounds().top) {
                saVar.dismiss();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (!this.B0) {
            this.C0.getClass();
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i11);
        sa saVar = this.C0;
        saVar.h = size;
        saVar.D(i10, i11);
        if (this.A0) {
            i11 = View.MeasureSpec.makeMeasureSpec(saVar.h, 1073741824);
        }
        super.onMeasure(i10, i11);
    }
}
