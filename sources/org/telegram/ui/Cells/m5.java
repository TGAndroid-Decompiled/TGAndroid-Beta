package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.messenger.em;
public final class m5 extends View {
    public int f19528a;

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(em.C(2.0f, this.f19528a, 1073741824), em.C(2.0f, this.f19528a, 1073741824));
    }

    public void setItemSize(int i10) {
        this.f19528a = i10;
    }
}
