package org.telegram.ui;
public final class hf implements Runnable {
    public final int f37552a;
    public final sn f37553b;
    public final boolean f37554c;

    public hf(sn snVar, boolean z10, int i10) {
        this.f37552a = i10;
        this.f37553b = snVar;
        this.f37554c = z10;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f37552a) {
            case 0:
                if (this.f37554c) {
                    str = "upload_speed";
                } else {
                    str = "download_speed";
                }
                this.f37553b.presentFragment(new PremiumPreviewFragment(0, str));
                return;
            default:
                this.f37553b.Cc(0, this.f37554c);
                return;
        }
    }
}
