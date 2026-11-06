package org.telegram.ui;

import android.media.MediaExtractor;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.camera.Size;
import org.telegram.ui.Components.AnimatedFileNative;
public final class dq0 implements Runnable {
    public final String f45129a;
    public final long f45130b;
    public final int f45131c;
    public final PhotoViewer d;

    public dq0(PhotoViewer photoViewer, String str, long j3, int i7) {
        this.d = photoViewer;
        this.f45129a = str;
        this.f45130b = j3;
        this.f45131c = i7;
    }

    @Override
    public final void run() {
        boolean z9;
        boolean z10;
        if (this.d.f41547w8 == this) {
            int E = MediaController.E(this.f45129a);
            int[] iArr = new int[11];
            AnimatedFileNative.d(this.f45129a, iArr, this.f45130b);
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
            photoViewer.f41432j8 = z10;
            PhotoViewer photoViewer2 = this.d;
            if (E == -1) {
                E = iArr[3];
            }
            photoViewer2.f41399f8 = E;
            photoViewer2.f41408g8 = E;
            if (this.d.f41432j8) {
                PhotoViewer photoViewer3 = this.d;
                int i7 = iArr[1];
                photoViewer3.f41361b8 = i7;
                photoViewer3.f41379d8 = i7;
                PhotoViewer photoViewer4 = this.d;
                int i10 = iArr[2];
                photoViewer4.f41371c8 = i10;
                photoViewer4.f41389e8 = i10;
                PhotoViewer photoViewer5 = this.d;
                int max = Math.max(photoViewer5.f41361b8, this.d.f41371c8);
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
                int i11 = this.f45131c;
                if (i11 == -1) {
                    i11 = photoViewer6.s2();
                }
                photoViewer6.X7 = i11;
                PhotoViewer photoViewer7 = this.d;
                if (photoViewer7.f41399f8 != 0 && photoViewer7.f41365c2 != 1) {
                    Size i02 = photoViewer7.i0();
                    if (i02.getWidth() == photoViewer7.f41361b8 && i02.getHeight() == photoViewer7.f41371c8) {
                        MediaController.v(i02.getWidth(), i02.getHeight(), photoViewer7.f41408g8, false);
                    } else {
                        MediaController.v(i02.getWidth(), i02.getHeight(), MediaController.Q(photoViewer7.f41371c8, photoViewer7.f41361b8, photoViewer7.f41408g8, i02.getHeight(), i02.getWidth()), false);
                    }
                }
                PhotoViewer photoViewer8 = this.d;
                String str = this.f45129a;
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
                    photoViewer8.f41441k8 = z11;
                } finally {
                    mediaExtractor.release();
                }
            }
            if (this.d.f41547w8 != this) {
                return;
            }
            org.telegram.messenger.g0.h3(new mc0(this, this, iArr, 22));
        }
    }
}
