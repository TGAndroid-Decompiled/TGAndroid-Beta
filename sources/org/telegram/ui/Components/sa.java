package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
public final class sa extends ic0 {
    public final boolean A0;
    public final xa B0;
    public final boolean f32596z0;

    public sa(xa xaVar, Context context, boolean z10, boolean z11) {
        super(context);
        this.B0 = xaVar;
        this.f32596z0 = z10;
        this.A0 = z11;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        xa xaVar = this.B0;
        xaVar.H(canvas, this);
        super.dispatchDraw(canvas);
        xaVar.G(canvas, this);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Drawable drawable;
        if (motionEvent.getAction() == 0) {
            float y8 = motionEvent.getY();
            xa xaVar = this.B0;
            drawable = ((org.telegram.ui.ActionBar.f3) xaVar).shadowDrawable;
            if (y8 < drawable.getBounds().top) {
                xaVar.dismiss();
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
        xa xaVar = this.B0;
        xaVar.h = size;
        xaVar.D(i10, i11);
        if (this.f32596z0) {
            i11 = View.MeasureSpec.makeMeasureSpec(xaVar.h, 1073741824);
        }
        super.onMeasure(i10, i11);
    }
}
