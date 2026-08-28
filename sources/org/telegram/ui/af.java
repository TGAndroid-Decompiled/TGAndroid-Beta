package org.telegram.ui;
public final class af implements Runnable {
    public final int f36469a;
    public final qn f36470b;
    public final boolean f36471c;

    public af(qn qnVar, boolean z10, int i9) {
        this.f36469a = i9;
        this.f36470b = qnVar;
        this.f36471c = z10;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f36469a) {
            case 0:
                if (this.f36471c) {
                    str = "upload_speed";
                } else {
                    str = "download_speed";
                }
                this.f36470b.presentFragment(new PremiumPreviewFragment(0, str));
                return;
            default:
                this.f36470b.yc(0, this.f36471c);
                return;
        }
    }
}
