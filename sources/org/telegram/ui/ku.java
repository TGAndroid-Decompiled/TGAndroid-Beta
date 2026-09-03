package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_payments;
public final class ku implements Utilities.Callback {
    public final int f35586a;
    public final long f35587b;
    public final Object f35588c;
    public final Object d;

    public ku(Object obj, Object obj2, long j10, int i10) {
        this.f35586a = i10;
        this.f35588c = obj;
        this.d = obj2;
        this.f35587b = j10;
    }

    @Override
    public final void run(Object obj) {
        boolean z4;
        int i10;
        switch (this.f35586a) {
            case 0:
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) this.f35588c;
                Long l10 = (Long) obj;
                AndroidUtilities.cancelRunOnUIThread((ju) this.d);
                if (!dataSettingsActivity.T && System.currentTimeMillis() - this.f35587b <= 120) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                dataSettingsActivity.T = z4;
                dataSettingsActivity.V = l10.longValue();
                dataSettingsActivity.U = false;
                if (dataSettingsActivity.f31551a != null && (i10 = dataSettingsActivity.f31557s) >= 0) {
                    dataSettingsActivity.n0(i10);
                    return;
                }
                return;
            case 1:
                Runnable runnable = (Runnable) obj;
                ((org.telegram.ui.ActionBar.d2) this.d).q(150L);
                qy qyVar = ((qx) this.f35588c).f37515b;
                Boolean bool = qyVar.D.bot_participant;
                if (bool != null && bool.booleanValue()) {
                    qyVar.getMessagesController().addUserToChat(this.f35587b, qyVar.getMessagesController().getUser(Long.valueOf(qyVar.E)), 0, null, qyVar, false, runnable, new jf(8, runnable));
                    return;
                }
                runnable.run();
                return;
            default:
                ProfileActivity.k0((ProfileActivity) this.f35588c, (Context) this.d, this.f35587b, (TL_payments.connectedBotStarRef) obj);
                return;
        }
    }
}
