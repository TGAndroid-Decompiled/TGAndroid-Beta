package org.telegram.ui;

import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.ClippingImageView;
public final class fn0 implements Runnable {
    public final int f45676a;
    public final PhotoViewer f45677b;
    public final wq0 f45678c;

    public fn0(PhotoViewer photoViewer, wq0 wq0Var, int i7) {
        this.f45676a = i7;
        this.f45677b = photoViewer;
        this.f45678c = wq0Var;
    }

    @Override
    public final void run() {
        ClippingImageView clippingImageView;
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.f45676a) {
            case 0:
                PhotoViewer photoViewer = this.f45677b;
                photoViewer.f41409h0.setImageBitmap(null);
                wq0 wq0Var = this.f45678c;
                if (wq0Var != null && !org.telegram.messenger.g0.Q1() && (clippingImageView = wq0Var.f51488m) != null) {
                    clippingImageView.setImageBitmap(null);
                }
                try {
                    if (photoViewer.f41400g0.getParent() != null) {
                        ((WindowManager) photoViewer.D.getSystemService("window")).removeView(photoViewer.f41400g0);
                        photoViewer.U1();
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 1:
                PhotoViewer photoViewer2 = this.f45677b;
                photoViewer2.o4 = null;
                int i7 = 0;
                photoViewer2.f41381e0.setLayerType(0, null);
                photoViewer2.f41453m4 = 0;
                photoViewer2.D1();
                photoViewer2.W1(this.f45678c);
                MediaController.B().F0();
                if (photoViewer2.f41527u7 && !photoViewer2.f41536v7 && (arrayList = photoViewer2.f41398f7) != null) {
                    int size = arrayList.size();
                    while (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        if (obj instanceof org.telegram.messenger.gf) {
                            ((org.telegram.messenger.gf) obj).h();
                        }
                    }
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer3 = this.f45677b;
                photoViewer3.o4 = null;
                pq0 pq0Var = photoViewer3.f41381e0;
                if (pq0Var != null) {
                    int i10 = 0;
                    pq0Var.setLayerType(0, null);
                    photoViewer3.f41453m4 = 0;
                    photoViewer3.W1(this.f45678c);
                    photoViewer3.f41381e0.setScaleX(1.0f);
                    photoViewer3.f41381e0.setScaleY(1.0f);
                    MediaController.B().F0();
                    if (photoViewer3.f41527u7 && !photoViewer3.f41536v7 && (arrayList2 = photoViewer3.f41398f7) != null) {
                        int size2 = arrayList2.size();
                        while (i10 < size2) {
                            Object obj2 = arrayList2.get(i10);
                            i10++;
                            if (obj2 instanceof org.telegram.messenger.gf) {
                                ((org.telegram.messenger.gf) obj2).h();
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
