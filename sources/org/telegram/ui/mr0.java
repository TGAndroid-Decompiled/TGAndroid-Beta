package org.telegram.ui;

import android.media.MediaExtractor;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.camera.Size;
import org.telegram.ui.Components.AnimatedFileNative;
public final class mr0 implements Runnable {
    public final String f39606a;
    public final long f39607b;
    public final int f39608c;
    public final PhotoViewer d;

    public mr0(PhotoViewer photoViewer, String str, long j10, int i10) {
        this.d = photoViewer;
        this.f39606a = str;
        this.f39607b = j10;
        this.f39608c = i10;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        if (this.d.f33655x8 == this) {
            int E = MediaController.E(this.f39606a);
            int[] iArr = new int[11];
            AnimatedFileNative.d(this.f39606a, iArr, this.f39607b);
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
            photoViewer.f33538k8 = z11;
            PhotoViewer photoViewer2 = this.d;
            if (E == -1) {
                E = iArr[3];
            }
            photoViewer2.f33502g8 = E;
            photoViewer2.f33511h8 = E;
            if (this.d.f33538k8) {
                PhotoViewer photoViewer3 = this.d;
                int i10 = iArr[1];
                photoViewer3.f33467c8 = i10;
                photoViewer3.f33484e8 = i10;
                PhotoViewer photoViewer4 = this.d;
                int i11 = iArr[2];
                photoViewer4.f33476d8 = i11;
                photoViewer4.f33493f8 = i11;
                PhotoViewer photoViewer5 = this.d;
                int max = Math.max(photoViewer5.f33467c8, this.d.f33476d8);
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
                int i12 = this.f39608c;
                if (i12 == -1) {
                    i12 = photoViewer6.y2();
                }
                photoViewer6.Y7 = i12;
                PhotoViewer photoViewer7 = this.d;
                if (photoViewer7.f33502g8 != 0 && photoViewer7.f33461c2 != 1) {
                    Size q02 = photoViewer7.q0();
                    if (q02.getWidth() == photoViewer7.f33467c8 && q02.getHeight() == photoViewer7.f33476d8) {
                        MediaController.v(q02.getWidth(), q02.getHeight(), photoViewer7.f33511h8, false);
                    } else {
                        MediaController.v(q02.getWidth(), q02.getHeight(), MediaController.Q(photoViewer7.f33476d8, photoViewer7.f33467c8, photoViewer7.f33511h8, q02.getHeight(), q02.getWidth()), false);
                    }
                }
                PhotoViewer photoViewer8 = this.d;
                String str = this.f39606a;
                MediaExtractor mediaExtractor = new MediaExtractor();
                try {
                    try {
                        mediaExtractor.setDataSource(str);
                        int w9 = MediaController.w(mediaExtractor, false);
                        if (w9 >= 0) {
                            if (mediaExtractor.getTrackFormat(w9).getString("mime").equals("video/avc")) {
                                z12 = true;
                            }
                        }
                    } catch (Exception e) {
                        org.telegram.messenger.f8.g(e, true);
                    }
                    photoViewer8.f33545l8 = z12;
                } finally {
                    mediaExtractor.release();
                }
            }
            if (this.d.f33655x8 != this) {
                return;
            }
            org.telegram.messenger.i0.g3(new pd0(this, this, iArr, 23));
        }
    }
}
