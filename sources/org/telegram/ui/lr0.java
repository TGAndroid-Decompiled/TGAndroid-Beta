package org.telegram.ui;

import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.ClippingImageView;
public final class lr0 implements Runnable {
    public final int f35441a;
    public final PhotoViewer f35442b;
    public final dv0 f35443c;

    public lr0(PhotoViewer photoViewer, dv0 dv0Var, int i10) {
        this.f35441a = i10;
        this.f35442b = photoViewer;
        this.f35443c = dv0Var;
    }

    @Override
    public final void run() {
        ClippingImageView clippingImageView;
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.f35441a) {
            case 0:
                PhotoViewer photoViewer = this.f35442b;
                photoViewer.f31207h0.setImageBitmap(null);
                dv0 dv0Var = this.f35443c;
                if (dv0Var != null && !AndroidUtilities.isTablet() && (clippingImageView = dv0Var.f33101m) != null) {
                    clippingImageView.setImageBitmap(null);
                }
                try {
                    if (photoViewer.f31198g0.getParent() != null) {
                        ((WindowManager) photoViewer.f31359y.getSystemService("window")).removeView(photoViewer.f31198g0);
                        photoViewer.V1();
                        return;
                    }
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                PhotoViewer photoViewer2 = this.f35442b;
                photoViewer2.f31280p4 = null;
                int i10 = 0;
                photoViewer2.f31181e0.setLayerType(0, null);
                photoViewer2.f31262n4 = 0;
                photoViewer2.F1();
                photoViewer2.X1(this.f35443c);
                MediaController.getInstance().tryResumePausedAudio();
                if (photoViewer2.f31337v7 && !photoViewer2.f31347w7 && (arrayList = photoViewer2.f31205g7) != null) {
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
                PhotoViewer photoViewer3 = this.f35442b;
                photoViewer3.f31280p4 = null;
                vu0 vu0Var = photoViewer3.f31181e0;
                if (vu0Var != null) {
                    int i11 = 0;
                    vu0Var.setLayerType(0, null);
                    photoViewer3.f31262n4 = 0;
                    photoViewer3.X1(this.f35443c);
                    photoViewer3.f31181e0.setScaleX(1.0f);
                    photoViewer3.f31181e0.setScaleY(1.0f);
                    MediaController.getInstance().tryResumePausedAudio();
                    if (photoViewer3.f31337v7 && !photoViewer3.f31347w7 && (arrayList2 = photoViewer3.f31205g7) != null) {
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
