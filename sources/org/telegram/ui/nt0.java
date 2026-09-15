package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.OrientationEventListener;
public final class nt0 extends OrientationEventListener {
    public final PhotoViewer f36040a;

    public nt0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f36040a = photoViewer;
    }

    @Override
    public final void onOrientationChanged(int i10) {
        st0 st0Var;
        Activity activity;
        int i11;
        PhotoViewer photoViewer = this.f36040a;
        if (photoViewer.W3 != null && (st0Var = photoViewer.f31117y2) != null && st0Var.getVisibility() == 0 && (activity = photoViewer.f31114y) != null && (i11 = photoViewer.Y3) != 0) {
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
