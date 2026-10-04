package org.telegram.messenger;
public final class z7 implements Runnable {
    public final int f19985a;
    public final MediaDataController f19986b;
    public final boolean f19987c;

    public z7(MediaDataController mediaDataController, boolean z10, int i10) {
        this.f19985a = i10;
        this.f19986b = mediaDataController;
        this.f19987c = z10;
    }

    @Override
    public final void run() {
        switch (this.f19985a) {
            case 0:
                this.f19986b.lambda$loadFeaturedStickers$55(this.f19987c);
                return;
            default:
                this.f19986b.lambda$processLoadedFeaturedStickers$59(this.f19987c);
                return;
        }
    }
}
