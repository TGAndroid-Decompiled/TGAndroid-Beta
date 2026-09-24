package org.telegram.ui;
public final class jf implements Runnable {
    public final int f34777a;
    public final wn f34778b;
    public final boolean f34779c;

    public jf(wn wnVar, boolean z10, int i10) {
        this.f34777a = i10;
        this.f34778b = wnVar;
        this.f34779c = z10;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f34777a) {
            case 0:
                if (this.f34779c) {
                    str = "upload_speed";
                } else {
                    str = "download_speed";
                }
                this.f34778b.presentFragment(new PremiumPreviewFragment(0, str));
                return;
            default:
                this.f34778b.yc(0, this.f34779c);
                return;
        }
    }
}
