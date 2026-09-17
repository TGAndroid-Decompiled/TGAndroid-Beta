package org.telegram.ui;
public final class kf implements Runnable {
    public final int f38071a;
    public final co f38072b;
    public final boolean f38073c;

    public kf(co coVar, boolean z10, int i10) {
        this.f38071a = i10;
        this.f38072b = coVar;
        this.f38073c = z10;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f38071a) {
            case 0:
                if (this.f38073c) {
                    str = "upload_speed";
                } else {
                    str = "download_speed";
                }
                this.f38072b.presentFragment(new PremiumPreviewFragment(0, str));
                return;
            default:
                this.f38072b.yc(0, this.f38073c);
                return;
        }
    }
}
