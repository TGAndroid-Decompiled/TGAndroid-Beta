package org.telegram.ui;
public final class mf implements Runnable {
    public final int f38587a;
    public final yn f38588b;
    public final boolean f38589c;

    public mf(yn ynVar, boolean z10, int i10) {
        this.f38587a = i10;
        this.f38588b = ynVar;
        this.f38589c = z10;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f38587a) {
            case 0:
                if (this.f38589c) {
                    str = "upload_speed";
                } else {
                    str = "download_speed";
                }
                this.f38588b.presentFragment(new PremiumPreviewFragment(0, str));
                return;
            default:
                this.f38588b.xc(0, this.f38589c);
                return;
        }
    }
}
