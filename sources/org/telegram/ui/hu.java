package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stories;
public final class hu implements Utilities.Callback {
    public final int f33915a;
    public final long f33916b;
    public final Object f33917c;
    public final Object d;

    public hu(Object obj, Object obj2, long j3, int i10) {
        this.f33915a = i10;
        this.f33917c = obj;
        this.d = obj2;
        this.f33916b = j3;
    }

    @Override
    public final void run(Object obj) {
        boolean z10;
        int i10;
        switch (this.f33915a) {
            case 0:
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) this.f33917c;
                Long l4 = (Long) obj;
                AndroidUtilities.cancelRunOnUIThread((gu) this.d);
                if (!dataSettingsActivity.W && System.currentTimeMillis() - this.f33916b <= 120) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                dataSettingsActivity.W = z10;
                dataSettingsActivity.Y = l4.longValue();
                dataSettingsActivity.X = false;
                if (dataSettingsActivity.f30750a != null && (i10 = dataSettingsActivity.f30756s) >= 0) {
                    dataSettingsActivity.n0(i10);
                    return;
                }
                return;
            case 1:
                Runnable runnable = (Runnable) obj;
                ((org.telegram.ui.ActionBar.b2) this.d).q(150L);
                ry ryVar = ((qx) this.f33917c).f36626b;
                Boolean bool = ryVar.G.bot_participant;
                if (bool != null && bool.booleanValue()) {
                    ryVar.getMessagesController().addUserToChat(this.f33916b, ryVar.getMessagesController().getUser(Long.valueOf(ryVar.H)), 0, null, ryVar, false, runnable, new lf(8, runnable));
                    return;
                }
                runnable.run();
                return;
            case 2:
                ProfileActivity.k0((ProfileActivity) this.f33917c, (Context) this.d, this.f33916b, (TL_payments.connectedBotStarRef) obj);
                return;
            default:
                yh.y3 y3Var = (yh.y3) this.f33917c;
                MessagesController messagesController = (MessagesController) this.d;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < messagesController.channelEmojiStatusLevelMin) {
                    ChannelBoostsController boostsController = messagesController.getBoostsController();
                    long j3 = this.f33916b;
                    boostsController.userCanBoostChannel(j3, tL_premium_boostsStatus, new ai.l(y3Var, tL_premium_boostsStatus, j3, messagesController, 10));
                    return;
                }
                y3Var.f47964j0.setLoading(false);
                y3Var.r2(true);
                return;
        }
    }
}
