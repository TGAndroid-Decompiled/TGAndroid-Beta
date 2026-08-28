package org.telegram.messenger;
public final class z7 implements Runnable {
    public final int f22311a;
    public final MediaDataController f22312b;
    public final boolean f22313c;

    public z7(MediaDataController mediaDataController, boolean z10, int i9) {
        this.f22311a = i9;
        this.f22312b = mediaDataController;
        this.f22313c = z10;
    }

    @Override
    public final void run() {
        switch (this.f22311a) {
            case 0:
                this.f22312b.lambda$loadFeaturedStickers$55(this.f22313c);
                return;
            default:
                this.f22312b.lambda$processLoadedFeaturedStickers$59(this.f22313c);
                return;
        }
    }
}
