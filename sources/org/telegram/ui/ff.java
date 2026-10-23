package org.telegram.ui;
public final class ff implements Runnable {
    public final int f36992a;
    public final qn f36993b;
    public final boolean f36994c;

    public ff(qn qnVar, boolean z10, int i10) {
        this.f36992a = i10;
        this.f36993b = qnVar;
        this.f36994c = z10;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f36992a) {
            case 0:
                if (this.f36994c) {
                    str = "upload_speed";
                } else {
                    str = "download_speed";
                }
                this.f36993b.presentFragment(new PremiumPreviewFragment(0, str));
                return;
            default:
                this.f36993b.Dc(0, this.f36994c);
                return;
        }
    }
}
