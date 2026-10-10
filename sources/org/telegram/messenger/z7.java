package org.telegram.messenger;
public final class z7 implements Runnable {
    public final int f19979a;
    public final MediaDataController f19980b;
    public final boolean f19981c;

    public z7(MediaDataController mediaDataController, boolean z10, int i10) {
        this.f19979a = i10;
        this.f19980b = mediaDataController;
        this.f19981c = z10;
    }

    @Override
    public final void run() {
        switch (this.f19979a) {
            case 0:
                this.f19980b.lambda$loadFeaturedStickers$55(this.f19981c);
                return;
            default:
                this.f19980b.lambda$processLoadedFeaturedStickers$59(this.f19981c);
                return;
        }
    }
}
