package org.telegram.ui;

public final class SecretMediaViewer$$ExternalSyntheticLambda5 implements Runnable {
    public final int $r8$classId;
    public final SecretMediaViewer f$0;
    public final PhotoViewer.PlaceProviderObject f$1;

    public SecretMediaViewer$$ExternalSyntheticLambda5(SecretMediaViewer secretMediaViewer, PhotoViewer.PlaceProviderObject placeProviderObject, int i) {
        this.$r8$classId = i;
        this.f$0 = secretMediaViewer;
        this.f$1 = placeProviderObject;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$openMedia$5(this.f$1);
                break;
            case 1:
                this.f$0.lambda$closePhoto$7(this.f$1);
                break;
            default:
                this.f$0.lambda$closePhoto$8(this.f$1);
                break;
        }
    }
}
