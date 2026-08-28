package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class bl implements cm {
    public final qn f36900a;
    public final qn f36901b;

    public bl(qn qnVar, qn qnVar2) {
        this.f36901b = qnVar;
        this.f36900a = qnVar2;
    }

    @Override
    public final void D(boolean z10, boolean z11) {
        int G8;
        ArrayList arrayList;
        org.telegram.ui.Components.ob obVar;
        int i9;
        qn qnVar = this.f36901b;
        if (z10) {
            ArrayList arrayList2 = new ArrayList(qnVar.D4);
            ArrayList arrayList3 = new ArrayList(qnVar.F4.values());
            org.telegram.ui.Components.gc gcVar = null;
            if (z11) {
                i9 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i9);
                if (qnVar.D4.isEmpty()) {
                    SharedPreferences.Editor edit = notificationsSettings.edit();
                    edit.remove("pin_" + qnVar.P5).commit();
                } else {
                    SharedPreferences.Editor edit2 = notificationsSettings.edit();
                    edit2.putInt("pin_" + qnVar.P5, ((Integer) qnVar.D4.get(0)).intValue()).commit();
                }
                qnVar.yc(0, true);
            } else {
                qnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadPinnedMessages, Long.valueOf(qnVar.P5), arrayList2, Boolean.FALSE, 0, 0, 0, 0, Boolean.TRUE);
            }
            org.telegram.ui.Components.gc gcVar2 = qnVar.f42117w3;
            if (gcVar2 != null) {
                gcVar2.b();
            }
            qnVar.f42130x3 = true;
            int i10 = qnVar.f42144y3 + 1;
            qnVar.f42144y3 = i10;
            boolean z12 = qnVar.f41882d4;
            qn qnVar2 = this.f36900a;
            if (z12) {
                G8 = qnVar2.G8();
            } else {
                G8 = qnVar.G8();
            }
            int i11 = G8;
            if (qnVar.f41882d4) {
                arrayList = qnVar2.D4;
            } else {
                arrayList = qnVar.D4;
            }
            ArrayList arrayList4 = new ArrayList(arrayList);
            org.telegram.messenger.v7 v7Var = new org.telegram.messenger.v7(this, z11, arrayList2, arrayList3, i11, i10);
            org.telegram.messenger.voip.j0 j0Var = new org.telegram.messenger.voip.j0(this, z11, arrayList4, i10);
            on onVar = qnVar.f41848aa;
            if (qnVar.getParentActivity() == null) {
                j0Var.run();
            } else {
                if (z11) {
                    ?? dcVar = new org.telegram.ui.Components.dc(qnVar.getParentActivity(), onVar);
                    dcVar.c(R.raw.ic_unpin, 28, 28, "Pin", "Line");
                    dcVar.f27704b.setText(LocaleController.getString(R.string.PinnedMessagesHidden));
                    dcVar.f27705c.setText(LocaleController.getString(R.string.PinnedMessagesHiddenInfo));
                    obVar = dcVar;
                } else {
                    org.telegram.ui.Components.ob obVar2 = new org.telegram.ui.Components.ob(qnVar.getParentActivity(), onVar);
                    obVar2.c(R.raw.ic_unpin, 28, 28, "Pin", "Line");
                    obVar2.f31343b.setText(LocaleController.formatPluralString("MessagesUnpinned", i11, new Object[0]));
                    obVar = obVar2;
                }
                org.telegram.ui.Components.ec ecVar = new org.telegram.ui.Components.ec(qnVar.getParentActivity(), onVar, true);
                ecVar.f27999a = v7Var;
                ecVar.f28000b = j0Var;
                obVar.setButton(ecVar);
                gcVar = org.telegram.ui.Components.gc.g(qnVar, obVar, 5000);
            }
            qnVar.f42117w3 = gcVar;
            return;
        }
        MessageObject messageObject = (MessageObject) qnVar.F4.get(Integer.valueOf(qnVar.H4));
        if (messageObject == null) {
            messageObject = (MessageObject) qnVar.f41972k6[0].get(qnVar.H4);
        }
        qnVar.cc(messageObject);
    }

    @Override
    public final void L(String str) {
        this.f36901b.da(str, false);
    }

    @Override
    public final void P0(int i9) {
        this.f36901b.j(i9, 0, true, 0, true, 0);
    }
}
