package org.telegram.ui;

import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.ClippingImageView;
public final class fr0 implements Runnable {
    public final int f33618a;
    public final PhotoViewer f33619b;
    public final yu0 f33620c;

    public fr0(PhotoViewer photoViewer, yu0 yu0Var, int i10) {
        this.f33618a = i10;
        this.f33619b = photoViewer;
        this.f33620c = yu0Var;
    }

    @Override
    public final void run() {
        ClippingImageView clippingImageView;
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.f33618a) {
            case 0:
                PhotoViewer photoViewer = this.f33619b;
                photoViewer.f31251h0.setImageBitmap(null);
                yu0 yu0Var = this.f33620c;
                if (yu0Var != null && !AndroidUtilities.isTablet() && (clippingImageView = yu0Var.f40334m) != null) {
                    clippingImageView.setImageBitmap(null);
                }
                try {
                    if (photoViewer.f31242g0.getParent() != null) {
                        ((WindowManager) photoViewer.f31403y.getSystemService("window")).removeView(photoViewer.f31242g0);
                        photoViewer.V1();
                        return;
                    }
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                PhotoViewer photoViewer2 = this.f33619b;
                photoViewer2.f31324p4 = null;
                int i10 = 0;
                photoViewer2.f31225e0.setLayerType(0, null);
                photoViewer2.f31306n4 = 0;
                photoViewer2.F1();
                photoViewer2.X1(this.f33620c);
                MediaController.getInstance().tryResumePausedAudio();
                if (photoViewer2.f31381v7 && !photoViewer2.f31391w7 && (arrayList = photoViewer2.f31249g7) != null) {
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
                PhotoViewer photoViewer3 = this.f33619b;
                photoViewer3.f31324p4 = null;
                qu0 qu0Var = photoViewer3.f31225e0;
                if (qu0Var != null) {
                    int i11 = 0;
                    qu0Var.setLayerType(0, null);
                    photoViewer3.f31306n4 = 0;
                    photoViewer3.X1(this.f33620c);
                    photoViewer3.f31225e0.setScaleX(1.0f);
                    photoViewer3.f31225e0.setScaleY(1.0f);
                    MediaController.getInstance().tryResumePausedAudio();
                    if (photoViewer3.f31381v7 && !photoViewer3.f31391w7 && (arrayList2 = photoViewer3.f31249g7) != null) {
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
