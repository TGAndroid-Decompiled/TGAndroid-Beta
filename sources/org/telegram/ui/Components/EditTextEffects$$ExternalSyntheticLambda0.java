package org.telegram.ui.Components;

public final class EditTextEffects$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final EditTextEffects f$0;

    public EditTextEffects$$ExternalSyntheticLambda0(EditTextEffects editTextEffects, int i) {
        this.$r8$classId = i;
        this.f$0 = editTextEffects;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$new$0();
                break;
            case 1:
                this.f$0.lambda$new$1();
                break;
            case 2:
                this.f$0.lambda$onSpoilerClicked$3();
                break;
            case 3:
                this.f$0.lambda$onSpoilerClicked$4();
                break;
            default:
                this.f$0.lambda$new$2();
                break;
        }
    }
}
