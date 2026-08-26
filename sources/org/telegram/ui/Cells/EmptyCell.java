package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

public final class EmptyCell extends FrameLayout {
    public int cellHeight;

    public EmptyCell(Context context) {
        super(context);
        this.cellHeight = 8;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(this.cellHeight, 1073741824));
    }

    public void setHeight(int i) {
        if (this.cellHeight != i) {
            this.cellHeight = i;
            requestLayout();
        }
    }

    public EmptyCell(Context context, int i) {
        super(context);
        this.cellHeight = i;
    }
}
