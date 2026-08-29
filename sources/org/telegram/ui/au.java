package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_payments;
public final class au implements Utilities.Callback {
    public final int f36602a;
    public final long f36603b;
    public final Object f36604c;
    public final Object d;

    public au(Object obj, Object obj2, long j10, int i10) {
        this.f36602a = i10;
        this.f36604c = obj;
        this.d = obj2;
        this.f36603b = j10;
    }

    @Override
    public final void run(Object obj) {
        boolean z10;
        int i10;
        switch (this.f36602a) {
            case 0:
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) this.f36604c;
                Long l10 = (Long) obj;
                AndroidUtilities.cancelRunOnUIThread((zt) this.d);
                if (!dataSettingsActivity.S && System.currentTimeMillis() - this.f36603b <= 120) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                dataSettingsActivity.S = z10;
                dataSettingsActivity.U = l10.longValue();
                dataSettingsActivity.T = false;
                if (dataSettingsActivity.f35521a != null && (i10 = dataSettingsActivity.f35528s) >= 0) {
                    dataSettingsActivity.n0(i10);
                    return;
                }
                return;
            case 1:
                Runnable runnable = (Runnable) obj;
                ((org.telegram.ui.ActionBar.c2) this.d).q(150L);
                fy fyVar = ((fx) this.f36604c).f38248b;
                Boolean bool = fyVar.C.bot_participant;
                if (bool != null && bool.booleanValue()) {
                    fyVar.getMessagesController().addUserToChat(this.f36603b, fyVar.getMessagesController().getUser(Long.valueOf(fyVar.D)), 0, null, fyVar, false, runnable, new ze(8, runnable));
                    return;
                }
                runnable.run();
                return;
            default:
                ProfileActivity.k0((ProfileActivity) this.f36604c, (Context) this.d, this.f36603b, (TL_payments.connectedBotStarRef) obj);
                return;
        }
    }
}
