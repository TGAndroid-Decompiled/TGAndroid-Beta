package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class ol implements nm {
    public final zn f40555a;
    public final zn f40556b;

    public ol(zn znVar, zn znVar2) {
        this.f40556b = znVar;
        this.f40555a = znVar2;
    }

    @Override
    public final void O0(int i10) {
        this.f40556b.F(i10, 0, 0, 0, true, true);
    }

    @Override
    public final void V(boolean z10, boolean z11) {
        int L8;
        ArrayList arrayList;
        org.telegram.ui.Components.bc bcVar;
        int i10;
        zn znVar = this.f40556b;
        if (z10) {
            ArrayList arrayList2 = new ArrayList(znVar.H4);
            ArrayList arrayList3 = new ArrayList(znVar.J4.values());
            org.telegram.ui.Components.tc tcVar = null;
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
                znVar.Cc(0, true);
            } else {
                znVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadPinnedMessages, Long.valueOf(znVar.T5), arrayList2, Boolean.FALSE, 0, 0, 0, 0, Boolean.TRUE);
            }
            org.telegram.ui.Components.tc tcVar2 = znVar.A3;
            if (tcVar2 != null) {
                tcVar2.b();
            }
            znVar.B3 = true;
            int i11 = znVar.C3 + 1;
            znVar.C3 = i11;
            boolean z12 = znVar.f44791h4;
            zn znVar2 = this.f40555a;
            if (z12) {
                L8 = znVar2.L8();
            } else {
                L8 = znVar.L8();
            }
            int i12 = L8;
            if (znVar.f44791h4) {
                arrayList = znVar2.H4;
            } else {
                arrayList = znVar.H4;
            }
            ArrayList arrayList4 = new ArrayList(arrayList);
            org.telegram.messenger.v7 v7Var = new org.telegram.messenger.v7(this, z11, arrayList2, arrayList3, i12, i11);
            org.telegram.messenger.voip.n0 n0Var = new org.telegram.messenger.voip.n0(this, z11, arrayList4, i11);
            xn xnVar = znVar.f44761ea;
            if (znVar.getParentActivity() == null) {
                n0Var.run();
            } else {
                if (z11) {
                    org.telegram.ui.Components.qc qcVar = new org.telegram.ui.Components.qc(znVar.getParentActivity(), xnVar);
                    qcVar.c(R.raw.ic_unpin, 28, 28, "Pin", "Line");
                    qcVar.f30141b.setText(LocaleController.getString(R.string.PinnedMessagesHidden));
                    qcVar.f30142c.setText(LocaleController.getString(R.string.PinnedMessagesHiddenInfo));
                    bcVar = qcVar;
                } else {
                    org.telegram.ui.Components.bc bcVar2 = new org.telegram.ui.Components.bc(znVar.getParentActivity(), xnVar);
                    bcVar2.c(R.raw.ic_unpin, 28, 28, "Pin", "Line");
                    bcVar2.f24967b.setText(LocaleController.formatPluralString("MessagesUnpinned", i12, new Object[0]));
                    bcVar = bcVar2;
                }
                org.telegram.ui.Components.rc rcVar = new org.telegram.ui.Components.rc(znVar.getParentActivity(), xnVar, true);
                rcVar.f30421a = v7Var;
                rcVar.f30422b = n0Var;
                bcVar.setButton(rcVar);
                tcVar = org.telegram.ui.Components.tc.g(znVar, bcVar, 5000);
            }
            znVar.A3 = tcVar;
            return;
        }
        MessageObject messageObject = (MessageObject) znVar.J4.get(Integer.valueOf(znVar.L4));
        if (messageObject == null) {
            messageObject = (MessageObject) znVar.f44878o6[0].get(znVar.L4);
        }
        znVar.gc(messageObject);
    }

    @Override
    public final void o0(String str) {
        this.f40556b.ia(str, false);
    }
}
