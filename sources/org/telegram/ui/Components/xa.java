package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
public final class xa extends md0 {
    public final boolean D0;
    public final boolean E0;
    public final db F0;

    public xa(db dbVar, Context context, boolean z10, boolean z11) {
        super(context);
        this.F0 = dbVar;
        this.D0 = z10;
        this.E0 = z11;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        db dbVar = this.F0;
        dbVar.J(canvas, this);
        super.dispatchDraw(canvas);
        dbVar.I(canvas, this);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Drawable drawable;
        if (motionEvent.getAction() == 0) {
            float y3 = motionEvent.getY();
            db dbVar = this.F0;
            drawable = ((org.telegram.ui.ActionBar.e3) dbVar).shadowDrawable;
            if (y3 < drawable.getBounds().top) {
                dbVar.dismiss();
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
        db dbVar = this.F0;
        dbVar.h = size;
        dbVar.F(i10, i11);
        if (this.D0) {
            i11 = View.MeasureSpec.makeMeasureSpec(dbVar.h, 1073741824);
        }
        super.onMeasure(i10, i11);
    }
}
