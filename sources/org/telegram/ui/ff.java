package org.telegram.ui;
public final class ff implements Runnable {
    public final int f36788a;
    public final xn f36789b;
    public final boolean f36790c;

    public ff(xn xnVar, boolean z4, int i10) {
        this.f36788a = i10;
        this.f36789b = xnVar;
        this.f36790c = z4;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f36788a) {
            case 0:
                if (this.f36790c) {
                    str = "upload_speed";
                } else {
                    str = "download_speed";
                }
                this.f36789b.presentFragment(new PremiumPreviewFragment(0, str));
                return;
            default:
                this.f36789b.yc(0, this.f36790c);
                return;
        }
    }
}
