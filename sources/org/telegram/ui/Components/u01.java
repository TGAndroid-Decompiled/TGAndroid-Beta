package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class u01 extends lw0 {
    public final org.telegram.ui.k20 f31237w0;
    public final org.telegram.ui.ActionBar.d6 f31238x0;
    public final s01 f31239y0;

    public u01(Context context, org.telegram.ui.ActionBar.d6 d6Var, s01 s01Var) {
        super(context, null);
        this.f31238x0 = d6Var;
        this.f31239y0 = s01Var;
        this.f31237w0 = new org.telegram.ui.k20();
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
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.f31239y0) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.save();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, AndroidUtilities.dp(45.0f), getHeight());
            this.f31237w0.b(canvas, rectF, 0, 1.0f);
            canvas.restore();
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final org.telegram.ui.ActionBar.d6 getResourceProvider() {
        return this.f31238x0;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824);
        s01 s01Var = this.f31239y0;
        s01Var.measure(makeMeasureSpec, i11);
        setMeasuredDimension(View.MeasureSpec.getSize(i10), s01Var.getMeasuredHeight() + AndroidUtilities.dp(24.0f));
    }
}
