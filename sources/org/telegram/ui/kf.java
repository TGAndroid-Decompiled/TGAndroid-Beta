package org.telegram.ui;
public final class kf implements Runnable {
    public final int f34700a;
    public final xn f34701b;
    public final boolean f34702c;

    public kf(xn xnVar, boolean z10, int i10) {
        this.f34700a = i10;
        this.f34701b = xnVar;
        this.f34702c = z10;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f34700a) {
            case 0:
                if (this.f34702c) {
                    str = "upload_speed";
                } else {
                    str = "download_speed";
                }
                this.f34701b.presentFragment(new PremiumPreviewFragment(0, str));
                return;
            default:
                this.f34701b.yc(0, this.f34702c);
                return;
        }
    }
}
