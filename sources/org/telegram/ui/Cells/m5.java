package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.messenger.am;
public final class m5 extends View {
    public int f22226a;

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(am.C(2.0f, this.f22226a, 1073741824), am.C(2.0f, this.f22226a, 1073741824));
    }

    public void setItemSize(int i10) {
        this.f22226a = i10;
    }
}
