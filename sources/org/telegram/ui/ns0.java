package org.telegram.ui;

import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;
public final class ns0 implements g5.n {
    public final PhotoViewer f40896a;

    public ns0(PhotoViewer photoViewer) {
        this.f40896a = photoViewer;
    }

    @Override
    public final void a(long j10, long j11, j3.t0 t0Var, MediaFormat mediaFormat) {
        org.telegram.ui.Components.x61 x61Var;
        PhotoViewer photoViewer = this.f40896a;
        if (!photoViewer.F4 || (x61Var = photoViewer.B2) == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new lf0(25, this, x61Var));
    }
}
