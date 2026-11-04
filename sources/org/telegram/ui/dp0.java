package org.telegram.ui;

import android.media.MediaFormat;
public final class dp0 implements c3.w {
    public final PhotoViewer f44792a;

    public dp0(PhotoViewer photoViewer) {
        this.f44792a = photoViewer;
    }

    @Override
    public final void a(long j10, long j11, d2.v vVar, MediaFormat mediaFormat) {
        org.telegram.ui.Components.m51 m51Var;
        PhotoViewer photoViewer = this.f44792a;
        if (!photoViewer.K4 || (m51Var = photoViewer.G2) == null) {
            return;
        }
        org.telegram.messenger.g0.h3(new hk0(7, this, m51Var));
    }
}
