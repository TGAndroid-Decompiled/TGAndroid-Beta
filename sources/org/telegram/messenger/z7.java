package org.telegram.messenger;
public final class z7 implements Runnable {
    public final int f18280a;
    public final MediaDataController f18281b;
    public final boolean f18282c;

    public z7(MediaDataController mediaDataController, boolean z10, int i10) {
        this.f18280a = i10;
        this.f18281b = mediaDataController;
        this.f18282c = z10;
    }

    @Override
    public final void run() {
        switch (this.f18280a) {
            case 0:
                this.f18281b.lambda$loadFeaturedStickers$55(this.f18282c);
                return;
            default:
                this.f18281b.lambda$processLoadedFeaturedStickers$59(this.f18282c);
                return;
        }
    }
}
