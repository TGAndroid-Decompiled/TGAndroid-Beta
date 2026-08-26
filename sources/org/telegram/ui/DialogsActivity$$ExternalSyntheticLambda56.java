package org.telegram.ui;

public final class DialogsActivity$$ExternalSyntheticLambda56 implements Runnable {
    public final int $r8$classId;
    public final DialogsActivity f$0;
    public final long f$1;
    public final boolean f$2;

    public DialogsActivity$$ExternalSyntheticLambda56(DialogsActivity dialogsActivity, long j, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = dialogsActivity;
        this.f$1 = j;
        this.f$2 = z;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$toggleArciveForStory$32(this.f$1, this.f$2);
                break;
            case 1:
                this.f$0.lambda$didSelectResult$130(this.f$1, this.f$2);
                break;
            case 2:
                this.f$0.lambda$toggleArciveForStory$30(this.f$1, this.f$2);
                break;
            default:
                this.f$0.lambda$toggleArciveForStory$31(this.f$1, this.f$2);
                break;
        }
    }
}
