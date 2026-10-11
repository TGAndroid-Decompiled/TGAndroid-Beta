package org.telegram.ui;

import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.ClippingImageView;
public final class jr0 implements Runnable {
    public final int f39146a;
    public final PhotoViewer f39147b;
    public final dv0 f39148c;

    public jr0(PhotoViewer photoViewer, dv0 dv0Var, int i10) {
        this.f39146a = i10;
        this.f39147b = photoViewer;
        this.f39148c = dv0Var;
    }

    @Override
    public final void run() {
        ClippingImageView clippingImageView;
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.f39146a) {
            case 0:
                PhotoViewer photoViewer = this.f39147b;
                photoViewer.f33992h0.setImageBitmap(null);
                dv0 dv0Var = this.f39148c;
                if (dv0Var != null && !AndroidUtilities.isTablet() && (clippingImageView = dv0Var.f37157m) != null) {
                    clippingImageView.setImageBitmap(null);
                }
                try {
                    if (photoViewer.f33983g0.getParent() != null) {
                        ((WindowManager) photoViewer.f34144y.getSystemService("window")).removeView(photoViewer.f33983g0);
                        photoViewer.W1();
                        return;
                    }
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 1:
                PhotoViewer photoViewer2 = this.f39147b;
                photoViewer2.f34065p4 = null;
                int i10 = 0;
                photoViewer2.f33966e0.setLayerType(0, null);
                photoViewer2.f34047n4 = 0;
                photoViewer2.G1();
                photoViewer2.Y1(this.f39148c);
                MediaController.getInstance().tryResumePausedAudio();
                if (photoViewer2.f34122v7 && !photoViewer2.f34132w7 && (arrayList = photoViewer2.f33990g7) != null) {
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
                PhotoViewer photoViewer3 = this.f39147b;
                photoViewer3.f34065p4 = null;
                vu0 vu0Var = photoViewer3.f33966e0;
                if (vu0Var != null) {
                    int i11 = 0;
                    vu0Var.setLayerType(0, null);
                    photoViewer3.f34047n4 = 0;
                    photoViewer3.Y1(this.f39148c);
                    photoViewer3.f33966e0.setScaleX(1.0f);
                    photoViewer3.f33966e0.setScaleY(1.0f);
                    MediaController.getInstance().tryResumePausedAudio();
                    if (photoViewer3.f34122v7 && !photoViewer3.f34132w7 && (arrayList2 = photoViewer3.f33990g7) != null) {
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
