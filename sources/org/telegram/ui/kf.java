package org.telegram.ui;
public final class kf implements Runnable {
    public final int f35160a;
    public final zn f35161b;
    public final boolean f35162c;

    public kf(zn znVar, boolean z10, int i10) {
        this.f35160a = i10;
        this.f35161b = znVar;
        this.f35162c = z10;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f35160a) {
            case 0:
                if (this.f35162c) {
                    str = "upload_speed";
                } else {
                    str = "download_speed";
                }
                this.f35161b.presentFragment(new PremiumPreviewFragment(0, str));
                return;
            default:
                this.f35161b.yc(0, this.f35162c);
                return;
        }
    }
}
