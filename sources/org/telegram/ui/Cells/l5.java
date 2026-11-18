package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.messenger.n10;
public final class l5 extends View {
    public int f31003a;

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(n10.C(2.0f, this.f31003a, 1073741824), n10.C(2.0f, this.f31003a, 1073741824));
    }

    public void setItemSize(int i7) {
        this.f31003a = i7;
    }
}
