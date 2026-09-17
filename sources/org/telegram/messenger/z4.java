package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class z4 implements Runnable {
    public final int f19831a;
    public final ImageLoader.ArtworkLoadTask f19832b;

    public z4(ImageLoader.ArtworkLoadTask artworkLoadTask, int i10) {
        this.f19831a = i10;
        this.f19832b = artworkLoadTask;
    }

    @Override
    public final void run() {
        switch (this.f19831a) {
            case 0:
                this.f19832b.lambda$onCancelled$2();
                return;
            default:
                this.f19832b.lambda$onPostExecute$1();
                return;
        }
    }
}
