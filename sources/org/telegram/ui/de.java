package org.telegram.ui;
public final class de implements Runnable {
    public final int f46863a;
    public final bn f46864b;
    public final boolean f46865c;

    public de(bn bnVar, boolean z10, int i7) {
        this.f46863a = i7;
        this.f46864b = bnVar;
        this.f46865c = z10;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f46863a) {
            case 0:
                this.f46864b.gd(0, this.f46865c);
                return;
            default:
                if (this.f46865c) {
                    str = "upload_speed";
                } else {
                    str = "download_speed";
                }
                this.f46864b.presentFragment(new PremiumPreviewFragment(0, str));
                return;
        }
    }
}
