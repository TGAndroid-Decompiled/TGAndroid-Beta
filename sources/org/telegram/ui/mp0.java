package org.telegram.ui;

import android.media.MediaFormat;
public final class mp0 implements d3.w {
    public final PhotoViewer f47861a;

    public mp0(PhotoViewer photoViewer) {
        this.f47861a = photoViewer;
    }

    @Override
    public final void b(long j3, long j10, e2.u uVar, MediaFormat mediaFormat) {
        org.telegram.ui.Components.t51 t51Var;
        PhotoViewer photoViewer = this.f47861a;
        if (!photoViewer.I4 || (t51Var = photoViewer.F2) == null) {
            return;
        }
        org.telegram.messenger.g0.h3(new qn0(3, this, t51Var));
    }
}
