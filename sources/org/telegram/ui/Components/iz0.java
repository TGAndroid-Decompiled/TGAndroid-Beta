package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

public final class iz0 extends zu0 {

    public final org.telegram.ui.v10 f29523s0;

    public final org.telegram.ui.ActionBar.c6 f29524t0;

    public final gz0 f29525u0;

    public iz0(Context context, org.telegram.ui.ActionBar.c6 c6Var, gz0 gz0Var) {
        super(context, null);
        this.f29524t0 = c6Var;
        this.f29525u0 = gz0Var;
        this.f29523s0 = new org.telegram.ui.v10();
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
        if (view != this.f29525u0) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        boolean zDrawChild = super.drawChild(canvas, view, j10);
        canvas.save();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, AndroidUtilities.dp(45.0f), getHeight());
        this.f29523s0.b(canvas, rectF, 0, 1.0f);
        canvas.restore();
        canvas.restore();
        return zDrawChild;
    }

    @Override
    public final org.telegram.ui.ActionBar.c6 getResourceProvider() {
        return this.f29524t0;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824);
        gz0 gz0Var = this.f29525u0;
        gz0Var.measure(iMakeMeasureSpec, i11);
        setMeasuredDimension(View.MeasureSpec.getSize(i10), gz0Var.getMeasuredHeight() + AndroidUtilities.dp(24.0f));
    }
}
