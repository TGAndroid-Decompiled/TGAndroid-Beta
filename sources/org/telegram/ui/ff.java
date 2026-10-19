package org.telegram.ui;
public final class ff implements Runnable {
    public final int f36987a;
    public final qn f36988b;
    public final boolean f36989c;

    public ff(qn qnVar, boolean z10, int i10) {
        this.f36987a = i10;
        this.f36988b = qnVar;
        this.f36989c = z10;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f36987a) {
            case 0:
                if (this.f36989c) {
                    str = "upload_speed";
                } else {
                    str = "download_speed";
                }
                this.f36988b.presentFragment(new PremiumPreviewFragment(0, str));
                return;
            default:
                this.f36988b.Cc(0, this.f36989c);
                return;
        }
    }
}
