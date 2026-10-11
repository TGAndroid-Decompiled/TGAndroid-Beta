package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.camera.Size;
import org.telegram.ui.Components.AnimatedFileNative;
public final class ju0 implements Runnable {
    public final String f39158a;
    public final long f39159b;
    public final int f39160c;
    public final PhotoViewer d;

    public ju0(PhotoViewer photoViewer, String str, long j3, int i10) {
        this.d = photoViewer;
        this.f39158a = str;
        this.f39159b = j3;
        this.f39160c = i10;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        if (this.d.f34143x8 == this) {
            int videoBitrate = MediaController.getVideoBitrate(this.f39158a);
            int[] iArr = new int[11];
            AnimatedFileNative.d(this.f39158a, iArr, this.f39159b);
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
            photoViewer.f34026k8 = z11;
            PhotoViewer photoViewer2 = this.d;
            if (videoBitrate == -1) {
                videoBitrate = iArr[3];
            }
            photoViewer2.f33991g8 = videoBitrate;
            photoViewer2.f34000h8 = videoBitrate;
            if (this.d.f34026k8) {
                PhotoViewer photoViewer3 = this.d;
                int i10 = iArr[1];
                photoViewer3.f33955c8 = i10;
                photoViewer3.f33973e8 = i10;
                PhotoViewer photoViewer4 = this.d;
                int i11 = iArr[2];
                photoViewer4.f33964d8 = i11;
                photoViewer4.f33982f8 = i11;
                PhotoViewer photoViewer5 = this.d;
                int max = Math.max(photoViewer5.f33955c8, this.d.f33964d8);
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
                int i12 = this.f39160c;
                if (i12 == -1) {
                    i12 = photoViewer6.v2();
                }
                photoViewer6.Y7 = i12;
                PhotoViewer photoViewer7 = this.d;
                if (photoViewer7.f33991g8 != 0 && photoViewer7.f33949c2 != 1) {
                    Size p02 = photoViewer7.p0();
                    if (p02.getWidth() == photoViewer7.f33955c8 && p02.getHeight() == photoViewer7.f33964d8) {
                        MediaController.extractRealEncoderBitrate(p02.getWidth(), p02.getHeight(), photoViewer7.f34000h8, false);
                    } else {
                        MediaController.extractRealEncoderBitrate(p02.getWidth(), p02.getHeight(), MediaController.makeVideoBitrate(photoViewer7.f33964d8, photoViewer7.f33955c8, photoViewer7.f34000h8, p02.getHeight(), p02.getWidth()), false);
                    }
                }
                this.d.f34033l8 = MediaController.isH264Video(this.f39158a);
            }
            if (this.d.f34143x8 != this) {
                return;
            }
            AndroidUtilities.runOnUIThread(new nf0(this, this, iArr, 20));
        }
    }
}
