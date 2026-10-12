package org.telegram.ui;

import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.ClippingImageView;
public final class mr0 implements Runnable {
    public final int f40123a;
    public final PhotoViewer f40124b;
    public final gv0 f40125c;

    public mr0(PhotoViewer photoViewer, gv0 gv0Var, int i10) {
        this.f40123a = i10;
        this.f40124b = photoViewer;
        this.f40125c = gv0Var;
    }

    @Override
    public final void run() {
        ClippingImageView clippingImageView;
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.f40123a) {
            case 0:
                PhotoViewer photoViewer = this.f40124b;
                photoViewer.f33769h0.setImageBitmap(null);
                gv0 gv0Var = this.f40125c;
                if (gv0Var != null && !AndroidUtilities.isTablet() && (clippingImageView = gv0Var.f38157m) != null) {
                    clippingImageView.setImageBitmap(null);
                }
                try {
                    if (photoViewer.f33760g0.getParent() != null) {
                        ((WindowManager) photoViewer.f33921y.getSystemService("window")).removeView(photoViewer.f33760g0);
                        photoViewer.W1();
                        return;
                    }
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 1:
                PhotoViewer photoViewer2 = this.f40124b;
                photoViewer2.f33842p4 = null;
                int i10 = 0;
                photoViewer2.f33743e0.setLayerType(0, null);
                photoViewer2.f33824n4 = 0;
                photoViewer2.G1();
                photoViewer2.Y1(this.f40125c);
                MediaController.getInstance().tryResumePausedAudio();
                if (photoViewer2.f33899v7 && !photoViewer2.f33909w7 && (arrayList = photoViewer2.f33767g7) != null) {
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
                PhotoViewer photoViewer3 = this.f40124b;
                photoViewer3.f33842p4 = null;
                yu0 yu0Var = photoViewer3.f33743e0;
                if (yu0Var != null) {
                    int i11 = 0;
                    yu0Var.setLayerType(0, null);
                    photoViewer3.f33824n4 = 0;
                    photoViewer3.Y1(this.f40125c);
                    photoViewer3.f33743e0.setScaleX(1.0f);
                    photoViewer3.f33743e0.setScaleY(1.0f);
                    MediaController.getInstance().tryResumePausedAudio();
                    if (photoViewer3.f33899v7 && !photoViewer3.f33909w7 && (arrayList2 = photoViewer3.f33767g7) != null) {
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
