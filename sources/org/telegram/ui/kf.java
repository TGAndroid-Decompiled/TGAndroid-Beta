package org.telegram.ui;
public final class kf implements Runnable {
    public final int f35182a;
    public final zn f35183b;
    public final boolean f35184c;

    public kf(zn znVar, boolean z10, int i10) {
        this.f35182a = i10;
        this.f35183b = znVar;
        this.f35184c = z10;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f35182a) {
            case 0:
                if (this.f35184c) {
                    str = "upload_speed";
                } else {
                    str = "download_speed";
                }
                this.f35183b.presentFragment(new PremiumPreviewFragment(0, str));
                return;
            default:
                this.f35183b.yc(0, this.f35184c);
                return;
        }
    }
}
