package org.telegram.ui.Components;

public final class RLottieDiceDrawable$$ExternalSyntheticLambda2 implements Runnable {
    public final int $r8$classId;
    public final RLottieDiceDrawable f$0;
    public final String f$1;

    public RLottieDiceDrawable$$ExternalSyntheticLambda2(RLottieDiceDrawable rLottieDiceDrawable, String str, int i) {
        this.$r8$classId = i;
        this.f$0 = rLottieDiceDrawable;
        this.f$1 = str;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$setDiceNumber$2(this.f$1);
                break;
            default:
                this.f$0.lambda$setBaseDice$4(this.f$1);
                break;
        }
    }
}
