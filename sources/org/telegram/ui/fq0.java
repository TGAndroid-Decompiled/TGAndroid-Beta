package org.telegram.ui;

import android.media.MediaExtractor;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.camera.Size;
import org.telegram.ui.Components.AnimatedFileNative;
public final class fq0 implements Runnable {
    public final String f45778a;
    public final long f45779b;
    public final int f45780c;
    public final PhotoViewer d;

    public fq0(PhotoViewer photoViewer, String str, long j3, int i7) {
        this.d = photoViewer;
        this.f45778a = str;
        this.f45779b = j3;
        this.f45780c = i7;
    }

    @Override
    public final void run() {
        boolean z9;
        boolean z10;
        if (this.d.f41557w8 == this) {
            int E = MediaController.E(this.f45778a);
            int[] iArr = new int[11];
            AnimatedFileNative.d(this.f45778a, iArr, this.f45779b);
            boolean z11 = false;
            if (iArr[10] != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            PhotoViewer photoViewer = this.d;
            if (iArr[0] != 0 && (!z9 || iArr[9] != 0)) {
                z10 = true;
            } else {
                z10 = false;
            }
            photoViewer.f41442j8 = z10;
            PhotoViewer photoViewer2 = this.d;
            if (E == -1) {
                E = iArr[3];
            }
            photoViewer2.f41409f8 = E;
            photoViewer2.f41418g8 = E;
            if (this.d.f41442j8) {
                PhotoViewer photoViewer3 = this.d;
                int i7 = iArr[1];
                photoViewer3.f41371b8 = i7;
                photoViewer3.f41389d8 = i7;
                PhotoViewer photoViewer4 = this.d;
                int i10 = iArr[2];
                photoViewer4.f41381c8 = i10;
                photoViewer4.f41399e8 = i10;
                PhotoViewer photoViewer5 = this.d;
                int max = Math.max(photoViewer5.f41371b8, this.d.f41381c8);
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
                int i11 = this.f45780c;
                if (i11 == -1) {
                    i11 = photoViewer6.s2();
                }
                photoViewer6.X7 = i11;
                PhotoViewer photoViewer7 = this.d;
                if (photoViewer7.f41409f8 != 0 && photoViewer7.f41375c2 != 1) {
                    Size i02 = photoViewer7.i0();
                    if (i02.getWidth() == photoViewer7.f41371b8 && i02.getHeight() == photoViewer7.f41381c8) {
                        MediaController.v(i02.getWidth(), i02.getHeight(), photoViewer7.f41418g8, false);
                    } else {
                        MediaController.v(i02.getWidth(), i02.getHeight(), MediaController.Q(photoViewer7.f41381c8, photoViewer7.f41371b8, photoViewer7.f41418g8, i02.getHeight(), i02.getWidth()), false);
                    }
                }
                PhotoViewer photoViewer8 = this.d;
                String str = this.f45778a;
                MediaExtractor mediaExtractor = new MediaExtractor();
                try {
                    try {
                        mediaExtractor.setDataSource(str);
                        int w10 = MediaController.w(mediaExtractor, false);
                        if (w10 >= 0) {
                            if (mediaExtractor.getTrackFormat(w10).getString("mime").equals("video/avc")) {
                                z11 = true;
                            }
                        }
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                    photoViewer8.f41451k8 = z11;
                } finally {
                    mediaExtractor.release();
                }
            }
            if (this.d.f41557w8 != this) {
                return;
            }
            org.telegram.messenger.g0.h3(new oc0(this, this, iArr, 22));
        }
    }
}
