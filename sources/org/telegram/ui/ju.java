package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stories;
public final class ju implements Utilities.Callback {
    public final int f39024a;
    public final long f39025b;
    public final Object f39026c;
    public final Object d;

    public ju(Object obj, Object obj2, long j3, int i10) {
        this.f39024a = i10;
        this.f39026c = obj;
        this.d = obj2;
        this.f39025b = j3;
    }

    @Override
    public final void run(Object obj) {
        boolean z10;
        int i10;
        switch (this.f39024a) {
            case 0:
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) this.f39026c;
                Long l4 = (Long) obj;
                AndroidUtilities.cancelRunOnUIThread((iu) this.d);
                if (!dataSettingsActivity.W && System.currentTimeMillis() - this.f39025b <= 120) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                dataSettingsActivity.W = z10;
                dataSettingsActivity.Y = l4.longValue();
                dataSettingsActivity.X = false;
                if (dataSettingsActivity.f33738a != null && (i10 = dataSettingsActivity.f33745s) >= 0) {
                    dataSettingsActivity.n0(i10);
                    return;
                }
                return;
            case 1:
                Runnable runnable = (Runnable) obj;
                ((org.telegram.ui.ActionBar.b2) this.d).q(150L);
                ty tyVar = ((sx) this.f39026c).f41784b;
                Boolean bool = tyVar.G.bot_participant;
                if (bool != null && bool.booleanValue()) {
                    tyVar.getMessagesController().addUserToChat(this.f39025b, tyVar.getMessagesController().getUser(Long.valueOf(tyVar.H)), 0, null, tyVar, false, runnable, new of(8, runnable));
                    return;
                }
                runnable.run();
                return;
            case 2:
                ProfileActivity.k0((ProfileActivity) this.f39026c, (Context) this.d, this.f39025b, (TL_payments.connectedBotStarRef) obj);
                return;
            default:
                yh.s3 s3Var = (yh.s3) this.f39026c;
                MessagesController messagesController = (MessagesController) this.d;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < messagesController.channelEmojiStatusLevelMin) {
                    ChannelBoostsController boostsController = messagesController.getBoostsController();
                    long j3 = this.f39025b;
                    boostsController.userCanBoostChannel(j3, tL_premium_boostsStatus, new ai.l(s3Var, tL_premium_boostsStatus, j3, messagesController, 10));
                    return;
                }
                s3Var.f53179k0.setLoading(false);
                s3Var.t2(true);
                return;
        }
    }
}
