package org.telegram.ui;

import android.content.Context;
public final class ft0 extends org.telegram.ui.Components.m71 {
    public final PhotoViewer f33365h0;

    public ft0(PhotoViewer photoViewer, Context context, kr0 kr0Var) {
        super(context, kr0Var);
        this.f33365h0 = photoViewer;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        PhotoViewer.X(this.f33365h0);
    }

    @Override
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 0) {
            PhotoViewer.X(this.f33365h0);
        }
    }
}
