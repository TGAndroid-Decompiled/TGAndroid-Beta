package org.telegram.ui;

import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;

public final class ps0 implements e5.m {

    public final PhotoViewer f41425a;

    public ps0(PhotoViewer photoViewer) {
        this.f41425a = photoViewer;
    }

    @Override
    public final void a(long j10, long j11, h3.t0 t0Var, MediaFormat mediaFormat) {
        org.telegram.ui.Components.m61 m61Var;
        PhotoViewer photoViewer = this.f41425a;
        if (photoViewer.F4 && (m61Var = photoViewer.B2) != null) {
            AndroidUtilities.runOnUIThread(new ff0(28, this, m61Var));
        }
    }
}
