package org.telegram.ui;

import android.widget.ImageView;
public final class lh0 extends org.telegram.ui.Cells.l8 {
    public ImageView f48993a0;

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int L;
        super.onLayout(z10, i7, i10, i11, i12);
        int i13 = i11 - i7;
        if (org.telegram.messenger.hd.f24104a0) {
            L = org.telegram.messenger.g0.L(17.0f);
        } else {
            L = i13 - org.telegram.messenger.g0.L(41.0f);
        }
        int y10 = org.telegram.messenger.i20.y(24.0f, i12 - i10, 2);
        this.f48993a0.layout(L, y10, org.telegram.messenger.g0.L(24.0f) + L, org.telegram.messenger.g0.L(24.0f) + y10);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        this.f48993a0.measure(i7, i10);
    }
}
