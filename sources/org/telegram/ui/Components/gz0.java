package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
public final class gz0 extends uu0 {
    public final li.k f26555f0;
    public final org.telegram.ui.ActionBar.p6 f26556g0;
    public final ez0 f26557h0;

    public gz0(Context context, org.telegram.ui.ActionBar.p6 p6Var, ez0 ez0Var) {
        super(context, null);
        this.f26556g0 = p6Var;
        this.f26557h0 = ez0Var;
        this.f26555f0 = new li.k(23);
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
        if (view == this.f26557h0) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.save();
            RectF rectF = org.telegram.messenger.i0.P;
            rectF.set(0.0f, 0.0f, org.telegram.messenger.i0.L(45.0f), getHeight());
            this.f26555f0.o(canvas, rectF, 0, 1.0f);
            canvas.restore();
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final org.telegram.ui.ActionBar.p6 getResourceProvider() {
        return this.f26556g0;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.f16026q.x, 1073741824);
        ez0 ez0Var = this.f26557h0;
        ez0Var.measure(makeMeasureSpec, i11);
        setMeasuredDimension(View.MeasureSpec.getSize(i10), ez0Var.getMeasuredHeight() + org.telegram.messenger.i0.L(24.0f));
    }
}
