package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_payments;
public final class ju implements Utilities.Callback {
    public final int f38123a;
    public final long f38124b;
    public final Object f38125c;
    public final Object d;

    public ju(Object obj, Object obj2, long j10, int i10) {
        this.f38123a = i10;
        this.f38125c = obj;
        this.d = obj2;
        this.f38124b = j10;
    }

    @Override
    public final void run(Object obj) {
        boolean z4;
        int i10;
        switch (this.f38123a) {
            case 0:
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) this.f38125c;
                Long l10 = (Long) obj;
                AndroidUtilities.cancelRunOnUIThread((iu) this.d);
                if (!dataSettingsActivity.T && System.currentTimeMillis() - this.f38124b <= 120) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                dataSettingsActivity.T = z4;
                dataSettingsActivity.V = l10.longValue();
                dataSettingsActivity.U = false;
                if (dataSettingsActivity.f34095a != null && (i10 = dataSettingsActivity.f34102s) >= 0) {
                    dataSettingsActivity.n0(i10);
                    return;
                }
                return;
            case 1:
                Runnable runnable = (Runnable) obj;
                ((org.telegram.ui.ActionBar.d2) this.d).q(150L);
                py pyVar = ((px) this.f38125c).f40143b;
                Boolean bool = pyVar.D.bot_participant;
                if (bool != null && bool.booleanValue()) {
                    pyVar.getMessagesController().addUserToChat(this.f38124b, pyVar.getMessagesController().getUser(Long.valueOf(pyVar.E)), 0, null, pyVar, false, runnable, new gf(8, runnable));
                    return;
                }
                runnable.run();
                return;
            default:
                ProfileActivity.k0((ProfileActivity) this.f38125c, (Context) this.d, this.f38124b, (TL_payments.connectedBotStarRef) obj);
                return;
        }
    }
}
