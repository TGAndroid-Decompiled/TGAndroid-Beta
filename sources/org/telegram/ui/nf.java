package org.telegram.ui;
public final class nf implements Runnable {
    public final int f40239a;
    public final zn f40240b;
    public final boolean f40241c;

    public nf(zn znVar, boolean z10, int i10) {
        this.f40239a = i10;
        this.f40240b = znVar;
        this.f40241c = z10;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f40239a) {
            case 0:
                if (this.f40241c) {
                    str = "upload_speed";
                } else {
                    str = "download_speed";
                }
                this.f40240b.presentFragment(new PremiumPreviewFragment(0, str));
                return;
            default:
                this.f40240b.Cc(0, this.f40241c);
                return;
        }
    }
}
