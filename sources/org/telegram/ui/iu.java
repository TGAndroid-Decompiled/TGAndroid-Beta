package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stories;
public final class iu implements Utilities.Callback {
    public final int f34532a;
    public final long f34533b;
    public final Object f34534c;
    public final Object d;

    public iu(Object obj, Object obj2, long j3, int i10) {
        this.f34532a = i10;
        this.f34534c = obj;
        this.d = obj2;
        this.f34533b = j3;
    }

    @Override
    public final void run(Object obj) {
        boolean z10;
        int i10;
        switch (this.f34532a) {
            case 0:
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) this.f34534c;
                Long l4 = (Long) obj;
                AndroidUtilities.cancelRunOnUIThread((hu) this.d);
                if (!dataSettingsActivity.W && System.currentTimeMillis() - this.f34533b <= 120) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                dataSettingsActivity.W = z10;
                dataSettingsActivity.Y = l4.longValue();
                dataSettingsActivity.X = false;
                if (dataSettingsActivity.f31067a != null && (i10 = dataSettingsActivity.f31073s) >= 0) {
                    dataSettingsActivity.n0(i10);
                    return;
                }
                return;
            case 1:
                Runnable runnable = (Runnable) obj;
                ((org.telegram.ui.ActionBar.c2) this.d).q(150L);
                ty tyVar = ((px) this.f34534c).f36560b;
                Boolean bool = tyVar.G.bot_participant;
                if (bool != null && bool.booleanValue()) {
                    tyVar.getMessagesController().addUserToChat(this.f34533b, tyVar.getMessagesController().getUser(Long.valueOf(tyVar.H)), 0, null, tyVar, false, runnable, new nf(6, runnable));
                    return;
                }
                runnable.run();
                return;
            case 2:
                ProfileActivity.k0((ProfileActivity) this.f34534c, (Context) this.d, this.f34533b, (TL_payments.connectedBotStarRef) obj);
                return;
            default:
                yh.x3 x3Var = (yh.x3) this.f34534c;
                MessagesController messagesController = (MessagesController) this.d;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < messagesController.channelEmojiStatusLevelMin) {
                    ChannelBoostsController boostsController = messagesController.getBoostsController();
                    long j3 = this.f34533b;
                    boostsController.userCanBoostChannel(j3, tL_premium_boostsStatus, new ai.l(x3Var, tL_premium_boostsStatus, j3, messagesController, 10));
                    return;
                }
                x3Var.f48295j0.setLoading(false);
                x3Var.r2(true);
                return;
        }
    }
}
