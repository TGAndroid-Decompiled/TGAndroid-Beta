package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
public final class by0 extends rt0 {
    public final h6.m f32324f0;
    public final org.telegram.ui.ActionBar.f6 f32325g0;
    public final zx0 f32326h0;

    public by0(Context context, org.telegram.ui.ActionBar.f6 f6Var, zx0 zx0Var) {
        super(context, null);
        this.f32325g0 = f6Var;
        this.f32326h0 = zx0Var;
        this.f32324f0 = new h6.m(28);
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
        if (view == this.f32326h0) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.save();
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(0.0f, 0.0f, org.telegram.messenger.g0.L(45.0f), getHeight());
            this.f32324f0.m(canvas, rectF, 0, 1.0f);
            canvas.restore();
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final org.telegram.ui.ActionBar.f6 getResourceProvider() {
        return this.f32325g0;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.f22537q.x, 1073741824);
        zx0 zx0Var = this.f32326h0;
        zx0Var.measure(makeMeasureSpec, i10);
        setMeasuredDimension(View.MeasureSpec.getSize(i7), zx0Var.getMeasuredHeight() + org.telegram.messenger.g0.L(24.0f));
    }
}
