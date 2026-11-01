package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
public final class ba extends sb0 {
    public final boolean f24690l0;
    public final boolean m0;
    public final ha f24691n0;

    public ba(ha haVar, Context context, boolean z10, boolean z11) {
        super(context);
        this.f24691n0 = haVar;
        this.f24690l0 = z10;
        this.m0 = z11;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ha haVar = this.f24691n0;
        haVar.W0(canvas, this);
        super.dispatchDraw(canvas);
        haVar.V0(canvas, this);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y3 = motionEvent.getY();
            ha haVar = this.f24691n0;
            if (y3 < haVar.f21613r0.getBounds().top) {
                haVar.dismiss();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (!this.m0) {
            this.f24691n0.getClass();
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i11);
        ha haVar = this.f24691n0;
        haVar.f26726n1 = size;
        haVar.S0(i10, i11);
        if (this.f24690l0) {
            i11 = View.MeasureSpec.makeMeasureSpec(haVar.f26726n1, 1073741824);
        }
        super.onMeasure(i10, i11);
    }
}
