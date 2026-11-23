package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
public final class my0 extends cu0 {
    public final i61 f37569g0;
    public final org.telegram.ui.ActionBar.i6 f37570h0;
    public final ky0 f37571i0;

    public my0(Context context, org.telegram.ui.ActionBar.i6 i6Var, ky0 ky0Var) {
        super(context, null);
        this.f37570h0 = i6Var;
        this.f37571i0 = ky0Var;
        this.f37569g0 = new i61(1);
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
        if (view == this.f37571i0) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.save();
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(0.0f, 0.0f, org.telegram.messenger.g0.L(45.0f), getHeight());
            this.f37569g0.u(canvas, rectF, 0, 1.0f);
            canvas.restore();
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final org.telegram.ui.ActionBar.i6 getResourceProvider() {
        return this.f37570h0;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.f24226q.x, 1073741824);
        ky0 ky0Var = this.f37571i0;
        ky0Var.measure(makeMeasureSpec, i10);
        setMeasuredDimension(View.MeasureSpec.getSize(i7), ky0Var.getMeasuredHeight() + org.telegram.messenger.g0.L(24.0f));
    }
}
