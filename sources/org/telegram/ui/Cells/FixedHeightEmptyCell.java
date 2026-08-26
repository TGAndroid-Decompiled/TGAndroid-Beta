package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

public final class FixedHeightEmptyCell extends View {
    public final int $r8$classId;
    public final int heightInDp;

    public FixedHeightEmptyCell(Context context, int i, int i2) {
        super(context);
        this.$r8$classId = i2;
        switch (i2) {
            case 1:
                this.heightInDp = i;
                super(context);
                break;
            default:
                this.heightInDp = i;
                break;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        switch (this.$r8$classId) {
            case 0:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.heightInDp), 1073741824));
                break;
            default:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.heightInDp), 1073741824));
                break;
        }
    }
}
