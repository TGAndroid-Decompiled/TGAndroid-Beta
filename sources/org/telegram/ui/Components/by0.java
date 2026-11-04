package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
public final class by0 extends qt0 {
    public final k4.j f32439g0;
    public final org.telegram.ui.ActionBar.e6 f32440h0;
    public final zx0 f32441i0;

    public by0(Context context, org.telegram.ui.ActionBar.e6 e6Var, zx0 zx0Var) {
        super(context, null);
        this.f32440h0 = e6Var;
        this.f32441i0 = zx0Var;
        this.f32439g0 = new k4.j(24);
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
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.f32441i0) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.save();
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(0.0f, 0.0f, org.telegram.messenger.g0.L(45.0f), getHeight());
            this.f32439g0.w(canvas, rectF, 0, 1.0f);
            canvas.restore();
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final org.telegram.ui.ActionBar.e6 getResourceProvider() {
        return this.f32440h0;
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.f22608q.x, 1073741824);
        zx0 zx0Var = this.f32441i0;
        zx0Var.measure(makeMeasureSpec, i10);
        setMeasuredDimension(View.MeasureSpec.getSize(i3), zx0Var.getMeasuredHeight() + org.telegram.messenger.g0.L(24.0f));
    }
}
