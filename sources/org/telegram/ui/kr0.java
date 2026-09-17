package org.telegram.ui;

import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.ClippingImageView;
public final class kr0 implements Runnable {
    public final int f38144a;
    public final PhotoViewer f38145b;
    public final cv0 f38146c;

    public kr0(PhotoViewer photoViewer, cv0 cv0Var, int i10) {
        this.f38144a = i10;
        this.f38145b = photoViewer;
        this.f38146c = cv0Var;
    }

    @Override
    public final void run() {
        ClippingImageView clippingImageView;
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.f38144a) {
            case 0:
                PhotoViewer photoViewer = this.f38145b;
                photoViewer.f33603h0.setImageBitmap(null);
                cv0 cv0Var = this.f38146c;
                if (cv0Var != null && !AndroidUtilities.isTablet() && (clippingImageView = cv0Var.f35578m) != null) {
                    clippingImageView.setImageBitmap(null);
                }
                try {
                    if (photoViewer.f33594g0.getParent() != null) {
                        ((WindowManager) photoViewer.f33755y.getSystemService("window")).removeView(photoViewer.f33594g0);
                        photoViewer.V1();
                        return;
                    }
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 1:
                PhotoViewer photoViewer2 = this.f38145b;
                photoViewer2.f33676p4 = null;
                int i10 = 0;
                photoViewer2.f33577e0.setLayerType(0, null);
                photoViewer2.f33658n4 = 0;
                photoViewer2.F1();
                photoViewer2.X1(this.f38146c);
                MediaController.getInstance().tryResumePausedAudio();
                if (photoViewer2.f33733v7 && !photoViewer2.f33743w7 && (arrayList = photoViewer2.f33601g7) != null) {
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
                PhotoViewer photoViewer3 = this.f38145b;
                photoViewer3.f33676p4 = null;
                uu0 uu0Var = photoViewer3.f33577e0;
                if (uu0Var != null) {
                    int i11 = 0;
                    uu0Var.setLayerType(0, null);
                    photoViewer3.f33658n4 = 0;
                    photoViewer3.X1(this.f38146c);
                    photoViewer3.f33577e0.setScaleX(1.0f);
                    photoViewer3.f33577e0.setScaleY(1.0f);
                    MediaController.getInstance().tryResumePausedAudio();
                    if (photoViewer3.f33733v7 && !photoViewer3.f33743w7 && (arrayList2 = photoViewer3.f33601g7) != null) {
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
