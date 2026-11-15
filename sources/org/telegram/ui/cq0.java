package org.telegram.ui;

import android.media.MediaExtractor;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.camera.Size;
import org.telegram.ui.Components.AnimatedFileNative;
public final class cq0 implements Runnable {
    public final String f46232a;
    public final long f46233b;
    public final int f46234c;
    public final PhotoViewer d;

    public cq0(PhotoViewer photoViewer, String str, long j3, int i7) {
        this.d = photoViewer;
        this.f46232a = str;
        this.f46233b = j3;
        this.f46234c = i7;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        if (this.d.f42929x8 == this) {
            int E = MediaController.E(this.f46232a);
            int[] iArr = new int[11];
            AnimatedFileNative.d(this.f46232a, iArr, this.f46233b);
            boolean z12 = false;
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
            photoViewer.f42813k8 = z11;
            PhotoViewer photoViewer2 = this.d;
            if (E == -1) {
                E = iArr[3];
            }
            photoViewer2.f42780g8 = E;
            photoViewer2.f42788h8 = E;
            if (this.d.f42813k8) {
                PhotoViewer photoViewer3 = this.d;
                int i7 = iArr[1];
                photoViewer3.f42743c8 = i7;
                photoViewer3.f42761e8 = i7;
                PhotoViewer photoViewer4 = this.d;
                int i10 = iArr[2];
                photoViewer4.f42751d8 = i10;
                photoViewer4.f42771f8 = i10;
                PhotoViewer photoViewer5 = this.d;
                int max = Math.max(photoViewer5.f42743c8, this.d.f42751d8);
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
                int i11 = this.f46234c;
                if (i11 == -1) {
                    i11 = photoViewer6.t2();
                }
                photoViewer6.Y7 = i11;
                PhotoViewer photoViewer7 = this.d;
                if (photoViewer7.f42780g8 != 0 && photoViewer7.d2 != 1) {
                    Size i02 = photoViewer7.i0();
                    if (i02.getWidth() == photoViewer7.f42743c8 && i02.getHeight() == photoViewer7.f42751d8) {
                        MediaController.v(i02.getWidth(), i02.getHeight(), photoViewer7.f42788h8, false);
                    } else {
                        MediaController.v(i02.getWidth(), i02.getHeight(), MediaController.Q(photoViewer7.f42751d8, photoViewer7.f42743c8, photoViewer7.f42788h8, i02.getHeight(), i02.getWidth()), false);
                    }
                }
                PhotoViewer photoViewer8 = this.d;
                String str = this.f46232a;
                MediaExtractor mediaExtractor = new MediaExtractor();
                try {
                    try {
                        mediaExtractor.setDataSource(str);
                        int w10 = MediaController.w(mediaExtractor, false);
                        if (w10 >= 0) {
                            if (mediaExtractor.getTrackFormat(w10).getString("mime").equals("video/avc")) {
                                z12 = true;
                            }
                        }
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                    photoViewer8.f42821l8 = z12;
                } finally {
                    mediaExtractor.release();
                }
            }
            if (this.d.f42929x8 != this) {
                return;
            }
            org.telegram.messenger.g0.h3(new lc0(this, this, iArr, 22));
        }
    }
}
