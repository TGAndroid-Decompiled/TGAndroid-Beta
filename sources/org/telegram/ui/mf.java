package org.telegram.ui;
public final class mf implements Runnable {
    public final int f35788a;
    public final bo f35789b;
    public final boolean f35790c;

    public mf(bo boVar, boolean z10, int i10) {
        this.f35788a = i10;
        this.f35789b = boVar;
        this.f35790c = z10;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f35788a) {
            case 0:
                if (this.f35790c) {
                    str = "upload_speed";
                } else {
                    str = "download_speed";
                }
                this.f35789b.presentFragment(new PremiumPreviewFragment(0, str));
                return;
            default:
                this.f35789b.yc(0, this.f35790c);
                return;
        }
    }
}
