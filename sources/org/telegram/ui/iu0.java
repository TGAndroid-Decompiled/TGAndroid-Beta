package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.camera.Size;
import org.telegram.ui.Components.AnimatedFileNative;
public final class iu0 implements Runnable {
    public final String f37440a;
    public final long f37441b;
    public final int f37442c;
    public final PhotoViewer d;

    public iu0(PhotoViewer photoViewer, String str, long j3, int i10) {
        this.d = photoViewer;
        this.f37440a = str;
        this.f37441b = j3;
        this.f37442c = i10;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        if (this.d.f33717w8 == this) {
            int videoBitrate = MediaController.getVideoBitrate(this.f37440a);
            int[] iArr = new int[11];
            AnimatedFileNative.d(this.f37440a, iArr, this.f37441b);
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
            photoViewer.f33601j8 = z11;
            PhotoViewer photoViewer2 = this.d;
            if (videoBitrate == -1) {
                videoBitrate = iArr[3];
            }
            photoViewer2.f33566f8 = videoBitrate;
            photoViewer2.f33575g8 = videoBitrate;
            if (this.d.f33601j8) {
                PhotoViewer photoViewer3 = this.d;
                int i10 = iArr[1];
                photoViewer3.f33529b8 = i10;
                photoViewer3.f33548d8 = i10;
                PhotoViewer photoViewer4 = this.d;
                int i11 = iArr[2];
                photoViewer4.f33539c8 = i11;
                photoViewer4.f33557e8 = i11;
                PhotoViewer photoViewer5 = this.d;
                int max = Math.max(photoViewer5.f33529b8, this.d.f33539c8);
                if (max > 1280) {
                    photoViewer5.Y7 = 4;
                } else if (max > 854) {
                    photoViewer5.Y7 = 3;
                } else if (max > 640) {
                    photoViewer5.Y7 = 2;
                } else {
                    photoViewer5.Y7 = 1;
                }
                PhotoViewer photoViewer6 = this.d;
                int i12 = this.f37442c;
                if (i12 == -1) {
                    i12 = photoViewer6.v2();
                }
                photoViewer6.X7 = i12;
                PhotoViewer photoViewer7 = this.d;
                if (photoViewer7.f33566f8 != 0 && photoViewer7.f33533c2 != 1) {
                    Size p02 = photoViewer7.p0();
                    if (p02.getWidth() == photoViewer7.f33529b8 && p02.getHeight() == photoViewer7.f33539c8) {
                        MediaController.extractRealEncoderBitrate(p02.getWidth(), p02.getHeight(), photoViewer7.f33575g8, false);
                    } else {
                        MediaController.extractRealEncoderBitrate(p02.getWidth(), p02.getHeight(), MediaController.makeVideoBitrate(photoViewer7.f33539c8, photoViewer7.f33529b8, photoViewer7.f33575g8, p02.getHeight(), p02.getWidth()), false);
                    }
                }
                this.d.f33610k8 = MediaController.isH264Video(this.f37440a);
            }
            if (this.d.f33717w8 != this) {
                return;
            }
            AndroidUtilities.runOnUIThread(new pf0(this, this, iArr, 20));
        }
    }
}
