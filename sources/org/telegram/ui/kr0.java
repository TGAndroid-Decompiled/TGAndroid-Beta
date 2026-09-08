package org.telegram.ui;

import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.ClippingImageView;
public final class kr0 implements Runnable {
    public final int f38143a;
    public final PhotoViewer f38144b;
    public final cv0 f38145c;

    public kr0(PhotoViewer photoViewer, cv0 cv0Var, int i10) {
        this.f38143a = i10;
        this.f38144b = photoViewer;
        this.f38145c = cv0Var;
    }

    @Override
    public final void run() {
        ClippingImageView clippingImageView;
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.f38143a) {
            case 0:
                PhotoViewer photoViewer = this.f38144b;
                photoViewer.f33602h0.setImageBitmap(null);
                cv0 cv0Var = this.f38145c;
                if (cv0Var != null && !AndroidUtilities.isTablet() && (clippingImageView = cv0Var.f35577m) != null) {
                    clippingImageView.setImageBitmap(null);
                }
                try {
                    if (photoViewer.f33593g0.getParent() != null) {
                        ((WindowManager) photoViewer.f33754y.getSystemService("window")).removeView(photoViewer.f33593g0);
                        photoViewer.V1();
                        return;
                    }
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 1:
                PhotoViewer photoViewer2 = this.f38144b;
                photoViewer2.f33675p4 = null;
                int i10 = 0;
                photoViewer2.f33576e0.setLayerType(0, null);
                photoViewer2.f33657n4 = 0;
                photoViewer2.F1();
                photoViewer2.X1(this.f38145c);
                MediaController.getInstance().tryResumePausedAudio();
                if (photoViewer2.f33732v7 && !photoViewer2.f33742w7 && (arrayList = photoViewer2.f33600g7) != null) {
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
                PhotoViewer photoViewer3 = this.f38144b;
                photoViewer3.f33675p4 = null;
                uu0 uu0Var = photoViewer3.f33576e0;
                if (uu0Var != null) {
                    int i11 = 0;
                    uu0Var.setLayerType(0, null);
                    photoViewer3.f33657n4 = 0;
                    photoViewer3.X1(this.f38145c);
                    photoViewer3.f33576e0.setScaleX(1.0f);
                    photoViewer3.f33576e0.setScaleY(1.0f);
                    MediaController.getInstance().tryResumePausedAudio();
                    if (photoViewer3.f33732v7 && !photoViewer3.f33742w7 && (arrayList2 = photoViewer3.f33600g7) != null) {
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
