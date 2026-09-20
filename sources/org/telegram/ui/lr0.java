package org.telegram.ui;

import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.ClippingImageView;
public final class lr0 implements Runnable {
    public final int f35515a;
    public final PhotoViewer f35516b;
    public final dv0 f35517c;

    public lr0(PhotoViewer photoViewer, dv0 dv0Var, int i10) {
        this.f35515a = i10;
        this.f35516b = photoViewer;
        this.f35517c = dv0Var;
    }

    @Override
    public final void run() {
        ClippingImageView clippingImageView;
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.f35515a) {
            case 0:
                PhotoViewer photoViewer = this.f35516b;
                photoViewer.f31247h0.setImageBitmap(null);
                dv0 dv0Var = this.f35517c;
                if (dv0Var != null && !AndroidUtilities.isTablet() && (clippingImageView = dv0Var.f33152m) != null) {
                    clippingImageView.setImageBitmap(null);
                }
                try {
                    if (photoViewer.f31238g0.getParent() != null) {
                        ((WindowManager) photoViewer.f31399y.getSystemService("window")).removeView(photoViewer.f31238g0);
                        photoViewer.V1();
                        return;
                    }
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                PhotoViewer photoViewer2 = this.f35516b;
                photoViewer2.f31320p4 = null;
                int i10 = 0;
                photoViewer2.f31221e0.setLayerType(0, null);
                photoViewer2.f31302n4 = 0;
                photoViewer2.F1();
                photoViewer2.X1(this.f35517c);
                MediaController.getInstance().tryResumePausedAudio();
                if (photoViewer2.f31377v7 && !photoViewer2.f31387w7 && (arrayList = photoViewer2.f31245g7) != null) {
                    int size = arrayList.size();
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        if (obj instanceof MediaController.PhotoEntry) {
                            ((MediaController.PhotoEntry) obj).deleteAll();
                        }
                    }
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer3 = this.f35516b;
                photoViewer3.f31320p4 = null;
                vu0 vu0Var = photoViewer3.f31221e0;
                if (vu0Var != null) {
                    int i11 = 0;
                    vu0Var.setLayerType(0, null);
                    photoViewer3.f31302n4 = 0;
                    photoViewer3.X1(this.f35517c);
                    photoViewer3.f31221e0.setScaleX(1.0f);
                    photoViewer3.f31221e0.setScaleY(1.0f);
                    MediaController.getInstance().tryResumePausedAudio();
                    if (photoViewer3.f31377v7 && !photoViewer3.f31387w7 && (arrayList2 = photoViewer3.f31245g7) != null) {
                        int size2 = arrayList2.size();
                        while (i11 < size2) {
                            Object obj2 = arrayList2.get(i11);
                            i11++;
                            if (obj2 instanceof MediaController.PhotoEntry) {
                                ((MediaController.PhotoEntry) obj2).deleteAll();
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
