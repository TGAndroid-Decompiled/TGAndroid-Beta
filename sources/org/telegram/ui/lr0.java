package org.telegram.ui;

import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.ClippingImageView;
public final class lr0 implements Runnable {
    public final int f35538a;
    public final PhotoViewer f35539b;
    public final dv0 f35540c;

    public lr0(PhotoViewer photoViewer, dv0 dv0Var, int i10) {
        this.f35538a = i10;
        this.f35539b = photoViewer;
        this.f35540c = dv0Var;
    }

    @Override
    public final void run() {
        ClippingImageView clippingImageView;
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.f35538a) {
            case 0:
                PhotoViewer photoViewer = this.f35539b;
                photoViewer.f31268h0.setImageBitmap(null);
                dv0 dv0Var = this.f35540c;
                if (dv0Var != null && !AndroidUtilities.isTablet() && (clippingImageView = dv0Var.f33172m) != null) {
                    clippingImageView.setImageBitmap(null);
                }
                try {
                    if (photoViewer.f31259g0.getParent() != null) {
                        ((WindowManager) photoViewer.f31420y.getSystemService("window")).removeView(photoViewer.f31259g0);
                        photoViewer.V1();
                        return;
                    }
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                PhotoViewer photoViewer2 = this.f35539b;
                photoViewer2.f31341p4 = null;
                int i10 = 0;
                photoViewer2.f31242e0.setLayerType(0, null);
                photoViewer2.f31323n4 = 0;
                photoViewer2.F1();
                photoViewer2.X1(this.f35540c);
                MediaController.getInstance().tryResumePausedAudio();
                if (photoViewer2.f31398v7 && !photoViewer2.f31408w7 && (arrayList = photoViewer2.f31266g7) != null) {
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
                PhotoViewer photoViewer3 = this.f35539b;
                photoViewer3.f31341p4 = null;
                vu0 vu0Var = photoViewer3.f31242e0;
                if (vu0Var != null) {
                    int i11 = 0;
                    vu0Var.setLayerType(0, null);
                    photoViewer3.f31323n4 = 0;
                    photoViewer3.X1(this.f35540c);
                    photoViewer3.f31242e0.setScaleX(1.0f);
                    photoViewer3.f31242e0.setScaleY(1.0f);
                    MediaController.getInstance().tryResumePausedAudio();
                    if (photoViewer3.f31398v7 && !photoViewer3.f31408w7 && (arrayList2 = photoViewer3.f31266g7) != null) {
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
