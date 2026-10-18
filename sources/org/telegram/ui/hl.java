package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class hl implements gm {
    public final sn f37553a;
    public final sn f37554b;

    public hl(sn snVar, sn snVar2) {
        this.f37554b = snVar;
        this.f37553a = snVar2;
    }

    @Override
    public final void D0(int i10) {
        this.f37554b.j(i10, 0, true, 0, true, 0);
    }

    @Override
    public final void J(boolean z10, boolean z11) {
        int L8;
        ArrayList arrayList;
        org.telegram.ui.Components.yb ybVar;
        int i10;
        sn snVar = this.f37554b;
        if (z10) {
            ArrayList arrayList2 = new ArrayList(snVar.H4);
            ArrayList arrayList3 = new ArrayList(snVar.J4.values());
            org.telegram.ui.Components.qc qcVar = null;
            if (z11) {
                i10 = ((org.telegram.ui.ActionBar.n2) snVar).currentAccount;
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
                if (snVar.H4.isEmpty()) {
                    SharedPreferences.Editor edit = notificationsSettings.edit();
                    edit.remove("pin_" + snVar.T5).commit();
                } else {
                    SharedPreferences.Editor edit2 = notificationsSettings.edit();
                    edit2.putInt("pin_" + snVar.T5, ((Integer) snVar.H4.get(0)).intValue()).commit();
                }
                snVar.Cc(0, true);
            } else {
                snVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadPinnedMessages, Long.valueOf(snVar.T5), arrayList2, Boolean.FALSE, 0, 0, 0, 0, Boolean.TRUE);
            }
            org.telegram.ui.Components.qc qcVar2 = snVar.A3;
            if (qcVar2 != null) {
                qcVar2.b();
            }
            snVar.B3 = true;
            int i11 = snVar.C3 + 1;
            snVar.C3 = i11;
            boolean z12 = snVar.f41223h4;
            sn snVar2 = this.f37553a;
            if (z12) {
                L8 = snVar2.L8();
            } else {
                L8 = snVar.L8();
            }
            int i12 = L8;
            if (snVar.f41223h4) {
                arrayList = snVar2.H4;
            } else {
                arrayList = snVar.H4;
            }
            ArrayList arrayList4 = new ArrayList(arrayList);
            org.telegram.messenger.x7 x7Var = new org.telegram.messenger.x7(this, z11, arrayList2, arrayList3, i12, i11);
            org.telegram.messenger.voip.k0 k0Var = new org.telegram.messenger.voip.k0(this, z11, arrayList4, i11);
            qn qnVar = snVar.f41191ea;
            if (snVar.getParentActivity() == null) {
                k0Var.run();
            } else {
                if (z11) {
                    ?? ncVar = new org.telegram.ui.Components.nc(snVar.getParentActivity(), qnVar);
                    ncVar.c(R.raw.ic_unpin, 28, 28, "Pin", "Line");
                    ncVar.f28730b.setText(LocaleController.getString(R.string.PinnedMessagesHidden));
                    ncVar.f28731c.setText(LocaleController.getString(R.string.PinnedMessagesHiddenInfo));
                    ybVar = ncVar;
                } else {
                    org.telegram.ui.Components.yb ybVar2 = new org.telegram.ui.Components.yb(snVar.getParentActivity(), qnVar);
                    ybVar2.c(R.raw.ic_unpin, 28, 28, "Pin", "Line");
                    ybVar2.f32599b.setText(LocaleController.formatPluralString("MessagesUnpinned", i12, new Object[0]));
                    ybVar = ybVar2;
                }
                org.telegram.ui.Components.oc ocVar = new org.telegram.ui.Components.oc(snVar.getParentActivity(), qnVar, true);
                ocVar.f28918a = x7Var;
                ocVar.f28919b = k0Var;
                ybVar.setButton(ocVar);
                qcVar = org.telegram.ui.Components.qc.g(snVar, ybVar, 5000);
            }
            snVar.A3 = qcVar;
            return;
        }
        MessageObject messageObject = (MessageObject) snVar.J4.get(Integer.valueOf(snVar.L4));
        if (messageObject == null) {
            messageObject = (MessageObject) snVar.f41311o6[0].get(snVar.L4);
        }
        snVar.gc(messageObject);
    }

    @Override
    public final void b0(String str) {
        this.f37554b.ia(str, false);
    }
}
