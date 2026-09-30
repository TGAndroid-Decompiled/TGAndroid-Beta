package org.telegram.messenger;
public final class z7 implements Runnable {
    public final int f18282a;
    public final MediaDataController f18283b;
    public final boolean f18284c;

    public z7(MediaDataController mediaDataController, boolean z10, int i10) {
        this.f18282a = i10;
        this.f18283b = mediaDataController;
        this.f18284c = z10;
    }

    @Override
    public final void run() {
        switch (this.f18282a) {
            case 0:
                this.f18283b.lambda$loadFeaturedStickers$55(this.f18284c);
                return;
            default:
                this.f18283b.lambda$processLoadedFeaturedStickers$59(this.f18284c);
                return;
        }
    }
}
