package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class m01 extends dw0 {
    public final org.telegram.ui.g20 f26165w0;
    public final org.telegram.ui.ActionBar.d6 f26166x0;
    public final k01 f26167y0;

    public m01(Context context, org.telegram.ui.ActionBar.d6 d6Var, k01 k01Var) {
        super(context, null);
        this.f26166x0 = d6Var;
        this.f26167y0 = k01Var;
        this.f26165w0 = new org.telegram.ui.g20();
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
        if (view == this.f26167y0) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.save();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, AndroidUtilities.dp(45.0f), getHeight());
            this.f26165w0.b(canvas, rectF, 0, 1.0f);
            canvas.restore();
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final org.telegram.ui.ActionBar.d6 getResourceProvider() {
        return this.f26166x0;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824);
        k01 k01Var = this.f26167y0;
        k01Var.measure(makeMeasureSpec, i11);
        setMeasuredDimension(View.MeasureSpec.getSize(i10), k01Var.getMeasuredHeight() + AndroidUtilities.dp(24.0f));
    }
}
