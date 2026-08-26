package org.telegram.ui.Stars;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.Theme;

public final class StarsController$$ExternalSyntheticLambda143 implements RequestDelegate {
    public final int $r8$classId = 1;
    public final StarsController f$0;
    public final Utilities.Callback2 f$1;
    public final Context f$2;
    public final Theme.ResourcesProvider f$3;
    public final long f$4;
    public final String f$5;
    public final TLObject f$6;
    public final TLObject f$7;
    public final long f$8;

    public StarsController$$ExternalSyntheticLambda143(StarsController starsController, Utilities.Callback2 callback2, Context context, Theme.ResourcesProvider resourcesProvider, long j, String str, long j2, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f$0 = starsController;
        this.f$1 = callback2;
        this.f$2 = context;
        this.f$3 = resourcesProvider;
        this.f$4 = j;
        this.f$5 = str;
        this.f$8 = j2;
        this.f$6 = tLObject;
        this.f$7 = tL_textWithEntities;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                StarsController starsController = this.f$0;
                starsController.getClass();
                AndroidUtilities.runOnUIThread(new StarsController$$ExternalSyntheticLambda2(starsController, tLObject, tL_error, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, (TLRPC.TL_payments_paymentFormStarGift) this.f$6, (TL_stars.TL_starGiftUnique) this.f$7, this.f$8));
                break;
            default:
                StarsController starsController2 = this.f$0;
                starsController2.getClass();
                AndroidUtilities.runOnUIThread(new StarsController$$ExternalSyntheticLambda2(starsController2, tLObject, tL_error, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$8, this.f$6, (TLRPC.TL_textWithEntities) this.f$7));
                break;
        }
    }

    public StarsController$$ExternalSyntheticLambda143(StarsController starsController, Utilities.Callback2 callback2, Context context, Theme.ResourcesProvider resourcesProvider, long j, String str, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j2) {
        this.f$0 = starsController;
        this.f$1 = callback2;
        this.f$2 = context;
        this.f$3 = resourcesProvider;
        this.f$4 = j;
        this.f$5 = str;
        this.f$6 = tL_payments_paymentFormStarGift;
        this.f$7 = tL_starGiftUnique;
        this.f$8 = j2;
    }
}
