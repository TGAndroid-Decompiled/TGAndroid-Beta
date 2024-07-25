package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public class FixedHeightEmptyCell extends View {
    int heightInDp;

    public FixedHeightEmptyCell(Context context, int i) {
        super(context);
        this.heightInDp = i;
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.heightInDp), 1073741824));
    }
}
