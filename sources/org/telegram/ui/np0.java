package org.telegram.ui;

import android.media.MediaFormat;
public final class np0 implements d3.v {
    public final PhotoViewer f50278a;

    public np0(PhotoViewer photoViewer) {
        this.f50278a = photoViewer;
    }

    @Override
    public final void a(long j3, long j10, e2.u uVar, MediaFormat mediaFormat) {
        org.telegram.ui.Components.f61 f61Var;
        PhotoViewer photoViewer = this.f50278a;
        if (!photoViewer.J4 || (f61Var = photoViewer.G2) == null) {
            return;
        }
        org.telegram.messenger.g0.g3(new ve0(24, this, f61Var));
    }
}
