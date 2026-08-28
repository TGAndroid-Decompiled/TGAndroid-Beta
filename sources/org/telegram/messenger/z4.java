package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class z4 implements Runnable {
    public final int f22298a;
    public final ImageLoader.ArtworkLoadTask f22299b;

    public z4(ImageLoader.ArtworkLoadTask artworkLoadTask, int i9) {
        this.f22298a = i9;
        this.f22299b = artworkLoadTask;
    }

    @Override
    public final void run() {
        switch (this.f22298a) {
            case 0:
                this.f22299b.lambda$onCancelled$2();
                return;
            default:
                this.f22299b.lambda$onPostExecute$1();
                return;
        }
    }
}
