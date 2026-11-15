package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
public final class ey0 extends st0 {
    public final h6.m f34452g0;
    public final org.telegram.ui.ActionBar.e6 f34453h0;
    public final cy0 f34454i0;

    public ey0(Context context, org.telegram.ui.ActionBar.e6 e6Var, cy0 cy0Var) {
        super(context, null);
        this.f34453h0 = e6Var;
        this.f34454i0 = cy0Var;
        this.f34452g0 = new h6.m(29);
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
        if (view == this.f34454i0) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.save();
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(0.0f, 0.0f, org.telegram.messenger.g0.L(45.0f), getHeight());
            this.f34452g0.m(canvas, rectF, 0, 1.0f);
            canvas.restore();
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final org.telegram.ui.ActionBar.e6 getResourceProvider() {
        return this.f34453h0;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.f23609q.x, 1073741824);
        cy0 cy0Var = this.f34454i0;
        cy0Var.measure(makeMeasureSpec, i10);
        setMeasuredDimension(View.MeasureSpec.getSize(i7), cy0Var.getMeasuredHeight() + org.telegram.messenger.g0.L(24.0f));
    }
}
