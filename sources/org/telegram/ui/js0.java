package org.telegram.ui;

import android.content.Context;
public final class js0 extends org.telegram.ui.Components.r61 {
    public final PhotoViewer f39623d0;

    public js0(PhotoViewer photoViewer, Context context, oq0 oq0Var) {
        super(context, oq0Var);
        this.f39623d0 = photoViewer;
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        PhotoViewer.W(this.f39623d0);
    }

    @Override
    public final void setVisibility(int i9) {
        super.setVisibility(i9);
        if (i9 == 0) {
            PhotoViewer.W(this.f39623d0);
        }
    }
}
