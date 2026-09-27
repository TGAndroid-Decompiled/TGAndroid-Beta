package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class kl implements lm {
    public final xn f35096a;
    public final xn f35097b;

    public kl(xn xnVar, xn xnVar2) {
        this.f35097b = xnVar;
        this.f35096a = xnVar2;
    }

    @Override
    public final void S0(int i10) {
        this.f35097b.F(i10, 0, 0, 0, true, true);
    }

    @Override
    public final void W(boolean z10, boolean z11) {
        int G8;
        ArrayList arrayList;
        org.telegram.ui.Components.yb ybVar;
        int i10;
        xn xnVar = this.f35097b;
        if (z10) {
            ArrayList arrayList2 = new ArrayList(xnVar.H4);
            ArrayList arrayList3 = new ArrayList(xnVar.J4.values());
            org.telegram.ui.Components.qc qcVar = null;
            if (z11) {
                i10 = ((org.telegram.ui.ActionBar.o2) xnVar).currentAccount;
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
                if (xnVar.H4.isEmpty()) {
                    SharedPreferences.Editor edit = notificationsSettings.edit();
                    edit.remove("pin_" + xnVar.T5).commit();
                } else {
                    SharedPreferences.Editor edit2 = notificationsSettings.edit();
                    edit2.putInt("pin_" + xnVar.T5, ((Integer) xnVar.H4.get(0)).intValue()).commit();
                }
                xnVar.yc(0, true);
            } else {
                xnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadPinnedMessages, Long.valueOf(xnVar.T5), arrayList2, Boolean.FALSE, 0, 0, 0, 0, Boolean.TRUE);
            }
            org.telegram.ui.Components.qc qcVar2 = xnVar.A3;
            if (qcVar2 != null) {
                qcVar2.b();
            }
            xnVar.B3 = true;
            int i11 = xnVar.C3 + 1;
            xnVar.C3 = i11;
            boolean z12 = xnVar.f39781h4;
            xn xnVar2 = this.f35096a;
            if (z12) {
                G8 = xnVar2.G8();
            } else {
                G8 = xnVar.G8();
            }
            int i12 = G8;
            if (xnVar.f39781h4) {
                arrayList = xnVar2.H4;
            } else {
                arrayList = xnVar.H4;
            }
            ArrayList arrayList4 = new ArrayList(arrayList);
            org.telegram.messenger.y7 y7Var = new org.telegram.messenger.y7(this, z11, arrayList2, arrayList3, i12, i11);
            org.telegram.messenger.voip.l0 l0Var = new org.telegram.messenger.voip.l0(this, z11, arrayList4, i11);
            vn vnVar = xnVar.f39750ea;
            if (xnVar.getParentActivity() == null) {
                l0Var.run();
            } else {
                if (z11) {
                    ?? ncVar = new org.telegram.ui.Components.nc(xnVar.getParentActivity(), vnVar);
                    ncVar.c(R.raw.ic_unpin, 28, 28, "Pin", "Line");
                    ncVar.f26778b.setText(LocaleController.getString(R.string.PinnedMessagesHidden));
                    ncVar.f26779c.setText(LocaleController.getString(R.string.PinnedMessagesHiddenInfo));
                    ybVar = ncVar;
                } else {
                    org.telegram.ui.Components.yb ybVar2 = new org.telegram.ui.Components.yb(xnVar.getParentActivity(), vnVar);
                    ybVar2.c(R.raw.ic_unpin, 28, 28, "Pin", "Line");
                    ybVar2.f30642b.setText(LocaleController.formatPluralString("MessagesUnpinned", i12, new Object[0]));
                    ybVar = ybVar2;
                }
                org.telegram.ui.Components.oc ocVar = new org.telegram.ui.Components.oc(xnVar.getParentActivity(), vnVar, true);
                ocVar.f27063a = y7Var;
                ocVar.f27064b = l0Var;
                ybVar.setButton(ocVar);
                qcVar = org.telegram.ui.Components.qc.g(xnVar, ybVar, 5000);
            }
            xnVar.A3 = qcVar;
            return;
        }
        MessageObject messageObject = (MessageObject) xnVar.J4.get(Integer.valueOf(xnVar.L4));
        if (messageObject == null) {
            messageObject = (MessageObject) xnVar.f39868o6[0].get(xnVar.L4);
        }
        xnVar.cc(messageObject);
    }

    @Override
    public final void s0(String str) {
        this.f35097b.da(str, false);
    }
}
