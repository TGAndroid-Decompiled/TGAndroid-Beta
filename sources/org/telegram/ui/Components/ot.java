package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.OrientationEventListener;
import org.telegram.ui.PhotoViewer;
public final class ot extends OrientationEventListener {
    public final int f36687a;
    public final Object f36688b;

    public ot(int i7, Context context, Object obj) {
        super(context);
        this.f36687a = i7;
        this.f36688b = obj;
    }

    @Override
    public final void onOrientationChanged(int i7) {
        Activity activity;
        fe0 fe0Var;
        Activity activity2;
        int i10;
        switch (this.f36687a) {
            case 0:
                vt vtVar = (vt) this.f36688b;
                l71 l71Var = vtVar.f39734m1;
                if (vtVar.f39746z1 != null && l71Var.getVisibility() == 0 && (activity = vtVar.f39739s1) != null && l71Var.T && vtVar.G1) {
                    if (i7 >= 240 && i7 <= 300) {
                        vtVar.H1 = true;
                        return;
                    } else if (vtVar.H1 && i7 > 0) {
                        if (i7 >= 330 || i7 <= 30) {
                            activity.setRequestedOrientation(vtVar.F1);
                            vtVar.G1 = false;
                            vtVar.H1 = false;
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f36688b;
                if (photoViewer.V3 != null && (fe0Var = photoViewer.f41562y2) != null && fe0Var.getVisibility() == 0 && (activity2 = photoViewer.D) != null && (i10 = photoViewer.X3) != 0) {
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
