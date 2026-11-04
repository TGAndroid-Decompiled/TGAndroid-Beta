package org.telegram.ui;

import android.widget.ImageView;
public final class fh0 extends org.telegram.ui.Cells.l8 {
    public ImageView f45283a0;

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int L;
        super.onLayout(z10, i3, i10, i11, i12);
        int i13 = i11 - i3;
        if (org.telegram.messenger.bd.f21784a0) {
            L = org.telegram.messenger.g0.L(17.0f);
        } else {
            L = i13 - org.telegram.messenger.g0.L(41.0f);
        }
        int y9 = org.telegram.messenger.camera.q.y(24.0f, i12 - i10, 2);
        this.f45283a0.layout(L, y9, org.telegram.messenger.g0.L(24.0f) + L, org.telegram.messenger.g0.L(24.0f) + y9);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        this.f45283a0.measure(i3, i10);
    }
}
