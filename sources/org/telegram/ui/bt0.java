package org.telegram.ui;

import android.content.Context;
public final class bt0 extends org.telegram.ui.Components.a91 {
    public final PhotoViewer f38100h0;

    public bt0(PhotoViewer photoViewer, Context context, hr0 hr0Var) {
        super(context, hr0Var);
        this.f38100h0 = photoViewer;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        PhotoViewer.Y(this.f38100h0);
    }

    @Override
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 0) {
            PhotoViewer.Y(this.f38100h0);
        }
    }
}
