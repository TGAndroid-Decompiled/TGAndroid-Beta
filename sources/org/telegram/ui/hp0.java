package org.telegram.ui;

import android.content.Context;
public final class hp0 extends org.telegram.ui.Components.a61 {
    public final PhotoViewer f47785i0;

    public hp0(PhotoViewer photoViewer, Context context, nn0 nn0Var) {
        super(context, nn0Var);
        this.f47785i0 = photoViewer;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        PhotoViewer.Q(this.f47785i0);
    }

    @Override
    public final void setVisibility(int i7) {
        super.setVisibility(i7);
        if (i7 == 0) {
            PhotoViewer.Q(this.f47785i0);
        }
    }
}
