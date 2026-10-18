package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.messenger.kk;
public final class l5 extends View {
    public int f22541a;

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(kk.C(2.0f, this.f22541a, 1073741824), kk.C(2.0f, this.f22541a, 1073741824));
    }

    public void setItemSize(int i10) {
        this.f22541a = i10;
    }
}
