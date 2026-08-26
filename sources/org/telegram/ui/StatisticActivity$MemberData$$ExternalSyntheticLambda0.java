package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;

public final class StatisticActivity$MemberData$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final StatisticActivity.MemberData f$0;
    public final StatisticActivity f$1;
    public final AlertDialog[] f$2;
    public final TLRPC.TL_error f$3;
    public final TLObject f$4;
    public final TLRPC.ChatFull f$5;

    public StatisticActivity$MemberData$$ExternalSyntheticLambda0(StatisticActivity.MemberData memberData, StatisticActivity statisticActivity, AlertDialog[] alertDialogArr, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.ChatFull chatFull, int i) {
        this.$r8$classId = i;
        this.f$0 = memberData;
        this.f$1 = statisticActivity;
        this.f$2 = alertDialogArr;
        this.f$3 = tL_error;
        this.f$4 = tLObject;
        this.f$5 = chatFull;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onLongClick$0(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5);
                break;
            default:
                this.f$0.lambda$onLongClick$2(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5);
                break;
        }
    }
}
