package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stories;
public final class ku implements Utilities.Callback {
    public final int f38093a;
    public final long f38094b;
    public final Object f38095c;
    public final Object d;

    public ku(Object obj, Object obj2, long j3, int i10) {
        this.f38093a = i10;
        this.f38095c = obj;
        this.d = obj2;
        this.f38094b = j3;
    }

    @Override
    public final void run(Object obj) {
        boolean z10;
        int i10;
        switch (this.f38093a) {
            case 0:
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) this.f38095c;
                Long l4 = (Long) obj;
                AndroidUtilities.cancelRunOnUIThread((ju) this.d);
                if (!dataSettingsActivity.W && System.currentTimeMillis() - this.f38094b <= 120) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                dataSettingsActivity.W = z10;
                dataSettingsActivity.Y = l4.longValue();
                dataSettingsActivity.X = false;
                if (dataSettingsActivity.f33735a != null && (i10 = dataSettingsActivity.f33742s) >= 0) {
                    dataSettingsActivity.n0(i10);
                    return;
                }
                return;
            case 1:
                Runnable runnable = (Runnable) obj;
                ((org.telegram.ui.ActionBar.b2) this.d).q(150L);
                uy uyVar = ((rx) this.f38095c).f40303b;
                Boolean bool = uyVar.G.bot_participant;
                if (bool != null && bool.booleanValue()) {
                    uyVar.getMessagesController().addUserToChat(this.f38094b, uyVar.getMessagesController().getUser(Long.valueOf(uyVar.H)), 0, null, uyVar, false, runnable, new nf(6, runnable));
                    return;
                }
                runnable.run();
                return;
            case 2:
                ProfileActivity.k0((ProfileActivity) this.f38095c, (Context) this.d, this.f38094b, (TL_payments.connectedBotStarRef) obj);
                return;
            default:
                yh.x3 x3Var = (yh.x3) this.f38095c;
                MessagesController messagesController = (MessagesController) this.d;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < messagesController.channelEmojiStatusLevelMin) {
                    ChannelBoostsController boostsController = messagesController.getBoostsController();
                    long j3 = this.f38094b;
                    boostsController.userCanBoostChannel(j3, tL_premium_boostsStatus, new ai.l(x3Var, tL_premium_boostsStatus, j3, messagesController, 10));
                    return;
                }
                x3Var.f52230j0.setLoading(false);
                x3Var.r2(true);
                return;
        }
    }
}
