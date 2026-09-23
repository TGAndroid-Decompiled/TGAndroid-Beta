package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.camera.Size;
import org.telegram.ui.Components.AnimatedFileNative;
public final class cu0 implements Runnable {
    public final String f32413a;
    public final long f32414b;
    public final int f32415c;
    public final PhotoViewer d;

    public cu0(PhotoViewer photoViewer, String str, long j3, int i10) {
        this.d = photoViewer;
        this.f32413a = str;
        this.f32414b = j3;
        this.f32415c = i10;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        if (this.d.f31085x8 == this) {
            int videoBitrate = MediaController.getVideoBitrate(this.f32413a);
            int[] iArr = new int[11];
            AnimatedFileNative.d(this.f32413a, iArr, this.f32414b);
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
            photoViewer.f30968k8 = z11;
            PhotoViewer photoViewer2 = this.d;
            if (videoBitrate == -1) {
                videoBitrate = iArr[3];
            }
            photoViewer2.f30933g8 = videoBitrate;
            photoViewer2.f30942h8 = videoBitrate;
            if (this.d.f30968k8) {
                PhotoViewer photoViewer3 = this.d;
                int i10 = iArr[1];
                photoViewer3.f30898c8 = i10;
                photoViewer3.f30915e8 = i10;
                PhotoViewer photoViewer4 = this.d;
                int i11 = iArr[2];
                photoViewer4.f30907d8 = i11;
                photoViewer4.f30924f8 = i11;
                PhotoViewer photoViewer5 = this.d;
                int max = Math.max(photoViewer5.f30898c8, this.d.f30907d8);
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
                int i12 = this.f32415c;
                if (i12 == -1) {
                    i12 = photoViewer6.u2();
                }
                photoViewer6.Y7 = i12;
                PhotoViewer photoViewer7 = this.d;
                if (photoViewer7.f30933g8 != 0 && photoViewer7.f30892c2 != 1) {
                    Size p02 = photoViewer7.p0();
                    if (p02.getWidth() == photoViewer7.f30898c8 && p02.getHeight() == photoViewer7.f30907d8) {
                        MediaController.extractRealEncoderBitrate(p02.getWidth(), p02.getHeight(), photoViewer7.f30942h8, false);
                    } else {
                        MediaController.extractRealEncoderBitrate(p02.getWidth(), p02.getHeight(), MediaController.makeVideoBitrate(photoViewer7.f30907d8, photoViewer7.f30898c8, photoViewer7.f30942h8, p02.getHeight(), p02.getWidth()), false);
                    }
                }
                this.d.f30975l8 = MediaController.isH264Video(this.f32413a);
            }
            if (this.d.f31085x8 != this) {
                return;
            }
            AndroidUtilities.runOnUIThread(new kf0(this, this, iArr, 20));
        }
    }
}
