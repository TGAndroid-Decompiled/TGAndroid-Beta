package org.telegram.ui;

import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.ClippingImageView;
public final class hn0 implements Runnable {
    public final int f46355a;
    public final PhotoViewer f46356b;
    public final yq0 f46357c;

    public hn0(PhotoViewer photoViewer, yq0 yq0Var, int i7) {
        this.f46355a = i7;
        this.f46356b = photoViewer;
        this.f46357c = yq0Var;
    }

    @Override
    public final void run() {
        ClippingImageView clippingImageView;
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.f46355a) {
            case 0:
                PhotoViewer photoViewer = this.f46356b;
                photoViewer.f41419h0.setImageBitmap(null);
                yq0 yq0Var = this.f46357c;
                if (yq0Var != null && !org.telegram.messenger.g0.Q1() && (clippingImageView = yq0Var.f52169m) != null) {
                    clippingImageView.setImageBitmap(null);
                }
                try {
                    if (photoViewer.f41410g0.getParent() != null) {
                        ((WindowManager) photoViewer.D.getSystemService("window")).removeView(photoViewer.f41410g0);
                        photoViewer.U1();
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 1:
                PhotoViewer photoViewer2 = this.f46356b;
                photoViewer2.o4 = null;
                int i7 = 0;
                photoViewer2.f41391e0.setLayerType(0, null);
                photoViewer2.f41463m4 = 0;
                photoViewer2.D1();
                photoViewer2.W1(this.f46357c);
                MediaController.B().F0();
                if (photoViewer2.f41537u7 && !photoViewer2.f41546v7 && (arrayList = photoViewer2.f41408f7) != null) {
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
                PhotoViewer photoViewer3 = this.f46356b;
                photoViewer3.o4 = null;
                rq0 rq0Var = photoViewer3.f41391e0;
                if (rq0Var != null) {
                    int i10 = 0;
                    rq0Var.setLayerType(0, null);
                    photoViewer3.f41463m4 = 0;
                    photoViewer3.W1(this.f46357c);
                    photoViewer3.f41391e0.setScaleX(1.0f);
                    photoViewer3.f41391e0.setScaleY(1.0f);
                    MediaController.B().F0();
                    if (photoViewer3.f41537u7 && !photoViewer3.f41546v7 && (arrayList2 = photoViewer3.f41408f7) != null) {
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
