package org.telegram.ui;

import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.ClippingImageView;
public final class iq0 implements Runnable {
    public final int f39318a;
    public final PhotoViewer f39319b;
    public final zt0 f39320c;

    public iq0(PhotoViewer photoViewer, zt0 zt0Var, int i10) {
        this.f39318a = i10;
        this.f39319b = photoViewer;
        this.f39320c = zt0Var;
    }

    @Override
    public final void run() {
        ClippingImageView clippingImageView;
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.f39318a) {
            case 0:
                PhotoViewer photoViewer = this.f39319b;
                photoViewer.f35673d0.setImageBitmap(null);
                zt0 zt0Var = this.f39320c;
                if (zt0Var != null && !AndroidUtilities.isTablet() && (clippingImageView = zt0Var.f45326m) != null) {
                    clippingImageView.setImageBitmap(null);
                }
                try {
                    if (photoViewer.f35666c0.getParent() != null) {
                        ((WindowManager) photoViewer.f35864y.getSystemService("window")).removeView(photoViewer.f35666c0);
                        photoViewer.V1();
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 1:
                PhotoViewer photoViewer2 = this.f39319b;
                photoViewer2.f35750l4 = null;
                int i10 = 0;
                photoViewer2.f35647a0.setLayerType(0, null);
                photoViewer2.f35733j4 = 0;
                photoViewer2.F1();
                photoViewer2.X1(this.f39320c);
                MediaController.getInstance().tryResumePausedAudio();
                if (photoViewer2.f35806r7 && !photoViewer2.f35816s7 && (arrayList = photoViewer2.f35671c7) != null) {
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
                PhotoViewer photoViewer3 = this.f39319b;
                photoViewer3.f35750l4 = null;
                rt0 rt0Var = photoViewer3.f35647a0;
                if (rt0Var != null) {
                    int i11 = 0;
                    rt0Var.setLayerType(0, null);
                    photoViewer3.f35733j4 = 0;
                    photoViewer3.X1(this.f39320c);
                    photoViewer3.f35647a0.setScaleX(1.0f);
                    photoViewer3.f35647a0.setScaleY(1.0f);
                    MediaController.getInstance().tryResumePausedAudio();
                    if (photoViewer3.f35806r7 && !photoViewer3.f35816s7 && (arrayList2 = photoViewer3.f35671c7) != null) {
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
