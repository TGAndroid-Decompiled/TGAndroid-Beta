package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.OrientationEventListener;
import org.telegram.ui.PhotoViewer;
public final class pt extends OrientationEventListener {
    public final int f37099a;
    public final Object f37100b;

    public pt(int i7, Context context, Object obj) {
        super(context);
        this.f37099a = i7;
        this.f37100b = obj;
    }

    @Override
    public final void onOrientationChanged(int i7) {
        Activity activity;
        fe0 fe0Var;
        Activity activity2;
        int i10;
        switch (this.f37099a) {
            case 0:
                wt wtVar = (wt) this.f37100b;
                l71 l71Var = wtVar.f40042j1;
                if (wtVar.f40053w1 != null && l71Var.getVisibility() == 0 && (activity = wtVar.f40046p1) != null && l71Var.T && wtVar.D1) {
                    if (i7 >= 240 && i7 <= 300) {
                        wtVar.E1 = true;
                        return;
                    } else if (wtVar.E1 && i7 > 0) {
                        if (i7 >= 330 || i7 <= 30) {
                            activity.setRequestedOrientation(wtVar.C1);
                            wtVar.D1 = false;
                            wtVar.E1 = false;
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f37100b;
                if (photoViewer.V3 != null && (fe0Var = photoViewer.f41564y2) != null && fe0Var.getVisibility() == 0 && (activity2 = photoViewer.D) != null && (i10 = photoViewer.X3) != 0) {
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
