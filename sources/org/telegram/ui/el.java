package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class el implements fm {
    public final tn f37859a;
    public final tn f37860b;

    public el(tn tnVar, tn tnVar2) {
        this.f37860b = tnVar;
        this.f37859a = tnVar2;
    }

    @Override
    public final void Q0(int i10) {
        this.f37860b.j(i10, 0, true, 0, true, 0);
    }

    @Override
    public final void U(boolean z10, boolean z11) {
        int G8;
        ArrayList arrayList;
        org.telegram.ui.Components.ub ubVar;
        int i10;
        tn tnVar = this.f37860b;
        if (z10) {
            ArrayList arrayList2 = new ArrayList(tnVar.D4);
            ArrayList arrayList3 = new ArrayList(tnVar.F4.values());
            org.telegram.ui.Components.mc mcVar = null;
            if (z11) {
                i10 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
                if (tnVar.D4.isEmpty()) {
                    SharedPreferences.Editor edit = notificationsSettings.edit();
                    edit.remove("pin_" + tnVar.P5).commit();
                } else {
                    SharedPreferences.Editor edit2 = notificationsSettings.edit();
                    edit2.putInt("pin_" + tnVar.P5, ((Integer) tnVar.D4.get(0)).intValue()).commit();
                }
                tnVar.yc(0, true);
            } else {
                tnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadPinnedMessages, Long.valueOf(tnVar.P5), arrayList2, Boolean.FALSE, 0, 0, 0, 0, Boolean.TRUE);
            }
            org.telegram.ui.Components.mc mcVar2 = tnVar.f43016w3;
            if (mcVar2 != null) {
                mcVar2.b();
            }
            tnVar.f43030x3 = true;
            int i11 = tnVar.f43041y3 + 1;
            tnVar.f43041y3 = i11;
            boolean z12 = tnVar.f42779d4;
            tn tnVar2 = this.f37859a;
            if (z12) {
                G8 = tnVar2.G8();
            } else {
                G8 = tnVar.G8();
            }
            int i12 = G8;
            if (tnVar.f42779d4) {
                arrayList = tnVar2.D4;
            } else {
                arrayList = tnVar.D4;
            }
            ArrayList arrayList4 = new ArrayList(arrayList);
            org.telegram.messenger.a8 a8Var = new org.telegram.messenger.a8(this, z11, arrayList2, arrayList3, i12, i11);
            org.telegram.messenger.voip.k0 k0Var = new org.telegram.messenger.voip.k0(this, z11, arrayList4, i11);
            rn rnVar = tnVar.f42746aa;
            if (tnVar.getParentActivity() == null) {
                k0Var.run();
            } else {
                if (z11) {
                    ?? jcVar = new org.telegram.ui.Components.jc(tnVar.getParentActivity(), rnVar);
                    jcVar.c(R.raw.ic_unpin, 28, 28, "Pin", "Line");
                    jcVar.f29638b.setText(LocaleController.getString(R.string.PinnedMessagesHidden));
                    jcVar.f29639c.setText(LocaleController.getString(R.string.PinnedMessagesHiddenInfo));
                    ubVar = jcVar;
                } else {
                    org.telegram.ui.Components.ub ubVar2 = new org.telegram.ui.Components.ub(tnVar.getParentActivity(), rnVar);
                    ubVar2.c(R.raw.ic_unpin, 28, 28, "Pin", "Line");
                    ubVar2.f33185b.setText(LocaleController.formatPluralString("MessagesUnpinned", i12, new Object[0]));
                    ubVar = ubVar2;
                }
                org.telegram.ui.Components.kc kcVar = new org.telegram.ui.Components.kc(tnVar.getParentActivity(), rnVar, true);
                kcVar.f30007a = a8Var;
                kcVar.f30008b = k0Var;
                ubVar.setButton(kcVar);
                mcVar = org.telegram.ui.Components.mc.g(tnVar, ubVar, 5000);
            }
            tnVar.f43016w3 = mcVar;
            return;
        }
        MessageObject messageObject = (MessageObject) tnVar.F4.get(Integer.valueOf(tnVar.H4));
        if (messageObject == null) {
            messageObject = (MessageObject) tnVar.f42870k6[0].get(tnVar.H4);
        }
        tnVar.cc(messageObject);
    }

    @Override
    public final void q0(String str) {
        this.f37860b.da(str, false);
    }
}
