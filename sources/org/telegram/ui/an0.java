package org.telegram.ui;

import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.ClippingImageView;
public final class an0 implements Runnable {
    public final int f43811a;
    public final PhotoViewer f43812b;
    public final mq0 f43813c;

    public an0(PhotoViewer photoViewer, mq0 mq0Var, int i3) {
        this.f43811a = i3;
        this.f43812b = photoViewer;
        this.f43813c = mq0Var;
    }

    @Override
    public final void run() {
        ClippingImageView clippingImageView;
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.f43811a) {
            case 0:
                PhotoViewer photoViewer = this.f43812b;
                photoViewer.f41445i0.setImageBitmap(null);
                mq0 mq0Var = this.f43813c;
                if (mq0Var != null && !org.telegram.messenger.g0.Q1() && (clippingImageView = mq0Var.f47761m) != null) {
                    clippingImageView.setImageBitmap(null);
                }
                try {
                    if (photoViewer.f41437h0.getParent() != null) {
                        ((WindowManager) photoViewer.E.getSystemService("window")).removeView(photoViewer.f41437h0);
                        photoViewer.Z1();
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 1:
                PhotoViewer photoViewer2 = this.f43812b;
                photoViewer2.f41517q4 = null;
                int i3 = 0;
                photoViewer2.f41420f0.setLayerType(0, null);
                photoViewer2.f41499o4 = 0;
                photoViewer2.I1();
                photoViewer2.b2(this.f43813c);
                MediaController.B().F0();
                if (photoViewer2.f41575w7 && !photoViewer2.f41585x7 && (arrayList = photoViewer2.h7) != null) {
                    int size = arrayList.size();
                    while (i3 < size) {
                        Object obj = arrayList.get(i3);
                        i3++;
                        if (obj instanceof org.telegram.messenger.ye) {
                            ((org.telegram.messenger.ye) obj).h();
                        }
                    }
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer3 = this.f43812b;
                photoViewer3.f41517q4 = null;
                gq0 gq0Var = photoViewer3.f41420f0;
                if (gq0Var != null) {
                    int i10 = 0;
                    gq0Var.setLayerType(0, null);
                    photoViewer3.f41499o4 = 0;
                    photoViewer3.b2(this.f43813c);
                    photoViewer3.f41420f0.setScaleX(1.0f);
                    photoViewer3.f41420f0.setScaleY(1.0f);
                    MediaController.B().F0();
                    if (photoViewer3.f41575w7 && !photoViewer3.f41585x7 && (arrayList2 = photoViewer3.h7) != null) {
                        int size2 = arrayList2.size();
                        while (i10 < size2) {
                            Object obj2 = arrayList2.get(i10);
                            i10++;
                            if (obj2 instanceof org.telegram.messenger.ye) {
                                ((org.telegram.messenger.ye) obj2).h();
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
