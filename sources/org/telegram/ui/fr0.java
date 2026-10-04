package org.telegram.ui;

import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.ClippingImageView;
public final class fr0 implements Runnable {
    public final int f36378a;
    public final PhotoViewer f36379b;
    public final yu0 f36380c;

    public fr0(PhotoViewer photoViewer, yu0 yu0Var, int i10) {
        this.f36378a = i10;
        this.f36379b = photoViewer;
        this.f36380c = yu0Var;
    }

    @Override
    public final void run() {
        ClippingImageView clippingImageView;
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.f36378a) {
            case 0:
                PhotoViewer photoViewer = this.f36379b;
                photoViewer.f33927h0.setImageBitmap(null);
                yu0 yu0Var = this.f36380c;
                if (yu0Var != null && !AndroidUtilities.isTablet() && (clippingImageView = yu0Var.f43637m) != null) {
                    clippingImageView.setImageBitmap(null);
                }
                try {
                    if (photoViewer.f33918g0.getParent() != null) {
                        ((WindowManager) photoViewer.f34079y.getSystemService("window")).removeView(photoViewer.f33918g0);
                        photoViewer.W1();
                        return;
                    }
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 1:
                PhotoViewer photoViewer2 = this.f36379b;
                photoViewer2.f34000p4 = null;
                int i10 = 0;
                photoViewer2.f33901e0.setLayerType(0, null);
                photoViewer2.f33982n4 = 0;
                photoViewer2.G1();
                photoViewer2.Y1(this.f36380c);
                MediaController.getInstance().tryResumePausedAudio();
                if (photoViewer2.f34057v7 && !photoViewer2.f34067w7 && (arrayList = photoViewer2.f33925g7) != null) {
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
                PhotoViewer photoViewer3 = this.f36379b;
                photoViewer3.f34000p4 = null;
                qu0 qu0Var = photoViewer3.f33901e0;
                if (qu0Var != null) {
                    int i11 = 0;
                    qu0Var.setLayerType(0, null);
                    photoViewer3.f33982n4 = 0;
                    photoViewer3.Y1(this.f36380c);
                    photoViewer3.f33901e0.setScaleX(1.0f);
                    photoViewer3.f33901e0.setScaleY(1.0f);
                    MediaController.getInstance().tryResumePausedAudio();
                    if (photoViewer3.f34057v7 && !photoViewer3.f34067w7 && (arrayList2 = photoViewer3.f33925g7) != null) {
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
