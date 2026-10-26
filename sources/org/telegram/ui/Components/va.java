package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
public final class va extends ed0 {
    public final boolean f33616r0;
    public final boolean f33617s0;
    public final bb f33618t0;

    public va(bb bbVar, Context context, boolean z10, boolean z11) {
        super(context);
        this.f33618t0 = bbVar;
        this.f33616r0 = z10;
        this.f33617s0 = z11;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        bb bbVar = this.f33618t0;
        bbVar.I(canvas, this);
        super.dispatchDraw(canvas);
        bbVar.H(canvas, this);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Drawable drawable;
        if (motionEvent.getAction() == 0) {
            float y3 = motionEvent.getY();
            bb bbVar = this.f33618t0;
            drawable = ((org.telegram.ui.ActionBar.k3) bbVar).shadowDrawable;
            if (y3 < drawable.getBounds().top) {
                bbVar.dismiss();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (!this.f33617s0) {
            this.f33618t0.getClass();
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i11);
        bb bbVar = this.f33618t0;
        bbVar.h = size;
        bbVar.D(i10, i11);
        if (this.f33616r0) {
            i11 = View.MeasureSpec.makeMeasureSpec(bbVar.h, 1073741824);
        }
        super.onMeasure(i10, i11);
    }
}
