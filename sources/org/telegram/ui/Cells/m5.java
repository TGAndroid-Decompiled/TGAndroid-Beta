package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.messenger.o10;
public final class m5 extends View {
    public int f31073a;

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(o10.C(2.0f, this.f31073a, 1073741824), o10.C(2.0f, this.f31073a, 1073741824));
    }

    public void setItemSize(int i7) {
        this.f31073a = i7;
    }
}
