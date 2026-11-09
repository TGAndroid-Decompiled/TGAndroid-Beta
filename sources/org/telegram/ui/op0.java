package org.telegram.ui;

import android.media.MediaFormat;
public final class op0 implements d3.w {
    public final PhotoViewer f48502a;

    public op0(PhotoViewer photoViewer) {
        this.f48502a = photoViewer;
    }

    @Override
    public final void b(long j3, long j10, e2.u uVar, MediaFormat mediaFormat) {
        org.telegram.ui.Components.u51 u51Var;
        PhotoViewer photoViewer = this.f48502a;
        if (!photoViewer.I4 || (u51Var = photoViewer.F2) == null) {
            return;
        }
        org.telegram.messenger.g0.h3(new sn0(3, this, u51Var));
    }
}
