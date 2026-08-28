package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.messenger.ll;
public final class m5 extends View {
    public int f24710a;

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(ll.C(2.0f, this.f24710a, 1073741824), ll.C(2.0f, this.f24710a, 1073741824));
    }

    public void setItemSize(int i9) {
        this.f24710a = i9;
    }
}
