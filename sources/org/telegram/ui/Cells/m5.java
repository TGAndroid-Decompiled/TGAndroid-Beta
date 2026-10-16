package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.messenger.sk;
public final class m5 extends View {
    public int f21217a;

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(sk.C(2.0f, this.f21217a, 1073741824), sk.C(2.0f, this.f21217a, 1073741824));
    }

    public void setItemSize(int i10) {
        this.f21217a = i10;
    }
}
