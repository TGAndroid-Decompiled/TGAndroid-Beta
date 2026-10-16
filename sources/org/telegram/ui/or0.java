package org.telegram.ui;

import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.ClippingImageView;
public final class or0 implements Runnable {
    public final int f38739a;
    public final PhotoViewer f38740b;
    public final jv0 f38741c;

    public or0(PhotoViewer photoViewer, jv0 jv0Var, int i10) {
        this.f38739a = i10;
        this.f38740b = photoViewer;
        this.f38741c = jv0Var;
    }

    @Override
    public final void run() {
        ClippingImageView clippingImageView;
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.f38739a) {
            case 0:
                PhotoViewer photoViewer = this.f38740b;
                photoViewer.f31954h0.setImageBitmap(null);
                jv0 jv0Var = this.f38741c;
                if (jv0Var != null && !AndroidUtilities.isTablet() && (clippingImageView = jv0Var.f37154m) != null) {
                    clippingImageView.setImageBitmap(null);
                }
                try {
                    if (photoViewer.f31945g0.getParent() != null) {
                        ((WindowManager) photoViewer.f32107y.getSystemService("window")).removeView(photoViewer.f31945g0);
                        photoViewer.W1();
                        return;
                    }
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                PhotoViewer photoViewer2 = this.f38740b;
                photoViewer2.f32028p4 = null;
                int i10 = 0;
                photoViewer2.f31928e0.setLayerType(0, null);
                photoViewer2.f32010n4 = 0;
                photoViewer2.G1();
                photoViewer2.Y1(this.f38741c);
                MediaController.getInstance().tryResumePausedAudio();
                if (photoViewer2.f32085v7 && !photoViewer2.f32095w7 && (arrayList = photoViewer2.f31952g7) != null) {
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
                PhotoViewer photoViewer3 = this.f38740b;
                photoViewer3.f32028p4 = null;
                bv0 bv0Var = photoViewer3.f31928e0;
                if (bv0Var != null) {
                    int i11 = 0;
                    bv0Var.setLayerType(0, null);
                    photoViewer3.f32010n4 = 0;
                    photoViewer3.Y1(this.f38741c);
                    photoViewer3.f31928e0.setScaleX(1.0f);
                    photoViewer3.f31928e0.setScaleY(1.0f);
                    MediaController.getInstance().tryResumePausedAudio();
                    if (photoViewer3.f32085v7 && !photoViewer3.f32095w7 && (arrayList2 = photoViewer3.f31952g7) != null) {
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
