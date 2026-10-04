package org.telegram.ui;
public final class mf implements Runnable {
    public final int f38581a;
    public final yn f38582b;
    public final boolean f38583c;

    public mf(yn ynVar, boolean z10, int i10) {
        this.f38581a = i10;
        this.f38582b = ynVar;
        this.f38583c = z10;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f38581a) {
            case 0:
                if (this.f38583c) {
                    str = "upload_speed";
                } else {
                    str = "download_speed";
                }
                this.f38582b.presentFragment(new PremiumPreviewFragment(0, str));
                return;
            default:
                this.f38582b.xc(0, this.f38583c);
                return;
        }
    }
}
