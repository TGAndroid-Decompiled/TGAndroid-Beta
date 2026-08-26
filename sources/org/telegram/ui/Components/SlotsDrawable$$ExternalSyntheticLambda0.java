package org.telegram.ui.Components;

public final class SlotsDrawable$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final SlotsDrawable f$0;

    public SlotsDrawable$$ExternalSyntheticLambda0(SlotsDrawable slotsDrawable, int i) {
        this.$r8$classId = i;
        this.f$0 = slotsDrawable;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$setDiceNumber$5();
                break;
            case 1:
                this.f$0.lambda$setDiceNumber$7();
                break;
            case 2:
                this.f$0.lambda$setBaseDice$0();
                break;
            default:
                this.f$0.lambda$setBaseDice$2();
                break;
        }
    }
}
