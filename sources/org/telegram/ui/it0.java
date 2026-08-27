package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.camera.Size;
import org.telegram.ui.Components.AnimatedFileNative;

public final class it0 implements Runnable {

    public final String f39159a;

    public final long f39160b;

    public final int f39161c;
    public final PhotoViewer d;

    public it0(PhotoViewer photoViewer, String str, long j10, int i10) {
        this.d = photoViewer;
        this.f39159a = str;
        this.f39160b = j10;
        this.f39161c = i10;
    }

    @Override
    public final void run() {
        if (this.d.f35754s8 != this) {
            return;
        }
        int videoBitrate = MediaController.getVideoBitrate(this.f39159a);
        int[] iArr = new int[11];
        AnimatedFileNative.d(this.f39159a, iArr, this.f39160b);
        boolean z10 = iArr[10] != 0;
        this.d.f35638f8 = (iArr[0] == 0 || (z10 && iArr[9] == 0)) ? false : true;
        PhotoViewer photoViewer = this.d;
        if (videoBitrate == -1) {
            videoBitrate = iArr[3];
        }
        photoViewer.f35599b8 = videoBitrate;
        photoViewer.f35609c8 = videoBitrate;
        if (this.d.f35638f8) {
            PhotoViewer photoViewer2 = this.d;
            int i10 = iArr[1];
            photoViewer2.X7 = i10;
            photoViewer2.Z7 = i10;
            PhotoViewer photoViewer3 = this.d;
            int i11 = iArr[2];
            photoViewer3.Y7 = i11;
            photoViewer3.f35589a8 = i11;
            PhotoViewer photoViewer4 = this.d;
            int iMax = Math.max(photoViewer4.X7, this.d.Y7);
            if (iMax > 1280) {
                photoViewer4.U7 = 4;
            } else if (iMax > 854) {
                photoViewer4.U7 = 3;
            } else if (iMax > 640) {
                photoViewer4.U7 = 2;
            } else {
                photoViewer4.U7 = 1;
            }
            PhotoViewer photoViewer5 = this.d;
            int iV2 = this.f39161c;
            if (iV2 == -1) {
                iV2 = photoViewer5.v2();
            }
            photoViewer5.T7 = iV2;
            PhotoViewer photoViewer6 = this.d;
            if (photoViewer6.f35599b8 != 0 && photoViewer6.Y1 != 1) {
                Size sizeP0 = photoViewer6.p0();
                if (sizeP0.getWidth() == photoViewer6.X7 && sizeP0.getHeight() == photoViewer6.Y7) {
                    MediaController.extractRealEncoderBitrate(sizeP0.getWidth(), sizeP0.getHeight(), photoViewer6.f35609c8, false);
                } else {
                    MediaController.extractRealEncoderBitrate(sizeP0.getWidth(), sizeP0.getHeight(), MediaController.makeVideoBitrate(photoViewer6.Y7, photoViewer6.X7, photoViewer6.f35609c8, sizeP0.getHeight(), sizeP0.getWidth()), false);
                }
            }
            this.d.f35647g8 = MediaController.isH264Video(this.f39159a);
        }
        if (this.d.f35754s8 != this) {
            return;
        }
        AndroidUtilities.runOnUIThread(new bf0(this, this, iArr, 20));
    }
}
