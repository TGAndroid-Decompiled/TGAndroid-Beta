package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
public final class na extends tb0 {
    public final boolean A0;
    public final sa B0;
    public final boolean f31059z0;

    public na(sa saVar, Context context, boolean z10, boolean z11) {
        super(context);
        this.B0 = saVar;
        this.f31059z0 = z10;
        this.A0 = z11;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        sa saVar = this.B0;
        saVar.H(canvas, this);
        super.dispatchDraw(canvas);
        saVar.G(canvas, this);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Drawable drawable;
        if (motionEvent.getAction() == 0) {
            float y10 = motionEvent.getY();
            sa saVar = this.B0;
            drawable = ((org.telegram.ui.ActionBar.f3) saVar).shadowDrawable;
            if (y10 < drawable.getBounds().top) {
                saVar.dismiss();
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
    public final void onMeasure(int i9, int i10) {
        int size = View.MeasureSpec.getSize(i10);
        sa saVar = this.B0;
        saVar.h = size;
        saVar.D(i9, i10);
        if (this.f31059z0) {
            i10 = View.MeasureSpec.makeMeasureSpec(saVar.h, 1073741824);
        }
        super.onMeasure(i9, i10);
    }
}
