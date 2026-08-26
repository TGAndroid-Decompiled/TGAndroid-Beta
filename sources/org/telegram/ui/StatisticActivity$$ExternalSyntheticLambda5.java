package org.telegram.ui;

import java.util.ArrayList;

public final class StatisticActivity$$ExternalSyntheticLambda5 implements Runnable {
    public final int $r8$classId;
    public final StatisticActivity f$0;
    public final ArrayList f$1;

    public StatisticActivity$$ExternalSyntheticLambda5(StatisticActivity statisticActivity, ArrayList arrayList, int i) {
        this.$r8$classId = i;
        this.f$0 = statisticActivity;
        this.f$1 = arrayList;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$loadStatistic$0(this.f$1);
                break;
            default:
                this.f$0.lambda$loadMessages$10(this.f$1);
                break;
        }
    }
}
