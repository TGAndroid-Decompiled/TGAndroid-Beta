package org.telegram.ui;
public final class mf implements Runnable {
    public final int f38582a;
    public final yn f38583b;
    public final boolean f38584c;

    public mf(yn ynVar, boolean z10, int i10) {
        this.f38582a = i10;
        this.f38583b = ynVar;
        this.f38584c = z10;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f38582a) {
            case 0:
                if (this.f38584c) {
                    str = "upload_speed";
                } else {
                    str = "download_speed";
                }
                this.f38583b.presentFragment(new PremiumPreviewFragment(0, str));
                return;
            default:
                this.f38583b.xc(0, this.f38584c);
                return;
        }
    }
}
