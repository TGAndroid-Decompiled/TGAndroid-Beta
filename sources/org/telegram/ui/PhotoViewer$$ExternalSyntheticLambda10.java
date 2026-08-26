package org.telegram.ui;

public final class PhotoViewer$$ExternalSyntheticLambda10 implements Runnable {
    public final int $r8$classId;
    public final PhotoViewer f$0;

    public PhotoViewer$$ExternalSyntheticLambda10(PhotoViewer photoViewer, int i) {
        this.$r8$classId = i;
        this.f$0 = photoViewer;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.applyCurrentEditMode();
                break;
            case 1:
                PhotoViewer.access$16700(this.f$0);
                break;
            case 2:
                this.f$0.lambda$onDraw$155();
                break;
            case 3:
                this.f$0.lambda$onDraw$156();
                break;
            case 4:
                this.f$0.lambda$onDraw$157();
                break;
            case 5:
                this.f$0.lambda$closePaintMode$124();
                break;
            case 6:
                this.f$0.lambda$setParentActivity$61();
                break;
            case 7:
                this.f$0.lambda$setParentActivity$62();
                break;
            case 8:
                this.f$0.replacePressed();
                break;
            case 9:
                this.f$0.showScheduleDatePickerDialog();
                break;
            case 10:
                this.f$0.lambda$setParentActivity$63();
                break;
            case 11:
                this.f$0.pipInvalidateAvailability();
                break;
            case 12:
                this.f$0.lambda$setParentActivity$51();
                break;
            case 13:
                this.f$0.lambda$new$0();
                break;
            case 14:
                this.f$0.onUserLeaveHint();
                break;
            case 15:
                this.f$0.lambda$new$5();
                break;
            case 16:
                this.f$0.onLongPress();
                break;
            case 17:
                this.f$0.lambda$setParentActivity$76();
                break;
            case 18:
                this.f$0.lambda$createPaintView$120();
                break;
            case 19:
                this.f$0.lambda$createPaintView$121();
                break;
            case 20:
                this.f$0.lambda$setImageIndex$137();
                break;
            case 21:
                this.f$0.lambda$setParentActivity$22();
                break;
            case 22:
                this.f$0.lambda$setParentActivity$23();
                break;
            case 23:
                this.f$0.lambda$showCaptionLimitBulletin$83();
                break;
            case 24:
                this.f$0.lambda$showCaptionLimitBulletin$84();
                break;
            case 25:
                this.f$0.lambda$setParentActivity$73();
                break;
            case 26:
                this.f$0.lambda$setParentActivity$29();
                break;
            case 27:
                this.f$0.lambda$setParentActivity$30();
                break;
            case 28:
                this.f$0.lambda$sendPressed$89();
                break;
            default:
                this.f$0.updateQualityItems();
                break;
        }
    }
}
