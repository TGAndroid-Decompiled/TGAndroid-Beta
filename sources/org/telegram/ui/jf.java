package org.telegram.ui;
public final class jf implements Runnable {
    public final int f34790a;
    public final wn f34791b;
    public final boolean f34792c;

    public jf(wn wnVar, boolean z10, int i10) {
        this.f34790a = i10;
        this.f34791b = wnVar;
        this.f34792c = z10;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f34790a) {
            case 0:
                if (this.f34792c) {
                    str = "upload_speed";
                } else {
                    str = "download_speed";
                }
                this.f34791b.presentFragment(new PremiumPreviewFragment(0, str));
                return;
            default:
                this.f34791b.yc(0, this.f34792c);
                return;
        }
    }
}
