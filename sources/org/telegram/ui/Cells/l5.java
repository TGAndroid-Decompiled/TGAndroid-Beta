package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.messenger.tl;
public final class l5 extends View {
    public int f22679a;

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(tl.C(2.0f, this.f22679a, 1073741824), tl.C(2.0f, this.f22679a, 1073741824));
    }

    public void setItemSize(int i10) {
        this.f22679a = i10;
    }
}
