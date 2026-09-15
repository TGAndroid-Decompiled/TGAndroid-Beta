package org.telegram.ui;
public final class kf implements Runnable {
    public final int f35140a;
    public final bo f35141b;
    public final boolean f35142c;

    public kf(bo boVar, boolean z10, int i10) {
        this.f35140a = i10;
        this.f35141b = boVar;
        this.f35142c = z10;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f35140a) {
            case 0:
                if (this.f35142c) {
                    str = "upload_speed";
                } else {
                    str = "download_speed";
                }
                this.f35141b.presentFragment(new PremiumPreviewFragment(0, str));
                return;
            default:
                this.f35141b.yc(0, this.f35142c);
                return;
        }
    }
}
