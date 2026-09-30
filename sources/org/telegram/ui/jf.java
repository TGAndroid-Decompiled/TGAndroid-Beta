package org.telegram.ui;
public final class jf implements Runnable {
    public final int f34884a;
    public final wn f34885b;
    public final boolean f34886c;

    public jf(wn wnVar, boolean z10, int i10) {
        this.f34884a = i10;
        this.f34885b = wnVar;
        this.f34886c = z10;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f34884a) {
            case 0:
                if (this.f34886c) {
                    str = "upload_speed";
                } else {
                    str = "download_speed";
                }
                this.f34885b.presentFragment(new PremiumPreviewFragment(0, str));
                return;
            default:
                this.f34885b.yc(0, this.f34886c);
                return;
        }
    }
}
