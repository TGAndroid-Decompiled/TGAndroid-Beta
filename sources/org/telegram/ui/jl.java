package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class jl implements km {
    public final wn f34826a;
    public final wn f34827b;

    public jl(wn wnVar, wn wnVar2) {
        this.f34827b = wnVar;
        this.f34826a = wnVar2;
    }

    @Override
    public final void S0(int i10) {
        this.f34827b.F(i10, 0, 0, 0, true, true);
    }

    @Override
    public final void W(boolean z10, boolean z11) {
        int G8;
        ArrayList arrayList;
        org.telegram.ui.Components.yb ybVar;
        int i10;
        wn wnVar = this.f34827b;
        if (z10) {
            ArrayList arrayList2 = new ArrayList(wnVar.H4);
            ArrayList arrayList3 = new ArrayList(wnVar.J4.values());
            org.telegram.ui.Components.qc qcVar = null;
            if (z11) {
                i10 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
                if (wnVar.H4.isEmpty()) {
                    SharedPreferences.Editor edit = notificationsSettings.edit();
                    edit.remove("pin_" + wnVar.T5).commit();
                } else {
                    SharedPreferences.Editor edit2 = notificationsSettings.edit();
                    edit2.putInt("pin_" + wnVar.T5, ((Integer) wnVar.H4.get(0)).intValue()).commit();
                }
                wnVar.yc(0, true);
            } else {
                wnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadPinnedMessages, Long.valueOf(wnVar.T5), arrayList2, Boolean.FALSE, 0, 0, 0, 0, Boolean.TRUE);
            }
            org.telegram.ui.Components.qc qcVar2 = wnVar.A3;
            if (qcVar2 != null) {
                qcVar2.b();
            }
            wnVar.B3 = true;
            int i11 = wnVar.C3 + 1;
            wnVar.C3 = i11;
            boolean z12 = wnVar.f39499h4;
            wn wnVar2 = this.f34826a;
            if (z12) {
                G8 = wnVar2.G8();
            } else {
                G8 = wnVar.G8();
            }
            int i12 = G8;
            if (wnVar.f39499h4) {
                arrayList = wnVar2.H4;
            } else {
                arrayList = wnVar.H4;
            }
            ArrayList arrayList4 = new ArrayList(arrayList);
            org.telegram.messenger.v7 v7Var = new org.telegram.messenger.v7(this, z11, arrayList2, arrayList3, i12, i11);
            org.telegram.messenger.voip.m0 m0Var = new org.telegram.messenger.voip.m0(this, z11, arrayList4, i11);
            un unVar = wnVar.f39469ea;
            if (wnVar.getParentActivity() == null) {
                m0Var.run();
            } else {
                if (z11) {
                    ?? ncVar = new org.telegram.ui.Components.nc(wnVar.getParentActivity(), unVar);
                    ncVar.c(R.raw.ic_unpin, 28, 28, "Pin", "Line");
                    ncVar.f26736b.setText(LocaleController.getString(R.string.PinnedMessagesHidden));
                    ncVar.f26737c.setText(LocaleController.getString(R.string.PinnedMessagesHiddenInfo));
                    ybVar = ncVar;
                } else {
                    org.telegram.ui.Components.yb ybVar2 = new org.telegram.ui.Components.yb(wnVar.getParentActivity(), unVar);
                    ybVar2.c(R.raw.ic_unpin, 28, 28, "Pin", "Line");
                    ybVar2.f30634b.setText(LocaleController.formatPluralString("MessagesUnpinned", i12, new Object[0]));
                    ybVar = ybVar2;
                }
                org.telegram.ui.Components.oc ocVar = new org.telegram.ui.Components.oc(wnVar.getParentActivity(), unVar, true);
                ocVar.f27019a = v7Var;
                ocVar.f27020b = m0Var;
                ybVar.setButton(ocVar);
                qcVar = org.telegram.ui.Components.qc.g(wnVar, ybVar, 5000);
            }
            wnVar.A3 = qcVar;
            return;
        }
        MessageObject messageObject = (MessageObject) wnVar.J4.get(Integer.valueOf(wnVar.L4));
        if (messageObject == null) {
            messageObject = (MessageObject) wnVar.f39586o6[0].get(wnVar.L4);
        }
        wnVar.cc(messageObject);
    }

    @Override
    public final void s0(String str) {
        this.f34827b.da(str, false);
    }
}
