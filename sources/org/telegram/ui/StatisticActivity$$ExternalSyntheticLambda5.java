package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class StatisticActivity$$ExternalSyntheticLambda5 implements RequestDelegate {
    public final int $r8$classId;
    public final StatisticActivity f$0;

    public StatisticActivity$$ExternalSyntheticLambda5(StatisticActivity statisticActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = statisticActivity;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$loadStatistic$3(tLObject);
                break;
            default:
                this.f$0.lambda$loadMessages$11(tLObject);
                break;
        }
    }
}
