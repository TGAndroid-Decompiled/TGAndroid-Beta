package org.telegram.ui;

import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.ClippingImageView;
public final class iq0 implements Runnable {
    public final int f39253a;
    public final PhotoViewer f39254b;
    public final bu0 f39255c;

    public iq0(PhotoViewer photoViewer, bu0 bu0Var, int i9) {
        this.f39253a = i9;
        this.f39254b = photoViewer;
        this.f39255c = bu0Var;
    }

    @Override
    public final void run() {
        ClippingImageView clippingImageView;
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.f39253a) {
            case 0:
                PhotoViewer photoViewer = this.f39254b;
                photoViewer.f35607d0.setImageBitmap(null);
                bu0 bu0Var = this.f39255c;
                if (bu0Var != null && !AndroidUtilities.isTablet() && (clippingImageView = bu0Var.f36988m) != null) {
                    clippingImageView.setImageBitmap(null);
                }
                try {
                    if (photoViewer.f35598c0.getParent() != null) {
                        ((WindowManager) photoViewer.f35797y.getSystemService("window")).removeView(photoViewer.f35598c0);
                        photoViewer.V1();
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 1:
                PhotoViewer photoViewer2 = this.f39254b;
                photoViewer2.f35684l4 = null;
                int i9 = 0;
                photoViewer2.f35580a0.setLayerType(0, null);
                photoViewer2.f35667j4 = 0;
                photoViewer2.F1();
                photoViewer2.X1(this.f39255c);
                MediaController.getInstance().tryResumePausedAudio();
                if (photoViewer2.f35740r7 && !photoViewer2.f35750s7 && (arrayList = photoViewer2.f35605c7) != null) {
                    int size = arrayList.size();
                    while (i9 < size) {
                        Object obj = arrayList.get(i9);
                        i9++;
                        if (obj instanceof MediaController.PhotoEntry) {
                            ((MediaController.PhotoEntry) obj).deleteAll();
                        }
                    }
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer3 = this.f39254b;
                photoViewer3.f35684l4 = null;
                tt0 tt0Var = photoViewer3.f35580a0;
                if (tt0Var != null) {
                    int i10 = 0;
                    tt0Var.setLayerType(0, null);
                    photoViewer3.f35667j4 = 0;
                    photoViewer3.X1(this.f39255c);
                    photoViewer3.f35580a0.setScaleX(1.0f);
                    photoViewer3.f35580a0.setScaleY(1.0f);
                    MediaController.getInstance().tryResumePausedAudio();
                    if (photoViewer3.f35740r7 && !photoViewer3.f35750s7 && (arrayList2 = photoViewer3.f35605c7) != null) {
                        int size2 = arrayList2.size();
                        while (i10 < size2) {
                            Object obj2 = arrayList2.get(i10);
                            i10++;
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
