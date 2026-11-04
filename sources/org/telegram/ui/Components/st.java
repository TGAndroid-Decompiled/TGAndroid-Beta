package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.OrientationEventListener;
import org.telegram.ui.PhotoViewer;
public final class st extends OrientationEventListener {
    public final int f38116a;
    public final Object f38117b;

    public st(int i3, Context context, Object obj) {
        super(context);
        this.f38116a = i3;
        this.f38117b = obj;
    }

    @Override
    public final void onOrientationChanged(int i3) {
        Activity activity;
        zd0 zd0Var;
        Activity activity2;
        int i10;
        switch (this.f38116a) {
            case 0:
                ut utVar = (ut) this.f38117b;
                d71 d71Var = utVar.k1;
                if (utVar.f38874x1 != null && d71Var.getVisibility() == 0 && (activity = utVar.f38867q1) != null && d71Var.U && utVar.E1) {
                    if (i3 >= 240 && i3 <= 300) {
                        utVar.F1 = true;
                        return;
                    } else if (utVar.F1 && i3 > 0) {
                        if (i3 >= 330 || i3 <= 30) {
                            activity.setRequestedOrientation(utVar.D1);
                            utVar.E1 = false;
                            utVar.F1 = false;
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f38117b;
                if (photoViewer.X3 != null && (zd0Var = photoViewer.f41599z2) != null && zd0Var.getVisibility() == 0 && (activity2 = photoViewer.E) != null && (i10 = photoViewer.Z3) != 0) {
                    if (i10 == 1) {
                        if (i3 >= 240 && i3 <= 300) {
                            photoViewer.f41376a4 = true;
                            return;
                        } else if (photoViewer.f41376a4 && i3 > 0) {
                            if (i3 >= 330 || i3 <= 30) {
                                activity2.setRequestedOrientation(photoViewer.Y3);
                                photoViewer.Z3 = 0;
                                photoViewer.f41376a4 = false;
                                return;
                            }
                            return;
                        } else {
                            return;
                        }
                    } else if (i3 > 0 && (i3 >= 330 || i3 <= 30)) {
                        photoViewer.f41376a4 = true;
                        return;
                    } else if (photoViewer.f41376a4 && i3 >= 240 && i3 <= 300) {
                        activity2.setRequestedOrientation(photoViewer.Y3);
                        photoViewer.Z3 = 0;
                        photoViewer.f41376a4 = false;
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }
}
