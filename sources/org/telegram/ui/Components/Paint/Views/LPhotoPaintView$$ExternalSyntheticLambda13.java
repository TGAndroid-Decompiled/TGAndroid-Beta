package org.telegram.ui.Components.Paint.Views;

public final class LPhotoPaintView$$ExternalSyntheticLambda13 implements Runnable {
    public final int $r8$classId;
    public final LPhotoPaintView f$0;

    public LPhotoPaintView$$ExternalSyntheticLambda13(LPhotoPaintView lPhotoPaintView, int i) {
        this.$r8$classId = i;
        this.f$0 = lPhotoPaintView;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$detectFaces$24();
                break;
            case 1:
                this.f$0.lambda$getThanosEffect$48();
                break;
            case 2:
                this.f$0.lambda$openStickersView$18();
                break;
            case 3:
                this.f$0.lambda$onAddButtonPressed$35();
                break;
            default:
                this.f$0.lambda$createText$13();
                break;
        }
    }
}
