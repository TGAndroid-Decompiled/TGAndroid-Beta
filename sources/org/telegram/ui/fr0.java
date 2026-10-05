package org.telegram.ui;

import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.ClippingImageView;
public final class fr0 implements Runnable {
    public final int f36386a;
    public final PhotoViewer f36387b;
    public final yu0 f36388c;

    public fr0(PhotoViewer photoViewer, yu0 yu0Var, int i10) {
        this.f36386a = i10;
        this.f36387b = photoViewer;
        this.f36388c = yu0Var;
    }

    @Override
    public final void run() {
        ClippingImageView clippingImageView;
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.f36386a) {
            case 0:
                PhotoViewer photoViewer = this.f36387b;
                photoViewer.f33940h0.setImageBitmap(null);
                yu0 yu0Var = this.f36388c;
                if (yu0Var != null && !AndroidUtilities.isTablet() && (clippingImageView = yu0Var.f43630m) != null) {
                    clippingImageView.setImageBitmap(null);
                }
                try {
                    if (photoViewer.f33931g0.getParent() != null) {
                        ((WindowManager) photoViewer.f34092y.getSystemService("window")).removeView(photoViewer.f33931g0);
                        photoViewer.W1();
                        return;
                    }
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 1:
                PhotoViewer photoViewer2 = this.f36387b;
                photoViewer2.f34013p4 = null;
                int i10 = 0;
                photoViewer2.f33914e0.setLayerType(0, null);
                photoViewer2.f33995n4 = 0;
                photoViewer2.G1();
                photoViewer2.Y1(this.f36388c);
                MediaController.getInstance().tryResumePausedAudio();
                if (photoViewer2.f34070v7 && !photoViewer2.f34080w7 && (arrayList = photoViewer2.f33938g7) != null) {
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
                PhotoViewer photoViewer3 = this.f36387b;
                photoViewer3.f34013p4 = null;
                qu0 qu0Var = photoViewer3.f33914e0;
                if (qu0Var != null) {
                    int i11 = 0;
                    qu0Var.setLayerType(0, null);
                    photoViewer3.f33995n4 = 0;
                    photoViewer3.Y1(this.f36388c);
                    photoViewer3.f33914e0.setScaleX(1.0f);
                    photoViewer3.f33914e0.setScaleY(1.0f);
                    MediaController.getInstance().tryResumePausedAudio();
                    if (photoViewer3.f34070v7 && !photoViewer3.f34080w7 && (arrayList2 = photoViewer3.f33938g7) != null) {
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
