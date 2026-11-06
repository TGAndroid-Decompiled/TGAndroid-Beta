package org.telegram.messenger;
public final class yd implements Runnable {
    public final int f26615a;
    public final MediaController f26616b;
    public final int f26617c;

    public yd(MediaController mediaController, int i7, int i10) {
        this.f26615a = i10;
        this.f26616b = mediaController;
        this.f26617c = i7;
    }

    @Override
    public final void run() {
        int i7;
        int i10 = this.f26615a;
        int i11 = this.f26617c;
        MediaController mediaController = this.f26616b;
        switch (i10) {
            case 0:
                qs f10 = qs.f(mediaController.f21267h1);
                Integer valueOf = Integer.valueOf(mediaController.f21265g1);
                if (i11 == 2) {
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                f10.k(157, valueOf, Integer.valueOf(i7));
                return;
            default:
                if (i11 == -1) {
                    if (mediaController.I(mediaController.f21292u0) && !mediaController.H()) {
                        mediaController.R(mediaController.f21292u0, true);
                    }
                    mediaController.U = 0;
                    mediaController.X = 0;
                } else if (i11 == 1) {
                    mediaController.X = 2;
                    if (mediaController.Y) {
                        mediaController.Y = false;
                        if (mediaController.I(mediaController.f21292u0) && mediaController.H()) {
                            mediaController.S(mediaController.f21292u0);
                        }
                    }
                } else if (i11 == -3) {
                    mediaController.X = 1;
                } else if (i11 == -2) {
                    mediaController.X = 0;
                    if (mediaController.I(mediaController.f21292u0) && !mediaController.H()) {
                        mediaController.R(mediaController.f21292u0, true);
                        mediaController.Y = true;
                    }
                } else {
                    String[] strArr = MediaController.V1;
                }
                mediaController.n0();
                return;
        }
    }
}
