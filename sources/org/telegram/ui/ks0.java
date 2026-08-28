package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.OrientationEventListener;
public final class ks0 extends OrientationEventListener {
    public final PhotoViewer f39916a;

    public ks0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f39916a = photoViewer;
    }

    @Override
    public final void onOrientationChanged(int i9) {
        ps0 ps0Var;
        Activity activity;
        int i10;
        PhotoViewer photoViewer = this.f39916a;
        if (photoViewer.S3 != null && (ps0Var = photoViewer.f35763u2) != null && ps0Var.getVisibility() == 0 && (activity = photoViewer.f35797y) != null && (i10 = photoViewer.U3) != 0) {
            if (i10 == 1) {
                if (i9 >= 240 && i9 <= 300) {
                    photoViewer.V3 = true;
                } else if (photoViewer.V3 && i9 > 0) {
                    if (i9 >= 330 || i9 <= 30) {
                        activity.setRequestedOrientation(photoViewer.T3);
                        photoViewer.U3 = 0;
                        photoViewer.V3 = false;
                    }
                }
            } else if (i9 > 0 && (i9 >= 330 || i9 <= 30)) {
                photoViewer.V3 = true;
            } else if (photoViewer.V3 && i9 >= 240 && i9 <= 300) {
                activity.setRequestedOrientation(photoViewer.T3);
                photoViewer.U3 = 0;
                photoViewer.V3 = false;
            }
        }
    }
}
