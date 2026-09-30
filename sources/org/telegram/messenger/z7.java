package org.telegram.messenger;
public final class z7 implements Runnable {
    public final int f18297a;
    public final MediaDataController f18298b;
    public final boolean f18299c;

    public z7(MediaDataController mediaDataController, boolean z10, int i10) {
        this.f18297a = i10;
        this.f18298b = mediaDataController;
        this.f18299c = z10;
    }

    @Override
    public final void run() {
        switch (this.f18297a) {
            case 0:
                this.f18298b.lambda$loadFeaturedStickers$55(this.f18299c);
                return;
            default:
                this.f18298b.lambda$processLoadedFeaturedStickers$59(this.f18299c);
                return;
        }
    }
}
