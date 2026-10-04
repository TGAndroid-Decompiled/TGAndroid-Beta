package org.telegram.messenger;
public final class z7 implements Runnable {
    public final int f19976a;
    public final MediaDataController f19977b;
    public final boolean f19978c;

    public z7(MediaDataController mediaDataController, boolean z10, int i10) {
        this.f19976a = i10;
        this.f19977b = mediaDataController;
        this.f19978c = z10;
    }

    @Override
    public final void run() {
        switch (this.f19976a) {
            case 0:
                this.f19977b.lambda$loadFeaturedStickers$55(this.f19978c);
                return;
            default:
                this.f19977b.lambda$processLoadedFeaturedStickers$59(this.f19978c);
                return;
        }
    }
}
