package org.telegram.ui;
public final class kf implements Runnable {
    public final int f35084a;
    public final zn f35085b;
    public final boolean f35086c;

    public kf(zn znVar, boolean z10, int i10) {
        this.f35084a = i10;
        this.f35085b = znVar;
        this.f35086c = z10;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f35084a) {
            case 0:
                if (this.f35086c) {
                    str = "upload_speed";
                } else {
                    str = "download_speed";
                }
                this.f35085b.presentFragment(new PremiumPreviewFragment(0, str));
                return;
            default:
                this.f35085b.yc(0, this.f35086c);
                return;
        }
    }
}
