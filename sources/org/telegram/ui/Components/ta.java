package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
public final class ta extends mc0 {
    public final boolean D0;
    public final boolean E0;
    public final za F0;

    public ta(za zaVar, Context context, boolean z10, boolean z11) {
        super(context);
        this.F0 = zaVar;
        this.D0 = z10;
        this.E0 = z11;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        za zaVar = this.F0;
        zaVar.I(canvas, this);
        super.dispatchDraw(canvas);
        zaVar.H(canvas, this);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Drawable drawable;
        if (motionEvent.getAction() == 0) {
            float y3 = motionEvent.getY();
            za zaVar = this.F0;
            drawable = ((org.telegram.ui.ActionBar.f3) zaVar).shadowDrawable;
            if (y3 < drawable.getBounds().top) {
                zaVar.dismiss();
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
        za zaVar = this.F0;
        zaVar.h = size;
        zaVar.E(i10, i11);
        if (this.D0) {
            i11 = View.MeasureSpec.makeMeasureSpec(zaVar.h, 1073741824);
        }
        super.onMeasure(i10, i11);
    }
}
