package org.telegram.messenger;
public final class z7 implements Runnable {
    public final int f19990a;
    public final MediaDataController f19991b;
    public final boolean f19992c;

    public z7(MediaDataController mediaDataController, boolean z10, int i10) {
        this.f19990a = i10;
        this.f19991b = mediaDataController;
        this.f19992c = z10;
    }

    @Override
    public final void run() {
        switch (this.f19990a) {
            case 0:
                this.f19991b.lambda$loadFeaturedStickers$55(this.f19992c);
                return;
            default:
                this.f19991b.lambda$processLoadedFeaturedStickers$59(this.f19992c);
                return;
        }
    }
}
