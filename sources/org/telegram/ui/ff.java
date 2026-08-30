package org.telegram.ui;
public final class ff implements Runnable {
    public final int f34240a;
    public final xn f34241b;
    public final boolean f34242c;

    public ff(xn xnVar, boolean z4, int i10) {
        this.f34240a = i10;
        this.f34241b = xnVar;
        this.f34242c = z4;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f34240a) {
            case 0:
                if (this.f34242c) {
                    str = "upload_speed";
                } else {
                    str = "download_speed";
                }
                this.f34241b.presentFragment(new PremiumPreviewFragment(0, str));
                return;
            default:
                this.f34241b.yc(0, this.f34242c);
                return;
        }
    }
}
