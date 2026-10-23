package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.messenger.nk;
public final class l5 extends View {
    public int f22542a;

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(nk.C(2.0f, this.f22542a, 1073741824), nk.C(2.0f, this.f22542a, 1073741824));
    }

    public void setItemSize(int i10) {
        this.f22542a = i10;
    }
}
