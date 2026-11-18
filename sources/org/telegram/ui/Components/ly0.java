package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
public final class ly0 extends au0 {
    public final h6.m f37269g0;
    public final org.telegram.ui.ActionBar.i6 f37270h0;
    public final jy0 f37271i0;

    public ly0(Context context, org.telegram.ui.ActionBar.i6 i6Var, jy0 jy0Var) {
        super(context, null);
        this.f37270h0 = i6Var;
        this.f37271i0 = jy0Var;
        this.f37269g0 = new h6.m(29);
    }

    @Override
    public final boolean O() {
        return false;
    }

    @Override
    public final boolean P() {
        return false;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.f37271i0) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.save();
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(0.0f, 0.0f, org.telegram.messenger.g0.L(45.0f), getHeight());
            this.f37269g0.n(canvas, rectF, 0, 1.0f);
            canvas.restore();
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final org.telegram.ui.ActionBar.i6 getResourceProvider() {
        return this.f37270h0;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.f24118q.x, 1073741824);
        jy0 jy0Var = this.f37271i0;
        jy0Var.measure(makeMeasureSpec, i10);
        setMeasuredDimension(View.MeasureSpec.getSize(i7), jy0Var.getMeasuredHeight() + org.telegram.messenger.g0.L(24.0f));
    }
}
