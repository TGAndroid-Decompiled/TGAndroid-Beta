package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.camera.Size;
import org.telegram.ui.Components.AnimatedFileNative;
public final class ft0 implements Runnable {
    public final String f38233a;
    public final long f38234b;
    public final int f38235c;
    public final PhotoViewer d;

    public ft0(PhotoViewer photoViewer, String str, long j10, int i10) {
        this.d = photoViewer;
        this.f38233a = str;
        this.f38234b = j10;
        this.f38235c = i10;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        if (this.d.f35817s8 == this) {
            int videoBitrate = MediaController.getVideoBitrate(this.f38233a);
            int[] iArr = new int[11];
            AnimatedFileNative.d(this.f38233a, iArr, this.f38234b);
            if (iArr[10] != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            PhotoViewer photoViewer = this.d;
            if (iArr[0] != 0 && (!z10 || iArr[9] != 0)) {
                z11 = true;
            } else {
                z11 = false;
            }
            photoViewer.f35701f8 = z11;
            PhotoViewer photoViewer2 = this.d;
            if (videoBitrate == -1) {
                videoBitrate = iArr[3];
            }
            photoViewer2.f35664b8 = videoBitrate;
            photoViewer2.f35672c8 = videoBitrate;
            if (this.d.f35701f8) {
                PhotoViewer photoViewer3 = this.d;
                int i10 = iArr[1];
                photoViewer3.X7 = i10;
                photoViewer3.Z7 = i10;
                PhotoViewer photoViewer4 = this.d;
                int i11 = iArr[2];
                photoViewer4.Y7 = i11;
                photoViewer4.f35654a8 = i11;
                PhotoViewer photoViewer5 = this.d;
                int max = Math.max(photoViewer5.X7, this.d.Y7);
                if (max > 1280) {
                    photoViewer5.U7 = 4;
                } else if (max > 854) {
                    photoViewer5.U7 = 3;
                } else if (max > 640) {
                    photoViewer5.U7 = 2;
                } else {
                    photoViewer5.U7 = 1;
                }
                PhotoViewer photoViewer6 = this.d;
                int i12 = this.f38235c;
                if (i12 == -1) {
                    i12 = photoViewer6.v2();
                }
                photoViewer6.T7 = i12;
                PhotoViewer photoViewer7 = this.d;
                if (photoViewer7.f35664b8 != 0 && photoViewer7.Y1 != 1) {
                    Size p02 = photoViewer7.p0();
                    if (p02.getWidth() == photoViewer7.X7 && p02.getHeight() == photoViewer7.Y7) {
                        MediaController.extractRealEncoderBitrate(p02.getWidth(), p02.getHeight(), photoViewer7.f35672c8, false);
                    } else {
                        MediaController.extractRealEncoderBitrate(p02.getWidth(), p02.getHeight(), MediaController.makeVideoBitrate(photoViewer7.Y7, photoViewer7.X7, photoViewer7.f35672c8, p02.getHeight(), p02.getWidth()), false);
                    }
                }
                this.d.f35710g8 = MediaController.isH264Video(this.f38233a);
            }
            if (this.d.f35817s8 != this) {
                return;
            }
            AndroidUtilities.runOnUIThread(new xe0(this, this, iArr, 20));
        }
    }
}
