package org.telegram.ui.Components;

public final class RLottieDiceDrawable$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final RLottieDiceDrawable f$0;

    public RLottieDiceDrawable$$ExternalSyntheticLambda0(RLottieDiceDrawable rLottieDiceDrawable, int i) {
        this.$r8$classId = i;
        this.f$0 = rLottieDiceDrawable;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$setBaseDice$3();
                break;
            default:
                this.f$0.lambda$setDiceNumber$0();
                break;
        }
    }
}
