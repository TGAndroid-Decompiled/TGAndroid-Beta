package org.telegram.ui;

import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;
public final class dt0 implements i5.n {
    public final PhotoViewer f36256a;

    public dt0(PhotoViewer photoViewer) {
        this.f36256a = photoViewer;
    }

    @Override
    public final void a(long j10, long j11, j3.n0 n0Var, MediaFormat mediaFormat) {
        org.telegram.ui.Components.j71 j71Var;
        PhotoViewer photoViewer = this.f36256a;
        if (!photoViewer.G4 || (j71Var = photoViewer.C2) == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new pr0(2, this, j71Var));
    }
}
