package org.telegram.ui;
public final class ff implements Runnable {
    public final int f36991a;
    public final qn f36992b;
    public final boolean f36993c;

    public ff(qn qnVar, boolean z10, int i10) {
        this.f36991a = i10;
        this.f36992b = qnVar;
        this.f36993c = z10;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f36991a) {
            case 0:
                if (this.f36993c) {
                    str = "upload_speed";
                } else {
                    str = "download_speed";
                }
                this.f36992b.presentFragment(new PremiumPreviewFragment(0, str));
                return;
            default:
                this.f36992b.Dc(0, this.f36993c);
                return;
        }
    }
}
