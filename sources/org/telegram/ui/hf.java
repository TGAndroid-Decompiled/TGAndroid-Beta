package org.telegram.ui;
public final class hf implements Runnable {
    public final int f37534a;
    public final sn f37535b;
    public final boolean f37536c;

    public hf(sn snVar, boolean z10, int i10) {
        this.f37534a = i10;
        this.f37535b = snVar;
        this.f37536c = z10;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f37534a) {
            case 0:
                if (this.f37536c) {
                    str = "upload_speed";
                } else {
                    str = "download_speed";
                }
                this.f37535b.presentFragment(new PremiumPreviewFragment(0, str));
                return;
            default:
                this.f37535b.Cc(0, this.f37536c);
                return;
        }
    }
}
