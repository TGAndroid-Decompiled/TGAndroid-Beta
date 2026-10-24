package org.telegram.ui;
public final class ff implements Runnable {
    public final int f37322a;
    public final sn f37323b;
    public final boolean f37324c;

    public ff(sn snVar, boolean z10, int i10) {
        this.f37322a = i10;
        this.f37323b = snVar;
        this.f37324c = z10;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f37322a) {
            case 0:
                if (this.f37324c) {
                    str = "upload_speed";
                } else {
                    str = "download_speed";
                }
                this.f37323b.presentFragment(new PremiumPreviewFragment(0, str));
                return;
            default:
                this.f37323b.Fc(0, this.f37324c);
                return;
        }
    }
}
