package org.telegram.ui;
public final class jf implements Runnable {
    public final int f34793a;
    public final wn f34794b;
    public final boolean f34795c;

    public jf(wn wnVar, boolean z10, int i10) {
        this.f34793a = i10;
        this.f34794b = wnVar;
        this.f34795c = z10;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f34793a) {
            case 0:
                if (this.f34795c) {
                    str = "upload_speed";
                } else {
                    str = "download_speed";
                }
                this.f34794b.presentFragment(new PremiumPreviewFragment(0, str));
                return;
            default:
                this.f34794b.yc(0, this.f34795c);
                return;
        }
    }
}
