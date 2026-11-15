package org.telegram.ui;

import android.media.MediaFormat;
public final class kp0 implements d3.v {
    public final PhotoViewer f48732a;

    public kp0(PhotoViewer photoViewer) {
        this.f48732a = photoViewer;
    }

    @Override
    public final void a(long j3, long j10, e2.u uVar, MediaFormat mediaFormat) {
        org.telegram.ui.Components.u51 u51Var;
        PhotoViewer photoViewer = this.f48732a;
        if (!photoViewer.J4 || (u51Var = photoViewer.G2) == null) {
            return;
        }
        org.telegram.messenger.g0.h3(new jd0(29, this, u51Var));
    }
}
