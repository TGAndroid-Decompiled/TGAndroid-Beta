package org.telegram.ui;

import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.ClippingImageView;
public final class hn0 implements Runnable {
    public final int f47745a;
    public final PhotoViewer f47746b;
    public final uq0 f47747c;

    public hn0(PhotoViewer photoViewer, uq0 uq0Var, int i7) {
        this.f47745a = i7;
        this.f47746b = photoViewer;
        this.f47747c = uq0Var;
    }

    @Override
    public final void run() {
        ClippingImageView clippingImageView;
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.f47745a) {
            case 0:
                PhotoViewer photoViewer = this.f47746b;
                photoViewer.f42789i0.setImageBitmap(null);
                uq0 uq0Var = this.f47747c;
                if (uq0Var != null && !org.telegram.messenger.g0.Q1() && (clippingImageView = uq0Var.f52007m) != null) {
                    clippingImageView.setImageBitmap(null);
                }
                try {
                    if (photoViewer.f42781h0.getParent() != null) {
                        ((WindowManager) photoViewer.E.getSystemService("window")).removeView(photoViewer.f42781h0);
                        photoViewer.U1();
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 1:
                PhotoViewer photoViewer2 = this.f47746b;
                photoViewer2.f42851p4 = null;
                int i7 = 0;
                photoViewer2.f42763f0.setLayerType(0, null);
                photoViewer2.f42834n4 = 0;
                photoViewer2.D1();
                photoViewer2.W1(this.f47747c);
                MediaController.B().F0();
                if (photoViewer2.f42908v7 && !photoViewer2.f42918w7 && (arrayList = photoViewer2.f42779g7) != null) {
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
                PhotoViewer photoViewer3 = this.f47746b;
                photoViewer3.f42851p4 = null;
                oq0 oq0Var = photoViewer3.f42763f0;
                if (oq0Var != null) {
                    int i10 = 0;
                    oq0Var.setLayerType(0, null);
                    photoViewer3.f42834n4 = 0;
                    photoViewer3.W1(this.f47747c);
                    photoViewer3.f42763f0.setScaleX(1.0f);
                    photoViewer3.f42763f0.setScaleY(1.0f);
                    MediaController.B().F0();
                    if (photoViewer3.f42908v7 && !photoViewer3.f42918w7 && (arrayList2 = photoViewer3.f42779g7) != null) {
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
