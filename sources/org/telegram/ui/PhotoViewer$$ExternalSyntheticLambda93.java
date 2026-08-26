package org.telegram.ui;

public final class PhotoViewer$$ExternalSyntheticLambda93 implements Runnable {
    public final int $r8$classId;
    public final PhotoViewer f$0;

    public PhotoViewer$$ExternalSyntheticLambda93(PhotoViewer photoViewer, int i) {
        this.$r8$classId = i;
        this.f$0 = photoViewer;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.limitBulletin = null;
                break;
            case 1:
                PhotoViewer photoViewer = this.f$0;
                photoViewer.cropTransform.setViewTransform(photoViewer.previousHasTransform, photoViewer.previousCropPx, photoViewer.previousCropPy, photoViewer.previousCropRotation, photoViewer.previousCropOrientation, photoViewer.previousCropScale, photoViewer.scale1(true), photoViewer.scale1(true), photoViewer.previousCropPw, photoViewer.previousCropPh, 0.0f, 0.0f, photoViewer.previousCropMirrored);
                photoViewer.switchToEditMode(0);
                break;
            case 2:
                this.f$0.closePhoto(true, false);
                break;
            default:
                PhotoViewer.access$16700(this.f$0);
                break;
        }
    }
}
