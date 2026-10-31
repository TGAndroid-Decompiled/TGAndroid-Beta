package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class eo extends ActionBarPopupWindow$ActionBarPopupWindowLayout {
    public final int T;
    public Object U;

    public eo(int i10, int i11, int i12, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(i10, i11, context, p6Var);
        this.T = i12;
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.T) {
            case 0:
                canvas.save();
                Path path = (Path) this.U;
                path.rewind();
                RectF rectF = org.telegram.messenger.i0.P;
                rectF.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                path.addRoundRect(rectF, org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), Path.Direction.CW);
                canvas.clipPath(path);
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            case 1:
                canvas.save();
                Path path2 = (Path) this.U;
                path2.rewind();
                RectF rectF2 = org.telegram.messenger.i0.P;
                rectF2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                path2.addRoundRect(rectF2, org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), Path.Direction.CW);
                canvas.clipPath(path2);
                boolean drawChild2 = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild2;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int i12;
        switch (this.T) {
            case 2:
                z60 z60Var = (z60) this.U;
                if (this == z60Var.A && (i12 = z60Var.X) > 0) {
                    i11 = View.MeasureSpec.makeMeasureSpec(Math.min(i12, View.MeasureSpec.getSize(i11)), View.MeasureSpec.getMode(i11));
                }
                super.onMeasure(i10, i11);
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    public eo(z60 z60Var, Context context, org.telegram.ui.ActionBar.p6 p6Var, int i10) {
        super(2131232564, i10, context, p6Var);
        this.T = 2;
        this.U = z60Var;
    }
}
