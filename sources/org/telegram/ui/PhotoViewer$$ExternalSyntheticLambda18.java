package org.telegram.ui;

public final class PhotoViewer$$ExternalSyntheticLambda18 implements Runnable {
    public final int $r8$classId;
    public final PhotoViewer f$0;
    public final PhotoViewer.PlaceProviderObject f$1;

    public PhotoViewer$$ExternalSyntheticLambda18(PhotoViewer photoViewer, PhotoViewer.PlaceProviderObject placeProviderObject, int i) {
        this.$r8$classId = i;
        this.f$0 = photoViewer;
        this.f$1 = placeProviderObject;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$closePhoto$148(this.f$1);
                break;
            case 1:
                this.f$0.lambda$onPhotoClosed$153(this.f$1);
                break;
            default:
                this.f$0.lambda$closePhoto$151(this.f$1);
                break;
        }
    }
}
