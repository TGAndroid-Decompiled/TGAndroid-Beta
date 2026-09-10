package org.telegram.ui;
public final class mf implements Runnable {
    public final int f34936a;
    public final eo f34937b;
    public final boolean f34938c;

    public mf(eo eoVar, boolean z10, int i10) {
        this.f34936a = i10;
        this.f34937b = eoVar;
        this.f34938c = z10;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f34936a) {
            case 0:
                if (this.f34938c) {
                    str = "upload_speed";
                } else {
                    str = "download_speed";
                }
                this.f34937b.presentFragment(new PremiumPreviewFragment(0, str));
                return;
            default:
                this.f34937b.yc(0, this.f34938c);
                return;
        }
    }
}
