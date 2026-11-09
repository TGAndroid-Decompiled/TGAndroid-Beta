package org.telegram.ui;

import android.content.Context;
public final class lp0 extends org.telegram.ui.Components.a61 {
    public final PhotoViewer f47663h0;

    public lp0(PhotoViewer photoViewer, Context context, nn0 nn0Var) {
        super(context, nn0Var);
        this.f47663h0 = photoViewer;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        PhotoViewer.P(this.f47663h0);
    }

    @Override
    public final void setVisibility(int i7) {
        super.setVisibility(i7);
        if (i7 == 0) {
            PhotoViewer.P(this.f47663h0);
        }
    }
}
