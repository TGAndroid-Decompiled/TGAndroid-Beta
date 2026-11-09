package org.telegram.ui;

import android.widget.ImageView;
public final class lh0 extends org.telegram.ui.Cells.m8 {
    public ImageView W;

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int L;
        super.onLayout(z9, i7, i10, i11, i12);
        int i13 = i11 - i7;
        if (org.telegram.messenger.id.f23157a0) {
            L = org.telegram.messenger.g0.L(17.0f);
        } else {
            L = i13 - org.telegram.messenger.g0.L(41.0f);
        }
        int y10 = org.telegram.messenger.camera.q.y(24.0f, i12 - i10, 2);
        this.W.layout(L, y10, org.telegram.messenger.g0.L(24.0f) + L, org.telegram.messenger.g0.L(24.0f) + y10);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        this.W.measure(i7, i10);
    }
}
