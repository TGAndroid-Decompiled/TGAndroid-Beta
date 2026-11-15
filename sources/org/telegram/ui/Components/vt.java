package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.OrientationEventListener;
import org.telegram.ui.PhotoViewer;
public final class vt extends OrientationEventListener {
    public final int f41153a;
    public final Object f41154b;

    public vt(int i7, Context context, Object obj) {
        super(context);
        this.f41153a = i7;
        this.f41154b = obj;
    }

    @Override
    public final void onOrientationChanged(int i7) {
        Activity activity;
        ie0 ie0Var;
        Activity activity2;
        int i10;
        switch (this.f41153a) {
            case 0:
                bu buVar = (bu) this.f41154b;
                m71 m71Var = buVar.n1;
                if (buVar.A1 != null && m71Var.getVisibility() == 0 && (activity = buVar.f33385t1) != null && m71Var.U && buVar.H1) {
                    if (i7 >= 240 && i7 <= 300) {
                        buVar.I1 = true;
                        return;
                    } else if (buVar.I1 && i7 > 0) {
                        if (i7 >= 330 || i7 <= 30) {
                            activity.setRequestedOrientation(buVar.G1);
                            buVar.H1 = false;
                            buVar.I1 = false;
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f41154b;
                if (photoViewer.W3 != null && (ie0Var = photoViewer.f42942z2) != null && ie0Var.getVisibility() == 0 && (activity2 = photoViewer.E) != null && (i10 = photoViewer.Y3) != 0) {
                    if (i10 == 1) {
                        if (i7 >= 240 && i7 <= 300) {
                            photoViewer.Z3 = true;
                            return;
                        } else if (photoViewer.Z3 && i7 > 0) {
                            if (i7 >= 330 || i7 <= 30) {
                                activity2.setRequestedOrientation(photoViewer.X3);
                                photoViewer.Y3 = 0;
                                photoViewer.Z3 = false;
                                return;
                            }
                            return;
                        } else {
                            return;
                        }
                    } else if (i7 > 0 && (i7 >= 330 || i7 <= 30)) {
                        photoViewer.Z3 = true;
                        return;
                    } else if (photoViewer.Z3 && i7 >= 240 && i7 <= 300) {
                        activity2.setRequestedOrientation(photoViewer.X3);
                        photoViewer.Y3 = 0;
                        photoViewer.Z3 = false;
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }
}
