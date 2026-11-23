package org.telegram.ui;

import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.ClippingImageView;
public final class mn0 implements Runnable {
    public final int f50085a;
    public final PhotoViewer f50086b;
    public final wq0 f50087c;

    public mn0(PhotoViewer photoViewer, wq0 wq0Var, int i7) {
        this.f50085a = i7;
        this.f50086b = photoViewer;
        this.f50087c = wq0Var;
    }

    @Override
    public final void run() {
        ClippingImageView clippingImageView;
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.f50085a) {
            case 0:
                PhotoViewer photoViewer = this.f50086b;
                photoViewer.f43360i0.setImageBitmap(null);
                wq0 wq0Var = this.f50087c;
                if (wq0Var != null && !org.telegram.messenger.g0.Q1() && (clippingImageView = wq0Var.f53736m) != null) {
                    clippingImageView.setImageBitmap(null);
                }
                try {
                    if (photoViewer.f43352h0.getParent() != null) {
                        ((WindowManager) photoViewer.E.getSystemService("window")).removeView(photoViewer.f43352h0);
                        photoViewer.V1();
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 1:
                PhotoViewer photoViewer2 = this.f50086b;
                photoViewer2.f43422p4 = null;
                int i7 = 0;
                photoViewer2.f43334f0.setLayerType(0, null);
                photoViewer2.f43405n4 = 0;
                photoViewer2.D1();
                photoViewer2.X1(this.f50087c);
                MediaController.B().F0();
                if (photoViewer2.B7 && !photoViewer2.C7 && (arrayList = photoViewer2.f43350g7) != null) {
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
                PhotoViewer photoViewer3 = this.f50086b;
                photoViewer3.f43422p4 = null;
                qq0 qq0Var = photoViewer3.f43334f0;
                if (qq0Var != null) {
                    int i10 = 0;
                    qq0Var.setLayerType(0, null);
                    photoViewer3.f43405n4 = 0;
                    photoViewer3.X1(this.f50087c);
                    photoViewer3.f43334f0.setScaleX(1.0f);
                    photoViewer3.f43334f0.setScaleY(1.0f);
                    MediaController.B().F0();
                    if (photoViewer3.B7 && !photoViewer3.C7 && (arrayList2 = photoViewer3.f43350g7) != null) {
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
