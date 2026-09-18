package org.telegram.ui;

import android.content.Context;
public final class ot0 extends org.telegram.ui.Components.o71 {
    public final PhotoViewer f36427h0;

    public ot0(PhotoViewer photoViewer, Context context, sr0 sr0Var) {
        super(context, sr0Var);
        this.f36427h0 = photoViewer;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        PhotoViewer.X(this.f36427h0);
    }

    @Override
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 0) {
            PhotoViewer.X(this.f36427h0);
        }
    }
}
