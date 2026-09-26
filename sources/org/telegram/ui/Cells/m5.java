package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.messenger.ok;
public final class m5 extends View {
    public int f20643a;

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(ok.C(2.0f, this.f20643a, 1073741824), ok.C(2.0f, this.f20643a, 1073741824));
    }

    public void setItemSize(int i10) {
        this.f20643a = i10;
    }
}
