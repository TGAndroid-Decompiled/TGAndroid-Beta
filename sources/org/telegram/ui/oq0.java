package org.telegram.ui;

import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.ClippingImageView;
public final class oq0 implements Runnable {
    public final int f36957a;
    public final PhotoViewer f36958b;
    public final ju0 f36959c;

    public oq0(PhotoViewer photoViewer, ju0 ju0Var, int i10) {
        this.f36957a = i10;
        this.f36958b = photoViewer;
        this.f36959c = ju0Var;
    }

    @Override
    public final void run() {
        ClippingImageView clippingImageView;
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.f36957a) {
            case 0:
                PhotoViewer photoViewer = this.f36958b;
                photoViewer.f31732e0.setImageBitmap(null);
                ju0 ju0Var = this.f36959c;
                if (ju0Var != null && !AndroidUtilities.isTablet() && (clippingImageView = ju0Var.f35504m) != null) {
                    clippingImageView.setImageBitmap(null);
                }
                try {
                    if (photoViewer.f31723d0.getParent() != null) {
                        ((WindowManager) photoViewer.f31913y.getSystemService("window")).removeView(photoViewer.f31723d0);
                        photoViewer.V1();
                        return;
                    }
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                PhotoViewer photoViewer2 = this.f36958b;
                photoViewer2.f31806m4 = null;
                int i10 = 0;
                photoViewer2.f31705b0.setLayerType(0, null);
                photoViewer2.f31790k4 = 0;
                photoViewer2.F1();
                photoViewer2.X1(this.f36959c);
                MediaController.getInstance().tryResumePausedAudio();
                if (photoViewer2.f31865s7 && !photoViewer2.f31873t7 && (arrayList = photoViewer2.f31730d7) != null) {
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
                PhotoViewer photoViewer3 = this.f36958b;
                photoViewer3.f31806m4 = null;
                bu0 bu0Var = photoViewer3.f31705b0;
                if (bu0Var != null) {
                    int i11 = 0;
                    bu0Var.setLayerType(0, null);
                    photoViewer3.f31790k4 = 0;
                    photoViewer3.X1(this.f36959c);
                    photoViewer3.f31705b0.setScaleX(1.0f);
                    photoViewer3.f31705b0.setScaleY(1.0f);
                    MediaController.getInstance().tryResumePausedAudio();
                    if (photoViewer3.f31865s7 && !photoViewer3.f31873t7 && (arrayList2 = photoViewer3.f31730d7) != null) {
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
