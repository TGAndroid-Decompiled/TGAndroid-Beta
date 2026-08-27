package org.telegram.ui;

import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.ClippingImageView;

public final class jq0 implements Runnable {

    public final int f39477a;

    public final PhotoViewer f39478b;

    public final cu0 f39479c;

    public jq0(PhotoViewer photoViewer, cu0 cu0Var, int i10) {
        this.f39477a = i10;
        this.f39478b = photoViewer;
        this.f39479c = cu0Var;
    }

    @Override
    public final void run() {
        ClippingImageView clippingImageView;
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.f39477a) {
            case 0:
                PhotoViewer photoViewer = this.f39478b;
                photoViewer.f35610d0.setImageBitmap(null);
                cu0 cu0Var = this.f39479c;
                if (cu0Var != null && !AndroidUtilities.isTablet() && (clippingImageView = cu0Var.f37163m) != null) {
                    clippingImageView.setImageBitmap(null);
                }
                try {
                    if (photoViewer.f35601c0.getParent() != null) {
                        ((WindowManager) photoViewer.f35800y.getSystemService("window")).removeView(photoViewer.f35601c0);
                        photoViewer.V1();
                    }
                } catch (Exception e9) {
                    FileLog.e(e9);
                    return;
                }
                break;
            case 1:
                PhotoViewer photoViewer2 = this.f39478b;
                photoViewer2.f35687l4 = null;
                int i10 = 0;
                photoViewer2.f35583a0.setLayerType(0, null);
                photoViewer2.f35670j4 = 0;
                photoViewer2.F1();
                photoViewer2.X1(this.f39479c);
                MediaController.getInstance().tryResumePausedAudio();
                if (photoViewer2.f35743r7 && !photoViewer2.f35753s7 && (arrayList = photoViewer2.f35608c7) != null) {
                    int size = arrayList.size();
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        if (obj instanceof MediaController.PhotoEntry) {
                            ((MediaController.PhotoEntry) obj).deleteAll();
                        }
                    }
                    break;
                }
                break;
            default:
                PhotoViewer photoViewer3 = this.f39478b;
                photoViewer3.f35687l4 = null;
                ut0 ut0Var = photoViewer3.f35583a0;
                if (ut0Var != null) {
                    int i11 = 0;
                    ut0Var.setLayerType(0, null);
                    photoViewer3.f35670j4 = 0;
                    photoViewer3.X1(this.f39479c);
                    photoViewer3.f35583a0.setScaleX(1.0f);
                    photoViewer3.f35583a0.setScaleY(1.0f);
                    MediaController.getInstance().tryResumePausedAudio();
                    if (photoViewer3.f35743r7 && !photoViewer3.f35753s7 && (arrayList2 = photoViewer3.f35608c7) != null) {
                        int size2 = arrayList2.size();
                        while (i11 < size2) {
                            Object obj2 = arrayList2.get(i11);
                            i11++;
                            if (obj2 instanceof MediaController.PhotoEntry) {
                                ((MediaController.PhotoEntry) obj2).deleteAll();
                            }
                        }
                        break;
                    }
                }
                break;
        }
    }
}
