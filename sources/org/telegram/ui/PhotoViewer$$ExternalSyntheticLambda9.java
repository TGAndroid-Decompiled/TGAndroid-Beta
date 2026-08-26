package org.telegram.ui;

public final class PhotoViewer$$ExternalSyntheticLambda9 implements Runnable {
    public final int $r8$classId;
    public final PhotoViewer f$0;

    public PhotoViewer$$ExternalSyntheticLambda9(PhotoViewer photoViewer, int i) {
        this.$r8$classId = i;
        this.f$0 = photoViewer;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.invalidateBlur();
                break;
            case 1:
                this.f$0.lambda$setParentActivity$21();
                break;
            case 2:
                this.f$0.updateActionBarTitlePadding();
                break;
            default:
                this.f$0.applyCaption();
                break;
        }
    }
}
