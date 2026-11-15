package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.messenger.i20;
public final class k5 extends View {
    public int f30566a;

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i20.B(2.0f, this.f30566a, 1073741824), i20.B(2.0f, this.f30566a, 1073741824));
    }

    public void setItemSize(int i7) {
        this.f30566a = i7;
    }
}
