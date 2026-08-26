package org.telegram.ui;

public final class DialogsActivity$14$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final DialogsActivity.ViewPage f$0;

    public DialogsActivity$14$$ExternalSyntheticLambda1(DialogsActivity.ViewPage viewPage, int i) {
        this.$r8$classId = i;
        this.f$0 = viewPage;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                DialogsActivity.AnonymousClass14.lambda$onLayoutChildren$1(this.f$0);
                break;
            case 1:
                this.f$0.lambda$new$0();
                break;
            default:
                this.f$0.lambda$new$1();
                break;
        }
    }
}
