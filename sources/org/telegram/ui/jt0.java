package org.telegram.ui;

import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;
public final class jt0 implements a3.y {
    public final PhotoViewer f34871a;

    public jt0(PhotoViewer photoViewer) {
        this.f34871a = photoViewer;
    }

    @Override
    public final void a(long j3, long j10, b2.s sVar, MediaFormat mediaFormat) {
        org.telegram.ui.Components.u71 u71Var;
        PhotoViewer photoViewer = this.f34871a;
        if (!photoViewer.J4 || (u71Var = photoViewer.F2) == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new xi0(22, this, u71Var));
    }
}
