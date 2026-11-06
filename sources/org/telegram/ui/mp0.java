package org.telegram.ui;

import android.media.MediaFormat;
public final class mp0 implements d3.w {
    public final PhotoViewer f47862a;

    public mp0(PhotoViewer photoViewer) {
        this.f47862a = photoViewer;
    }

    @Override
    public final void b(long j3, long j10, e2.u uVar, MediaFormat mediaFormat) {
        org.telegram.ui.Components.s51 s51Var;
        PhotoViewer photoViewer = this.f47862a;
        if (!photoViewer.I4 || (s51Var = photoViewer.F2) == null) {
            return;
        }
        org.telegram.messenger.g0.h3(new qn0(3, this, s51Var));
    }
}
