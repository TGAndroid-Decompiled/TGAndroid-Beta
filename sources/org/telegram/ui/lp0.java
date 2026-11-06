package org.telegram.ui;

import android.media.MediaFormat;
public final class lp0 implements d3.w {
    public final PhotoViewer f47545a;

    public lp0(PhotoViewer photoViewer) {
        this.f47545a = photoViewer;
    }

    @Override
    public final void b(long j3, long j10, e2.u uVar, MediaFormat mediaFormat) {
        org.telegram.ui.Components.n51 n51Var;
        PhotoViewer photoViewer = this.f47545a;
        if (!photoViewer.I4 || (n51Var = photoViewer.F2) == null) {
            return;
        }
        org.telegram.messenger.g0.h3(new qn0(3, this, n51Var));
    }
}
