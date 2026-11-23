package org.telegram.ui;

import android.media.MediaFormat;
public final class op0 implements d3.v {
    public final PhotoViewer f50614a;

    public op0(PhotoViewer photoViewer) {
        this.f50614a = photoViewer;
    }

    @Override
    public final void a(long j3, long j10, e2.u uVar, MediaFormat mediaFormat) {
        org.telegram.ui.Components.i61 i61Var;
        PhotoViewer photoViewer = this.f50614a;
        if (!photoViewer.J4 || (i61Var = photoViewer.G2) == null) {
            return;
        }
        org.telegram.messenger.g0.g3(new ve0(24, this, i61Var));
    }
}
