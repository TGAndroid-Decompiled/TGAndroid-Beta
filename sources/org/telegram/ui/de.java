package org.telegram.ui;
public final class de implements Runnable {
    public final int f47046a;
    public final bn f47047b;
    public final boolean f47048c;

    public de(bn bnVar, boolean z10, int i7) {
        this.f47046a = i7;
        this.f47047b = bnVar;
        this.f47048c = z10;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f47046a) {
            case 0:
                this.f47047b.gd(0, this.f47048c);
                return;
            default:
                if (this.f47048c) {
                    str = "upload_speed";
                } else {
                    str = "download_speed";
                }
                this.f47047b.presentFragment(new PremiumPreviewFragment(0, str));
                return;
        }
    }
}
