package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class ml implements mm {
    public final zn f36129a;
    public final zn f36130b;

    public ml(zn znVar, zn znVar2) {
        this.f36130b = znVar;
        this.f36129a = znVar2;
    }

    @Override
    public final void O0(int i10) {
        this.f36130b.j(i10, 0, true, 0, true, 0);
    }

    @Override
    public final void X(boolean z4, boolean z10) {
        int G8;
        ArrayList arrayList;
        org.telegram.ui.Components.qb qbVar;
        int i10;
        zn znVar = this.f36130b;
        if (z4) {
            ArrayList arrayList2 = new ArrayList(znVar.E4);
            ArrayList arrayList3 = new ArrayList(znVar.G4.values());
            org.telegram.ui.Components.ic icVar = null;
            if (z10) {
                i10 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
                if (znVar.E4.isEmpty()) {
                    SharedPreferences.Editor edit = notificationsSettings.edit();
                    edit.remove("pin_" + znVar.Q5).commit();
                } else {
                    SharedPreferences.Editor edit2 = notificationsSettings.edit();
                    edit2.putInt("pin_" + znVar.Q5, ((Integer) znVar.E4.get(0)).intValue()).commit();
                }
                znVar.yc(0, true);
            } else {
                znVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadPinnedMessages, Long.valueOf(znVar.Q5), arrayList2, Boolean.FALSE, 0, 0, 0, 0, Boolean.TRUE);
            }
            org.telegram.ui.Components.ic icVar2 = znVar.f40803x3;
            if (icVar2 != null) {
                icVar2.b();
            }
            znVar.f40817y3 = true;
            int i11 = znVar.f40830z3 + 1;
            znVar.f40830z3 = i11;
            boolean z11 = znVar.f40567e4;
            zn znVar2 = this.f36129a;
            if (z11) {
                G8 = znVar2.G8();
            } else {
                G8 = znVar.G8();
            }
            int i12 = G8;
            if (znVar.f40567e4) {
                arrayList = znVar2.E4;
            } else {
                arrayList = znVar.E4;
            }
            ArrayList arrayList4 = new ArrayList(arrayList);
            org.telegram.messenger.b8 b8Var = new org.telegram.messenger.b8(this, z10, arrayList2, arrayList3, i12, i11);
            org.telegram.messenger.voip.l0 l0Var = new org.telegram.messenger.voip.l0(this, z10, arrayList4, i11);
            xn xnVar = znVar.f40534ba;
            if (znVar.getParentActivity() == null) {
                l0Var.run();
            } else {
                if (z10) {
                    ?? fcVar = new org.telegram.ui.Components.fc(znVar.getParentActivity(), xnVar);
                    fcVar.c(R.raw.ic_unpin, 28, 28, "Pin", "Line");
                    fcVar.f24859b.setText(LocaleController.getString(R.string.PinnedMessagesHidden));
                    fcVar.f24860c.setText(LocaleController.getString(R.string.PinnedMessagesHiddenInfo));
                    qbVar = fcVar;
                } else {
                    org.telegram.ui.Components.qb qbVar2 = new org.telegram.ui.Components.qb(znVar.getParentActivity(), xnVar);
                    qbVar2.c(R.raw.ic_unpin, 28, 28, "Pin", "Line");
                    qbVar2.f28137b.setText(LocaleController.formatPluralString("MessagesUnpinned", i12, new Object[0]));
                    qbVar = qbVar2;
                }
                org.telegram.ui.Components.gc gcVar = new org.telegram.ui.Components.gc(znVar.getParentActivity(), xnVar, true);
                gcVar.f25112a = b8Var;
                gcVar.f25113b = l0Var;
                qbVar.setButton(gcVar);
                icVar = org.telegram.ui.Components.ic.g(znVar, qbVar, 5000);
            }
            znVar.f40803x3 = icVar;
            return;
        }
        MessageObject messageObject = (MessageObject) znVar.G4.get(Integer.valueOf(znVar.I4));
        if (messageObject == null) {
            messageObject = (MessageObject) znVar.f40655l6[0].get(znVar.I4);
        }
        znVar.cc(messageObject);
    }

    @Override
    public final void o0(String str) {
        this.f36130b.da(str, false);
    }
}
