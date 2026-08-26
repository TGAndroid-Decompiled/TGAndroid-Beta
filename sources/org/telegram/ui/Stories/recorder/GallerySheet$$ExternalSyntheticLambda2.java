package org.telegram.ui.Stories.recorder;

public final class GallerySheet$$ExternalSyntheticLambda2 implements Runnable {
    public final int $r8$classId;
    public final GallerySheet f$0;

    public GallerySheet$$ExternalSyntheticLambda2(GallerySheet gallerySheet, int i) {
        this.$r8$classId = i;
        this.f$0 = gallerySheet;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$dismiss$2();
                break;
            default:
                this.f$0.lambda$new$0$16();
                break;
        }
    }
}
