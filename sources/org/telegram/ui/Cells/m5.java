package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.messenger.ul;
public final class m5 extends View {
    public int f20409a;

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(ul.C(2.0f, this.f20409a, 1073741824), ul.C(2.0f, this.f20409a, 1073741824));
    }

    public void setItemSize(int i10) {
        this.f20409a = i10;
    }
}
