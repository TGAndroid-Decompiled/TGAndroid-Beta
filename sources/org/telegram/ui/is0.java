package org.telegram.ui;

import android.content.Context;
public final class is0 extends org.telegram.ui.Components.d71 {
    public final PhotoViewer f39335d0;

    public is0(PhotoViewer photoViewer, Context context, oq0 oq0Var) {
        super(context, oq0Var);
        this.f39335d0 = photoViewer;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        PhotoViewer.X(this.f39335d0);
    }

    @Override
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 0) {
            PhotoViewer.X(this.f39335d0);
        }
    }
}
