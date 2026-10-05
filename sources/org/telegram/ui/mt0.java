package org.telegram.ui;

import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;
public final class mt0 implements a3.y {
    public final PhotoViewer f38745a;

    public mt0(PhotoViewer photoViewer) {
        this.f38745a = photoViewer;
    }

    @Override
    public final void a(long j3, long j10, b2.s sVar, MediaFormat mediaFormat) {
        org.telegram.ui.Components.e81 e81Var;
        PhotoViewer photoViewer = this.f38745a;
        if (!photoViewer.J4 || (e81Var = photoViewer.F2) == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new wj0(19, this, e81Var));
    }
}
