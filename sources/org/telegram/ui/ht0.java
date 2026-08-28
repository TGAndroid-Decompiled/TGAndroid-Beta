package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.camera.Size;
import org.telegram.ui.Components.AnimatedFileNative;
public final class ht0 implements Runnable {
    public final String f38937a;
    public final long f38938b;
    public final int f38939c;
    public final PhotoViewer d;

    public ht0(PhotoViewer photoViewer, String str, long j10, int i9) {
        this.d = photoViewer;
        this.f38937a = str;
        this.f38938b = j10;
        this.f38939c = i9;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        if (this.d.f35751s8 == this) {
            int videoBitrate = MediaController.getVideoBitrate(this.f38937a);
            int[] iArr = new int[11];
            AnimatedFileNative.d(this.f38937a, iArr, this.f38938b);
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
            photoViewer.f35635f8 = z11;
            PhotoViewer photoViewer2 = this.d;
            if (videoBitrate == -1) {
                videoBitrate = iArr[3];
            }
            photoViewer2.f35596b8 = videoBitrate;
            photoViewer2.f35606c8 = videoBitrate;
            if (this.d.f35635f8) {
                PhotoViewer photoViewer3 = this.d;
                int i9 = iArr[1];
                photoViewer3.X7 = i9;
                photoViewer3.Z7 = i9;
                PhotoViewer photoViewer4 = this.d;
                int i10 = iArr[2];
                photoViewer4.Y7 = i10;
                photoViewer4.f35586a8 = i10;
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
                int i11 = this.f38939c;
                if (i11 == -1) {
                    i11 = photoViewer6.v2();
                }
                photoViewer6.T7 = i11;
                PhotoViewer photoViewer7 = this.d;
                if (photoViewer7.f35596b8 != 0 && photoViewer7.Y1 != 1) {
                    Size o02 = photoViewer7.o0();
                    if (o02.getWidth() == photoViewer7.X7 && o02.getHeight() == photoViewer7.Y7) {
                        MediaController.extractRealEncoderBitrate(o02.getWidth(), o02.getHeight(), photoViewer7.f35606c8, false);
                    } else {
                        MediaController.extractRealEncoderBitrate(o02.getWidth(), o02.getHeight(), MediaController.makeVideoBitrate(photoViewer7.Y7, photoViewer7.X7, photoViewer7.f35606c8, o02.getHeight(), o02.getWidth()), false);
                    }
                }
                this.d.f35644g8 = MediaController.isH264Video(this.f38937a);
            }
            if (this.d.f35751s8 != this) {
                return;
            }
            AndroidUtilities.runOnUIThread(new ye0(this, this, iArr, 20));
        }
    }
}
