package org.telegram.ui;

import android.content.Context;
public final class ap0 extends org.telegram.ui.Components.s51 {
    public final PhotoViewer f43822i0;

    public ap0(PhotoViewer photoViewer, Context context, gn0 gn0Var) {
        super(context, gn0Var);
        this.f43822i0 = photoViewer;
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        PhotoViewer.X(this.f43822i0);
    }

    @Override
    public final void setVisibility(int i3) {
        super.setVisibility(i3);
        if (i3 == 0) {
            PhotoViewer.X(this.f43822i0);
        }
    }
}
