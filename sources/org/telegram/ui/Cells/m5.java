package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.messenger.bi;
public final class m5 extends View {
    public int f22475a;

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(bi.B(2.0f, this.f22475a, 1073741824), bi.B(2.0f, this.f22475a, 1073741824));
    }

    public void setItemSize(int i10) {
        this.f22475a = i10;
    }
}
