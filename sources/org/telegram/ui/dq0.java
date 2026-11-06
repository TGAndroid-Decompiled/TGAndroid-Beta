package org.telegram.ui;

import android.media.MediaExtractor;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.camera.Size;
import org.telegram.ui.Components.AnimatedFileNative;
public final class dq0 implements Runnable {
    public final String f45128a;
    public final long f45129b;
    public final int f45130c;
    public final PhotoViewer d;

    public dq0(PhotoViewer photoViewer, String str, long j3, int i7) {
        this.d = photoViewer;
        this.f45128a = str;
        this.f45129b = j3;
        this.f45130c = i7;
    }

    @Override
    public final void run() {
        boolean z9;
        boolean z10;
        if (this.d.f41546w8 == this) {
            int E = MediaController.E(this.f45128a);
            int[] iArr = new int[11];
            AnimatedFileNative.d(this.f45128a, iArr, this.f45129b);
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
            photoViewer.f41431j8 = z10;
            PhotoViewer photoViewer2 = this.d;
            if (E == -1) {
                E = iArr[3];
            }
            photoViewer2.f41398f8 = E;
            photoViewer2.f41407g8 = E;
            if (this.d.f41431j8) {
                PhotoViewer photoViewer3 = this.d;
                int i7 = iArr[1];
                photoViewer3.f41360b8 = i7;
                photoViewer3.f41378d8 = i7;
                PhotoViewer photoViewer4 = this.d;
                int i10 = iArr[2];
                photoViewer4.f41370c8 = i10;
                photoViewer4.f41388e8 = i10;
                PhotoViewer photoViewer5 = this.d;
                int max = Math.max(photoViewer5.f41360b8, this.d.f41370c8);
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
                int i11 = this.f45130c;
                if (i11 == -1) {
                    i11 = photoViewer6.s2();
                }
                photoViewer6.X7 = i11;
                PhotoViewer photoViewer7 = this.d;
                if (photoViewer7.f41398f8 != 0 && photoViewer7.f41364c2 != 1) {
                    Size i02 = photoViewer7.i0();
                    if (i02.getWidth() == photoViewer7.f41360b8 && i02.getHeight() == photoViewer7.f41370c8) {
                        MediaController.v(i02.getWidth(), i02.getHeight(), photoViewer7.f41407g8, false);
                    } else {
                        MediaController.v(i02.getWidth(), i02.getHeight(), MediaController.Q(photoViewer7.f41370c8, photoViewer7.f41360b8, photoViewer7.f41407g8, i02.getHeight(), i02.getWidth()), false);
                    }
                }
                PhotoViewer photoViewer8 = this.d;
                String str = this.f45128a;
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
                    photoViewer8.f41440k8 = z11;
                } finally {
                    mediaExtractor.release();
                }
            }
            if (this.d.f41546w8 != this) {
                return;
            }
            org.telegram.messenger.g0.h3(new mc0(this, this, iArr, 22));
        }
    }
}
