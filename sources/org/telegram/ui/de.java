package org.telegram.ui;
public final class de implements Runnable {
    public final int f46920a;
    public final bn f46921b;
    public final boolean f46922c;

    public de(bn bnVar, boolean z10, int i7) {
        this.f46920a = i7;
        this.f46921b = bnVar;
        this.f46922c = z10;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f46920a) {
            case 0:
                this.f46921b.gd(0, this.f46922c);
                return;
            default:
                if (this.f46922c) {
                    str = "upload_speed";
                } else {
                    str = "download_speed";
                }
                this.f46921b.presentFragment(new PremiumPreviewFragment(0, str));
                return;
        }
    }
}
