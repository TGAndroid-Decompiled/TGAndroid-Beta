package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class mo extends ActionBarPopupWindow$ActionBarPopupWindowLayout {
    public final int U;
    public Object V;

    public mo(int i7, int i10, int i11, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(i7, i10, context, i6Var);
        this.U = i11;
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        switch (this.U) {
            case 0:
                canvas.save();
                Path path = (Path) this.V;
                path.rewind();
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                path.addRoundRect(rectF, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), Path.Direction.CW);
                canvas.clipPath(path);
                boolean drawChild = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild;
            case 1:
                canvas.save();
                Path path2 = (Path) this.V;
                path2.rewind();
                RectF rectF2 = org.telegram.messenger.g0.P;
                rectF2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                path2.addRoundRect(rectF2, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), Path.Direction.CW);
                canvas.clipPath(path2);
                boolean drawChild2 = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild2;
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        int i11;
        switch (this.U) {
            case 2:
                x60 x60Var = (x60) this.V;
                if (this == x60Var.A && (i11 = x60Var.f41860a0) > 0) {
                    i10 = View.MeasureSpec.makeMeasureSpec(Math.min(i11, View.MeasureSpec.getSize(i10)), View.MeasureSpec.getMode(i10));
                }
                super.onMeasure(i7, i10);
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    public mo(x60 x60Var, Context context, org.telegram.ui.ActionBar.i6 i6Var, int i7) {
        super(2131232572, i7, context, i6Var);
        this.U = 2;
        this.V = x60Var;
    }
}
