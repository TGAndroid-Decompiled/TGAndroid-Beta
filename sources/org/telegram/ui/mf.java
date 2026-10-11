package org.telegram.ui;
public final class mf implements Runnable {
    public final int f39928a;
    public final zn f39929b;
    public final boolean f39930c;

    public mf(zn znVar, boolean z10, int i10) {
        this.f39928a = i10;
        this.f39929b = znVar;
        this.f39930c = z10;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f39928a) {
            case 0:
                if (this.f39930c) {
                    str = "upload_speed";
                } else {
                    str = "download_speed";
                }
                this.f39929b.presentFragment(new PremiumPreviewFragment(0, str));
                return;
            default:
                this.f39929b.Cc(0, this.f39930c);
                return;
        }
    }
}
