package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class fl implements em {
    public final qn f37031a;
    public final qn f37032b;

    public fl(qn qnVar, qn qnVar2) {
        this.f37032b = qnVar;
        this.f37031a = qnVar2;
    }

    @Override
    public final void D0(int i10) {
        this.f37032b.j(i10, 0, true, 0, true, 0);
    }

    @Override
    public final void J(boolean z10, boolean z11) {
        int L8;
        ArrayList arrayList;
        org.telegram.ui.Components.yb ybVar;
        int i10;
        qn qnVar = this.f37032b;
        if (z10) {
            ArrayList arrayList2 = new ArrayList(qnVar.H4);
            ArrayList arrayList3 = new ArrayList(qnVar.J4.values());
            org.telegram.ui.Components.qc qcVar = null;
            if (z11) {
                i10 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
                if (qnVar.H4.isEmpty()) {
                    SharedPreferences.Editor edit = notificationsSettings.edit();
                    edit.remove("pin_" + qnVar.T5).commit();
                } else {
                    SharedPreferences.Editor edit2 = notificationsSettings.edit();
                    edit2.putInt("pin_" + qnVar.T5, ((Integer) qnVar.H4.get(0)).intValue()).commit();
                }
                qnVar.Dc(0, true);
            } else {
                qnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadPinnedMessages, Long.valueOf(qnVar.T5), arrayList2, Boolean.FALSE, 0, 0, 0, 0, Boolean.TRUE);
            }
            org.telegram.ui.Components.qc qcVar2 = qnVar.A3;
            if (qcVar2 != null) {
                qcVar2.b();
            }
            qnVar.B3 = true;
            int i11 = qnVar.C3 + 1;
            qnVar.C3 = i11;
            boolean z12 = qnVar.f40709h4;
            qn qnVar2 = this.f37031a;
            if (z12) {
                L8 = qnVar2.L8();
            } else {
                L8 = qnVar.L8();
            }
            int i12 = L8;
            if (qnVar.f40709h4) {
                arrayList = qnVar2.H4;
            } else {
                arrayList = qnVar.H4;
            }
            ArrayList arrayList4 = new ArrayList(arrayList);
            org.telegram.messenger.a8 a8Var = new org.telegram.messenger.a8(this, z11, arrayList2, arrayList3, i12, i11);
            org.telegram.messenger.voip.k0 k0Var = new org.telegram.messenger.voip.k0(this, z11, arrayList4, i11);
            on onVar = qnVar.f40677ea;
            if (qnVar.getParentActivity() == null) {
                k0Var.run();
            } else {
                if (z11) {
                    ?? ncVar = new org.telegram.ui.Components.nc(qnVar.getParentActivity(), onVar);
                    ncVar.c(R.raw.ic_unpin, 28, 28, "Pin", "Line");
                    ncVar.f28779b.setText(LocaleController.getString(R.string.PinnedMessagesHidden));
                    ncVar.f28780c.setText(LocaleController.getString(R.string.PinnedMessagesHiddenInfo));
                    ybVar = ncVar;
                } else {
                    org.telegram.ui.Components.yb ybVar2 = new org.telegram.ui.Components.yb(qnVar.getParentActivity(), onVar);
                    ybVar2.c(R.raw.ic_unpin, 28, 28, "Pin", "Line");
                    ybVar2.f32629b.setText(LocaleController.formatPluralString("MessagesUnpinned", i12, new Object[0]));
                    ybVar = ybVar2;
                }
                org.telegram.ui.Components.oc ocVar = new org.telegram.ui.Components.oc(qnVar.getParentActivity(), onVar, true);
                ocVar.f28987a = a8Var;
                ocVar.f28988b = k0Var;
                ybVar.setButton(ocVar);
                qcVar = org.telegram.ui.Components.qc.g(qnVar, ybVar, 5000);
            }
            qnVar.A3 = qcVar;
            return;
        }
        MessageObject messageObject = (MessageObject) qnVar.J4.get(Integer.valueOf(qnVar.L4));
        if (messageObject == null) {
            messageObject = (MessageObject) qnVar.f40797o6[0].get(qnVar.L4);
        }
        qnVar.hc(messageObject);
    }

    @Override
    public final void b0(String str) {
        this.f37032b.ia(str, false);
    }
}
