package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class x01 extends ow0 {
    public final org.telegram.ui.p20 f31096w0;
    public final org.telegram.ui.ActionBar.c6 f31097x0;
    public final v01 f31098y0;

    public x01(Context context, org.telegram.ui.ActionBar.c6 c6Var, v01 v01Var) {
        super(context, null);
        this.f31097x0 = c6Var;
        this.f31098y0 = v01Var;
        this.f31096w0 = new org.telegram.ui.p20();
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
        if (view == this.f31098y0) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.save();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, AndroidUtilities.dp(45.0f), getHeight());
            this.f31096w0.b(canvas, rectF, 0, 1.0f);
            canvas.restore();
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final org.telegram.ui.ActionBar.c6 getResourceProvider() {
        return this.f31097x0;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824);
        v01 v01Var = this.f31098y0;
        v01Var.measure(makeMeasureSpec, i11);
        setMeasuredDimension(View.MeasureSpec.getSize(i10), v01Var.getMeasuredHeight() + AndroidUtilities.dp(24.0f));
    }
}
