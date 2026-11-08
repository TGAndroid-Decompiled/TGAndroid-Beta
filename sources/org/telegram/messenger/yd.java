package org.telegram.messenger;
public final class yd implements Runnable {
    public final int f26632a;
    public final MediaController f26633b;
    public final int f26634c;

    public yd(MediaController mediaController, int i7, int i10) {
        this.f26632a = i10;
        this.f26633b = mediaController;
        this.f26634c = i7;
    }

    @Override
    public final void run() {
        int i7;
        int i10 = this.f26632a;
        int i11 = this.f26634c;
        MediaController mediaController = this.f26633b;
        switch (i10) {
            case 0:
                qs f10 = qs.f(mediaController.f21270h1);
                Integer valueOf = Integer.valueOf(mediaController.f21268g1);
                if (i11 == 2) {
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                f10.k(157, valueOf, Integer.valueOf(i7));
                return;
            default:
                if (i11 == -1) {
                    if (mediaController.I(mediaController.f21295u0) && !mediaController.H()) {
                        mediaController.R(mediaController.f21295u0, true);
                    }
                    mediaController.U = 0;
                    mediaController.X = 0;
                } else if (i11 == 1) {
                    mediaController.X = 2;
                    if (mediaController.Y) {
                        mediaController.Y = false;
                        if (mediaController.I(mediaController.f21295u0) && mediaController.H()) {
                            mediaController.S(mediaController.f21295u0);
                        }
                    }
                } else if (i11 == -3) {
                    mediaController.X = 1;
                } else if (i11 == -2) {
                    mediaController.X = 0;
                    if (mediaController.I(mediaController.f21295u0) && !mediaController.H()) {
                        mediaController.R(mediaController.f21295u0, true);
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
