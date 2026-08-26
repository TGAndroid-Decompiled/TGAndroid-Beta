package org.telegram.ui;

import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.SharedMediaLayout;

public final class PhotoViewer$$ExternalSyntheticLambda10 implements Runnable {
    public final int $r8$classId;
    public final PhotoViewer f$0;
    public final PhotoViewer.PlaceProviderObject f$1;

    public PhotoViewer$$ExternalSyntheticLambda10(PhotoViewer photoViewer, PhotoViewer.PlaceProviderObject placeProviderObject, int i) {
        this.$r8$classId = i;
        this.f$0 = photoViewer;
        this.f$1 = placeProviderObject;
    }

    @Override
    public final void run() {
        ArrayList arrayList;
        SharedMediaLayout.AnonymousClass26 anonymousClass26;
        ArrayList arrayList2;
        switch (this.$r8$classId) {
            case 0:
                PhotoViewer photoViewer = this.f$0;
                photoViewer.animationEndRunnable = null;
                int i = 0;
                photoViewer.containerView.setLayerType(0, null);
                photoViewer.animationInProgress = 0;
                photoViewer.invalidateBlur$1();
                photoViewer.onPhotoClosed(this.f$1);
                MediaController.getInstance().tryResumePausedAudio();
                if (photoViewer.stickerEmpty && !photoViewer.stickerEmptySent && (arrayList = photoViewer.imagesArrLocals) != null) {
                    int size = arrayList.size();
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        if (obj instanceof MediaController.PhotoEntry) {
                            ((MediaController.PhotoEntry) obj).deleteAll();
                        }
                    }
                    break;
                }
                break;
            case 1:
                PhotoViewer photoViewer2 = this.f$0;
                photoViewer2.animatingImageView.setImageBitmap(null);
                PhotoViewer.PlaceProviderObject placeProviderObject = this.f$1;
                if (placeProviderObject != null && !AndroidUtilities.isTablet() && (anonymousClass26 = placeProviderObject.animatingImageView) != null) {
                    anonymousClass26.setImageBitmap(null);
                }
                try {
                    if (photoViewer2.windowView.getParent() != null) {
                        ((WindowManager) photoViewer2.parentActivity.getSystemService("window")).removeView(photoViewer2.windowView);
                        photoViewer2.onHideView();
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
                break;
            default:
                PhotoViewer photoViewer3 = this.f$0;
                photoViewer3.animationEndRunnable = null;
                PhotoViewer.FrameLayoutDrawer frameLayoutDrawer = photoViewer3.containerView;
                if (frameLayoutDrawer != null) {
                    int i2 = 0;
                    frameLayoutDrawer.setLayerType(0, null);
                    photoViewer3.animationInProgress = 0;
                    photoViewer3.onPhotoClosed(this.f$1);
                    photoViewer3.containerView.setScaleX(1.0f);
                    photoViewer3.containerView.setScaleY(1.0f);
                    MediaController.getInstance().tryResumePausedAudio();
                    if (photoViewer3.stickerEmpty && !photoViewer3.stickerEmptySent && (arrayList2 = photoViewer3.imagesArrLocals) != null) {
                        int size2 = arrayList2.size();
                        while (i2 < size2) {
                            Object obj2 = arrayList2.get(i2);
                            i2++;
                            if (obj2 instanceof MediaController.PhotoEntry) {
                                ((MediaController.PhotoEntry) obj2).deleteAll();
                            }
                        }
                        break;
                    }
                }
                break;
        }
    }
}
