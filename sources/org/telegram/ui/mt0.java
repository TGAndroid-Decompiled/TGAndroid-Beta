package org.telegram.ui;

import android.content.Context;
public final class mt0 extends org.telegram.ui.Components.b81 {
    public final PhotoViewer f35814h0;

    public mt0(PhotoViewer photoViewer, Context context, rr0 rr0Var) {
        super(context, rr0Var);
        this.f35814h0 = photoViewer;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        PhotoViewer.X(this.f35814h0);
    }

    @Override
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 0) {
            PhotoViewer.X(this.f35814h0);
        }
    }
}
