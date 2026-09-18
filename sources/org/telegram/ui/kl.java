package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class kl implements mm {
    public final zn f35142a;
    public final zn f35143b;

    public kl(zn znVar, zn znVar2) {
        this.f35143b = znVar;
        this.f35142a = znVar2;
    }

    @Override
    public final void S0(int i10) {
        this.f35143b.F(i10, 0, 0, 0, true, true);
    }

    @Override
    public final void W(boolean z10, boolean z11) {
        int G8;
        ArrayList arrayList;
        org.telegram.ui.Components.yb ybVar;
        int i10;
        zn znVar = this.f35143b;
        if (z10) {
            ArrayList arrayList2 = new ArrayList(znVar.H4);
            ArrayList arrayList3 = new ArrayList(znVar.J4.values());
            org.telegram.ui.Components.qc qcVar = null;
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
            org.telegram.ui.Components.qc qcVar2 = znVar.A3;
            if (qcVar2 != null) {
                qcVar2.b();
            }
            znVar.B3 = true;
            int i11 = znVar.C3 + 1;
            znVar.C3 = i11;
            boolean z12 = znVar.f40292h4;
            zn znVar2 = this.f35142a;
            if (z12) {
                G8 = znVar2.G8();
            } else {
                G8 = znVar.G8();
            }
            int i12 = G8;
            if (znVar.f40292h4) {
                arrayList = znVar2.H4;
            } else {
                arrayList = znVar.H4;
            }
            ArrayList arrayList4 = new ArrayList(arrayList);
            org.telegram.messenger.y7 y7Var = new org.telegram.messenger.y7(this, z11, arrayList2, arrayList3, i12, i11);
            org.telegram.messenger.voip.l0 l0Var = new org.telegram.messenger.voip.l0(this, z11, arrayList4, i11);
            xn xnVar = znVar.f40261ea;
            if (znVar.getParentActivity() == null) {
                l0Var.run();
            } else {
                if (z11) {
                    ?? ncVar = new org.telegram.ui.Components.nc(znVar.getParentActivity(), xnVar);
                    ncVar.c(R.raw.ic_unpin, 28, 28, "Pin", "Line");
                    ncVar.f26657b.setText(LocaleController.getString(R.string.PinnedMessagesHidden));
                    ncVar.f26658c.setText(LocaleController.getString(R.string.PinnedMessagesHiddenInfo));
                    ybVar = ncVar;
                } else {
                    org.telegram.ui.Components.yb ybVar2 = new org.telegram.ui.Components.yb(znVar.getParentActivity(), xnVar);
                    ybVar2.c(R.raw.ic_unpin, 28, 28, "Pin", "Line");
                    ybVar2.f30530b.setText(LocaleController.formatPluralString("MessagesUnpinned", i12, new Object[0]));
                    ybVar = ybVar2;
                }
                org.telegram.ui.Components.oc ocVar = new org.telegram.ui.Components.oc(znVar.getParentActivity(), xnVar, true);
                ocVar.f26906a = y7Var;
                ocVar.f26907b = l0Var;
                ybVar.setButton(ocVar);
                qcVar = org.telegram.ui.Components.qc.g(znVar, ybVar, 5000);
            }
            znVar.A3 = qcVar;
            return;
        }
        MessageObject messageObject = (MessageObject) znVar.J4.get(Integer.valueOf(znVar.L4));
        if (messageObject == null) {
            messageObject = (MessageObject) znVar.f40379o6[0].get(znVar.L4);
        }
        znVar.cc(messageObject);
    }

    @Override
    public final void s0(String str) {
        this.f35143b.da(str, false);
    }
}
