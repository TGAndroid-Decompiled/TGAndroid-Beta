package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class jl implements km {
    public final yn f37728a;
    public final yn f37729b;

    public jl(yn ynVar, yn ynVar2) {
        this.f37729b = ynVar;
        this.f37728a = ynVar2;
    }

    @Override
    public final void S0(int i10) {
        this.f37729b.D(i10, 0, 0, 0, true, true);
    }

    @Override
    public final void X(boolean z10, boolean z11) {
        int H8;
        ArrayList arrayList;
        org.telegram.ui.Components.zb zbVar;
        int i10;
        yn ynVar = this.f37729b;
        if (z10) {
            ArrayList arrayList2 = new ArrayList(ynVar.F4);
            ArrayList arrayList3 = new ArrayList(ynVar.H4.values());
            org.telegram.ui.Components.rc rcVar = null;
            if (z11) {
                i10 = ((org.telegram.ui.ActionBar.n2) ynVar).currentAccount;
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
                if (ynVar.F4.isEmpty()) {
                    SharedPreferences.Editor edit = notificationsSettings.edit();
                    edit.remove("pin_" + ynVar.R5).commit();
                } else {
                    SharedPreferences.Editor edit2 = notificationsSettings.edit();
                    edit2.putInt("pin_" + ynVar.R5, ((Integer) ynVar.F4.get(0)).intValue()).commit();
                }
                ynVar.xc(0, true);
            } else {
                ynVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadPinnedMessages, Long.valueOf(ynVar.R5), arrayList2, Boolean.FALSE, 0, 0, 0, 0, Boolean.TRUE);
            }
            org.telegram.ui.Components.rc rcVar2 = ynVar.y3;
            if (rcVar2 != null) {
                rcVar2.b();
            }
            ynVar.f43580z3 = true;
            int i11 = ynVar.A3 + 1;
            ynVar.A3 = i11;
            boolean z12 = ynVar.f43332f4;
            yn ynVar2 = this.f37728a;
            if (z12) {
                H8 = ynVar2.H8();
            } else {
                H8 = ynVar.H8();
            }
            int i12 = H8;
            if (ynVar.f43332f4) {
                arrayList = ynVar2.F4;
            } else {
                arrayList = ynVar.F4;
            }
            ArrayList arrayList4 = new ArrayList(arrayList);
            org.telegram.messenger.v7 v7Var = new org.telegram.messenger.v7(this, z11, arrayList2, arrayList3, i12, i11);
            org.telegram.messenger.voip.m0 m0Var = new org.telegram.messenger.voip.m0(this, z11, arrayList4, i11);
            wn wnVar = ynVar.f43300ca;
            if (ynVar.getParentActivity() == null) {
                m0Var.run();
            } else {
                if (z11) {
                    ?? ocVar = new org.telegram.ui.Components.oc(ynVar.getParentActivity(), wnVar);
                    ocVar.c(R.raw.ic_unpin, 28, 28, "Pin", "Line");
                    ocVar.f29434b.setText(LocaleController.getString(R.string.PinnedMessagesHidden));
                    ocVar.f29435c.setText(LocaleController.getString(R.string.PinnedMessagesHiddenInfo));
                    zbVar = ocVar;
                } else {
                    org.telegram.ui.Components.zb zbVar2 = new org.telegram.ui.Components.zb(ynVar.getParentActivity(), wnVar);
                    zbVar2.c(R.raw.ic_unpin, 28, 28, "Pin", "Line");
                    zbVar2.f33480b.setText(LocaleController.formatPluralString("MessagesUnpinned", i12, new Object[0]));
                    zbVar = zbVar2;
                }
                org.telegram.ui.Components.pc pcVar = new org.telegram.ui.Components.pc(ynVar.getParentActivity(), wnVar, true);
                pcVar.f29693a = v7Var;
                pcVar.f29694b = m0Var;
                zbVar.setButton(pcVar);
                rcVar = org.telegram.ui.Components.rc.g(ynVar, zbVar, 5000);
            }
            ynVar.y3 = rcVar;
            return;
        }
        MessageObject messageObject = (MessageObject) ynVar.H4.get(Integer.valueOf(ynVar.J4));
        if (messageObject == null) {
            messageObject = (MessageObject) ynVar.f43418m6[0].get(ynVar.J4);
        }
        ynVar.bc(messageObject);
    }

    @Override
    public final void u0(String str) {
        this.f37729b.ca(str, false);
    }
}
