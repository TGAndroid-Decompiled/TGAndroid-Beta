package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.camera.Size;
import org.telegram.ui.Components.AnimatedFileNative;
public final class pt0 implements Runnable {
    public final String f40298a;
    public final long f40299b;
    public final int f40300c;
    public final PhotoViewer d;

    public pt0(PhotoViewer photoViewer, String str, long j10, int i10) {
        this.d = photoViewer;
        this.f40298a = str;
        this.f40299b = j10;
        this.f40300c = i10;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        if (this.d.f33460x8 == this) {
            int videoBitrate = MediaController.getVideoBitrate(this.f40298a);
            int[] iArr = new int[11];
            AnimatedFileNative.d(this.f40298a, iArr, this.f40299b);
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
            photoViewer.f33343k8 = z11;
            PhotoViewer photoViewer2 = this.d;
            if (videoBitrate == -1) {
                videoBitrate = iArr[3];
            }
            photoViewer2.f33307g8 = videoBitrate;
            photoViewer2.f33316h8 = videoBitrate;
            if (this.d.f33343k8) {
                PhotoViewer photoViewer3 = this.d;
                int i10 = iArr[1];
                photoViewer3.f33272c8 = i10;
                photoViewer3.f33289e8 = i10;
                PhotoViewer photoViewer4 = this.d;
                int i11 = iArr[2];
                photoViewer4.f33281d8 = i11;
                photoViewer4.f33298f8 = i11;
                PhotoViewer photoViewer5 = this.d;
                int max = Math.max(photoViewer5.f33272c8, this.d.f33281d8);
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
                int i12 = this.f40300c;
                if (i12 == -1) {
                    i12 = photoViewer6.x2();
                }
                photoViewer6.Y7 = i12;
                PhotoViewer photoViewer7 = this.d;
                if (photoViewer7.f33307g8 != 0 && photoViewer7.f33266c2 != 1) {
                    Size q02 = photoViewer7.q0();
                    if (q02.getWidth() == photoViewer7.f33272c8 && q02.getHeight() == photoViewer7.f33281d8) {
                        MediaController.extractRealEncoderBitrate(q02.getWidth(), q02.getHeight(), photoViewer7.f33316h8, false);
                    } else {
                        MediaController.extractRealEncoderBitrate(q02.getWidth(), q02.getHeight(), MediaController.makeVideoBitrate(photoViewer7.f33281d8, photoViewer7.f33272c8, photoViewer7.f33316h8, q02.getHeight(), q02.getWidth()), false);
                    }
                }
                this.d.f33350l8 = MediaController.isH264Video(this.f40298a);
            }
            if (this.d.f33460x8 != this) {
                return;
            }
            AndroidUtilities.runOnUIThread(new ve0(this, this, iArr, 21));
        }
    }
}
