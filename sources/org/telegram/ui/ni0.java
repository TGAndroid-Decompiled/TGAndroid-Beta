package org.telegram.ui;

import android.widget.ImageView;
public final class ni0 extends org.telegram.ui.Cells.p8 {
    public ImageView W;

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int L;
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = i12 - i10;
        if (org.telegram.messenger.dd.X) {
            L = org.telegram.messenger.i0.L(17.0f);
        } else {
            L = i14 - org.telegram.messenger.i0.L(41.0f);
        }
        int y3 = org.telegram.messenger.a30.y(24.0f, i13 - i11, 2);
        this.W.layout(L, y3, org.telegram.messenger.i0.L(24.0f) + L, org.telegram.messenger.i0.L(24.0f) + y3);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.W.measure(i10, i11);
    }
}
