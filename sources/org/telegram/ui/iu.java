package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_payments;
public final class iu implements Utilities.Callback {
    public final int f35163a;
    public final long f35164b;
    public final Object f35165c;
    public final Object d;

    public iu(Object obj, Object obj2, long j10, int i10) {
        this.f35163a = i10;
        this.f35165c = obj;
        this.d = obj2;
        this.f35164b = j10;
    }

    @Override
    public final void run(Object obj) {
        boolean z4;
        int i10;
        switch (this.f35163a) {
            case 0:
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) this.f35165c;
                Long l10 = (Long) obj;
                AndroidUtilities.cancelRunOnUIThread((hu) this.d);
                if (!dataSettingsActivity.T && System.currentTimeMillis() - this.f35164b <= 120) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                dataSettingsActivity.T = z4;
                dataSettingsActivity.V = l10.longValue();
                dataSettingsActivity.U = false;
                if (dataSettingsActivity.f31577a != null && (i10 = dataSettingsActivity.f31583s) >= 0) {
                    dataSettingsActivity.n0(i10);
                    return;
                }
                return;
            case 1:
                Runnable runnable = (Runnable) obj;
                ((org.telegram.ui.ActionBar.d2) this.d).q(150L);
                oy oyVar = ((ox) this.f35165c).f36996b;
                Boolean bool = oyVar.D.bot_participant;
                if (bool != null && bool.booleanValue()) {
                    oyVar.getMessagesController().addUserToChat(this.f35164b, oyVar.getMessagesController().getUser(Long.valueOf(oyVar.E)), 0, null, oyVar, false, runnable, new gf(8, runnable));
                    return;
                }
                runnable.run();
                return;
            default:
                ProfileActivity.k0((ProfileActivity) this.f35165c, (Context) this.d, this.f35164b, (TL_payments.connectedBotStarRef) obj);
                return;
        }
    }
}
