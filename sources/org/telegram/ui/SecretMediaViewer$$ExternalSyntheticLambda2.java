package org.telegram.ui;

public final class SecretMediaViewer$$ExternalSyntheticLambda2 implements Runnable {
    public final int $r8$classId;
    public final SecretMediaViewer f$0;

    public SecretMediaViewer$$ExternalSyntheticLambda2(SecretMediaViewer secretMediaViewer, int i) {
        this.$r8$classId = i;
        this.f$0 = secretMediaViewer;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onPhotoClosed$9();
                break;
            case 1:
                this.f$0.lambda$new$0();
                break;
            default:
                this.f$0.lambda$new$6();
                break;
        }
    }
}
