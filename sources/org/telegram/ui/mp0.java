package org.telegram.ui;

import android.content.Context;
public final class mp0 extends org.telegram.ui.Components.z51 {
    public final PhotoViewer f48038h0;

    public mp0(PhotoViewer photoViewer, Context context, on0 on0Var) {
        super(context, on0Var);
        this.f48038h0 = photoViewer;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        PhotoViewer.P(this.f48038h0);
    }

    @Override
    public final void setVisibility(int i7) {
        super.setVisibility(i7);
        if (i7 == 0) {
            PhotoViewer.P(this.f48038h0);
        }
    }
}
