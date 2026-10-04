package org.telegram.ui;

import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;
public final class mt0 implements a3.y {
    public final PhotoViewer f38754a;

    public mt0(PhotoViewer photoViewer) {
        this.f38754a = photoViewer;
    }

    @Override
    public final void a(long j3, long j10, b2.s sVar, MediaFormat mediaFormat) {
        org.telegram.ui.Components.d81 d81Var;
        PhotoViewer photoViewer = this.f38754a;
        if (!photoViewer.J4 || (d81Var = photoViewer.F2) == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new wj0(19, this, d81Var));
    }
}
