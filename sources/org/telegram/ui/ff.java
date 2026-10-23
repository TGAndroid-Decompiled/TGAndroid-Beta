package org.telegram.ui;
public final class ff implements Runnable {
    public final int f37319a;
    public final sn f37320b;
    public final boolean f37321c;

    public ff(sn snVar, boolean z10, int i10) {
        this.f37319a = i10;
        this.f37320b = snVar;
        this.f37321c = z10;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f37319a) {
            case 0:
                if (this.f37321c) {
                    str = "upload_speed";
                } else {
                    str = "download_speed";
                }
                this.f37320b.presentFragment(new PremiumPreviewFragment(0, str));
                return;
            default:
                this.f37320b.Fc(0, this.f37321c);
                return;
        }
    }
}
