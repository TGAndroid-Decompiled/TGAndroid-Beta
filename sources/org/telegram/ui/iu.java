package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stories;
public final class iu implements Utilities.Callback {
    public final int f38815a;
    public final long f38816b;
    public final Object f38817c;
    public final Object d;

    public iu(Object obj, Object obj2, long j3, int i10) {
        this.f38815a = i10;
        this.f38817c = obj;
        this.d = obj2;
        this.f38816b = j3;
    }

    @Override
    public final void run(Object obj) {
        boolean z10;
        int i10;
        switch (this.f38815a) {
            case 0:
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) this.f38817c;
                Long l4 = (Long) obj;
                AndroidUtilities.cancelRunOnUIThread((hu) this.d);
                if (!dataSettingsActivity.W && System.currentTimeMillis() - this.f38816b <= 120) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                dataSettingsActivity.W = z10;
                dataSettingsActivity.Y = l4.longValue();
                dataSettingsActivity.X = false;
                if (dataSettingsActivity.f33800a != null && (i10 = dataSettingsActivity.f33807s) >= 0) {
                    dataSettingsActivity.n0(i10);
                    return;
                }
                return;
            case 1:
                Runnable runnable = (Runnable) obj;
                ((org.telegram.ui.ActionBar.a2) this.d).q(150L);
                sy syVar = ((rx) this.f38817c).f41558b;
                Boolean bool = syVar.G.bot_participant;
                if (bool != null && bool.booleanValue()) {
                    syVar.getMessagesController().addUserToChat(this.f38816b, syVar.getMessagesController().getUser(Long.valueOf(syVar.H)), 0, null, syVar, false, runnable, new nf(8, runnable));
                    return;
                }
                runnable.run();
                return;
            case 2:
                ProfileActivity.k0((ProfileActivity) this.f38817c, (Context) this.d, this.f38816b, (TL_payments.connectedBotStarRef) obj);
                return;
            default:
                yh.s3 s3Var = (yh.s3) this.f38817c;
                MessagesController messagesController = (MessagesController) this.d;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < messagesController.channelEmojiStatusLevelMin) {
                    ChannelBoostsController boostsController = messagesController.getBoostsController();
                    long j3 = this.f38816b;
                    boostsController.userCanBoostChannel(j3, tL_premium_boostsStatus, new ai.l(s3Var, tL_premium_boostsStatus, j3, messagesController, 10));
                    return;
                }
                s3Var.f53300k0.setLoading(false);
                s3Var.t2(true);
                return;
        }
    }
}
