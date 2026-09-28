package org.telegram.ui;
public final class jf implements Runnable {
    public final int f34791a;
    public final wn f34792b;
    public final boolean f34793c;

    public jf(wn wnVar, boolean z10, int i10) {
        this.f34791a = i10;
        this.f34792b = wnVar;
        this.f34793c = z10;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f34791a) {
            case 0:
                if (this.f34793c) {
                    str = "upload_speed";
                } else {
                    str = "download_speed";
                }
                this.f34792b.presentFragment(new PremiumPreviewFragment(0, str));
                return;
            default:
                this.f34792b.yc(0, this.f34793c);
                return;
        }
    }
}
