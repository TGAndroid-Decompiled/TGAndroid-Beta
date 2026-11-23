package org.telegram.ui;

import android.media.MediaFormat;
public final class np0 implements d3.v {
    public final PhotoViewer f50389a;

    public np0(PhotoViewer photoViewer) {
        this.f50389a = photoViewer;
    }

    @Override
    public final void a(long j3, long j10, e2.u uVar, MediaFormat mediaFormat) {
        org.telegram.ui.Components.h61 h61Var;
        PhotoViewer photoViewer = this.f50389a;
        if (!photoViewer.J4 || (h61Var = photoViewer.G2) == null) {
            return;
        }
        org.telegram.messenger.g0.g3(new mp0(0, this, h61Var));
    }
}
