package org.telegram.ui;
public final class mf implements Runnable {
    public final int f35793a;
    public final bo f35794b;
    public final boolean f35795c;

    public mf(bo boVar, boolean z10, int i10) {
        this.f35793a = i10;
        this.f35794b = boVar;
        this.f35795c = z10;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f35793a) {
            case 0:
                if (this.f35795c) {
                    str = "upload_speed";
                } else {
                    str = "download_speed";
                }
                this.f35794b.presentFragment(new PremiumPreviewFragment(0, str));
                return;
            default:
                this.f35794b.yc(0, this.f35795c);
                return;
        }
    }
}
