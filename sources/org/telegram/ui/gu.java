package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stories;
public final class gu implements Utilities.Callback {
    public final int f34049a;
    public final long f34050b;
    public final Object f34051c;
    public final Object d;

    public gu(Object obj, Object obj2, long j3, int i10) {
        this.f34049a = i10;
        this.f34051c = obj;
        this.d = obj2;
        this.f34050b = j3;
    }

    @Override
    public final void run(Object obj) {
        boolean z10;
        int i10;
        switch (this.f34049a) {
            case 0:
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) this.f34051c;
                Long l4 = (Long) obj;
                AndroidUtilities.cancelRunOnUIThread((fu) this.d);
                if (!dataSettingsActivity.W && System.currentTimeMillis() - this.f34050b <= 120) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                dataSettingsActivity.W = z10;
                dataSettingsActivity.Y = l4.longValue();
                dataSettingsActivity.X = false;
                if (dataSettingsActivity.f31066a != null && (i10 = dataSettingsActivity.f31072s) >= 0) {
                    dataSettingsActivity.n0(i10);
                    return;
                }
                return;
            case 1:
                Runnable runnable = (Runnable) obj;
                ((org.telegram.ui.ActionBar.a2) this.d).q(150L);
                qy qyVar = ((px) this.f34051c).f36692b;
                Boolean bool = qyVar.G.bot_participant;
                if (bool != null && bool.booleanValue()) {
                    qyVar.getMessagesController().addUserToChat(this.f34050b, qyVar.getMessagesController().getUser(Long.valueOf(qyVar.H)), 0, null, qyVar, false, runnable, new kf(8, runnable));
                    return;
                }
                runnable.run();
                return;
            case 2:
                ProfileActivity.k0((ProfileActivity) this.f34051c, (Context) this.d, this.f34050b, (TL_payments.connectedBotStarRef) obj);
                return;
            default:
                yh.x3 x3Var = (yh.x3) this.f34051c;
                MessagesController messagesController = (MessagesController) this.d;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < messagesController.channelEmojiStatusLevelMin) {
                    ChannelBoostsController boostsController = messagesController.getBoostsController();
                    long j3 = this.f34050b;
                    boostsController.userCanBoostChannel(j3, tL_premium_boostsStatus, new ai.l(x3Var, tL_premium_boostsStatus, j3, messagesController, 10));
                    return;
                }
                x3Var.f48247j0.setLoading(false);
                x3Var.r2(true);
                return;
        }
    }
}
