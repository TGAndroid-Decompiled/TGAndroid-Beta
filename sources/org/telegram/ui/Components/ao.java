package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

public final class ao extends ActionBarPopupWindow$ActionBarPopupWindowLayout {
    public final int P;
    public Object Q;

    public ao(Context context, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var, int i12) {
        super(i10, i11, context, c6Var);
        this.P = i12;
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.P) {
            case 0:
                canvas.save();
                Path path = (Path) this.Q;
                path.rewind();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                path.addRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), Path.Direction.CW);
                canvas.clipPath(path);
                boolean zDrawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return zDrawChild;
            case 1:
                canvas.save();
                Path path2 = (Path) this.Q;
                path2.rewind();
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                path2.addRoundRect(rectF2, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), Path.Direction.CW);
                canvas.clipPath(path2);
                boolean zDrawChild2 = super.drawChild(canvas, view, j10);
                canvas.restore();
                return zDrawChild2;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int i12;
        switch (this.P) {
            case 2:
                b70 b70Var = (b70) this.Q;
                if (this == b70Var.A && (i12 = b70Var.X) > 0) {
                    i11 = View.MeasureSpec.makeMeasureSpec(Math.min(i12, View.MeasureSpec.getSize(i11)), View.MeasureSpec.getMode(i11));
                }
                super.onMeasure(i10, i11);
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    public ao(b70 b70Var, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var, int i11) {
        super(i10, i11, context, c6Var);
        this.P = 2;
        this.Q = b70Var;
    }
}
