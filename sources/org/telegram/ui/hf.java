package org.telegram.ui;
public final class hf implements Runnable {
    public final int f37514a;
    public final sn f37515b;
    public final boolean f37516c;

    public hf(sn snVar, boolean z10, int i10) {
        this.f37514a = i10;
        this.f37515b = snVar;
        this.f37516c = z10;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f37514a) {
            case 0:
                if (this.f37516c) {
                    str = "upload_speed";
                } else {
                    str = "download_speed";
                }
                this.f37515b.presentFragment(new PremiumPreviewFragment(0, str));
                return;
            default:
                this.f37515b.Cc(0, this.f37516c);
                return;
        }
    }
}
