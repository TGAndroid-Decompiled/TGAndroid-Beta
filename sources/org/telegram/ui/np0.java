package org.telegram.ui;

import android.media.MediaFormat;
public final class np0 implements d3.v {
    public final PhotoViewer f50269a;

    public np0(PhotoViewer photoViewer) {
        this.f50269a = photoViewer;
    }

    @Override
    public final void a(long j3, long j10, e2.u uVar, MediaFormat mediaFormat) {
        org.telegram.ui.Components.i61 i61Var;
        PhotoViewer photoViewer = this.f50269a;
        if (!photoViewer.J4 || (i61Var = photoViewer.G2) == null) {
            return;
        }
        org.telegram.messenger.g0.g3(new fe0(26, this, i61Var));
    }
}
