package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.OrientationEventListener;

public final class ls0 extends OrientationEventListener {

    public final PhotoViewer f40245a;

    public ls0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f40245a = photoViewer;
    }

    @Override
    public final void onOrientationChanged(int i10) {
        qs0 qs0Var;
        Activity activity;
        int i11;
        PhotoViewer photoViewer = this.f40245a;
        if (photoViewer.S3 == null || (qs0Var = photoViewer.f35766u2) == null || qs0Var.getVisibility() != 0 || (activity = photoViewer.f35800y) == null || (i11 = photoViewer.U3) == 0) {
            return;
        }
        if (i11 != 1) {
            if (i10 > 0 && (i10 >= 330 || i10 <= 30)) {
                photoViewer.V3 = true;
                return;
            }
            if (!photoViewer.V3 || i10 < 240 || i10 > 300) {
                return;
            }
            activity.setRequestedOrientation(photoViewer.T3);
            photoViewer.U3 = 0;
            photoViewer.V3 = false;
            return;
        }
        if (i10 >= 240 && i10 <= 300) {
            photoViewer.V3 = true;
            return;
        }
        if (!photoViewer.V3 || i10 <= 0) {
            return;
        }
        if (i10 >= 330 || i10 <= 30) {
            activity.setRequestedOrientation(photoViewer.T3);
            photoViewer.U3 = 0;
            photoViewer.V3 = false;
        }
    }
}
