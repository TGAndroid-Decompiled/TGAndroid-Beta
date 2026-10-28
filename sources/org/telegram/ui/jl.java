package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class jl implements im {
    public final wn f40557a;
    public final wn f40558b;

    public jl(wn wnVar, wn wnVar2) {
        this.f40558b = wnVar;
        this.f40557a = wnVar2;
    }

    @Override
    public final void Q0(int i10) {
        this.f40558b.j(i10, 0, true, 0, true, 0);
    }

    @Override
    public final void T(boolean z10, boolean z11) {
        int T8;
        ArrayList arrayList;
        org.telegram.ui.Components.yb ybVar;
        int i10;
        wn wnVar = this.f40558b;
        if (z10) {
            ArrayList arrayList2 = new ArrayList(wnVar.T4);
            ArrayList arrayList3 = new ArrayList(wnVar.V4.values());
            org.telegram.ui.Components.qc qcVar = null;
            if (z11) {
                i10 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
                if (wnVar.T4.isEmpty()) {
                    SharedPreferences.Editor edit = notificationsSettings.edit();
                    edit.remove("pin_" + wnVar.f45168j6).commit();
                } else {
                    SharedPreferences.Editor edit2 = notificationsSettings.edit();
                    edit2.putInt("pin_" + wnVar.f45168j6, ((Integer) wnVar.T4.get(0)).intValue()).commit();
                }
                wnVar.Pc(0, true);
            } else {
                wnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadPinnedMessages, Long.valueOf(wnVar.f45168j6), arrayList2, Boolean.FALSE, 0, 0, 0, 0, Boolean.TRUE);
            }
            org.telegram.ui.Components.qc qcVar2 = wnVar.M3;
            if (qcVar2 != null) {
                qcVar2.b();
            }
            wnVar.N3 = true;
            int i11 = wnVar.O3 + 1;
            wnVar.O3 = i11;
            boolean z12 = wnVar.f45290t4;
            wn wnVar2 = this.f40557a;
            if (z12) {
                T8 = wnVar2.T8();
            } else {
                T8 = wnVar.T8();
            }
            int i12 = T8;
            if (wnVar.f45290t4) {
                arrayList = wnVar2.T4;
            } else {
                arrayList = wnVar.T4;
            }
            ArrayList arrayList4 = new ArrayList(arrayList);
            org.telegram.messenger.d8 d8Var = new org.telegram.messenger.d8(this, z11, arrayList2, arrayList3, i12, i11);
            org.telegram.messenger.voip.j0 j0Var = new org.telegram.messenger.voip.j0(this, z11, arrayList4, i11);
            un unVar = wnVar.f45309ua;
            if (wnVar.getParentActivity() == null) {
                j0Var.run();
            } else {
                if (z11) {
                    ?? ncVar = new org.telegram.ui.Components.nc(wnVar.getParentActivity(), unVar);
                    ncVar.c(R.raw.ic_unpin, 28, 28, "Pin", "Line");
                    ncVar.f30859b.setText(LocaleController.getString(R.string.PinnedMessagesHidden));
                    ncVar.f30860c.setText(LocaleController.getString(R.string.PinnedMessagesHiddenInfo));
                    ybVar = ncVar;
                } else {
                    org.telegram.ui.Components.yb ybVar2 = new org.telegram.ui.Components.yb(wnVar.getParentActivity(), unVar);
                    ybVar2.c(R.raw.ic_unpin, 28, 28, "Pin", "Line");
                    ybVar2.f35028b.setText(LocaleController.formatPluralString("MessagesUnpinned", i12, new Object[0]));
                    ybVar = ybVar2;
                }
                org.telegram.ui.Components.oc ocVar = new org.telegram.ui.Components.oc(wnVar.getParentActivity(), unVar, true);
                ocVar.f31259b = d8Var;
                ocVar.f31260c = j0Var;
                ybVar.setButton(ocVar);
                qcVar = org.telegram.ui.Components.qc.g(wnVar, ybVar, 5000);
            }
            wnVar.M3 = qcVar;
            return;
        }
        MessageObject messageObject = (MessageObject) wnVar.V4.get(Integer.valueOf(wnVar.X4));
        if (messageObject == null) {
            messageObject = (MessageObject) wnVar.E6[0].get(wnVar.X4);
        }
        wnVar.tc(messageObject);
    }

    @Override
    public final void p0(String str) {
        this.f40558b.qa(str, false);
    }
}
