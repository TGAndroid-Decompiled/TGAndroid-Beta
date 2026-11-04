package org.telegram.ui.Cells;

import android.view.View;
public final class k5 extends View {
    public int f29505a;

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(org.telegram.messenger.camera.q.B(2.0f, this.f29505a, 1073741824), org.telegram.messenger.camera.q.B(2.0f, this.f29505a, 1073741824));
    }

    public void setItemSize(int i3) {
        this.f29505a = i3;
    }
}
