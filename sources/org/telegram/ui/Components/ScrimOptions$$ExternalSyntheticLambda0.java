package org.telegram.ui.Components;

public final class ScrimOptions$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final ScrimOptions f$0;

    public ScrimOptions$$ExternalSyntheticLambda0(ScrimOptions scrimOptions, int i) {
        this.$r8$classId = i;
        this.f$0 = scrimOptions;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$dismissFast$4();
                break;
            case 1:
                this.f$0.lambda$dismissFast$3();
                break;
            case 2:
                this.f$0.lambda$dismiss$1();
                break;
            default:
                this.f$0.lambda$dismiss$2();
                break;
        }
    }
}
