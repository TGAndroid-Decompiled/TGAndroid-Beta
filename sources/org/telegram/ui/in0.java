package org.telegram.ui;

import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.ClippingImageView;
public final class in0 implements Runnable {
    public final int f46678a;
    public final PhotoViewer f46679b;
    public final zq0 f46680c;

    public in0(PhotoViewer photoViewer, zq0 zq0Var, int i7) {
        this.f46678a = i7;
        this.f46679b = photoViewer;
        this.f46680c = zq0Var;
    }

    @Override
    public final void run() {
        ClippingImageView clippingImageView;
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.f46678a) {
            case 0:
                PhotoViewer photoViewer = this.f46679b;
                photoViewer.f41410h0.setImageBitmap(null);
                zq0 zq0Var = this.f46680c;
                if (zq0Var != null && !org.telegram.messenger.g0.Q1() && (clippingImageView = zq0Var.f52513m) != null) {
                    clippingImageView.setImageBitmap(null);
                }
                try {
                    if (photoViewer.f41401g0.getParent() != null) {
                        ((WindowManager) photoViewer.D.getSystemService("window")).removeView(photoViewer.f41401g0);
                        photoViewer.U1();
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 1:
                PhotoViewer photoViewer2 = this.f46679b;
                photoViewer2.o4 = null;
                int i7 = 0;
                photoViewer2.f41382e0.setLayerType(0, null);
                photoViewer2.f41454m4 = 0;
                photoViewer2.D1();
                photoViewer2.W1(this.f46680c);
                MediaController.B().F0();
                if (photoViewer2.f41528u7 && !photoViewer2.f41537v7 && (arrayList = photoViewer2.f41399f7) != null) {
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
                PhotoViewer photoViewer3 = this.f46679b;
                photoViewer3.o4 = null;
                sq0 sq0Var = photoViewer3.f41382e0;
                if (sq0Var != null) {
                    int i10 = 0;
                    sq0Var.setLayerType(0, null);
                    photoViewer3.f41454m4 = 0;
                    photoViewer3.W1(this.f46680c);
                    photoViewer3.f41382e0.setScaleX(1.0f);
                    photoViewer3.f41382e0.setScaleY(1.0f);
                    MediaController.B().F0();
                    if (photoViewer3.f41528u7 && !photoViewer3.f41537v7 && (arrayList2 = photoViewer3.f41399f7) != null) {
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
