package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.OrientationEventListener;
public final class nt0 extends OrientationEventListener {
    public final PhotoViewer f40407a;

    public nt0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f40407a = photoViewer;
    }

    @Override
    public final void onOrientationChanged(int i10) {
        tt0 tt0Var;
        Activity activity;
        int i11;
        PhotoViewer photoViewer = this.f40407a;
        if (photoViewer.W3 != null && (tt0Var = photoViewer.f34123y2) != null && tt0Var.getVisibility() == 0 && (activity = photoViewer.f34120y) != null && (i11 = photoViewer.Y3) != 0) {
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
