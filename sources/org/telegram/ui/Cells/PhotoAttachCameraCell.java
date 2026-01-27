package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

public class PhotoAttachCameraCell extends View {
    private int itemSize;

    public PhotoAttachCameraCell(Context context) {
        super(context);
        setFocusable(true);
        this.itemSize = AndroidUtilities.dp(0.0f);
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.itemSize + AndroidUtilities.dp(2.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(this.itemSize + AndroidUtilities.dp(2.0f), 1073741824));
    }

    public void setItemSize(int i) {
        this.itemSize = i;
    }
}
