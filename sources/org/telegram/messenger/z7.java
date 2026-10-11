package org.telegram.messenger;
public final class z7 implements Runnable {
    public final int f20012a;
    public final MediaDataController f20013b;
    public final boolean f20014c;

    public z7(MediaDataController mediaDataController, boolean z10, int i10) {
        this.f20012a = i10;
        this.f20013b = mediaDataController;
        this.f20014c = z10;
    }

    @Override
    public final void run() {
        switch (this.f20012a) {
            case 0:
                this.f20013b.lambda$loadFeaturedStickers$55(this.f20014c);
                return;
            default:
                this.f20013b.lambda$processLoadedFeaturedStickers$59(this.f20014c);
                return;
        }
    }
}
