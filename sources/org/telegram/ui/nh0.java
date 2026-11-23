package org.telegram.ui;

import android.widget.ImageView;
public final class nh0 extends org.telegram.ui.Cells.m8 {
    public ImageView f50317a0;

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int L;
        super.onLayout(z10, i7, i10, i11, i12);
        int i13 = i11 - i7;
        if (org.telegram.messenger.gd.f24314a0) {
            L = org.telegram.messenger.g0.L(17.0f);
        } else {
            L = i13 - org.telegram.messenger.g0.L(41.0f);
        }
        int z11 = org.telegram.messenger.m10.z(24.0f, i12 - i10, 2);
        this.f50317a0.layout(L, z11, org.telegram.messenger.g0.L(24.0f) + L, org.telegram.messenger.g0.L(24.0f) + z11);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        this.f50317a0.measure(i7, i10);
    }
}
