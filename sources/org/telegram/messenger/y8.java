package org.telegram.messenger;
public final class y8 implements Runnable {
    public final int f17042a;
    public final MediaDataController f17043b;
    public final boolean f17044c;
    public final int d;

    public y8(MediaDataController mediaDataController, boolean z10, int i10, int i11) {
        this.f17042a = i11;
        this.f17043b = mediaDataController;
        this.f17044c = z10;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f17042a) {
            case 0:
                this.f17043b.lambda$loadRecents$49(this.f17044c, this.d);
                return;
            case 1:
                this.f17043b.lambda$processLoadedFeaturedStickers$62(this.f17044c, this.d);
                return;
            default:
                this.f17043b.lambda$loadFeaturedStickers$56(this.f17044c, this.d);
                return;
        }
    }
}
