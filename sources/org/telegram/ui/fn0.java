package org.telegram.ui;

import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.ClippingImageView;
public final class fn0 implements Runnable {
    public final int f45671a;
    public final PhotoViewer f45672b;
    public final vq0 f45673c;

    public fn0(PhotoViewer photoViewer, vq0 vq0Var, int i7) {
        this.f45671a = i7;
        this.f45672b = photoViewer;
        this.f45673c = vq0Var;
    }

    @Override
    public final void run() {
        ClippingImageView clippingImageView;
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.f45671a) {
            case 0:
                PhotoViewer photoViewer = this.f45672b;
                photoViewer.f41384h0.setImageBitmap(null);
                vq0 vq0Var = this.f45673c;
                if (vq0Var != null && !org.telegram.messenger.g0.Q1() && (clippingImageView = vq0Var.f50800m) != null) {
                    clippingImageView.setImageBitmap(null);
                }
                try {
                    if (photoViewer.f41375g0.getParent() != null) {
                        ((WindowManager) photoViewer.D.getSystemService("window")).removeView(photoViewer.f41375g0);
                        photoViewer.U1();
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 1:
                PhotoViewer photoViewer2 = this.f45672b;
                photoViewer2.o4 = null;
                int i7 = 0;
                photoViewer2.f41356e0.setLayerType(0, null);
                photoViewer2.f41428m4 = 0;
                photoViewer2.D1();
                photoViewer2.W1(this.f45673c);
                MediaController.B().F0();
                if (photoViewer2.f41502u7 && !photoViewer2.f41511v7 && (arrayList = photoViewer2.f41373f7) != null) {
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
                PhotoViewer photoViewer3 = this.f45672b;
                photoViewer3.o4 = null;
                oq0 oq0Var = photoViewer3.f41356e0;
                if (oq0Var != null) {
                    int i10 = 0;
                    oq0Var.setLayerType(0, null);
                    photoViewer3.f41428m4 = 0;
                    photoViewer3.W1(this.f45673c);
                    photoViewer3.f41356e0.setScaleX(1.0f);
                    photoViewer3.f41356e0.setScaleY(1.0f);
                    MediaController.B().F0();
                    if (photoViewer3.f41502u7 && !photoViewer3.f41511v7 && (arrayList2 = photoViewer3.f41373f7) != null) {
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
