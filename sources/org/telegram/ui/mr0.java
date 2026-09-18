package org.telegram.ui;

import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.ClippingImageView;
public final class mr0 implements Runnable {
    public final int f35878a;
    public final PhotoViewer f35879b;
    public final fv0 f35880c;

    public mr0(PhotoViewer photoViewer, fv0 fv0Var, int i10) {
        this.f35878a = i10;
        this.f35879b = photoViewer;
        this.f35880c = fv0Var;
    }

    @Override
    public final void run() {
        ClippingImageView clippingImageView;
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.f35878a) {
            case 0:
                PhotoViewer photoViewer = this.f35879b;
                photoViewer.f30980h0.setImageBitmap(null);
                fv0 fv0Var = this.f35880c;
                if (fv0Var != null && !AndroidUtilities.isTablet() && (clippingImageView = fv0Var.f33776m) != null) {
                    clippingImageView.setImageBitmap(null);
                }
                try {
                    if (photoViewer.f30971g0.getParent() != null) {
                        ((WindowManager) photoViewer.f31132y.getSystemService("window")).removeView(photoViewer.f30971g0);
                        photoViewer.V1();
                        return;
                    }
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                PhotoViewer photoViewer2 = this.f35879b;
                photoViewer2.f31053p4 = null;
                int i10 = 0;
                photoViewer2.f30954e0.setLayerType(0, null);
                photoViewer2.f31035n4 = 0;
                photoViewer2.F1();
                photoViewer2.X1(this.f35880c);
                MediaController.getInstance().tryResumePausedAudio();
                if (photoViewer2.f31110v7 && !photoViewer2.f31120w7 && (arrayList = photoViewer2.f30978g7) != null) {
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
                PhotoViewer photoViewer3 = this.f35879b;
                photoViewer3.f31053p4 = null;
                xu0 xu0Var = photoViewer3.f30954e0;
                if (xu0Var != null) {
                    int i11 = 0;
                    xu0Var.setLayerType(0, null);
                    photoViewer3.f31035n4 = 0;
                    photoViewer3.X1(this.f35880c);
                    photoViewer3.f30954e0.setScaleX(1.0f);
                    photoViewer3.f30954e0.setScaleY(1.0f);
                    MediaController.getInstance().tryResumePausedAudio();
                    if (photoViewer3.f31110v7 && !photoViewer3.f31120w7 && (arrayList2 = photoViewer3.f30978g7) != null) {
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
