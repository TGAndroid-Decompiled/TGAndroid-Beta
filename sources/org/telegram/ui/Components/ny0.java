package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
public final class ny0 extends du0 {
    public final h6.m f38012g0;
    public final org.telegram.ui.ActionBar.h6 f38013h0;
    public final ly0 f38014i0;

    public ny0(Context context, org.telegram.ui.ActionBar.h6 h6Var, ly0 ly0Var) {
        super(context, null);
        this.f38013h0 = h6Var;
        this.f38014i0 = ly0Var;
        this.f38012g0 = new h6.m(29);
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
        if (view == this.f38014i0) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.save();
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(0.0f, 0.0f, org.telegram.messenger.g0.L(45.0f), getHeight());
            this.f38012g0.n(canvas, rectF, 0, 1.0f);
            canvas.restore();
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final org.telegram.ui.ActionBar.h6 getResourceProvider() {
        return this.f38013h0;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.f24146q.x, 1073741824);
        ly0 ly0Var = this.f38014i0;
        ly0Var.measure(makeMeasureSpec, i10);
        setMeasuredDimension(View.MeasureSpec.getSize(i7), ly0Var.getMeasuredHeight() + org.telegram.messenger.g0.L(24.0f));
    }
}
