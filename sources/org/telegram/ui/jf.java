package org.telegram.ui;
public final class jf implements Runnable {
    public final int f34792a;
    public final wn f34793b;
    public final boolean f34794c;

    public jf(wn wnVar, boolean z10, int i10) {
        this.f34792a = i10;
        this.f34793b = wnVar;
        this.f34794c = z10;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f34792a) {
            case 0:
                if (this.f34794c) {
                    str = "upload_speed";
                } else {
                    str = "download_speed";
                }
                this.f34793b.presentFragment(new PremiumPreviewFragment(0, str));
                return;
            default:
                this.f34793b.yc(0, this.f34794c);
                return;
        }
    }
}
