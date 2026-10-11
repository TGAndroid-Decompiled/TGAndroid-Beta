package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.messenger.ai;
public final class m5 extends View {
    public int f22490a;

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(ai.C(2.0f, this.f22490a, 1073741824), ai.C(2.0f, this.f22490a, 1073741824));
    }

    public void setItemSize(int i10) {
        this.f22490a = i10;
    }
}
