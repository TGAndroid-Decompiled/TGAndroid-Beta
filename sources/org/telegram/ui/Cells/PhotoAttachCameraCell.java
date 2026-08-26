package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.ArticleViewer$10$$ExternalSyntheticOutline0;

public final class PhotoAttachCameraCell extends View {
    public int itemSize;

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(ArticleViewer$10$$ExternalSyntheticOutline0.m(2.0f, this.itemSize, 1073741824), ArticleViewer$10$$ExternalSyntheticOutline0.m(2.0f, this.itemSize, 1073741824));
    }

    public void setItemSize(int i) {
        this.itemSize = i;
    }
}
