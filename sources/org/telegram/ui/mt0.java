package org.telegram.ui;

import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;
public final class mt0 implements a3.y {
    public final PhotoViewer f35751a;

    public mt0(PhotoViewer photoViewer) {
        this.f35751a = photoViewer;
    }

    @Override
    public final void a(long j3, long j10, b2.s sVar, MediaFormat mediaFormat) {
        org.telegram.ui.Components.u71 u71Var;
        PhotoViewer photoViewer = this.f35751a;
        if (!photoViewer.J4 || (u71Var = photoViewer.F2) == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new jl0(17, this, u71Var));
    }
}
