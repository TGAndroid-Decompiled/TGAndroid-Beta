package org.telegram.ui;
public final class ff implements Runnable {
    public final int f36988a;
    public final qn f36989b;
    public final boolean f36990c;

    public ff(qn qnVar, boolean z10, int i10) {
        this.f36988a = i10;
        this.f36989b = qnVar;
        this.f36990c = z10;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f36988a) {
            case 0:
                if (this.f36990c) {
                    str = "upload_speed";
                } else {
                    str = "download_speed";
                }
                this.f36989b.presentFragment(new PremiumPreviewFragment(0, str));
                return;
            default:
                this.f36989b.Dc(0, this.f36990c);
                return;
        }
    }
}
