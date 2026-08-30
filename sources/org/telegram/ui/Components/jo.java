package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class jo extends ActionBarPopupWindow$ActionBarPopupWindowLayout {
    public final int Q;
    public Object R;

    public jo(Context context, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var, int i12) {
        super(i10, i11, context, f6Var);
        this.Q = i12;
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.Q) {
            case 0:
                canvas.save();
                Path path = (Path) this.R;
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
                Path path2 = (Path) this.R;
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
    public void onMeasure(int i10, int i11) {
        int i12;
        switch (this.Q) {
            case 2:
                o70 o70Var = (o70) this.R;
                if (this == o70Var.A && (i12 = o70Var.X) > 0) {
                    i11 = View.MeasureSpec.makeMeasureSpec(Math.min(i12, View.MeasureSpec.getSize(i11)), View.MeasureSpec.getMode(i11));
                }
                super.onMeasure(i10, i11);
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    public jo(o70 o70Var, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var, int i11) {
        super(i10, i11, context, f6Var);
        this.Q = 2;
        this.R = o70Var;
    }
}
