package org.telegram.ui;

public final class af implements Runnable {

    public final int f36524a;

    public final rn f36525b;

    public final boolean f36526c;

    public af(rn rnVar, boolean z10, int i10) {
        this.f36524a = i10;
        this.f36525b = rnVar;
        this.f36526c = z10;
    }

    @Override
    public final void run() {
        switch (this.f36524a) {
            case 0:
                this.f36525b.presentFragment(new PremiumPreviewFragment(0, this.f36526c ? "upload_speed" : "download_speed"));
                break;
            default:
                this.f36525b.yc(0, this.f36526c);
                break;
        }
    }
}
