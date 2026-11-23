package org.telegram.ui;

import android.content.Context;
public final class kp0 extends org.telegram.ui.Components.o61 {
    public final PhotoViewer f49375i0;

    public kp0(PhotoViewer photoViewer, Context context, qn0 qn0Var) {
        super(context, qn0Var);
        this.f49375i0 = photoViewer;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        PhotoViewer.Q(this.f49375i0);
    }

    @Override
    public final void setVisibility(int i7) {
        super.setVisibility(i7);
        if (i7 == 0) {
            PhotoViewer.Q(this.f49375i0);
        }
    }
}
