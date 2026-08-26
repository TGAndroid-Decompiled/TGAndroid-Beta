package org.telegram.ui.Components;

public final class AiButtonDrawable$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final AiButtonDrawable f$0;

    public AiButtonDrawable$$ExternalSyntheticLambda0(AiButtonDrawable aiButtonDrawable, int i) {
        this.$r8$classId = i;
        this.f$0 = aiButtonDrawable;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.invalidateSelf();
                break;
            default:
                this.f$0.animate();
                break;
        }
    }
}
