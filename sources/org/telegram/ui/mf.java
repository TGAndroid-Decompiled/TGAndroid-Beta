package org.telegram.ui;
public final class mf implements Runnable {
    public final int f38616a;
    public final yn f38617b;
    public final boolean f38618c;

    public mf(yn ynVar, boolean z10, int i10) {
        this.f38616a = i10;
        this.f38617b = ynVar;
        this.f38618c = z10;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f38616a) {
            case 0:
                if (this.f38618c) {
                    str = "upload_speed";
                } else {
                    str = "download_speed";
                }
                this.f38617b.presentFragment(new PremiumPreviewFragment(0, str));
                return;
            default:
                this.f38617b.xc(0, this.f38618c);
                return;
        }
    }
}
