package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class nl implements om {
    public final bo f36006a;
    public final bo f36007b;

    public nl(bo boVar, bo boVar2) {
        this.f36007b = boVar;
        this.f36006a = boVar2;
    }

    @Override
    public final void S0(int i10) {
        this.f36007b.F(i10, 0, 0, 0, true, true);
    }

    @Override
    public final void W(boolean z10, boolean z11) {
        int G8;
        ArrayList arrayList;
        org.telegram.ui.Components.wb wbVar;
        int i10;
        bo boVar = this.f36007b;
        if (z10) {
            ArrayList arrayList2 = new ArrayList(boVar.H4);
            ArrayList arrayList3 = new ArrayList(boVar.J4.values());
            org.telegram.ui.Components.oc ocVar = null;
            if (z11) {
                i10 = ((org.telegram.ui.ActionBar.n2) boVar).currentAccount;
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
                if (boVar.H4.isEmpty()) {
                    SharedPreferences.Editor edit = notificationsSettings.edit();
                    edit.remove("pin_" + boVar.T5).commit();
                } else {
                    SharedPreferences.Editor edit2 = notificationsSettings.edit();
                    edit2.putInt("pin_" + boVar.T5, ((Integer) boVar.H4.get(0)).intValue()).commit();
                }
                boVar.yc(0, true);
            } else {
                boVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadPinnedMessages, Long.valueOf(boVar.T5), arrayList2, Boolean.FALSE, 0, 0, 0, 0, Boolean.TRUE);
            }
            org.telegram.ui.Components.oc ocVar2 = boVar.A3;
            if (ocVar2 != null) {
                ocVar2.b();
            }
            boVar.B3 = true;
            int i11 = boVar.C3 + 1;
            boVar.C3 = i11;
            boolean z12 = boVar.f32323h4;
            bo boVar2 = this.f36006a;
            if (z12) {
                G8 = boVar2.G8();
            } else {
                G8 = boVar.G8();
            }
            int i12 = G8;
            if (boVar.f32323h4) {
                arrayList = boVar2.H4;
            } else {
                arrayList = boVar.H4;
            }
            ArrayList arrayList4 = new ArrayList(arrayList);
            org.telegram.messenger.y7 y7Var = new org.telegram.messenger.y7(this, z11, arrayList2, arrayList3, i12, i11);
            org.telegram.messenger.voip.l0 l0Var = new org.telegram.messenger.voip.l0(this, z11, arrayList4, i11);
            zn znVar = boVar.f32293ea;
            if (boVar.getParentActivity() == null) {
                l0Var.run();
            } else {
                if (z11) {
                    ?? lcVar = new org.telegram.ui.Components.lc(boVar.getParentActivity(), znVar);
                    lcVar.c(R.raw.ic_unpin, 28, 28, "Pin", "Line");
                    lcVar.f25906b.setText(LocaleController.getString(R.string.PinnedMessagesHidden));
                    lcVar.f25907c.setText(LocaleController.getString(R.string.PinnedMessagesHiddenInfo));
                    wbVar = lcVar;
                } else {
                    org.telegram.ui.Components.wb wbVar2 = new org.telegram.ui.Components.wb(boVar.getParentActivity(), znVar);
                    wbVar2.c(R.raw.ic_unpin, 28, 28, "Pin", "Line");
                    wbVar2.f29679b.setText(LocaleController.formatPluralString("MessagesUnpinned", i12, new Object[0]));
                    wbVar = wbVar2;
                }
                org.telegram.ui.Components.mc mcVar = new org.telegram.ui.Components.mc(boVar.getParentActivity(), znVar, true);
                mcVar.f26136a = y7Var;
                mcVar.f26137b = l0Var;
                wbVar.setButton(mcVar);
                ocVar = org.telegram.ui.Components.oc.g(boVar, wbVar, 5000);
            }
            boVar.A3 = ocVar;
            return;
        }
        MessageObject messageObject = (MessageObject) boVar.J4.get(Integer.valueOf(boVar.L4));
        if (messageObject == null) {
            messageObject = (MessageObject) boVar.f32410o6[0].get(boVar.L4);
        }
        boVar.cc(messageObject);
    }

    @Override
    public final void s0(String str) {
        this.f36007b.da(str, false);
    }
}
