package org.telegram.ui.Adapters;

public final class DialogsSearchAdapter$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final DialogsSearchAdapter f$0;
    public final long f$1;

    public DialogsSearchAdapter$$ExternalSyntheticLambda1(DialogsSearchAdapter dialogsSearchAdapter, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = dialogsSearchAdapter;
        this.f$1 = j;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$putRecentSearch$9(this.f$1);
                break;
            default:
                this.f$0.lambda$removeRecentSearch$11(this.f$1);
                break;
        }
    }
}
