package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class z4 implements Runnable {
    public final int f19804a;
    public final ImageLoader.ArtworkLoadTask f19805b;

    public z4(ImageLoader.ArtworkLoadTask artworkLoadTask, int i10) {
        this.f19804a = i10;
        this.f19805b = artworkLoadTask;
    }

    @Override
    public final void run() {
        switch (this.f19804a) {
            case 0:
                this.f19805b.lambda$onCancelled$2();
                return;
            default:
                this.f19805b.lambda$onPostExecute$1();
                return;
        }
    }
}
