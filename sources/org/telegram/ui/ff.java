package org.telegram.ui;
public final class ff implements Runnable {
    public final int f36867a;
    public final xn f36868b;
    public final boolean f36869c;

    public ff(xn xnVar, boolean z4, int i10) {
        this.f36867a = i10;
        this.f36868b = xnVar;
        this.f36869c = z4;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f36867a) {
            case 0:
                if (this.f36869c) {
                    str = "upload_speed";
                } else {
                    str = "download_speed";
                }
                this.f36868b.presentFragment(new PremiumPreviewFragment(0, str));
                return;
            default:
                this.f36868b.yc(0, this.f36869c);
                return;
        }
    }
}
