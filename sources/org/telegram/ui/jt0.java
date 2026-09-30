package org.telegram.ui;

import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;
public final class jt0 implements a3.y {
    public final PhotoViewer f34958a;

    public jt0(PhotoViewer photoViewer) {
        this.f34958a = photoViewer;
    }

    @Override
    public final void a(long j3, long j10, b2.s sVar, MediaFormat mediaFormat) {
        org.telegram.ui.Components.v71 v71Var;
        PhotoViewer photoViewer = this.f34958a;
        if (!photoViewer.J4 || (v71Var = photoViewer.F2) == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new sj0(21, this, v71Var));
    }
}
