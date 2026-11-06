package org.telegram.ui;

import android.content.Context;
public final class ip0 extends org.telegram.ui.Components.u51 {
    public final PhotoViewer f46696h0;

    public ip0(PhotoViewer photoViewer, Context context, ln0 ln0Var) {
        super(context, ln0Var);
        this.f46696h0 = photoViewer;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        PhotoViewer.P(this.f46696h0);
    }

    @Override
    public final void setVisibility(int i7) {
        super.setVisibility(i7);
        if (i7 == 0) {
            PhotoViewer.P(this.f46696h0);
        }
    }
}
