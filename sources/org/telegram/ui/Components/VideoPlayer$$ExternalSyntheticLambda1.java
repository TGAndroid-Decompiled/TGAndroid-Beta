package org.telegram.ui.Components;

public final class VideoPlayer$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;

    public VideoPlayer$$ExternalSyntheticLambda1(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((VideoPlayer) this.f$0).lambda$onPlayerError$1();
                break;
            case 1:
                ((UnsupportedBlockDrawable) this.f$0).invalidateSelf();
                break;
            case 2:
                ((VideoEditTextureView) this.f$0).lambda$onSurfaceTextureSizeChanged$1();
                break;
            default:
                ((VideoPlayerSeekBar) this.f$0).lambda$onTouch$0();
                break;
        }
    }
}
