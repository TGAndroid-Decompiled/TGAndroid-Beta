package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_payments;
public final class lu implements Utilities.Callback {
    public final int f34773a;
    public final long f34774b;
    public final Object f34775c;
    public final Object d;

    public lu(Object obj, Object obj2, long j3, int i10) {
        this.f34773a = i10;
        this.f34775c = obj;
        this.d = obj2;
        this.f34774b = j3;
    }

    @Override
    public final void run(Object obj) {
        boolean z10;
        int i10;
        switch (this.f34773a) {
            case 0:
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) this.f34775c;
                Long l4 = (Long) obj;
                AndroidUtilities.cancelRunOnUIThread((ku) this.d);
                if (!dataSettingsActivity.W && System.currentTimeMillis() - this.f34774b <= 120) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                dataSettingsActivity.W = z10;
                dataSettingsActivity.Y = l4.longValue();
                dataSettingsActivity.X = false;
                if (dataSettingsActivity.f29892a != null && (i10 = dataSettingsActivity.f29898s) >= 0) {
                    dataSettingsActivity.n0(i10);
                    return;
                }
                return;
            case 1:
                Runnable runnable = (Runnable) obj;
                ((org.telegram.ui.ActionBar.d2) this.d).q(150L);
                wy wyVar = ((vx) this.f34775c).f37644b;
                Boolean bool = wyVar.G.bot_participant;
                if (bool != null && bool.booleanValue()) {
                    wyVar.getMessagesController().addUserToChat(this.f34774b, wyVar.getMessagesController().getUser(Long.valueOf(wyVar.H)), 0, null, wyVar, false, runnable, new nf(8, runnable));
                    return;
                }
                runnable.run();
                return;
            default:
                ProfileActivity.k0((ProfileActivity) this.f34775c, (Context) this.d, this.f34774b, (TL_payments.connectedBotStarRef) obj);
                return;
        }
    }
}
