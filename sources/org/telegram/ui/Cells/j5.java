package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.messenger.rl;

public final class j5 extends View {

    public int f24531a;

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(rl.B(2.0f, this.f24531a, 1073741824), rl.B(2.0f, this.f24531a, 1073741824));
    }

    public void setItemSize(int i10) {
        this.f24531a = i10;
    }
}
