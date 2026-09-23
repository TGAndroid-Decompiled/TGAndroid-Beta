package org.telegram.ui;

import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;
public final class kt0 implements a3.y {
    public final PhotoViewer f34797a;

    public kt0(PhotoViewer photoViewer) {
        this.f34797a = photoViewer;
    }

    @Override
    public final void b(long j3, long j10, b2.s sVar, MediaFormat mediaFormat) {
        org.telegram.ui.Components.f71 f71Var;
        PhotoViewer photoViewer = this.f34797a;
        if (!photoViewer.J4 || (f71Var = photoViewer.F2) == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new gl0(16, this, f71Var));
    }
}
