package org.telegram.messenger;
public final class z7 implements Runnable {
    public final int f18281a;
    public final MediaDataController f18282b;
    public final boolean f18283c;

    public z7(MediaDataController mediaDataController, boolean z10, int i10) {
        this.f18281a = i10;
        this.f18282b = mediaDataController;
        this.f18283c = z10;
    }

    @Override
    public final void run() {
        switch (this.f18281a) {
            case 0:
                this.f18282b.lambda$loadFeaturedStickers$55(this.f18283c);
                return;
            default:
                this.f18282b.lambda$processLoadedFeaturedStickers$59(this.f18283c);
                return;
        }
    }
}
