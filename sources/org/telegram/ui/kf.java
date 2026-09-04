package org.telegram.ui;
public final class kf implements Runnable {
    public final int f38043a;
    public final co f38044b;
    public final boolean f38045c;

    public kf(co coVar, boolean z10, int i10) {
        this.f38043a = i10;
        this.f38044b = coVar;
        this.f38045c = z10;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f38043a) {
            case 0:
                if (this.f38045c) {
                    str = "upload_speed";
                } else {
                    str = "download_speed";
                }
                this.f38044b.presentFragment(new PremiumPreviewFragment(0, str));
                return;
            default:
                this.f38044b.yc(0, this.f38045c);
                return;
        }
    }
}
