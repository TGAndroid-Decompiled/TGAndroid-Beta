package org.telegram.ui;
public final class hf implements Runnable {
    public final int f37914a;
    public final un f37915b;
    public final boolean f37916c;

    public hf(un unVar, boolean z10, int i10) {
        this.f37914a = i10;
        this.f37915b = unVar;
        this.f37916c = z10;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f37914a) {
            case 0:
                if (this.f37916c) {
                    str = "upload_speed";
                } else {
                    str = "download_speed";
                }
                this.f37915b.presentFragment(new PremiumPreviewFragment(0, str));
                return;
            default:
                this.f37915b.Sc(0, this.f37916c);
                return;
        }
    }
}
