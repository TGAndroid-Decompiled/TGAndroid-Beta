package org.telegram.ui;

import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.ClippingImageView;
public final class kr0 implements Runnable {
    public final int f39385a;
    public final PhotoViewer f39386b;
    public final ev0 f39387c;

    public kr0(PhotoViewer photoViewer, ev0 ev0Var, int i10) {
        this.f39385a = i10;
        this.f39386b = photoViewer;
        this.f39387c = ev0Var;
    }

    @Override
    public final void run() {
        ClippingImageView clippingImageView;
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.f39385a) {
            case 0:
                PhotoViewer photoViewer = this.f39386b;
                photoViewer.f33968h0.setImageBitmap(null);
                ev0 ev0Var = this.f39387c;
                if (ev0Var != null && !AndroidUtilities.isTablet() && (clippingImageView = ev0Var.f37410m) != null) {
                    clippingImageView.setImageBitmap(null);
                }
                try {
                    if (photoViewer.f33959g0.getParent() != null) {
                        ((WindowManager) photoViewer.f34120y.getSystemService("window")).removeView(photoViewer.f33959g0);
                        photoViewer.W1();
                        return;
                    }
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 1:
                PhotoViewer photoViewer2 = this.f39386b;
                photoViewer2.f34041p4 = null;
                int i10 = 0;
                photoViewer2.f33942e0.setLayerType(0, null);
                photoViewer2.f34023n4 = 0;
                photoViewer2.G1();
                photoViewer2.Y1(this.f39387c);
                MediaController.getInstance().tryResumePausedAudio();
                if (photoViewer2.f34098v7 && !photoViewer2.f34108w7 && (arrayList = photoViewer2.f33966g7) != null) {
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
                PhotoViewer photoViewer3 = this.f39386b;
                photoViewer3.f34041p4 = null;
                wu0 wu0Var = photoViewer3.f33942e0;
                if (wu0Var != null) {
                    int i11 = 0;
                    wu0Var.setLayerType(0, null);
                    photoViewer3.f34023n4 = 0;
                    photoViewer3.Y1(this.f39387c);
                    photoViewer3.f33942e0.setScaleX(1.0f);
                    photoViewer3.f33942e0.setScaleY(1.0f);
                    MediaController.getInstance().tryResumePausedAudio();
                    if (photoViewer3.f34098v7 && !photoViewer3.f34108w7 && (arrayList2 = photoViewer3.f33966g7) != null) {
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
