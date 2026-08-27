package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_payments;

public final class cu implements Utilities.Callback {

    public final int f37150a;

    public final long f37151b;

    public final Object f37152c;
    public final Object d;

    public cu(Object obj, Object obj2, long j10, int i10) {
        this.f37150a = i10;
        this.f37152c = obj;
        this.d = obj2;
        this.f37151b = j10;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        switch (this.f37150a) {
            case 0:
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) this.f37152c;
                Long l10 = (Long) obj;
                AndroidUtilities.cancelRunOnUIThread((bu) this.d);
                dataSettingsActivity.S = dataSettingsActivity.S || System.currentTimeMillis() - this.f37151b > 120;
                dataSettingsActivity.U = l10.longValue();
                dataSettingsActivity.T = false;
                if (dataSettingsActivity.f35457a != null && (i10 = dataSettingsActivity.f35464s) >= 0) {
                    dataSettingsActivity.n0(i10);
                    break;
                }
                break;
            case 1:
                gx gxVar = (gx) this.f37152c;
                Runnable runnable = (Runnable) obj;
                ((org.telegram.ui.ActionBar.b2) this.d).q(150L);
                gy gyVar = gxVar.f38491b;
                Boolean bool = gyVar.C.bot_participant;
                if (bool != null && bool.booleanValue()) {
                    gyVar.getMessagesController().addUserToChat(this.f37151b, gyVar.getMessagesController().getUser(Long.valueOf(gyVar.D)), 0, null, gyVar, false, runnable, new bf(8, runnable));
                } else {
                    runnable.run();
                }
                break;
            default:
                ProfileActivity.k0((ProfileActivity) this.f37152c, (Context) this.d, this.f37151b, (TL_payments.connectedBotStarRef) obj);
                break;
        }
    }
}
