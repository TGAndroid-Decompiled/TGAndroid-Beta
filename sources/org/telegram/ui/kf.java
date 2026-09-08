package org.telegram.ui;
public final class kf implements Runnable {
    public final int f38070a;
    public final co f38071b;
    public final boolean f38072c;

    public kf(co coVar, boolean z10, int i10) {
        this.f38070a = i10;
        this.f38071b = coVar;
        this.f38072c = z10;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f38070a) {
            case 0:
                if (this.f38072c) {
                    str = "upload_speed";
                } else {
                    str = "download_speed";
                }
                this.f38071b.presentFragment(new PremiumPreviewFragment(0, str));
                return;
            default:
                this.f38071b.yc(0, this.f38072c);
                return;
        }
    }
}
