package org.telegram.ui;

import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.ClippingImageView;
public final class kr0 implements Runnable {
    public final int f35254a;
    public final PhotoViewer f35255b;
    public final dv0 f35256c;

    public kr0(PhotoViewer photoViewer, dv0 dv0Var, int i10) {
        this.f35254a = i10;
        this.f35255b = photoViewer;
        this.f35256c = dv0Var;
    }

    @Override
    public final void run() {
        ClippingImageView clippingImageView;
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.f35254a) {
            case 0:
                PhotoViewer photoViewer = this.f35255b;
                photoViewer.f30962h0.setImageBitmap(null);
                dv0 dv0Var = this.f35256c;
                if (dv0Var != null && !AndroidUtilities.isTablet() && (clippingImageView = dv0Var.f33143m) != null) {
                    clippingImageView.setImageBitmap(null);
                }
                try {
                    if (photoViewer.f30953g0.getParent() != null) {
                        ((WindowManager) photoViewer.f31114y.getSystemService("window")).removeView(photoViewer.f30953g0);
                        photoViewer.V1();
                        return;
                    }
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                PhotoViewer photoViewer2 = this.f35255b;
                photoViewer2.f31035p4 = null;
                int i10 = 0;
                photoViewer2.f30936e0.setLayerType(0, null);
                photoViewer2.f31017n4 = 0;
                photoViewer2.F1();
                photoViewer2.X1(this.f35256c);
                MediaController.getInstance().tryResumePausedAudio();
                if (photoViewer2.f31092v7 && !photoViewer2.f31102w7 && (arrayList = photoViewer2.f30960g7) != null) {
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
                PhotoViewer photoViewer3 = this.f35255b;
                photoViewer3.f31035p4 = null;
                vu0 vu0Var = photoViewer3.f30936e0;
                if (vu0Var != null) {
                    int i11 = 0;
                    vu0Var.setLayerType(0, null);
                    photoViewer3.f31017n4 = 0;
                    photoViewer3.X1(this.f35256c);
                    photoViewer3.f30936e0.setScaleX(1.0f);
                    photoViewer3.f30936e0.setScaleY(1.0f);
                    MediaController.getInstance().tryResumePausedAudio();
                    if (photoViewer3.f31092v7 && !photoViewer3.f31102w7 && (arrayList2 = photoViewer3.f30960g7) != null) {
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
