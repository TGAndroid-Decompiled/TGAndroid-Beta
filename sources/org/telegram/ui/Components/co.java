package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class co extends ActionBarPopupWindow$ActionBarPopupWindowLayout {
    public final int P;
    public Object Q;

    public co(Context context, int i9, int i10, org.telegram.ui.ActionBar.b6 b6Var, int i11) {
        super(i9, i10, context, b6Var);
        this.P = i11;
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
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            case 1:
                canvas.save();
                Path path2 = (Path) this.Q;
                path2.rewind();
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                path2.addRoundRect(rectF2, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), Path.Direction.CW);
                canvas.clipPath(path2);
                boolean drawChild2 = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild2;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void onMeasure(int i9, int i10) {
        int i11;
        switch (this.P) {
            case 2:
                x60 x60Var = (x60) this.Q;
                if (this == x60Var.A && (i11 = x60Var.X) > 0) {
                    i10 = View.MeasureSpec.makeMeasureSpec(Math.min(i11, View.MeasureSpec.getSize(i10)), View.MeasureSpec.getMode(i10));
                }
                super.onMeasure(i9, i10);
                return;
            default:
                super.onMeasure(i9, i10);
                return;
        }
    }

    public co(x60 x60Var, Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var, int i10) {
        super(i9, i10, context, b6Var);
        this.P = 2;
        this.Q = x60Var;
    }
}
