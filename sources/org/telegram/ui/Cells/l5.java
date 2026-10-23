package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.messenger.sl;
public final class l5 extends View {
    public int f22678a;

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(sl.C(2.0f, this.f22678a, 1073741824), sl.C(2.0f, this.f22678a, 1073741824));
    }

    public void setItemSize(int i10) {
        this.f22678a = i10;
    }
}
