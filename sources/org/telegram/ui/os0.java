package org.telegram.ui;

import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;
public final class os0 implements e5.n {
    public final PhotoViewer f41236a;

    public os0(PhotoViewer photoViewer) {
        this.f41236a = photoViewer;
    }

    @Override
    public final void a(long j10, long j11, h3.t0 t0Var, MediaFormat mediaFormat) {
        org.telegram.ui.Components.k61 k61Var;
        PhotoViewer photoViewer = this.f41236a;
        if (!photoViewer.F4 || (k61Var = photoViewer.B2) == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new cf0(28, this, k61Var));
    }
}
