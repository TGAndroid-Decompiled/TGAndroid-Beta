package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class gl implements fm {
    public final sn f37627a;
    public final sn f37628b;

    public gl(sn snVar, sn snVar2) {
        this.f37628b = snVar;
        this.f37627a = snVar2;
    }

    @Override
    public final void D0(int i10) {
        this.f37628b.j(i10, 0, true, 0, true, 0);
    }

    @Override
    public final void J(boolean z10, boolean z11) {
        int L8;
        ArrayList arrayList;
        org.telegram.ui.Components.yb ybVar;
        int i10;
        sn snVar = this.f37628b;
        if (z10) {
            ArrayList arrayList2 = new ArrayList(snVar.T4);
            ArrayList arrayList3 = new ArrayList(snVar.V4.values());
            org.telegram.ui.Components.qc qcVar = null;
            if (z11) {
                i10 = ((org.telegram.ui.ActionBar.o2) snVar).currentAccount;
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
                if (snVar.T4.isEmpty()) {
                    SharedPreferences.Editor edit = notificationsSettings.edit();
                    edit.remove("pin_" + snVar.f41519f6).commit();
                } else {
                    SharedPreferences.Editor edit2 = notificationsSettings.edit();
                    edit2.putInt("pin_" + snVar.f41519f6, ((Integer) snVar.T4.get(0)).intValue()).commit();
                }
                snVar.Fc(0, true);
            } else {
                snVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadPinnedMessages, Long.valueOf(snVar.f41519f6), arrayList2, Boolean.FALSE, 0, 0, 0, 0, Boolean.TRUE);
            }
            org.telegram.ui.Components.qc qcVar2 = snVar.M3;
            if (qcVar2 != null) {
                qcVar2.b();
            }
            snVar.N3 = true;
            int i11 = snVar.O3 + 1;
            snVar.O3 = i11;
            boolean z12 = snVar.f41689t4;
            sn snVar2 = this.f37627a;
            if (z12) {
                L8 = snVar2.L8();
            } else {
                L8 = snVar.L8();
            }
            int i12 = L8;
            if (snVar.f41689t4) {
                arrayList = snVar2.T4;
            } else {
                arrayList = snVar.T4;
            }
            ArrayList arrayList4 = new ArrayList(arrayList);
            org.telegram.messenger.a8 a8Var = new org.telegram.messenger.a8(this, z11, arrayList2, arrayList3, i12, i11);
            org.telegram.messenger.voip.k0 k0Var = new org.telegram.messenger.voip.k0(this, z11, arrayList4, i11);
            qn qnVar = snVar.f41654qa;
            if (snVar.getParentActivity() == null) {
                k0Var.run();
            } else {
                if (z11) {
                    ?? ncVar = new org.telegram.ui.Components.nc(snVar.getParentActivity(), qnVar);
                    ncVar.c(R.raw.ic_unpin, 28, 28, "Pin", "Line");
                    ncVar.f28933b.setText(LocaleController.getString(R.string.PinnedMessagesHidden));
                    ncVar.f28934c.setText(LocaleController.getString(R.string.PinnedMessagesHiddenInfo));
                    ybVar = ncVar;
                } else {
                    org.telegram.ui.Components.yb ybVar2 = new org.telegram.ui.Components.yb(snVar.getParentActivity(), qnVar);
                    ybVar2.c(R.raw.ic_unpin, 28, 28, "Pin", "Line");
                    ybVar2.f32863b.setText(LocaleController.formatPluralString("MessagesUnpinned", i12, new Object[0]));
                    ybVar = ybVar2;
                }
                org.telegram.ui.Components.oc ocVar = new org.telegram.ui.Components.oc(snVar.getParentActivity(), qnVar, true);
                ocVar.f29152b = a8Var;
                ocVar.f29153c = k0Var;
                ybVar.setButton(ocVar);
                qcVar = org.telegram.ui.Components.qc.g(snVar, ybVar, 5000);
            }
            snVar.M3 = qcVar;
            return;
        }
        MessageObject messageObject = (MessageObject) snVar.V4.get(Integer.valueOf(snVar.X4));
        if (messageObject == null) {
            messageObject = (MessageObject) snVar.A6[0].get(snVar.X4);
        }
        snVar.jc(messageObject);
    }

    @Override
    public final void b0(String str) {
        this.f37628b.ia(str, false);
    }
}
