package org.telegram.ui.Adapters;

public final class DialogsSearchAdapter$$ExternalSyntheticLambda18 implements Runnable {
    public final int $r8$classId;
    public final DialogsSearchAdapter f$0;
    public final String f$1;
    public final int f$2;
    public final String f$3;

    public DialogsSearchAdapter$$ExternalSyntheticLambda18(DialogsSearchAdapter dialogsSearchAdapter, int i, String str, String str2) {
        this.$r8$classId = 2;
        this.f$0 = dialogsSearchAdapter;
        this.f$2 = i;
        this.f$1 = str;
        this.f$3 = str2;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$searchDialogs$19(this.f$1, this.f$2, this.f$3);
                break;
            case 1:
                this.f$0.lambda$searchDialogsInternal$13(this.f$1, this.f$2, this.f$3);
                break;
            default:
                this.f$0.lambda$searchDialogs$18(this.f$2, this.f$1, this.f$3);
                break;
        }
    }

    public DialogsSearchAdapter$$ExternalSyntheticLambda18(DialogsSearchAdapter dialogsSearchAdapter, String str, int i, String str2, int i2) {
        this.$r8$classId = i2;
        this.f$0 = dialogsSearchAdapter;
        this.f$1 = str;
        this.f$2 = i;
        this.f$3 = str2;
    }
}
