package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.camera.Size;
import org.telegram.ui.Components.AnimatedFileNative;
public final class eu0 implements Runnable {
    public final String f36091a;
    public final long f36092b;
    public final int f36093c;
    public final PhotoViewer d;

    public eu0(PhotoViewer photoViewer, String str, long j3, int i10) {
        this.d = photoViewer;
        this.f36091a = str;
        this.f36092b = j3;
        this.f36093c = i10;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        if (this.d.f34072x8 == this) {
            int videoBitrate = MediaController.getVideoBitrate(this.f36091a);
            int[] iArr = new int[11];
            AnimatedFileNative.d(this.f36091a, iArr, this.f36092b);
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
            photoViewer.f33955k8 = z11;
            PhotoViewer photoViewer2 = this.d;
            if (videoBitrate == -1) {
                videoBitrate = iArr[3];
            }
            photoViewer2.f33920g8 = videoBitrate;
            photoViewer2.f33929h8 = videoBitrate;
            if (this.d.f33955k8) {
                PhotoViewer photoViewer3 = this.d;
                int i10 = iArr[1];
                photoViewer3.f33884c8 = i10;
                photoViewer3.f33902e8 = i10;
                PhotoViewer photoViewer4 = this.d;
                int i11 = iArr[2];
                photoViewer4.f33893d8 = i11;
                photoViewer4.f33911f8 = i11;
                PhotoViewer photoViewer5 = this.d;
                int max = Math.max(photoViewer5.f33884c8, this.d.f33893d8);
                if (max > 1280) {
                    photoViewer5.Z7 = 4;
                } else if (max > 854) {
                    photoViewer5.Z7 = 3;
                } else if (max > 640) {
                    photoViewer5.Z7 = 2;
                } else {
                    photoViewer5.Z7 = 1;
                }
                PhotoViewer photoViewer6 = this.d;
                int i12 = this.f36093c;
                if (i12 == -1) {
                    i12 = photoViewer6.v2();
                }
                photoViewer6.Y7 = i12;
                PhotoViewer photoViewer7 = this.d;
                if (photoViewer7.f33920g8 != 0 && photoViewer7.f33878c2 != 1) {
                    Size p02 = photoViewer7.p0();
                    if (p02.getWidth() == photoViewer7.f33884c8 && p02.getHeight() == photoViewer7.f33893d8) {
                        MediaController.extractRealEncoderBitrate(p02.getWidth(), p02.getHeight(), photoViewer7.f33929h8, false);
                    } else {
                        MediaController.extractRealEncoderBitrate(p02.getWidth(), p02.getHeight(), MediaController.makeVideoBitrate(photoViewer7.f33893d8, photoViewer7.f33884c8, photoViewer7.f33929h8, p02.getHeight(), p02.getWidth()), false);
                    }
                }
                this.d.f33962l8 = MediaController.isH264Video(this.f36091a);
            }
            if (this.d.f34072x8 != this) {
                return;
            }
            AndroidUtilities.runOnUIThread(new nf0(this, this, iArr, 20));
        }
    }
}
