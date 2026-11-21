package org.telegram.ui;

import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.ClippingImageView;
public final class kn0 implements Runnable {
    public final int f49364a;
    public final PhotoViewer f49365b;
    public final wq0 f49366c;

    public kn0(PhotoViewer photoViewer, wq0 wq0Var, int i7) {
        this.f49364a = i7;
        this.f49365b = photoViewer;
        this.f49366c = wq0Var;
    }

    @Override
    public final void run() {
        ClippingImageView clippingImageView;
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.f49364a) {
            case 0:
                PhotoViewer photoViewer = this.f49365b;
                photoViewer.f43275i0.setImageBitmap(null);
                wq0 wq0Var = this.f49366c;
                if (wq0Var != null && !org.telegram.messenger.g0.Q1() && (clippingImageView = wq0Var.f53503m) != null) {
                    clippingImageView.setImageBitmap(null);
                }
                try {
                    if (photoViewer.f43267h0.getParent() != null) {
                        ((WindowManager) photoViewer.E.getSystemService("window")).removeView(photoViewer.f43267h0);
                        photoViewer.U1();
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 1:
                PhotoViewer photoViewer2 = this.f49365b;
                photoViewer2.f43337p4 = null;
                int i7 = 0;
                photoViewer2.f43249f0.setLayerType(0, null);
                photoViewer2.f43320n4 = 0;
                photoViewer2.D1();
                photoViewer2.W1(this.f49366c);
                MediaController.B().F0();
                if (photoViewer2.f43394v7 && !photoViewer2.f43404w7 && (arrayList = photoViewer2.f43265g7) != null) {
                    int size = arrayList.size();
                    while (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        if (obj instanceof org.telegram.messenger.ef) {
                            ((org.telegram.messenger.ef) obj).h();
                        }
                    }
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer3 = this.f49365b;
                photoViewer3.f43337p4 = null;
                qq0 qq0Var = photoViewer3.f43249f0;
                if (qq0Var != null) {
                    int i10 = 0;
                    qq0Var.setLayerType(0, null);
                    photoViewer3.f43320n4 = 0;
                    photoViewer3.W1(this.f49366c);
                    photoViewer3.f43249f0.setScaleX(1.0f);
                    photoViewer3.f43249f0.setScaleY(1.0f);
                    MediaController.B().F0();
                    if (photoViewer3.f43394v7 && !photoViewer3.f43404w7 && (arrayList2 = photoViewer3.f43265g7) != null) {
                        int size2 = arrayList2.size();
                        while (i10 < size2) {
                            Object obj2 = arrayList2.get(i10);
                            i10++;
                            if (obj2 instanceof org.telegram.messenger.ef) {
                                ((org.telegram.messenger.ef) obj2).h();
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
