package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stories;
public final class pu implements Utilities.Callback {
    public final int f39012a;
    public final long f39013b;
    public final Object f39014c;
    public final Object d;

    public pu(Object obj, Object obj2, long j10, int i10) {
        this.f39012a = i10;
        this.f39014c = obj;
        this.d = obj2;
        this.f39013b = j10;
    }

    @Override
    public final void run(Object obj) {
        boolean z10;
        int i10;
        switch (this.f39012a) {
            case 0:
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) this.f39014c;
                Long l4 = (Long) obj;
                AndroidUtilities.cancelRunOnUIThread((ou) this.d);
                if (!dataSettingsActivity.W && System.currentTimeMillis() - this.f39013b <= 120) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                dataSettingsActivity.W = z10;
                dataSettingsActivity.Y = l4.longValue();
                dataSettingsActivity.X = false;
                if (dataSettingsActivity.f31770a != null && (i10 = dataSettingsActivity.f31776s) >= 0) {
                    dataSettingsActivity.n0(i10);
                    return;
                }
                return;
            case 1:
                Runnable runnable = (Runnable) obj;
                ((org.telegram.ui.ActionBar.a2) this.d).q(150L);
                yy yyVar = ((xx) this.f39014c).f41675b;
                Boolean bool = yyVar.G.bot_participant;
                if (bool != null && bool.booleanValue()) {
                    yyVar.getMessagesController().addUserToChat(this.f39013b, yyVar.getMessagesController().getUser(Long.valueOf(yyVar.H)), 0, null, yyVar, false, runnable, new tf(8, runnable));
                    return;
                }
                runnable.run();
                return;
            case 2:
                ProfileActivity.k0((ProfileActivity) this.f39014c, (Context) this.d, this.f39013b, (TL_payments.connectedBotStarRef) obj);
                return;
            default:
                zh.r3 r3Var = (zh.r3) this.f39014c;
                MessagesController messagesController = (MessagesController) this.d;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < messagesController.channelEmojiStatusLevelMin) {
                    ChannelBoostsController boostsController = messagesController.getBoostsController();
                    long j10 = this.f39013b;
                    boostsController.userCanBoostChannel(j10, tL_premium_boostsStatus, new bi.i(r3Var, tL_premium_boostsStatus, j10, messagesController, 7));
                    return;
                }
                r3Var.f51089k0.setLoading(false);
                r3Var.t2(true);
                return;
        }
    }
}
