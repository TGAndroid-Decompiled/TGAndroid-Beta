package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class gz0 extends xu0 {
    public final org.telegram.ui.s10 f28899s0;
    public final org.telegram.ui.ActionBar.b6 f28900t0;
    public final ez0 f28901u0;

    public gz0(Context context, org.telegram.ui.ActionBar.b6 b6Var, ez0 ez0Var) {
        super(context, null);
        this.f28900t0 = b6Var;
        this.f28901u0 = ez0Var;
        this.f28899s0 = new org.telegram.ui.s10();
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
        if (view == this.f28901u0) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.save();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, AndroidUtilities.dp(45.0f), getHeight());
            this.f28899s0.b(canvas, rectF, 0, 1.0f);
            canvas.restore();
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final org.telegram.ui.ActionBar.b6 getResourceProvider() {
        return this.f28900t0;
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824);
        ez0 ez0Var = this.f28901u0;
        ez0Var.measure(makeMeasureSpec, i10);
        setMeasuredDimension(View.MeasureSpec.getSize(i9), ez0Var.getMeasuredHeight() + AndroidUtilities.dp(24.0f));
    }
}
