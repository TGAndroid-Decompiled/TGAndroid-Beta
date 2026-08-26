package org.telegram.ui.Components;

public final class Bulletin$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final Bulletin f$0;

    public Bulletin$$ExternalSyntheticLambda0(Bulletin bulletin, int i) {
        this.$r8$classId = i;
        this.f$0 = bulletin;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.hide();
                break;
            case 1:
                this.f$0.lambda$hide$3();
                break;
            default:
                this.f$0.lambda$hide$5();
                break;
        }
    }
}
