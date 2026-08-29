package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.OrientationEventListener;
public final class js0 extends OrientationEventListener {
    public final PhotoViewer f39684a;

    public js0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f39684a = photoViewer;
    }

    @Override
    public final void onOrientationChanged(int i10) {
        os0 os0Var;
        Activity activity;
        int i11;
        PhotoViewer photoViewer = this.f39684a;
        if (photoViewer.S3 != null && (os0Var = photoViewer.f35829u2) != null && os0Var.getVisibility() == 0 && (activity = photoViewer.f35864y) != null && (i11 = photoViewer.U3) != 0) {
            if (i11 == 1) {
                if (i10 >= 240 && i10 <= 300) {
                    photoViewer.V3 = true;
                } else if (photoViewer.V3 && i10 > 0) {
                    if (i10 >= 330 || i10 <= 30) {
                        activity.setRequestedOrientation(photoViewer.T3);
                        photoViewer.U3 = 0;
                        photoViewer.V3 = false;
                    }
                }
            } else if (i10 > 0 && (i10 >= 330 || i10 <= 30)) {
                photoViewer.V3 = true;
            } else if (photoViewer.V3 && i10 >= 240 && i10 <= 300) {
                activity.setRequestedOrientation(photoViewer.T3);
                photoViewer.U3 = 0;
                photoViewer.V3 = false;
            }
        }
    }
}
