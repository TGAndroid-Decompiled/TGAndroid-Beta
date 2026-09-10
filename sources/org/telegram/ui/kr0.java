package org.telegram.ui;

import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.ClippingImageView;
public final class kr0 implements Runnable {
    public final int f34449a;
    public final PhotoViewer f34450b;
    public final ev0 f34451c;

    public kr0(PhotoViewer photoViewer, ev0 ev0Var, int i10) {
        this.f34449a = i10;
        this.f34450b = photoViewer;
        this.f34451c = ev0Var;
    }

    @Override
    public final void run() {
        ClippingImageView clippingImageView;
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.f34449a) {
            case 0:
                PhotoViewer photoViewer = this.f34450b;
                photoViewer.f30075h0.setImageBitmap(null);
                ev0 ev0Var = this.f34451c;
                if (ev0Var != null && !AndroidUtilities.isTablet() && (clippingImageView = ev0Var.f32625m) != null) {
                    clippingImageView.setImageBitmap(null);
                }
                try {
                    if (photoViewer.f30066g0.getParent() != null) {
                        ((WindowManager) photoViewer.f30227y.getSystemService("window")).removeView(photoViewer.f30066g0);
                        photoViewer.V1();
                        return;
                    }
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                PhotoViewer photoViewer2 = this.f34450b;
                photoViewer2.f30148p4 = null;
                int i10 = 0;
                photoViewer2.f30049e0.setLayerType(0, null);
                photoViewer2.f30130n4 = 0;
                photoViewer2.F1();
                photoViewer2.X1(this.f34451c);
                MediaController.getInstance().tryResumePausedAudio();
                if (photoViewer2.f30205v7 && !photoViewer2.f30215w7 && (arrayList = photoViewer2.f30073g7) != null) {
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
                PhotoViewer photoViewer3 = this.f34450b;
                photoViewer3.f30148p4 = null;
                wu0 wu0Var = photoViewer3.f30049e0;
                if (wu0Var != null) {
                    int i11 = 0;
                    wu0Var.setLayerType(0, null);
                    photoViewer3.f30130n4 = 0;
                    photoViewer3.X1(this.f34451c);
                    photoViewer3.f30049e0.setScaleX(1.0f);
                    photoViewer3.f30049e0.setScaleY(1.0f);
                    MediaController.getInstance().tryResumePausedAudio();
                    if (photoViewer3.f30205v7 && !photoViewer3.f30215w7 && (arrayList2 = photoViewer3.f30073g7) != null) {
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
