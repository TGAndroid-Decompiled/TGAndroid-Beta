package org.telegram.ui.Cells;

import android.view.View;
import com.google.android.gms.internal.mlkit_vision_common.zzkm;

public final class PhotoAttachCameraCell extends View {
    public int itemSize;

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(zzkm.m(2.0f, this.itemSize), zzkm.m(2.0f, this.itemSize));
    }

    public void setItemSize(int i) {
        this.itemSize = i;
    }
}
