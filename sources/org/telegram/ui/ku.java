package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_payments;
public final class ku implements Utilities.Callback {
    public final int f35265a;
    public final long f35266b;
    public final Object f35267c;
    public final Object d;

    public ku(Object obj, Object obj2, long j3, int i10) {
        this.f35265a = i10;
        this.f35267c = obj;
        this.d = obj2;
        this.f35266b = j3;
    }

    @Override
    public final void run(Object obj) {
        boolean z10;
        int i10;
        switch (this.f35265a) {
            case 0:
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) this.f35267c;
                Long l4 = (Long) obj;
                AndroidUtilities.cancelRunOnUIThread((ju) this.d);
                if (!dataSettingsActivity.W && System.currentTimeMillis() - this.f35266b <= 120) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                dataSettingsActivity.W = z10;
                dataSettingsActivity.Y = l4.longValue();
                dataSettingsActivity.X = false;
                if (dataSettingsActivity.f30779a != null && (i10 = dataSettingsActivity.f30785s) >= 0) {
                    dataSettingsActivity.n0(i10);
                    return;
                }
                return;
            case 1:
                Runnable runnable = (Runnable) obj;
                ((org.telegram.ui.ActionBar.b2) this.d).q(150L);
                uy uyVar = ((tx) this.f35267c).f37802b;
                Boolean bool = uyVar.G.bot_participant;
                if (bool != null && bool.booleanValue()) {
                    uyVar.getMessagesController().addUserToChat(this.f35266b, uyVar.getMessagesController().getUser(Long.valueOf(uyVar.H)), 0, null, uyVar, false, runnable, new lf(8, runnable));
                    return;
                }
                runnable.run();
                return;
            default:
                ProfileActivity.k0((ProfileActivity) this.f35267c, (Context) this.d, this.f35266b, (TL_payments.connectedBotStarRef) obj);
                return;
        }
    }
}
