package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.messenger.z20;
public final class p5 extends View {
    public int f22455a;

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(z20.B(2.0f, this.f22455a, 1073741824), z20.B(2.0f, this.f22455a, 1073741824));
    }

    public void setItemSize(int i10) {
        this.f22455a = i10;
    }
}
