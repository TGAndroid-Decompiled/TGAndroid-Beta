package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stories;
public final class mu implements Utilities.Callback {
    public final int f40135a;
    public final long f40136b;
    public final Object f40137c;
    public final Object d;

    public mu(Object obj, Object obj2, long j3, int i10) {
        this.f40135a = i10;
        this.f40137c = obj;
        this.d = obj2;
        this.f40136b = j3;
    }

    @Override
    public final void run(Object obj) {
        boolean z10;
        int i10;
        switch (this.f40135a) {
            case 0:
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) this.f40137c;
                Long l4 = (Long) obj;
                AndroidUtilities.cancelRunOnUIThread((lu) this.d);
                if (!dataSettingsActivity.W && System.currentTimeMillis() - this.f40136b <= 120) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                dataSettingsActivity.W = z10;
                dataSettingsActivity.Y = l4.longValue();
                dataSettingsActivity.X = false;
                if (dataSettingsActivity.f33577a != null && (i10 = dataSettingsActivity.f33584s) >= 0) {
                    dataSettingsActivity.n0(i10);
                    return;
                }
                return;
            case 1:
                Runnable runnable = (Runnable) obj;
                ((org.telegram.ui.ActionBar.a2) this.d).q(150L);
                vy vyVar = ((ux) this.f40137c).f42607b;
                Boolean bool = vyVar.G.bot_participant;
                if (bool != null && bool.booleanValue()) {
                    vyVar.getMessagesController().addUserToChat(this.f40136b, vyVar.getMessagesController().getUser(Long.valueOf(vyVar.H)), 0, null, vyVar, false, runnable, new sf(8, runnable));
                    return;
                }
                runnable.run();
                return;
            case 2:
                ProfileActivity.k0((ProfileActivity) this.f40137c, (Context) this.d, this.f40136b, (TL_payments.connectedBotStarRef) obj);
                return;
            default:
                yh.s3 s3Var = (yh.s3) this.f40137c;
                MessagesController messagesController = (MessagesController) this.d;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < messagesController.channelEmojiStatusLevelMin) {
                    ChannelBoostsController boostsController = messagesController.getBoostsController();
                    long j3 = this.f40136b;
                    boostsController.userCanBoostChannel(j3, tL_premium_boostsStatus, new ai.l(s3Var, tL_premium_boostsStatus, j3, messagesController, 7));
                    return;
                }
                s3Var.f53415k0.setLoading(false);
                s3Var.t2(true);
                return;
        }
    }
}
