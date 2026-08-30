package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class kl implements km {
    public final xn f35764a;
    public final xn f35765b;

    public kl(xn xnVar, xn xnVar2) {
        this.f35765b = xnVar;
        this.f35764a = xnVar2;
    }

    @Override
    public final void Q0(int i10) {
        this.f35765b.j(i10, 0, true, 0, true, 0);
    }

    @Override
    public final void X(boolean z4, boolean z10) {
        int G8;
        ArrayList arrayList;
        org.telegram.ui.Components.qb qbVar;
        int i10;
        xn xnVar = this.f35765b;
        if (z4) {
            ArrayList arrayList2 = new ArrayList(xnVar.E4);
            ArrayList arrayList3 = new ArrayList(xnVar.G4.values());
            org.telegram.ui.Components.ic icVar = null;
            if (z10) {
                i10 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
                if (xnVar.E4.isEmpty()) {
                    SharedPreferences.Editor edit = notificationsSettings.edit();
                    edit.remove("pin_" + xnVar.Q5).commit();
                } else {
                    SharedPreferences.Editor edit2 = notificationsSettings.edit();
                    edit2.putInt("pin_" + xnVar.Q5, ((Integer) xnVar.E4.get(0)).intValue()).commit();
                }
                xnVar.yc(0, true);
            } else {
                xnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadPinnedMessages, Long.valueOf(xnVar.Q5), arrayList2, Boolean.FALSE, 0, 0, 0, 0, Boolean.TRUE);
            }
            org.telegram.ui.Components.ic icVar2 = xnVar.f40237x3;
            if (icVar2 != null) {
                icVar2.b();
            }
            xnVar.f40251y3 = true;
            int i11 = xnVar.f40264z3 + 1;
            xnVar.f40264z3 = i11;
            boolean z11 = xnVar.f40001e4;
            xn xnVar2 = this.f35764a;
            if (z11) {
                G8 = xnVar2.G8();
            } else {
                G8 = xnVar.G8();
            }
            int i12 = G8;
            if (xnVar.f40001e4) {
                arrayList = xnVar2.E4;
            } else {
                arrayList = xnVar.E4;
            }
            ArrayList arrayList4 = new ArrayList(arrayList);
            org.telegram.messenger.b8 b8Var = new org.telegram.messenger.b8(this, z10, arrayList2, arrayList3, i12, i11);
            org.telegram.messenger.voip.l0 l0Var = new org.telegram.messenger.voip.l0(this, z10, arrayList4, i11);
            vn vnVar = xnVar.f39968ba;
            if (xnVar.getParentActivity() == null) {
                l0Var.run();
            } else {
                if (z10) {
                    ?? fcVar = new org.telegram.ui.Components.fc(xnVar.getParentActivity(), vnVar);
                    fcVar.c(R.raw.ic_unpin, 28, 28, "Pin", "Line");
                    fcVar.f24846b.setText(LocaleController.getString(R.string.PinnedMessagesHidden));
                    fcVar.f24847c.setText(LocaleController.getString(R.string.PinnedMessagesHiddenInfo));
                    qbVar = fcVar;
                } else {
                    org.telegram.ui.Components.qb qbVar2 = new org.telegram.ui.Components.qb(xnVar.getParentActivity(), vnVar);
                    qbVar2.c(R.raw.ic_unpin, 28, 28, "Pin", "Line");
                    qbVar2.f28100b.setText(LocaleController.formatPluralString("MessagesUnpinned", i12, new Object[0]));
                    qbVar = qbVar2;
                }
                org.telegram.ui.Components.gc gcVar = new org.telegram.ui.Components.gc(xnVar.getParentActivity(), vnVar, true);
                gcVar.f25097a = b8Var;
                gcVar.f25098b = l0Var;
                qbVar.setButton(gcVar);
                icVar = org.telegram.ui.Components.ic.g(xnVar, qbVar, 5000);
            }
            xnVar.f40237x3 = icVar;
            return;
        }
        MessageObject messageObject = (MessageObject) xnVar.G4.get(Integer.valueOf(xnVar.I4));
        if (messageObject == null) {
            messageObject = (MessageObject) xnVar.f40089l6[0].get(xnVar.I4);
        }
        xnVar.cc(messageObject);
    }

    @Override
    public final void r0(String str) {
        this.f35765b.da(str, false);
    }
}
