package org.telegram.ui;

import android.content.Context;
public final class ht0 extends org.telegram.ui.Components.l81 {
    public final PhotoViewer f37176h0;

    public ht0(PhotoViewer photoViewer, Context context, lr0 lr0Var) {
        super(context, lr0Var);
        this.f37176h0 = photoViewer;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        PhotoViewer.W(this.f37176h0);
    }

    @Override
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 0) {
            PhotoViewer.W(this.f37176h0);
        }
    }
}
