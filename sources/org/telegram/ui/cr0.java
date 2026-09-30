package org.telegram.ui;

import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.ClippingImageView;
public final class cr0 implements Runnable {
    public final int f32859a;
    public final PhotoViewer f32860b;
    public final vu0 f32861c;

    public cr0(PhotoViewer photoViewer, vu0 vu0Var, int i10) {
        this.f32859a = i10;
        this.f32860b = photoViewer;
        this.f32861c = vu0Var;
    }

    @Override
    public final void run() {
        ClippingImageView clippingImageView;
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.f32859a) {
            case 0:
                PhotoViewer photoViewer = this.f32860b;
                photoViewer.f31323h0.setImageBitmap(null);
                vu0 vu0Var = this.f32861c;
                if (vu0Var != null && !AndroidUtilities.isTablet() && (clippingImageView = vu0Var.f38916m) != null) {
                    clippingImageView.setImageBitmap(null);
                }
                try {
                    if (photoViewer.f31314g0.getParent() != null) {
                        ((WindowManager) photoViewer.f31475y.getSystemService("window")).removeView(photoViewer.f31314g0);
                        photoViewer.W1();
                        return;
                    }
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                PhotoViewer photoViewer2 = this.f32860b;
                photoViewer2.f31396p4 = null;
                int i10 = 0;
                photoViewer2.f31297e0.setLayerType(0, null);
                photoViewer2.f31378n4 = 0;
                photoViewer2.G1();
                photoViewer2.Y1(this.f32861c);
                MediaController.getInstance().tryResumePausedAudio();
                if (photoViewer2.f31453v7 && !photoViewer2.f31463w7 && (arrayList = photoViewer2.f31321g7) != null) {
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
                PhotoViewer photoViewer3 = this.f32860b;
                photoViewer3.f31396p4 = null;
                nu0 nu0Var = photoViewer3.f31297e0;
                if (nu0Var != null) {
                    int i11 = 0;
                    nu0Var.setLayerType(0, null);
                    photoViewer3.f31378n4 = 0;
                    photoViewer3.Y1(this.f32861c);
                    photoViewer3.f31297e0.setScaleX(1.0f);
                    photoViewer3.f31297e0.setScaleY(1.0f);
                    MediaController.getInstance().tryResumePausedAudio();
                    if (photoViewer3.f31453v7 && !photoViewer3.f31463w7 && (arrayList2 = photoViewer3.f31321g7) != null) {
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
