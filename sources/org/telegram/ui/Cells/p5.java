package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.messenger.a30;
public final class p5 extends View {
    public int f22456a;

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(a30.B(2.0f, this.f22456a, 1073741824), a30.B(2.0f, this.f22456a, 1073741824));
    }

    public void setItemSize(int i10) {
        this.f22456a = i10;
    }
}
