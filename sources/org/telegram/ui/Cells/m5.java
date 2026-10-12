package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.messenger.yh;
public final class m5 extends View {
    public int f21519a;

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(yh.D(2.0f, this.f21519a, 1073741824), yh.D(2.0f, this.f21519a, 1073741824));
    }

    public void setItemSize(int i10) {
        this.f21519a = i10;
    }
}
