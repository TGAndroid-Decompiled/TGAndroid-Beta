package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.OrientationEventListener;
import org.telegram.ui.PhotoViewer;
public final class ot extends OrientationEventListener {
    public final int f36655a;
    public final Object f36656b;

    public ot(int i7, Context context, Object obj) {
        super(context);
        this.f36655a = i7;
        this.f36656b = obj;
    }

    @Override
    public final void onOrientationChanged(int i7) {
        Activity activity;
        fe0 fe0Var;
        Activity activity2;
        int i10;
        switch (this.f36655a) {
            case 0:
                vt vtVar = (vt) this.f36656b;
                k71 k71Var = vtVar.f39665j1;
                if (vtVar.f39676w1 != null && k71Var.getVisibility() == 0 && (activity = vtVar.f39669p1) != null && k71Var.T && vtVar.D1) {
                    if (i7 >= 240 && i7 <= 300) {
                        vtVar.E1 = true;
                        return;
                    } else if (vtVar.E1 && i7 > 0) {
                        if (i7 >= 330 || i7 <= 30) {
                            activity.setRequestedOrientation(vtVar.C1);
                            vtVar.D1 = false;
                            vtVar.E1 = false;
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f36656b;
                if (photoViewer.V3 != null && (fe0Var = photoViewer.f41561y2) != null && fe0Var.getVisibility() == 0 && (activity2 = photoViewer.D) != null && (i10 = photoViewer.X3) != 0) {
                    if (i10 == 1) {
                        if (i7 >= 240 && i7 <= 300) {
                            photoViewer.Y3 = true;
                            return;
                        } else if (photoViewer.Y3 && i7 > 0) {
                            if (i7 >= 330 || i7 <= 30) {
                                activity2.setRequestedOrientation(photoViewer.W3);
                                photoViewer.X3 = 0;
                                photoViewer.Y3 = false;
                                return;
                            }
                            return;
                        } else {
                            return;
                        }
                    } else if (i7 > 0 && (i7 >= 330 || i7 <= 30)) {
                        photoViewer.Y3 = true;
                        return;
                    } else if (photoViewer.Y3 && i7 >= 240 && i7 <= 300) {
                        activity2.setRequestedOrientation(photoViewer.W3);
                        photoViewer.X3 = 0;
                        photoViewer.Y3 = false;
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }
}
