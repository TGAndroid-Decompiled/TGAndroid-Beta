package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.OrientationEventListener;
public final class pt0 extends OrientationEventListener {
    public final PhotoViewer f41092a;

    public pt0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f41092a = photoViewer;
    }

    @Override
    public final void onOrientationChanged(int i10) {
        ut0 ut0Var;
        Activity activity;
        int i11;
        PhotoViewer photoViewer = this.f41092a;
        if (photoViewer.W3 != null && (ut0Var = photoViewer.f33922y2) != null && ut0Var.getVisibility() == 0 && (activity = photoViewer.f33919y) != null && (i11 = photoViewer.Y3) != 0) {
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
