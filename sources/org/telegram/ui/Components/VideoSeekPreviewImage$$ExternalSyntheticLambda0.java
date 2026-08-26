package org.telegram.ui.Components;

public final class VideoSeekPreviewImage$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final VideoSeekPreviewImage f$0;

    public VideoSeekPreviewImage$$ExternalSyntheticLambda0(VideoSeekPreviewImage videoSeekPreviewImage, int i) {
        this.$r8$classId = i;
        this.f$0 = videoSeekPreviewImage;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$close$8();
                break;
            case 1:
                this.f$0.lambda$open$6();
                break;
            default:
                this.f$0.lambda$open$4();
                break;
        }
    }
}
