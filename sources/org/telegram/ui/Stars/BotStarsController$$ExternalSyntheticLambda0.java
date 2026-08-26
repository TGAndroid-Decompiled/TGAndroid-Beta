package org.telegram.ui.Stars;

import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class BotStarsController$$ExternalSyntheticLambda0 implements RequestDelegate {
    public final int $r8$classId;
    public final BotStarsController f$0;
    public final long f$1;

    public BotStarsController$$ExternalSyntheticLambda0(BotStarsController botStarsController, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = botStarsController;
        this.f$1 = j;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                final BotStarsController botStarsController = this.f$0;
                botStarsController.getClass();
                final long j = this.f$1;
                final int i = 1;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        long j2 = j;
                        TLObject tLObject2 = tLObject;
                        BotStarsController botStarsController2 = botStarsController;
                        int i2 = i;
                        botStarsController2.getClass();
                        switch (i2) {
                            case 0:
                                boolean z = tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats;
                                HashMap map = botStarsController2.tonStats;
                                if (z) {
                                    map.put(Long.valueOf(j2), (TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                } else {
                                    map.put(Long.valueOf(j2), null);
                                }
                                botStarsController2.lastLoadedTonStats.put(Long.valueOf(j2), Long.valueOf(System.currentTimeMillis()));
                                NotificationCenter.getInstance(botStarsController2.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.botStarsUpdated, Long.valueOf(j2));
                                break;
                            default:
                                boolean z2 = tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats;
                                HashMap map2 = botStarsController2.botStarsStats;
                                if (z2) {
                                    map2.put(Long.valueOf(j2), (TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                } else {
                                    map2.put(Long.valueOf(j2), null);
                                }
                                botStarsController2.lastLoadedBotStarsStats.put(Long.valueOf(j2), Long.valueOf(System.currentTimeMillis()));
                                NotificationCenter.getInstance(botStarsController2.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.botStarsUpdated, Long.valueOf(j2));
                                break;
                        }
                    }
                });
                break;
            default:
                final BotStarsController botStarsController2 = this.f$0;
                botStarsController2.getClass();
                final long j2 = this.f$1;
                final int i2 = 0;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        long j3 = j2;
                        TLObject tLObject2 = tLObject;
                        BotStarsController botStarsController3 = botStarsController2;
                        int i3 = i2;
                        botStarsController3.getClass();
                        switch (i3) {
                            case 0:
                                boolean z = tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats;
                                HashMap map = botStarsController3.tonStats;
                                if (z) {
                                    map.put(Long.valueOf(j3), (TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                } else {
                                    map.put(Long.valueOf(j3), null);
                                }
                                botStarsController3.lastLoadedTonStats.put(Long.valueOf(j3), Long.valueOf(System.currentTimeMillis()));
                                NotificationCenter.getInstance(botStarsController3.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.botStarsUpdated, Long.valueOf(j3));
                                break;
                            default:
                                boolean z2 = tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats;
                                HashMap map2 = botStarsController3.botStarsStats;
                                if (z2) {
                                    map2.put(Long.valueOf(j3), (TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                } else {
                                    map2.put(Long.valueOf(j3), null);
                                }
                                botStarsController3.lastLoadedBotStarsStats.put(Long.valueOf(j3), Long.valueOf(System.currentTimeMillis()));
                                NotificationCenter.getInstance(botStarsController3.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.botStarsUpdated, Long.valueOf(j3));
                                break;
                        }
                    }
                });
                break;
        }
    }
}
