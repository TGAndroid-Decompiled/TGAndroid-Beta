package org.telegram.ui.Stars;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.bots.ChannelAffiliateProgramsFragment;

public final class StarsIntroActivity$$ExternalSyntheticLambda38 implements Utilities.Callback {
    public final int $r8$classId;
    public final Object f$0;
    public final Context f$1;
    public final int f$2;
    public final long f$3;
    public final Theme.ResourcesProvider f$4;

    public StarsIntroActivity$$ExternalSyntheticLambda38(Object obj, Context context, int i, long j, Theme.ResourcesProvider resourcesProvider, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = context;
        this.f$2 = i;
        this.f$3 = j;
        this.f$4 = resourcesProvider;
    }

    @Override
    public final void run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                ((BottomSheet[]) this.f$0)[0].lambda$showGiftOfferSheet$15();
                ChannelAffiliateProgramsFragment.showShareAffiliateAlert(this.f$1, this.f$2, (TL_payments.connectedBotStarRef) obj, this.f$3, this.f$4);
                break;
            case 1:
                final TLRPC.UserFull userFull = (TLRPC.UserFull) obj;
                final long j = this.f$3;
                final Theme.ResourcesProvider resourcesProvider = this.f$4;
                final BottomSheet bottomSheet = (BottomSheet) this.f$0;
                final Context context = this.f$1;
                final int i = this.f$2;
                final int i2 = 0;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i2) {
                            case 0:
                                TLRPC.UserFull userFull2 = userFull;
                                if (userFull2 != null && userFull2.starref_program != null) {
                                    bottomSheet.lambda$showGiftOfferSheet$15();
                                    ChannelAffiliateProgramsFragment.showConnectAffiliateAlert(context, i, userFull2.starref_program, j, resourcesProvider, true);
                                    break;
                                }
                                break;
                            default:
                                TLRPC.UserFull userFull3 = userFull;
                                if (userFull3 != null && userFull3.starref_program != null) {
                                    bottomSheet.lambda$showGiftOfferSheet$15();
                                    ChannelAffiliateProgramsFragment.showConnectAffiliateAlert(context, i, userFull3.starref_program, j, resourcesProvider, true);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final TLRPC.UserFull userFull2 = (TLRPC.UserFull) obj;
                final BottomSheet bottomSheet2 = (BottomSheet) this.f$0;
                final long j2 = this.f$3;
                final Theme.ResourcesProvider resourcesProvider2 = this.f$4;
                final Context context2 = this.f$1;
                final int i3 = this.f$2;
                final int i4 = 1;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i4) {
                            case 0:
                                TLRPC.UserFull userFull3 = userFull2;
                                if (userFull3 != null && userFull3.starref_program != null) {
                                    bottomSheet2.lambda$showGiftOfferSheet$15();
                                    ChannelAffiliateProgramsFragment.showConnectAffiliateAlert(context2, i3, userFull3.starref_program, j2, resourcesProvider2, true);
                                    break;
                                }
                                break;
                            default:
                                TLRPC.UserFull userFull4 = userFull2;
                                if (userFull4 != null && userFull4.starref_program != null) {
                                    bottomSheet2.lambda$showGiftOfferSheet$15();
                                    ChannelAffiliateProgramsFragment.showConnectAffiliateAlert(context2, i3, userFull4.starref_program, j2, resourcesProvider2, true);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
        }
    }
}
