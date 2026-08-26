package org.telegram.ui;

public final class VoIPFragment$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final VoIPFragment f$0;

    public VoIPFragment$$ExternalSyntheticLambda1(VoIPFragment voIPFragment, int i) {
        this.$r8$classId = i;
        this.f$0 = voIPFragment;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$checkEmojiLoaded$34();
                break;
            case 1:
                this.f$0.lambda$new$2();
                break;
            case 2:
                this.f$0.lambda$updateViewState$21();
                break;
            case 3:
                this.f$0.lambda$updateViewState$27();
                break;
            case 4:
                this.f$0.lambda$updateViewState$31();
                break;
            case 5:
                this.f$0.lambda$updateViewState$32();
                break;
            case 6:
                this.f$0.lambda$updateViewState$33();
                break;
            case 7:
                this.f$0.lambda$startTransitionFromPiP$19();
                break;
            case 8:
                this.f$0.lambda$updateViewState$24();
                break;
            case 9:
                this.f$0.lambda$createView$14();
                break;
            case 10:
                this.f$0.startWaitingFoHideUi();
                break;
            case 11:
                this.f$0.lambda$runAcceptCallAnimation$16();
                break;
            case 12:
                this.f$0.lambda$onRequestPermissionsResultInternal$41();
                break;
            default:
                this.f$0.lambda$new$1();
                break;
        }
    }
}
