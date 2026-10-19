package org.telegram.ui;
public final class ff implements Runnable {
    public final int f36981a;
    public final qn f36982b;
    public final boolean f36983c;

    public ff(qn qnVar, boolean z10, int i10) {
        this.f36981a = i10;
        this.f36982b = qnVar;
        this.f36983c = z10;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f36981a) {
            case 0:
                if (this.f36983c) {
                    str = "upload_speed";
                } else {
                    str = "download_speed";
                }
                this.f36982b.presentFragment(new PremiumPreviewFragment(0, str));
                return;
            default:
                this.f36982b.Cc(0, this.f36983c);
                return;
        }
    }
}
