package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.messenger.wh;
public final class m5 extends View {
    public int f20607a;

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(wh.C(2.0f, this.f20607a, 1073741824), wh.C(2.0f, this.f20607a, 1073741824));
    }

    public void setItemSize(int i10) {
        this.f20607a = i10;
    }
}
