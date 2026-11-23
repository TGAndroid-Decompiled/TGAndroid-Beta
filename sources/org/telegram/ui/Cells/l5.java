package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.messenger.m10;
public final class l5 extends View {
    public int f31087a;

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(m10.C(2.0f, this.f31087a, 1073741824), m10.C(2.0f, this.f31087a, 1073741824));
    }

    public void setItemSize(int i7) {
        this.f31087a = i7;
    }
}
