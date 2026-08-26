package org.telegram.ui.Adapters;

public final class DialogsAdapter$$ExternalSyntheticLambda2 implements Runnable {
    public final int $r8$classId;
    public final DialogsAdapter f$0;

    public DialogsAdapter$$ExternalSyntheticLambda2(DialogsAdapter dialogsAdapter, int i) {
        this.$r8$classId = i;
        this.f$0 = dialogsAdapter;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onBindViewHolder$4();
                break;
            default:
                this.f$0.onArchiveSettingsClick();
                break;
        }
    }
}
