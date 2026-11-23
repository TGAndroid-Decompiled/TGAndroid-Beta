package org.telegram.ui;

import android.media.MediaExtractor;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.camera.Size;
import org.telegram.ui.Components.AnimatedFileNative;
public final class fq0 implements Runnable {
    public final String f47790a;
    public final long f47791b;
    public final int f47792c;
    public final PhotoViewer d;

    public fq0(PhotoViewer photoViewer, String str, long j3, int i7) {
        this.d = photoViewer;
        this.f47790a = str;
        this.f47791b = j3;
        this.f47792c = i7;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        if (this.d.f43384x8 == this) {
            int E = MediaController.E(this.f47790a);
            int[] iArr = new int[11];
            AnimatedFileNative.d(this.f47790a, iArr, this.f47791b);
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
            photoViewer.f43268k8 = z11;
            PhotoViewer photoViewer2 = this.d;
            if (E == -1) {
                E = iArr[3];
            }
            photoViewer2.f43235g8 = E;
            photoViewer2.f43243h8 = E;
            if (this.d.f43268k8) {
                PhotoViewer photoViewer3 = this.d;
                int i7 = iArr[1];
                photoViewer3.f43198c8 = i7;
                photoViewer3.f43216e8 = i7;
                PhotoViewer photoViewer4 = this.d;
                int i10 = iArr[2];
                photoViewer4.f43206d8 = i10;
                photoViewer4.f43226f8 = i10;
                PhotoViewer photoViewer5 = this.d;
                int max = Math.max(photoViewer5.f43198c8, this.d.f43206d8);
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
                int i11 = this.f47792c;
                if (i11 == -1) {
                    i11 = photoViewer6.t2();
                }
                photoViewer6.Y7 = i11;
                PhotoViewer photoViewer7 = this.d;
                if (photoViewer7.f43235g8 != 0 && photoViewer7.d2 != 1) {
                    Size i02 = photoViewer7.i0();
                    if (i02.getWidth() == photoViewer7.f43198c8 && i02.getHeight() == photoViewer7.f43206d8) {
                        MediaController.v(i02.getWidth(), i02.getHeight(), photoViewer7.f43243h8, false);
                    } else {
                        MediaController.v(i02.getWidth(), i02.getHeight(), MediaController.Q(photoViewer7.f43206d8, photoViewer7.f43198c8, photoViewer7.f43243h8, i02.getHeight(), i02.getWidth()), false);
                    }
                }
                PhotoViewer photoViewer8 = this.d;
                String str = this.f47790a;
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
                    photoViewer8.f43276l8 = z12;
                } finally {
                    mediaExtractor.release();
                }
            }
            if (this.d.f43384x8 != this) {
                return;
            }
            org.telegram.messenger.g0.g3(new mc0(this, this, iArr, 22));
        }
    }
}
