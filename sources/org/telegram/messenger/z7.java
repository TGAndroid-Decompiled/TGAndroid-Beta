package org.telegram.messenger;
public final class z7 implements Runnable {
    public final int f19975a;
    public final MediaDataController f19976b;
    public final boolean f19977c;

    public z7(MediaDataController mediaDataController, boolean z10, int i10) {
        this.f19975a = i10;
        this.f19976b = mediaDataController;
        this.f19977c = z10;
    }

    @Override
    public final void run() {
        switch (this.f19975a) {
            case 0:
                this.f19976b.lambda$loadFeaturedStickers$55(this.f19977c);
                return;
            default:
                this.f19976b.lambda$processLoadedFeaturedStickers$59(this.f19977c);
                return;
        }
    }
}
