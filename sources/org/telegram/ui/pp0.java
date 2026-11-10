package org.telegram.ui;

import android.media.MediaFormat;
public final class pp0 implements d3.w {
    public final PhotoViewer f48818a;

    public pp0(PhotoViewer photoViewer) {
        this.f48818a = photoViewer;
    }

    @Override
    public final void b(long j3, long j10, e2.u uVar, MediaFormat mediaFormat) {
        org.telegram.ui.Components.t51 t51Var;
        PhotoViewer photoViewer = this.f48818a;
        if (!photoViewer.I4 || (t51Var = photoViewer.F2) == null) {
            return;
        }
        org.telegram.messenger.g0.h3(new tn0(4, this, t51Var));
    }
}
