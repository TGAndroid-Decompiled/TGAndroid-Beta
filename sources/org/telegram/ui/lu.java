package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_payments;
public final class lu implements Utilities.Callback {
    public final int f38508a;
    public final long f38509b;
    public final Object f38510c;
    public final Object d;

    public lu(Object obj, Object obj2, long j3, int i10) {
        this.f38508a = i10;
        this.f38510c = obj;
        this.d = obj2;
        this.f38509b = j3;
    }

    @Override
    public final void run(Object obj) {
        boolean z10;
        int i10;
        switch (this.f38508a) {
            case 0:
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) this.f38510c;
                Long l4 = (Long) obj;
                AndroidUtilities.cancelRunOnUIThread((ku) this.d);
                if (!dataSettingsActivity.W && System.currentTimeMillis() - this.f38509b <= 120) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                dataSettingsActivity.W = z10;
                dataSettingsActivity.Y = l4.longValue();
                dataSettingsActivity.X = false;
                if (dataSettingsActivity.f33412a != null && (i10 = dataSettingsActivity.f33419s) >= 0) {
                    dataSettingsActivity.n0(i10);
                    return;
                }
                return;
            case 1:
                Runnable runnable = (Runnable) obj;
                ((org.telegram.ui.ActionBar.b2) this.d).q(150L);
                uy uyVar = ((tx) this.f38510c).f40880b;
                Boolean bool = uyVar.G.bot_participant;
                if (bool != null && bool.booleanValue()) {
                    uyVar.getMessagesController().addUserToChat(this.f38509b, uyVar.getMessagesController().getUser(Long.valueOf(uyVar.H)), 0, null, uyVar, false, runnable, new lf(8, runnable));
                    return;
                }
                runnable.run();
                return;
            default:
                ProfileActivity.k0((ProfileActivity) this.f38510c, (Context) this.d, this.f38509b, (TL_payments.connectedBotStarRef) obj);
                return;
        }
    }
}
