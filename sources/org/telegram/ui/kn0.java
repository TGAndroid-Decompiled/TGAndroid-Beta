package org.telegram.ui;

import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.ClippingImageView;
public final class kn0 implements Runnable {
    public final int f49319a;
    public final PhotoViewer f49320b;
    public final xq0 f49321c;

    public kn0(PhotoViewer photoViewer, xq0 xq0Var, int i7) {
        this.f49319a = i7;
        this.f49320b = photoViewer;
        this.f49321c = xq0Var;
    }

    @Override
    public final void run() {
        ClippingImageView clippingImageView;
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.f49319a) {
            case 0:
                PhotoViewer photoViewer = this.f49320b;
                photoViewer.f43244i0.setImageBitmap(null);
                xq0 xq0Var = this.f49321c;
                if (xq0Var != null && !org.telegram.messenger.g0.Q1() && (clippingImageView = xq0Var.f53908m) != null) {
                    clippingImageView.setImageBitmap(null);
                }
                try {
                    if (photoViewer.f43236h0.getParent() != null) {
                        ((WindowManager) photoViewer.E.getSystemService("window")).removeView(photoViewer.f43236h0);
                        photoViewer.U1();
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 1:
                PhotoViewer photoViewer2 = this.f49320b;
                photoViewer2.f43306p4 = null;
                int i7 = 0;
                photoViewer2.f43218f0.setLayerType(0, null);
                photoViewer2.f43289n4 = 0;
                photoViewer2.D1();
                photoViewer2.W1(this.f49321c);
                MediaController.B().F0();
                if (photoViewer2.f43363v7 && !photoViewer2.f43373w7 && (arrayList = photoViewer2.f43234g7) != null) {
                    int size = arrayList.size();
                    while (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        if (obj instanceof org.telegram.messenger.ff) {
                            ((org.telegram.messenger.ff) obj).h();
                        }
                    }
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer3 = this.f49320b;
                photoViewer3.f43306p4 = null;
                rq0 rq0Var = photoViewer3.f43218f0;
                if (rq0Var != null) {
                    int i10 = 0;
                    rq0Var.setLayerType(0, null);
                    photoViewer3.f43289n4 = 0;
                    photoViewer3.W1(this.f49321c);
                    photoViewer3.f43218f0.setScaleX(1.0f);
                    photoViewer3.f43218f0.setScaleY(1.0f);
                    MediaController.B().F0();
                    if (photoViewer3.f43363v7 && !photoViewer3.f43373w7 && (arrayList2 = photoViewer3.f43234g7) != null) {
                        int size2 = arrayList2.size();
                        while (i10 < size2) {
                            Object obj2 = arrayList2.get(i10);
                            i10++;
                            if (obj2 instanceof org.telegram.messenger.ff) {
                                ((org.telegram.messenger.ff) obj2).h();
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
