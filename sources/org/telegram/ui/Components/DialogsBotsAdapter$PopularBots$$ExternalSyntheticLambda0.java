package org.telegram.ui.Components;

import java.util.ArrayList;

public final class DialogsBotsAdapter$PopularBots$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final DialogsBotsAdapter.PopularBots f$0;

    public DialogsBotsAdapter$PopularBots$$ExternalSyntheticLambda0(DialogsBotsAdapter.PopularBots popularBots, int i) {
        this.$r8$classId = i;
        this.f$0 = popularBots;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                DialogsBotsAdapter.PopularBots popularBots = this.f$0;
                popularBots.loading = false;
                popularBots.whenUpdated.run();
                ArrayList arrayList = popularBots.bots;
                if (arrayList.isEmpty() || System.currentTimeMillis() - popularBots.cacheTime > 3600000) {
                    arrayList.clear();
                    popularBots.endReached = false;
                    popularBots.lastOffset = null;
                    popularBots.load();
                }
                break;
            default:
                this.f$0.savingCache = false;
                break;
        }
    }
}
