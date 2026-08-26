package org.telegram.ui;

public final class DialogsActivity$$ExternalSyntheticLambda75 implements Runnable {
    public final int $r8$classId;
    public final DialogsActivity f$0;

    public DialogsActivity$$ExternalSyntheticLambda75(DialogsActivity dialogsActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = dialogsActivity;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$pinDialog$115();
                break;
            case 1:
                this.f$0.lambda$checkAnimationFinished$103();
                break;
            case 2:
                this.f$0.lambda$createView$5();
                break;
            case 3:
                this.f$0.lambda$showItemOptions$160();
                break;
            case 4:
                this.f$0.lambda$showItemOptions$173();
                break;
            case 5:
                this.f$0.lambda$showItemOptions$161();
                break;
            case 6:
                this.f$0.lambda$showItemOptions$162();
                break;
            case 7:
                this.f$0.lambda$showItemOptions$163();
                break;
            case 8:
                this.f$0.showArchiveHelp();
                break;
            case 9:
                this.f$0.lambda$showItemOptions$165();
                break;
            case 10:
                this.f$0.lambda$showItemOptions$166();
                break;
            case 11:
                this.f$0.lambda$showItemOptions$167();
                break;
            default:
                this.f$0.blur3_InvalidateBlur();
                break;
        }
    }
}
