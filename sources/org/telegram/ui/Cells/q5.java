package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.messenger.wh;
public final class q5 extends View {
    public int f24836a;

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(wh.D(2.0f, this.f24836a, 1073741824), wh.D(2.0f, this.f24836a, 1073741824));
    }

    public void setItemSize(int i10) {
        this.f24836a = i10;
    }
}
