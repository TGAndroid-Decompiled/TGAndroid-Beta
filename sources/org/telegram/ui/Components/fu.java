package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.OrientationEventListener;
import org.telegram.ui.PhotoViewer;
public final class fu extends OrientationEventListener {
    public final int f26220a;
    public final Object f26221b;

    public fu(Object obj, Context context, int i10) {
        super(context);
        this.f26220a = i10;
        this.f26221b = obj;
    }

    @Override
    public final void onOrientationChanged(int i10) {
        Activity activity;
        af0 af0Var;
        Activity activity2;
        int i11;
        switch (this.f26220a) {
            case 0:
                hu huVar = (hu) this.f26221b;
                n81 n81Var = huVar.f26921j1;
                if (huVar.f26933w1 != null && n81Var.getVisibility() == 0 && (activity = huVar.f26926p1) != null && n81Var.T && huVar.D1) {
                    if (i10 >= 240 && i10 <= 300) {
                        huVar.E1 = true;
                        return;
                    } else if (huVar.E1 && i10 > 0) {
                        if (i10 >= 330 || i10 <= 30) {
                            activity.setRequestedOrientation(huVar.C1);
                            huVar.D1 = false;
                            huVar.E1 = false;
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f26221b;
                if (photoViewer.W3 != null && (af0Var = photoViewer.f33659y2) != null && af0Var.getVisibility() == 0 && (activity2 = photoViewer.D) != null && (i11 = photoViewer.Y3) != 0) {
                    if (i11 == 1) {
                        if (i10 >= 240 && i10 <= 300) {
                            photoViewer.Z3 = true;
                            return;
                        } else if (photoViewer.Z3 && i10 > 0) {
                            if (i10 >= 330 || i10 <= 30) {
                                activity2.setRequestedOrientation(photoViewer.X3);
                                photoViewer.Y3 = 0;
                                photoViewer.Z3 = false;
                                return;
                            }
                            return;
                        } else {
                            return;
                        }
                    } else if (i10 > 0 && (i10 >= 330 || i10 <= 30)) {
                        photoViewer.Z3 = true;
                        return;
                    } else if (photoViewer.Z3 && i10 >= 240 && i10 <= 300) {
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
