package org.telegram.ui;
public final class mf implements Runnable {
    public final int f35679a;
    public final xn f35680b;
    public final boolean f35681c;

    public mf(xn xnVar, boolean z10, int i10) {
        this.f35679a = i10;
        this.f35680b = xnVar;
        this.f35681c = z10;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f35679a) {
            case 0:
                if (this.f35681c) {
                    str = "upload_speed";
                } else {
                    str = "download_speed";
                }
                this.f35680b.presentFragment(new PremiumPreviewFragment(0, str));
                return;
            default:
                this.f35680b.yc(0, this.f35681c);
                return;
        }
    }
}
