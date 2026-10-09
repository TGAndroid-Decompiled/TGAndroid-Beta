package org.telegram.ui;
public final class nf implements Runnable {
    public final int f40193a;
    public final zn f40194b;
    public final boolean f40195c;

    public nf(zn znVar, boolean z10, int i10) {
        this.f40193a = i10;
        this.f40194b = znVar;
        this.f40195c = z10;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f40193a) {
            case 0:
                if (this.f40195c) {
                    str = "upload_speed";
                } else {
                    str = "download_speed";
                }
                this.f40194b.presentFragment(new PremiumPreviewFragment(0, str));
                return;
            default:
                this.f40194b.Cc(0, this.f40195c);
                return;
        }
    }
}
