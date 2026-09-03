package org.telegram.ui;
public final class hf implements Runnable {
    public final int f34659a;
    public final zn f34660b;
    public final boolean f34661c;

    public hf(zn znVar, boolean z4, int i10) {
        this.f34659a = i10;
        this.f34660b = znVar;
        this.f34661c = z4;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f34659a) {
            case 0:
                if (this.f34661c) {
                    str = "upload_speed";
                } else {
                    str = "download_speed";
                }
                this.f34660b.presentFragment(new PremiumPreviewFragment(0, str));
                return;
            default:
                this.f34660b.yc(0, this.f34661c);
                return;
        }
    }
}
