package org.telegram.ui;
public final class de implements Runnable {
    public final int f46930a;
    public final bn f46931b;
    public final boolean f46932c;

    public de(bn bnVar, boolean z10, int i7) {
        this.f46930a = i7;
        this.f46931b = bnVar;
        this.f46932c = z10;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f46930a) {
            case 0:
                this.f46931b.gd(0, this.f46932c);
                return;
            default:
                if (this.f46932c) {
                    str = "upload_speed";
                } else {
                    str = "download_speed";
                }
                this.f46931b.presentFragment(new PremiumPreviewFragment(0, str));
                return;
        }
    }
}
