package org.telegram.ui;
public final class kf implements Runnable {
    public final int f38044a;
    public final co f38045b;
    public final boolean f38046c;

    public kf(co coVar, boolean z10, int i10) {
        this.f38044a = i10;
        this.f38045b = coVar;
        this.f38046c = z10;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f38044a) {
            case 0:
                if (this.f38046c) {
                    str = "upload_speed";
                } else {
                    str = "download_speed";
                }
                this.f38045b.presentFragment(new PremiumPreviewFragment(0, str));
                return;
            default:
                this.f38045b.yc(0, this.f38046c);
                return;
        }
    }
}
