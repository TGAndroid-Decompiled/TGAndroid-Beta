package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_payments;
public final class mu implements Utilities.Callback {
    public final int f35889a;
    public final long f35890b;
    public final Object f35891c;
    public final Object d;

    public mu(Object obj, Object obj2, long j3, int i10) {
        this.f35889a = i10;
        this.f35891c = obj;
        this.d = obj2;
        this.f35890b = j3;
    }

    @Override
    public final void run(Object obj) {
        boolean z10;
        int i10;
        switch (this.f35889a) {
            case 0:
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) this.f35891c;
                Long l4 = (Long) obj;
                AndroidUtilities.cancelRunOnUIThread((lu) this.d);
                if (!dataSettingsActivity.W && System.currentTimeMillis() - this.f35890b <= 120) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                dataSettingsActivity.W = z10;
                dataSettingsActivity.Y = l4.longValue();
                dataSettingsActivity.X = false;
                if (dataSettingsActivity.f30796a != null && (i10 = dataSettingsActivity.f30802s) >= 0) {
                    dataSettingsActivity.n0(i10);
                    return;
                }
                return;
            case 1:
                Runnable runnable = (Runnable) obj;
                ((org.telegram.ui.ActionBar.c2) this.d).q(150L);
                wy wyVar = ((vx) this.f35891c).f38526b;
                Boolean bool = wyVar.G.bot_participant;
                if (bool != null && bool.booleanValue()) {
                    wyVar.getMessagesController().addUserToChat(this.f35890b, wyVar.getMessagesController().getUser(Long.valueOf(wyVar.H)), 0, null, wyVar, false, runnable, new nf(8, runnable));
                    return;
                }
                runnable.run();
                return;
            default:
                ProfileActivity.k0((ProfileActivity) this.f35891c, (Context) this.d, this.f35890b, (TL_payments.connectedBotStarRef) obj);
                return;
        }
    }
}
