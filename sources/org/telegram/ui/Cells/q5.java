package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.messenger.vh;
public final class q5 extends View {
    public int f24832a;

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(vh.D(2.0f, this.f24832a, 1073741824), vh.D(2.0f, this.f24832a, 1073741824));
    }

    public void setItemSize(int i10) {
        this.f24832a = i10;
    }
}
