package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class g11 extends vw0 {
    public final org.telegram.ui.w10 f28383l0;
    public final org.telegram.ui.ActionBar.u6 m0;
    public final e11 f28384n0;

    public g11(Context context, org.telegram.ui.ActionBar.u6 u6Var, e11 e11Var) {
        super(context, null);
        this.m0 = u6Var;
        this.f28384n0 = e11Var;
        this.f28383l0 = new org.telegram.ui.w10();
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
        if (view == this.f28384n0) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.save();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, AndroidUtilities.dp(45.0f), getHeight());
            this.f28383l0.b(canvas, rectF, 0, 1.0f);
            canvas.restore();
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final org.telegram.ui.ActionBar.u6 getResourceProvider() {
        return this.m0;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824);
        e11 e11Var = this.f28384n0;
        e11Var.measure(makeMeasureSpec, i11);
        setMeasuredDimension(View.MeasureSpec.getSize(i10), e11Var.getMeasuredHeight() + AndroidUtilities.dp(24.0f));
    }
}
