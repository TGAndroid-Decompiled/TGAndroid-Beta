package org.telegram.ui;
public final class nf implements Runnable {
    public final int f40195a;
    public final zn f40196b;
    public final boolean f40197c;

    public nf(zn znVar, boolean z10, int i10) {
        this.f40195a = i10;
        this.f40196b = znVar;
        this.f40197c = z10;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f40195a) {
            case 0:
                if (this.f40197c) {
                    str = "upload_speed";
                } else {
                    str = "download_speed";
                }
                this.f40196b.presentFragment(new PremiumPreviewFragment(0, str));
                return;
            default:
                this.f40196b.Cc(0, this.f40197c);
                return;
        }
    }
}
