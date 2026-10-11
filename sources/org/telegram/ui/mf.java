package org.telegram.ui;
public final class mf implements Runnable {
    public final int f39962a;
    public final zn f39963b;
    public final boolean f39964c;

    public mf(zn znVar, boolean z10, int i10) {
        this.f39962a = i10;
        this.f39963b = znVar;
        this.f39964c = z10;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f39962a) {
            case 0:
                if (this.f39964c) {
                    str = "upload_speed";
                } else {
                    str = "download_speed";
                }
                this.f39963b.presentFragment(new PremiumPreviewFragment(0, str));
                return;
            default:
                this.f39963b.Cc(0, this.f39964c);
                return;
        }
    }
}
