package org.telegram.ui;

import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;
public final class dt0 implements i5.n {
    public final PhotoViewer f33530a;

    public dt0(PhotoViewer photoViewer) {
        this.f33530a = photoViewer;
    }

    @Override
    public final void a(long j10, long j11, j3.n0 n0Var, MediaFormat mediaFormat) {
        org.telegram.ui.Components.i71 i71Var;
        PhotoViewer photoViewer = this.f33530a;
        if (!photoViewer.G4 || (i71Var = photoViewer.C2) == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new gr0(3, this, i71Var));
    }
}
