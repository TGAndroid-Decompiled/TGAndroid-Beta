package org.telegram.ui;
public final class de implements Runnable {
    public final int f46923a;
    public final bn f46924b;
    public final boolean f46925c;

    public de(bn bnVar, boolean z10, int i7) {
        this.f46923a = i7;
        this.f46924b = bnVar;
        this.f46925c = z10;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f46923a) {
            case 0:
                this.f46924b.gd(0, this.f46925c);
                return;
            default:
                if (this.f46925c) {
                    str = "upload_speed";
                } else {
                    str = "download_speed";
                }
                this.f46924b.presentFragment(new PremiumPreviewFragment(0, str));
                return;
        }
    }
}
