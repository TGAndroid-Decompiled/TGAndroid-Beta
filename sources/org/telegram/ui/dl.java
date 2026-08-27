package org.telegram.ui;

import android.content.SharedPreferences;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;

public final class dl implements em {

    public final rn f37435a;

    public final rn f37436b;

    public dl(rn rnVar, rn rnVar2) {
        this.f37436b = rnVar;
        this.f37435a = rnVar2;
    }

    @Override
    public final void E(boolean z10, boolean z11) throws FileNotFoundException {
        org.telegram.ui.Components.cb cbVar;
        rn rnVar = this.f37436b;
        if (!z10) {
            MessageObject messageObject = (MessageObject) rnVar.F4.get(Integer.valueOf(rnVar.H4));
            if (messageObject == null) {
                messageObject = (MessageObject) rnVar.f42109k6[0].get(rnVar.H4);
            }
            rnVar.cc(messageObject);
            return;
        }
        ArrayList arrayList = new ArrayList(rnVar.D4);
        ArrayList arrayList2 = new ArrayList(rnVar.F4.values());
        org.telegram.ui.Components.ec ecVarG = null;
        if (z11) {
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(((org.telegram.ui.ActionBar.n2) rnVar).currentAccount);
            if (rnVar.D4.isEmpty()) {
                notificationsSettings.edit().remove("pin_" + rnVar.P5).commit();
            } else {
                notificationsSettings.edit().putInt("pin_" + rnVar.P5, ((Integer) rnVar.D4.get(0)).intValue()).commit();
            }
            rnVar.yc(0, true);
        } else {
            rnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadPinnedMessages, Long.valueOf(rnVar.P5), arrayList, Boolean.FALSE, null, null, 0, 0, Boolean.TRUE);
        }
        org.telegram.ui.Components.ec ecVar = rnVar.f42255w3;
        if (ecVar != null) {
            ecVar.b();
        }
        rnVar.f42267x3 = true;
        int i10 = rnVar.f42280y3 + 1;
        rnVar.f42280y3 = i10;
        boolean z12 = rnVar.f42017d4;
        rn rnVar2 = this.f37435a;
        int iG8 = z12 ? rnVar2.G8() : rnVar.G8();
        ArrayList arrayList3 = new ArrayList(rnVar.f42017d4 ? rnVar2.D4 : rnVar.D4);
        org.telegram.messenger.y7 y7Var = new org.telegram.messenger.y7(this, z11, arrayList, arrayList2, iG8, i10);
        org.telegram.messenger.voip.j0 j0Var = new org.telegram.messenger.voip.j0(this, z11, arrayList3, i10);
        pn pnVar = rnVar.f41983aa;
        if (rnVar.getParentActivity() == null) {
            j0Var.run();
        } else {
            if (z11) {
                org.telegram.ui.Components.bc bcVar = new org.telegram.ui.Components.bc(rnVar.getParentActivity(), pnVar);
                bcVar.c(R.raw.ic_unpin, 28, 28, "Pin", "Line");
                bcVar.f27064b.setText(LocaleController.getString(R.string.PinnedMessagesHidden));
                bcVar.f27065c.setText(LocaleController.getString(R.string.PinnedMessagesHiddenInfo));
                cbVar = bcVar;
            } else {
                org.telegram.ui.Components.mb mbVar = new org.telegram.ui.Components.mb(rnVar.getParentActivity(), pnVar);
                mbVar.c(R.raw.ic_unpin, 28, 28, "Pin", "Line");
                mbVar.f30639b.setText(LocaleController.formatPluralString("MessagesUnpinned", iG8, new Object[0]));
                cbVar = mbVar;
            }
            org.telegram.ui.Components.cc ccVar = new org.telegram.ui.Components.cc(rnVar.getParentActivity(), pnVar, true);
            ccVar.f27402a = y7Var;
            ccVar.f27403b = j0Var;
            cbVar.setButton(ccVar);
            ecVarG = org.telegram.ui.Components.ec.g(rnVar, cbVar, 5000);
        }
        rnVar.f42255w3 = ecVarG;
    }

    @Override
    public final void P0(int i10) {
        this.f37436b.j(i10, 0, true, 0, true, 0);
    }

    @Override
    public final void g0(String str) {
        this.f37436b.da(str, false);
    }
}
