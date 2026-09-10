package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.OrientationEventListener;
public final class mt0 extends OrientationEventListener {
    public final PhotoViewer f35059a;

    public mt0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f35059a = photoViewer;
    }

    @Override
    public final void onOrientationChanged(int i10) {
        rt0 rt0Var;
        Activity activity;
        int i11;
        PhotoViewer photoViewer = this.f35059a;
        if (photoViewer.W3 != null && (rt0Var = photoViewer.f30230y2) != null && rt0Var.getVisibility() == 0 && (activity = photoViewer.f30227y) != null && (i11 = photoViewer.Y3) != 0) {
            if (i11 == 1) {
                if (i10 >= 240 && i10 <= 300) {
                    photoViewer.Z3 = true;
                } else if (photoViewer.Z3 && i10 > 0) {
                    if (i10 >= 330 || i10 <= 30) {
                        activity.setRequestedOrientation(photoViewer.X3);
                        photoViewer.Y3 = 0;
                        photoViewer.Z3 = false;
                    }
                }
            } else if (i10 > 0 && (i10 >= 330 || i10 <= 30)) {
                photoViewer.Z3 = true;
            } else if (photoViewer.Z3 && i10 >= 240 && i10 <= 300) {
                activity.setRequestedOrientation(photoViewer.X3);
                photoViewer.Y3 = 0;
                photoViewer.Z3 = false;
            }
        }
    }
}
