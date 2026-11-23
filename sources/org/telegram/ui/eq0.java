package org.telegram.ui;

import android.media.MediaExtractor;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.camera.Size;
import org.telegram.ui.Components.AnimatedFileNative;
public final class eq0 implements Runnable {
    public final String f47603a;
    public final long f47604b;
    public final int f47605c;
    public final PhotoViewer d;

    public eq0(PhotoViewer photoViewer, String str, long j3, int i7) {
        this.d = photoViewer;
        this.f47603a = str;
        this.f47604b = j3;
        this.f47605c = i7;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        if (this.d.D8 == this) {
            int E = MediaController.E(this.f47603a);
            int[] iArr = new int[11];
            AnimatedFileNative.d(this.f47603a, iArr, this.f47604b);
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
            photoViewer.f43435q8 = z11;
            PhotoViewer photoViewer2 = this.d;
            if (E == -1) {
                E = iArr[3];
            }
            photoViewer2.f43400m8 = E;
            photoViewer2.f43409n8 = E;
            if (this.d.f43435q8) {
                PhotoViewer photoViewer3 = this.d;
                int i7 = iArr[1];
                photoViewer3.f43367i8 = i7;
                photoViewer3.f43384k8 = i7;
                PhotoViewer photoViewer4 = this.d;
                int i10 = iArr[2];
                photoViewer4.f43375j8 = i10;
                photoViewer4.f43392l8 = i10;
                PhotoViewer photoViewer5 = this.d;
                int max = Math.max(photoViewer5.f43367i8, this.d.f43375j8);
                if (max > 1280) {
                    photoViewer5.f43342f8 = 4;
                } else if (max > 854) {
                    photoViewer5.f43342f8 = 3;
                } else if (max > 640) {
                    photoViewer5.f43342f8 = 2;
                } else {
                    photoViewer5.f43342f8 = 1;
                }
                PhotoViewer photoViewer6 = this.d;
                int i11 = this.f47605c;
                if (i11 == -1) {
                    i11 = photoViewer6.u2();
                }
                photoViewer6.f43331e8 = i11;
                PhotoViewer photoViewer7 = this.d;
                if (photoViewer7.f43400m8 != 0 && photoViewer7.d2 != 1) {
                    Size i02 = photoViewer7.i0();
                    if (i02.getWidth() == photoViewer7.f43367i8 && i02.getHeight() == photoViewer7.f43375j8) {
                        MediaController.v(i02.getWidth(), i02.getHeight(), photoViewer7.f43409n8, false);
                    } else {
                        MediaController.v(i02.getWidth(), i02.getHeight(), MediaController.Q(photoViewer7.f43375j8, photoViewer7.f43367i8, photoViewer7.f43409n8, i02.getHeight(), i02.getWidth()), false);
                    }
                }
                PhotoViewer photoViewer8 = this.d;
                String str = this.f47603a;
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
                    photoViewer8.f43445r8 = z12;
                } finally {
                    mediaExtractor.release();
                }
            }
            if (this.d.D8 != this) {
                return;
            }
            org.telegram.messenger.g0.g3(new lc0(this, this, iArr, 22));
        }
    }
}
