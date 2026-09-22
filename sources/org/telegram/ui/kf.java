package org.telegram.ui;
public final class kf implements Runnable {
    public final int f35137a;
    public final bo f35138b;
    public final boolean f35139c;

    public kf(bo boVar, boolean z10, int i10) {
        this.f35137a = i10;
        this.f35138b = boVar;
        this.f35139c = z10;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f35137a) {
            case 0:
                if (this.f35139c) {
                    str = "upload_speed";
                } else {
                    str = "download_speed";
                }
                this.f35138b.presentFragment(new PremiumPreviewFragment(0, str));
                return;
            default:
                this.f35138b.yc(0, this.f35139c);
                return;
        }
    }
}
