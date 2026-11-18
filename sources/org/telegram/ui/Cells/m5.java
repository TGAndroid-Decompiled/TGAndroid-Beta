package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.messenger.n10;
public final class m5 extends View {
    public int f31076a;

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(n10.C(2.0f, this.f31076a, 1073741824), n10.C(2.0f, this.f31076a, 1073741824));
    }

    public void setItemSize(int i7) {
        this.f31076a = i7;
    }
}
