package org.telegram.ui;

import android.content.Context;
public final class et0 extends org.telegram.ui.Components.b81 {
    public final PhotoViewer f33467h0;

    public et0(PhotoViewer photoViewer, Context context, ir0 ir0Var) {
        super(context, ir0Var);
        this.f33467h0 = photoViewer;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        PhotoViewer.X(this.f33467h0);
    }

    @Override
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 0) {
            PhotoViewer.X(this.f33467h0);
        }
    }
}
