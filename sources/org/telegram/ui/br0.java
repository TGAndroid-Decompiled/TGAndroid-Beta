package org.telegram.ui;

import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.ClippingImageView;
public final class br0 implements Runnable {
    public final int f38091a;
    public final PhotoViewer f38092b;
    public final su0 f38093c;

    public br0(PhotoViewer photoViewer, su0 su0Var, int i10) {
        this.f38091a = i10;
        this.f38092b = photoViewer;
        this.f38093c = su0Var;
    }

    @Override
    public final void run() {
        ClippingImageView clippingImageView;
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.f38091a) {
            case 0:
                PhotoViewer photoViewer = this.f38092b;
                photoViewer.f35696h0.setImageBitmap(null);
                su0 su0Var = this.f38093c;
                if (su0Var != null && !AndroidUtilities.isTablet() && (clippingImageView = su0Var.f43415m) != null) {
                    clippingImageView.setImageBitmap(null);
                }
                try {
                    if (photoViewer.f35688g0.getParent() != null) {
                        ((WindowManager) photoViewer.f35849y.getSystemService("window")).removeView(photoViewer.f35688g0);
                        photoViewer.Z1();
                        return;
                    }
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                PhotoViewer photoViewer2 = this.f38092b;
                photoViewer2.f35770p4 = null;
                int i10 = 0;
                photoViewer2.f35670e0.setLayerType(0, null);
                photoViewer2.f35752n4 = 0;
                photoViewer2.I1();
                photoViewer2.b2(this.f38093c);
                MediaController.getInstance().tryResumePausedAudio();
                if (photoViewer2.f35827v7 && !photoViewer2.f35837w7 && (arrayList = photoViewer2.g7) != null) {
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
                PhotoViewer photoViewer3 = this.f38092b;
                photoViewer3.f35770p4 = null;
                ku0 ku0Var = photoViewer3.f35670e0;
                if (ku0Var != null) {
                    int i11 = 0;
                    ku0Var.setLayerType(0, null);
                    photoViewer3.f35752n4 = 0;
                    photoViewer3.b2(this.f38093c);
                    photoViewer3.f35670e0.setScaleX(1.0f);
                    photoViewer3.f35670e0.setScaleY(1.0f);
                    MediaController.getInstance().tryResumePausedAudio();
                    if (photoViewer3.f35827v7 && !photoViewer3.f35837w7 && (arrayList2 = photoViewer3.g7) != null) {
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
