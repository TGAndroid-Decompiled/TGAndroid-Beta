package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_payments;
public final class mu implements Utilities.Callback {
    public final int f35884a;
    public final long f35885b;
    public final Object f35886c;
    public final Object d;

    public mu(Object obj, Object obj2, long j3, int i10) {
        this.f35884a = i10;
        this.f35886c = obj;
        this.d = obj2;
        this.f35885b = j3;
    }

    @Override
    public final void run(Object obj) {
        boolean z10;
        int i10;
        switch (this.f35884a) {
            case 0:
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) this.f35886c;
                Long l4 = (Long) obj;
                AndroidUtilities.cancelRunOnUIThread((lu) this.d);
                if (!dataSettingsActivity.W && System.currentTimeMillis() - this.f35885b <= 120) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                dataSettingsActivity.W = z10;
                dataSettingsActivity.Y = l4.longValue();
                dataSettingsActivity.X = false;
                if (dataSettingsActivity.f30793a != null && (i10 = dataSettingsActivity.f30799s) >= 0) {
                    dataSettingsActivity.n0(i10);
                    return;
                }
                return;
            case 1:
                Runnable runnable = (Runnable) obj;
                ((org.telegram.ui.ActionBar.c2) this.d).q(150L);
                wy wyVar = ((vx) this.f35886c).f38521b;
                Boolean bool = wyVar.G.bot_participant;
                if (bool != null && bool.booleanValue()) {
                    wyVar.getMessagesController().addUserToChat(this.f35885b, wyVar.getMessagesController().getUser(Long.valueOf(wyVar.H)), 0, null, wyVar, false, runnable, new nf(8, runnable));
                    return;
                }
                runnable.run();
                return;
            default:
                ProfileActivity.k0((ProfileActivity) this.f35886c, (Context) this.d, this.f35885b, (TL_payments.connectedBotStarRef) obj);
                return;
        }
    }
}
