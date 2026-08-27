package org.telegram.ui;

import android.content.Context;

public final class ks0 extends org.telegram.ui.Components.t61 {

    public final PhotoViewer f39851d0;

    public ks0(PhotoViewer photoViewer, Context context, pq0 pq0Var) {
        super(context, pq0Var);
        this.f39851d0 = photoViewer;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        PhotoViewer.X(this.f39851d0);
    }

    @Override
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 0) {
            PhotoViewer.X(this.f39851d0);
        }
    }
}
