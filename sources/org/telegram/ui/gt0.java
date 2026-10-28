package org.telegram.ui;

import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;
public final class gt0 implements a3.y {
    public final PhotoViewer f39690a;

    public gt0(PhotoViewer photoViewer) {
        this.f39690a = photoViewer;
    }

    @Override
    public final void a(long j10, long j11, b2.x xVar, MediaFormat mediaFormat) {
        org.telegram.ui.Components.t81 t81Var;
        PhotoViewer photoViewer = this.f39690a;
        if (!photoViewer.J4 || (t81Var = photoViewer.F2) == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new am0(14, this, t81Var));
    }
}
