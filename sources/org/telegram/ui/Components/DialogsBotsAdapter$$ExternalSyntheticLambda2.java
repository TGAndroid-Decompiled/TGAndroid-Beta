package org.telegram.ui.Components;

public final class DialogsBotsAdapter$$ExternalSyntheticLambda2 implements Runnable {
    public final int $r8$classId;
    public final DialogsBotsAdapter f$0;

    public DialogsBotsAdapter$$ExternalSyntheticLambda2(DialogsBotsAdapter dialogsBotsAdapter, int i) {
        this.$r8$classId = i;
        this.f$0 = dialogsBotsAdapter;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.searchMessages(false);
                break;
            default:
                this.f$0.update(true);
                break;
        }
    }
}
