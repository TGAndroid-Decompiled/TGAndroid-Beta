package org.telegram.ui.Adapters;

public final class DialogsSearchAdapter$$ExternalSyntheticLambda5 implements Runnable {
    public final int $r8$classId;
    public final DialogsSearchAdapter f$0;

    public DialogsSearchAdapter$$ExternalSyntheticLambda5(DialogsSearchAdapter dialogsSearchAdapter, int i) {
        this.$r8$classId = i;
        this.f$0 = dialogsSearchAdapter;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onCreateViewHolder$25();
                break;
            default:
                this.f$0.lambda$searchDialogsInternal$12();
                break;
        }
    }
}
