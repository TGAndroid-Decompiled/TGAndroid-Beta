package org.telegram.ui.Components;

public final class DialogsBotsAdapter$PopularBots$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final DialogsBotsAdapter.PopularBots f$0;

    public DialogsBotsAdapter$PopularBots$$ExternalSyntheticLambda1(DialogsBotsAdapter.PopularBots popularBots, int i) {
        this.$r8$classId = i;
        this.f$0 = popularBots;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$saveCache$2();
                break;
            default:
                this.f$0.lambda$load$4();
                break;
        }
    }
}
