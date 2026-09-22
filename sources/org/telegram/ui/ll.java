package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class ll implements mm {
    public final zn f35493a;
    public final zn f35494b;

    public ll(zn znVar, zn znVar2) {
        this.f35494b = znVar;
        this.f35493a = znVar2;
    }

    @Override
    public final void R0(int i10) {
        this.f35494b.E(i10, 0, 0, 0, true, true);
    }

    @Override
    public final void W(boolean z10, boolean z11) {
        int G8;
        ArrayList arrayList;
        org.telegram.ui.Components.xb xbVar;
        int i10;
        zn znVar = this.f35494b;
        if (z10) {
            ArrayList arrayList2 = new ArrayList(znVar.H4);
            ArrayList arrayList3 = new ArrayList(znVar.J4.values());
            org.telegram.ui.Components.pc pcVar = null;
            if (z11) {
                i10 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
                if (znVar.H4.isEmpty()) {
                    SharedPreferences.Editor edit = notificationsSettings.edit();
                    edit.remove("pin_" + znVar.T5).commit();
                } else {
                    SharedPreferences.Editor edit2 = notificationsSettings.edit();
                    edit2.putInt("pin_" + znVar.T5, ((Integer) znVar.H4.get(0)).intValue()).commit();
                }
                znVar.yc(0, true);
            } else {
                znVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadPinnedMessages, Long.valueOf(znVar.T5), arrayList2, Boolean.FALSE, 0, 0, 0, 0, Boolean.TRUE);
            }
            org.telegram.ui.Components.pc pcVar2 = znVar.A3;
            if (pcVar2 != null) {
                pcVar2.b();
            }
            znVar.B3 = true;
            int i11 = znVar.C3 + 1;
            znVar.C3 = i11;
            boolean z12 = znVar.f40355h4;
            zn znVar2 = this.f35493a;
            if (z12) {
                G8 = znVar2.G8();
            } else {
                G8 = znVar.G8();
            }
            int i12 = G8;
            if (znVar.f40355h4) {
                arrayList = znVar2.H4;
            } else {
                arrayList = znVar.H4;
            }
            ArrayList arrayList4 = new ArrayList(arrayList);
            org.telegram.messenger.y7 y7Var = new org.telegram.messenger.y7(this, z11, arrayList2, arrayList3, i12, i11);
            org.telegram.messenger.voip.l0 l0Var = new org.telegram.messenger.voip.l0(this, z11, arrayList4, i11);
            xn xnVar = znVar.f40324ea;
            if (znVar.getParentActivity() == null) {
                l0Var.run();
            } else {
                if (z11) {
                    ?? mcVar = new org.telegram.ui.Components.mc(znVar.getParentActivity(), xnVar);
                    mcVar.c(R.raw.ic_unpin, 28, 28, "Pin", "Line");
                    mcVar.f26422b.setText(LocaleController.getString(R.string.PinnedMessagesHidden));
                    mcVar.f26423c.setText(LocaleController.getString(R.string.PinnedMessagesHiddenInfo));
                    xbVar = mcVar;
                } else {
                    org.telegram.ui.Components.xb xbVar2 = new org.telegram.ui.Components.xb(znVar.getParentActivity(), xnVar);
                    xbVar2.c(R.raw.ic_unpin, 28, 28, "Pin", "Line");
                    xbVar2.f30299b.setText(LocaleController.formatPluralString("MessagesUnpinned", i12, new Object[0]));
                    xbVar = xbVar2;
                }
                org.telegram.ui.Components.nc ncVar = new org.telegram.ui.Components.nc(znVar.getParentActivity(), xnVar, true);
                ncVar.f26720a = y7Var;
                ncVar.f26721b = l0Var;
                xbVar.setButton(ncVar);
                pcVar = org.telegram.ui.Components.pc.g(znVar, xbVar, 5000);
            }
            znVar.A3 = pcVar;
            return;
        }
        MessageObject messageObject = (MessageObject) znVar.J4.get(Integer.valueOf(znVar.L4));
        if (messageObject == null) {
            messageObject = (MessageObject) znVar.f40442o6[0].get(znVar.L4);
        }
        znVar.cc(messageObject);
    }

    @Override
    public final void s0(String str) {
        this.f35494b.da(str, false);
    }
}
