package org.telegram.ui;

import android.content.Context;
public final class lt0 extends org.telegram.ui.Components.a81 {
    public final PhotoViewer f34772h0;

    public lt0(PhotoViewer photoViewer, Context context, qr0 qr0Var) {
        super(context, qr0Var);
        this.f34772h0 = photoViewer;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        PhotoViewer.X(this.f34772h0);
    }

    @Override
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 0) {
            PhotoViewer.X(this.f34772h0);
        }
    }
}
