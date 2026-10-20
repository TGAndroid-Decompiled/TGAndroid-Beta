package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.messenger.mk;
public final class l5 extends View {
    public int f22538a;

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(mk.C(2.0f, this.f22538a, 1073741824), mk.C(2.0f, this.f22538a, 1073741824));
    }

    public void setItemSize(int i10) {
        this.f22538a = i10;
    }
}
