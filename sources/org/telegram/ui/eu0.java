package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.camera.Size;
import org.telegram.ui.Components.AnimatedFileNative;
public final class eu0 implements Runnable {
    public final String f36090a;
    public final long f36091b;
    public final int f36092c;
    public final PhotoViewer d;

    public eu0(PhotoViewer photoViewer, String str, long j3, int i10) {
        this.d = photoViewer;
        this.f36090a = str;
        this.f36091b = j3;
        this.f36092c = i10;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        if (this.d.f34071x8 == this) {
            int videoBitrate = MediaController.getVideoBitrate(this.f36090a);
            int[] iArr = new int[11];
            AnimatedFileNative.d(this.f36090a, iArr, this.f36091b);
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
            photoViewer.f33954k8 = z11;
            PhotoViewer photoViewer2 = this.d;
            if (videoBitrate == -1) {
                videoBitrate = iArr[3];
            }
            photoViewer2.f33919g8 = videoBitrate;
            photoViewer2.f33928h8 = videoBitrate;
            if (this.d.f33954k8) {
                PhotoViewer photoViewer3 = this.d;
                int i10 = iArr[1];
                photoViewer3.f33883c8 = i10;
                photoViewer3.f33901e8 = i10;
                PhotoViewer photoViewer4 = this.d;
                int i11 = iArr[2];
                photoViewer4.f33892d8 = i11;
                photoViewer4.f33910f8 = i11;
                PhotoViewer photoViewer5 = this.d;
                int max = Math.max(photoViewer5.f33883c8, this.d.f33892d8);
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
                int i12 = this.f36092c;
                if (i12 == -1) {
                    i12 = photoViewer6.v2();
                }
                photoViewer6.Y7 = i12;
                PhotoViewer photoViewer7 = this.d;
                if (photoViewer7.f33919g8 != 0 && photoViewer7.f33877c2 != 1) {
                    Size p02 = photoViewer7.p0();
                    if (p02.getWidth() == photoViewer7.f33883c8 && p02.getHeight() == photoViewer7.f33892d8) {
                        MediaController.extractRealEncoderBitrate(p02.getWidth(), p02.getHeight(), photoViewer7.f33928h8, false);
                    } else {
                        MediaController.extractRealEncoderBitrate(p02.getWidth(), p02.getHeight(), MediaController.makeVideoBitrate(photoViewer7.f33892d8, photoViewer7.f33883c8, photoViewer7.f33928h8, p02.getHeight(), p02.getWidth()), false);
                    }
                }
                this.d.f33961l8 = MediaController.isH264Video(this.f36090a);
            }
            if (this.d.f34071x8 != this) {
                return;
            }
            AndroidUtilities.runOnUIThread(new nf0(this, this, iArr, 20));
        }
    }
}
