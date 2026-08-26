package org.telegram.ui;

public final class BoostsActivity$$ExternalSyntheticLambda6 implements Runnable {
    public final int $r8$classId;
    public final BoostsActivity f$0;

    public BoostsActivity$$ExternalSyntheticLambda6(BoostsActivity boostsActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = boostsActivity;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$loadUsers$4();
                break;
            case 1:
                this.f$0.lambda$loadUsers$6();
                break;
            case 2:
                this.f$0.lambda$loadUsers$7();
                break;
            case 3:
                this.f$0.lambda$loadUsers$3();
                break;
            default:
                this.f$0.lambda$loadUsers$5();
                break;
        }
    }
}
