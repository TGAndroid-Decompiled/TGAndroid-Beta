package org.telegram.ui;
public final class gf implements Runnable {
    public final int f37467a;
    public final un f37468b;
    public final boolean f37469c;

    public gf(un unVar, boolean z10, int i10) {
        this.f37467a = i10;
        this.f37468b = unVar;
        this.f37469c = z10;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f37467a) {
            case 0:
                if (this.f37469c) {
                    str = "upload_speed";
                } else {
                    str = "download_speed";
                }
                this.f37468b.presentFragment(new PremiumPreviewFragment(0, str));
                return;
            default:
                this.f37468b.Xc(0, this.f37469c);
                return;
        }
    }
}
