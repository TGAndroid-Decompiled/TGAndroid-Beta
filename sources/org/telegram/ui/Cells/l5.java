package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.messenger.vl;
public final class l5 extends View {
    public int f22253a;

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(vl.C(2.0f, this.f22253a, 1073741824), vl.C(2.0f, this.f22253a, 1073741824));
    }

    public void setItemSize(int i10) {
        this.f22253a = i10;
    }
}
