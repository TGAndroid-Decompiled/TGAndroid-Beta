package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class nl implements pm {
    public final co f38978a;
    public final co f38979b;

    public nl(co coVar, co coVar2) {
        this.f38979b = coVar;
        this.f38978a = coVar2;
    }

    @Override
    public final void V0(int i10) {
        this.f38979b.F(i10, 0, 0, 0, true, true);
    }

    @Override
    public final void W(boolean z10, boolean z11) {
        int G8;
        ArrayList arrayList;
        org.telegram.ui.Components.yb ybVar;
        int i10;
        co coVar = this.f38979b;
        if (z10) {
            ArrayList arrayList2 = new ArrayList(coVar.H4);
            ArrayList arrayList3 = new ArrayList(coVar.J4.values());
            org.telegram.ui.Components.qc qcVar = null;
            if (z11) {
                i10 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
                if (coVar.H4.isEmpty()) {
                    SharedPreferences.Editor edit = notificationsSettings.edit();
                    edit.remove("pin_" + coVar.T5).commit();
                } else {
                    SharedPreferences.Editor edit2 = notificationsSettings.edit();
                    edit2.putInt("pin_" + coVar.T5, ((Integer) coVar.H4.get(0)).intValue()).commit();
                }
                coVar.yc(0, true);
            } else {
                coVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadPinnedMessages, Long.valueOf(coVar.T5), arrayList2, Boolean.FALSE, 0, 0, 0, 0, Boolean.TRUE);
            }
            org.telegram.ui.Components.qc qcVar2 = coVar.A3;
            if (qcVar2 != null) {
                qcVar2.b();
            }
            coVar.B3 = true;
            int i11 = coVar.C3 + 1;
            coVar.C3 = i11;
            boolean z12 = coVar.f35277h4;
            co coVar2 = this.f38978a;
            if (z12) {
                G8 = coVar2.G8();
            } else {
                G8 = coVar.G8();
            }
            int i12 = G8;
            if (coVar.f35277h4) {
                arrayList = coVar2.H4;
            } else {
                arrayList = coVar.H4;
            }
            ArrayList arrayList4 = new ArrayList(arrayList);
            org.telegram.messenger.x7 x7Var = new org.telegram.messenger.x7(this, z11, arrayList2, arrayList3, i12, i11);
            org.telegram.messenger.voip.l0 l0Var = new org.telegram.messenger.voip.l0(this, z11, arrayList4, i11);
            ao aoVar = coVar.f35247ea;
            if (coVar.getParentActivity() == null) {
                l0Var.run();
            } else {
                if (z11) {
                    ?? ncVar = new org.telegram.ui.Components.nc(coVar.getParentActivity(), aoVar);
                    ncVar.c(R.raw.ic_unpin, 28, 28, "Pin", "Line");
                    ncVar.f28724b.setText(LocaleController.getString(R.string.PinnedMessagesHidden));
                    ncVar.f28725c.setText(LocaleController.getString(R.string.PinnedMessagesHiddenInfo));
                    ybVar = ncVar;
                } else {
                    org.telegram.ui.Components.yb ybVar2 = new org.telegram.ui.Components.yb(coVar.getParentActivity(), aoVar);
                    ybVar2.c(R.raw.ic_unpin, 28, 28, "Pin", "Line");
                    ybVar2.f32876b.setText(LocaleController.formatPluralString("MessagesUnpinned", i12, new Object[0]));
                    ybVar = ybVar2;
                }
                org.telegram.ui.Components.oc ocVar = new org.telegram.ui.Components.oc(coVar.getParentActivity(), aoVar, true);
                ocVar.f29029a = x7Var;
                ocVar.f29030b = l0Var;
                ybVar.setButton(ocVar);
                qcVar = org.telegram.ui.Components.qc.g(coVar, ybVar, 5000);
            }
            coVar.A3 = qcVar;
            return;
        }
        MessageObject messageObject = (MessageObject) coVar.J4.get(Integer.valueOf(coVar.L4));
        if (messageObject == null) {
            messageObject = (MessageObject) coVar.f35364o6[0].get(coVar.L4);
        }
        coVar.cc(messageObject);
    }

    @Override
    public final void r0(String str) {
        this.f38979b.da(str, false);
    }
}
