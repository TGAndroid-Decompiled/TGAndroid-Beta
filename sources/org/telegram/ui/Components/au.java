package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.OrientationEventListener;
import org.telegram.ui.PhotoViewer;
public final class au extends OrientationEventListener {
    public final int f33451a;
    public final Object f33452b;

    public au(int i7, Context context, Object obj) {
        super(context);
        this.f33451a = i7;
        this.f33452b = obj;
    }

    @Override
    public final void onOrientationChanged(int i7) {
        Activity activity;
        se0 se0Var;
        Activity activity2;
        int i10;
        switch (this.f33451a) {
            case 0:
                gu guVar = (gu) this.f33452b;
                w71 w71Var = guVar.n1;
                if (guVar.A1 != null && w71Var.getVisibility() == 0 && (activity = guVar.f35651t1) != null && w71Var.U && guVar.H1) {
                    if (i7 >= 240 && i7 <= 300) {
                        guVar.I1 = true;
                        return;
                    } else if (guVar.I1 && i7 > 0) {
                        if (i7 >= 330 || i7 <= 30) {
                            activity.setRequestedOrientation(guVar.G1);
                            guVar.H1 = false;
                            guVar.I1 = false;
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f33452b;
                if (photoViewer.W3 != null && (se0Var = photoViewer.f43387z2) != null && se0Var.getVisibility() == 0 && (activity2 = photoViewer.E) != null && (i10 = photoViewer.Y3) != 0) {
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
