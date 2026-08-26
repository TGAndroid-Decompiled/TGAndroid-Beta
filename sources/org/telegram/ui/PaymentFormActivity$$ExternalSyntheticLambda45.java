package org.telegram.ui;

import android.app.Activity;
import android.content.DialogInterface;
import java.util.ArrayList;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Gifts.AuctionJoinSheet$$ExternalSyntheticLambda0;
import org.telegram.ui.Stories.DarkThemeResourceProvider;

public final class PaymentFormActivity$$ExternalSyntheticLambda45 implements DialogInterface.OnClickListener {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final Object f$3;

    public PaymentFormActivity$$ExternalSyntheticLambda45(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.$r8$classId) {
            case 0:
                ((PaymentFormActivity) this.f$0).lambda$showChoosePaymentMethod$31((Runnable) this.f$1, (ArrayList) this.f$2, (ArrayList) this.f$3, i);
                break;
            default:
                int i2 = ((int[]) this.f$0)[i];
                AuctionJoinSheet$$ExternalSyntheticLambda0 auctionJoinSheet$$ExternalSyntheticLambda0 = (AuctionJoinSheet$$ExternalSyntheticLambda0) this.f$3;
                if (i2 != 100) {
                    auctionJoinSheet$$ExternalSyntheticLambda0.run(Integer.valueOf(i2), "");
                } else {
                    new AlertsCreator.AnonymousClass57((Activity) this.f$1, i2, (DarkThemeResourceProvider) this.f$2, auctionJoinSheet$$ExternalSyntheticLambda0).show();
                }
                break;
        }
    }
}
