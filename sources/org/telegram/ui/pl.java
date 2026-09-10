package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class pl implements qm {
    public final eo f35861a;
    public final eo f35862b;

    public pl(eo eoVar, eo eoVar2) {
        this.f35862b = eoVar;
        this.f35861a = eoVar2;
    }

    @Override
    public final void S0(int i10) {
        this.f35862b.E(i10, 0, 0, 0, true, true);
    }

    @Override
    public final void V(boolean z10, boolean z11) {
        int G8;
        ArrayList arrayList;
        org.telegram.ui.Components.xb xbVar;
        int i10;
        eo eoVar = this.f35862b;
        if (z10) {
            ArrayList arrayList2 = new ArrayList(eoVar.H4);
            ArrayList arrayList3 = new ArrayList(eoVar.J4.values());
            org.telegram.ui.Components.pc pcVar = null;
            if (z11) {
                i10 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
                if (eoVar.H4.isEmpty()) {
                    SharedPreferences.Editor edit = notificationsSettings.edit();
                    edit.remove("pin_" + eoVar.T5).commit();
                } else {
                    SharedPreferences.Editor edit2 = notificationsSettings.edit();
                    edit2.putInt("pin_" + eoVar.T5, ((Integer) eoVar.H4.get(0)).intValue()).commit();
                }
                eoVar.yc(0, true);
            } else {
                eoVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadPinnedMessages, Long.valueOf(eoVar.T5), arrayList2, Boolean.FALSE, 0, 0, 0, 0, Boolean.TRUE);
            }
            org.telegram.ui.Components.pc pcVar2 = eoVar.A3;
            if (pcVar2 != null) {
                pcVar2.b();
            }
            eoVar.B3 = true;
            int i11 = eoVar.C3 + 1;
            eoVar.C3 = i11;
            boolean z12 = eoVar.f32346h4;
            eo eoVar2 = this.f35861a;
            if (z12) {
                G8 = eoVar2.G8();
            } else {
                G8 = eoVar.G8();
            }
            int i12 = G8;
            if (eoVar.f32346h4) {
                arrayList = eoVar2.H4;
            } else {
                arrayList = eoVar.H4;
            }
            ArrayList arrayList4 = new ArrayList(arrayList);
            org.telegram.messenger.e8 e8Var = new org.telegram.messenger.e8(this, z11, arrayList2, arrayList3, i12, i11);
            org.telegram.messenger.voip.o0 o0Var = new org.telegram.messenger.voip.o0(this, z11, arrayList4, i11);
            bo boVar = eoVar.f32316ea;
            if (eoVar.getParentActivity() == null) {
                o0Var.run();
            } else {
                if (z11) {
                    ?? mcVar = new org.telegram.ui.Components.mc(eoVar.getParentActivity(), boVar);
                    mcVar.c(R.raw.ic_unpin, 28, 28, "Pin", "Line");
                    mcVar.f25216b.setText(LocaleController.getString(R.string.PinnedMessagesHidden));
                    mcVar.f25217c.setText(LocaleController.getString(R.string.PinnedMessagesHiddenInfo));
                    xbVar = mcVar;
                } else {
                    org.telegram.ui.Components.xb xbVar2 = new org.telegram.ui.Components.xb(eoVar.getParentActivity(), boVar);
                    xbVar2.c(R.raw.ic_unpin, 28, 28, "Pin", "Line");
                    xbVar2.f29000b.setText(LocaleController.formatPluralString("MessagesUnpinned", i12, new Object[0]));
                    xbVar = xbVar2;
                }
                org.telegram.ui.Components.nc ncVar = new org.telegram.ui.Components.nc(eoVar.getParentActivity(), boVar, true);
                ncVar.f25483a = e8Var;
                ncVar.f25484b = o0Var;
                xbVar.setButton(ncVar);
                pcVar = org.telegram.ui.Components.pc.g(eoVar, xbVar, 5000);
            }
            eoVar.A3 = pcVar;
            return;
        }
        MessageObject messageObject = (MessageObject) eoVar.J4.get(Integer.valueOf(eoVar.L4));
        if (messageObject == null) {
            messageObject = (MessageObject) eoVar.f32433o6[0].get(eoVar.L4);
        }
        eoVar.cc(messageObject);
    }

    @Override
    public final void r0(String str) {
        this.f35862b.da(str, false);
    }
}
