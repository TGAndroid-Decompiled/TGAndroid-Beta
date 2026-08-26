package org.telegram.ui.Components;

public final class DeleteMessagesBottomSheet$$ExternalSyntheticLambda11 implements Runnable {
    public final int $r8$classId;
    public final DeleteMessagesBottomSheet f$0;

    public DeleteMessagesBottomSheet$$ExternalSyntheticLambda11(DeleteMessagesBottomSheet deleteMessagesBottomSheet, int i) {
        this.$r8$classId = i;
        this.f$0 = deleteMessagesBottomSheet;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$fillItems$13();
                break;
            default:
                this.f$0.lambda$proceed$26();
                break;
        }
    }
}
