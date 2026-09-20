package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
public final class ua extends uc0 {
    public final boolean C0;
    public final boolean D0;
    public final ab E0;

    public ua(ab abVar, Context context, boolean z10, boolean z11) {
        super(context);
        this.E0 = abVar;
        this.C0 = z10;
        this.D0 = z11;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ab abVar = this.E0;
        abVar.I(canvas, this);
        super.dispatchDraw(canvas);
        abVar.H(canvas, this);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Drawable drawable;
        if (motionEvent.getAction() == 0) {
            float y3 = motionEvent.getY();
            ab abVar = this.E0;
            drawable = ((org.telegram.ui.ActionBar.f3) abVar).shadowDrawable;
            if (y3 < drawable.getBounds().top) {
                abVar.dismiss();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (!this.D0) {
            this.E0.getClass();
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i11);
        ab abVar = this.E0;
        abVar.h = size;
        abVar.E(i10, i11);
        if (this.C0) {
            i11 = View.MeasureSpec.makeMeasureSpec(abVar.h, 1073741824);
        }
        super.onMeasure(i10, i11);
    }
}
