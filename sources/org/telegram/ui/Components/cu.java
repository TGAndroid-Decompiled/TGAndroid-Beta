package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.OrientationEventListener;
import org.telegram.ui.PhotoViewer;
public final class cu extends OrientationEventListener {
    public final int f34269a;
    public final Object f34270b;

    public cu(int i7, Context context, Object obj) {
        super(context);
        this.f34269a = i7;
        this.f34270b = obj;
    }

    @Override
    public final void onOrientationChanged(int i7) {
        Activity activity;
        ue0 ue0Var;
        Activity activity2;
        int i10;
        switch (this.f34269a) {
            case 0:
                iu iuVar = (iu) this.f34270b;
                z71 z71Var = iuVar.n1;
                if (iuVar.A1 != null && z71Var.getVisibility() == 0 && (activity = iuVar.f36276t1) != null && z71Var.U && iuVar.H1) {
                    if (i7 >= 240 && i7 <= 300) {
                        iuVar.I1 = true;
                        return;
                    } else if (iuVar.I1 && i7 > 0) {
                        if (i7 >= 330 || i7 <= 30) {
                            activity.setRequestedOrientation(iuVar.G1);
                            iuVar.H1 = false;
                            iuVar.I1 = false;
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f34270b;
                if (photoViewer.W3 != null && (ue0Var = photoViewer.f43397z2) != null && ue0Var.getVisibility() == 0 && (activity2 = photoViewer.E) != null && (i10 = photoViewer.Y3) != 0) {
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
