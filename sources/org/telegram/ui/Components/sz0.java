package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class sz0 extends hv0 {
    public final org.telegram.ui.u10 f32766s0;
    public final org.telegram.ui.ActionBar.c6 f32767t0;
    public final qz0 f32768u0;

    public sz0(Context context, org.telegram.ui.ActionBar.c6 c6Var, qz0 qz0Var) {
        super(context, null);
        this.f32767t0 = c6Var;
        this.f32768u0 = qz0Var;
        this.f32766s0 = new org.telegram.ui.u10();
    }

    @Override
    public final boolean P() {
        return false;
    }

    @Override
    public final boolean Q() {
        return false;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.f32768u0) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.save();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, AndroidUtilities.dp(45.0f), getHeight());
            this.f32766s0.b(canvas, rectF, 0, 1.0f);
            canvas.restore();
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final org.telegram.ui.ActionBar.c6 getResourceProvider() {
        return this.f32767t0;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824);
        qz0 qz0Var = this.f32768u0;
        qz0Var.measure(makeMeasureSpec, i11);
        setMeasuredDimension(View.MeasureSpec.getSize(i10), qz0Var.getMeasuredHeight() + AndroidUtilities.dp(24.0f));
    }
}
