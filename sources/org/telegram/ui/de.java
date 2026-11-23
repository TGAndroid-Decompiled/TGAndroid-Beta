package org.telegram.ui;
public final class de implements Runnable {
    public final int f46883a;
    public final bn f46884b;
    public final boolean f46885c;

    public de(bn bnVar, boolean z10, int i7) {
        this.f46883a = i7;
        this.f46884b = bnVar;
        this.f46885c = z10;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f46883a) {
            case 0:
                this.f46884b.gd(0, this.f46885c);
                return;
            default:
                if (this.f46885c) {
                    str = "upload_speed";
                } else {
                    str = "download_speed";
                }
                this.f46884b.presentFragment(new PremiumPreviewFragment(0, str));
                return;
        }
    }
}
