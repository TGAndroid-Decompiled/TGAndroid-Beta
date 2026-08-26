package org.telegram.ui;

public final class LanguageSelectActivity$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final LanguageSelectActivity f$0;

    public LanguageSelectActivity$$ExternalSyntheticLambda0(LanguageSelectActivity languageSelectActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = languageSelectActivity;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onBecomeFullyVisible$9();
                break;
            case 1:
                this.f$0.lambda$createView$0$4$2();
                break;
            default:
                this.f$0.listAdapter.mObservable.notifyChanged();
                break;
        }
    }
}
