package org.telegram.ui;

import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;
public final class et0 implements a3.y {
    public final PhotoViewer f39177a;

    public et0(PhotoViewer photoViewer) {
        this.f39177a = photoViewer;
    }

    @Override
    public final void a(long j10, long j11, b2.x xVar, MediaFormat mediaFormat) {
        org.telegram.ui.Components.s81 s81Var;
        PhotoViewer photoViewer = this.f39177a;
        if (!photoViewer.J4 || (s81Var = photoViewer.F2) == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new yl0(13, this, s81Var));
    }
}
