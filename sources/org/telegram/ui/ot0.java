package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.camera.Size;
import org.telegram.ui.Components.AnimatedFileNative;
public final class ot0 implements Runnable {
    public final String f36978a;
    public final long f36979b;
    public final int f36980c;
    public final PhotoViewer d;

    public ot0(PhotoViewer photoViewer, String str, long j10, int i10) {
        this.d = photoViewer;
        this.f36978a = str;
        this.f36979b = j10;
        this.f36980c = i10;
    }

    @Override
    public final void run() {
        boolean z4;
        boolean z10;
        if (this.d.f31874t8 == this) {
            int videoBitrate = MediaController.getVideoBitrate(this.f36978a);
            int[] iArr = new int[11];
            AnimatedFileNative.d(this.f36978a, iArr, this.f36979b);
            if (iArr[10] != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            PhotoViewer photoViewer = this.d;
            if (iArr[0] != 0 && (!z4 || iArr[9] != 0)) {
                z10 = true;
            } else {
                z10 = false;
            }
            photoViewer.f31758g8 = z10;
            PhotoViewer photoViewer2 = this.d;
            if (videoBitrate == -1) {
                videoBitrate = iArr[3];
            }
            photoViewer2.f31722c8 = videoBitrate;
            photoViewer2.f31731d8 = videoBitrate;
            if (this.d.f31758g8) {
                PhotoViewer photoViewer3 = this.d;
                int i10 = iArr[1];
                photoViewer3.Y7 = i10;
                photoViewer3.f31703a8 = i10;
                PhotoViewer photoViewer4 = this.d;
                int i11 = iArr[2];
                photoViewer4.Z7 = i11;
                photoViewer4.f31713b8 = i11;
                PhotoViewer photoViewer5 = this.d;
                int max = Math.max(photoViewer5.Y7, this.d.Z7);
                if (max > 1280) {
                    photoViewer5.V7 = 4;
                } else if (max > 854) {
                    photoViewer5.V7 = 3;
                } else if (max > 640) {
                    photoViewer5.V7 = 2;
                } else {
                    photoViewer5.V7 = 1;
                }
                PhotoViewer photoViewer6 = this.d;
                int i12 = this.f36980c;
                if (i12 == -1) {
                    i12 = photoViewer6.v2();
                }
                photoViewer6.U7 = i12;
                PhotoViewer photoViewer7 = this.d;
                if (photoViewer7.f31722c8 != 0 && photoViewer7.Z1 != 1) {
                    Size p02 = photoViewer7.p0();
                    if (p02.getWidth() == photoViewer7.Y7 && p02.getHeight() == photoViewer7.Z7) {
                        MediaController.extractRealEncoderBitrate(p02.getWidth(), p02.getHeight(), photoViewer7.f31731d8, false);
                    } else {
                        MediaController.extractRealEncoderBitrate(p02.getWidth(), p02.getHeight(), MediaController.makeVideoBitrate(photoViewer7.Z7, photoViewer7.Y7, photoViewer7.f31731d8, p02.getHeight(), p02.getWidth()), false);
                    }
                }
                this.d.f31767h8 = MediaController.isH264Video(this.f36978a);
            }
            if (this.d.f31874t8 != this) {
                return;
            }
            AndroidUtilities.runOnUIThread(new hf0(this, this, iArr, 20));
        }
    }
}
