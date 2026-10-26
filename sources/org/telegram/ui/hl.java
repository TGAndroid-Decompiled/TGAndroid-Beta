package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class hl implements gm {
    public final un f40032a;
    public final un f40033b;

    public hl(un unVar, un unVar2) {
        this.f40033b = unVar;
        this.f40032a = unVar2;
    }

    @Override
    public final void Q0(int i10) {
        this.f40033b.j(i10, 0, true, 0, true, 0);
    }

    @Override
    public final void T(boolean z10, boolean z11) {
        int Q8;
        ArrayList arrayList;
        org.telegram.ui.Components.yb ybVar;
        int i10;
        un unVar = this.f40033b;
        if (z10) {
            ArrayList arrayList2 = new ArrayList(unVar.T4);
            ArrayList arrayList3 = new ArrayList(unVar.V4.values());
            org.telegram.ui.Components.qc qcVar = null;
            if (z11) {
                i10 = ((org.telegram.ui.ActionBar.r2) unVar).currentAccount;
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
                if (unVar.T4.isEmpty()) {
                    SharedPreferences.Editor edit = notificationsSettings.edit();
                    edit.remove("pin_" + unVar.f44252f6).commit();
                } else {
                    SharedPreferences.Editor edit2 = notificationsSettings.edit();
                    edit2.putInt("pin_" + unVar.f44252f6, ((Integer) unVar.T4.get(0)).intValue()).commit();
                }
                unVar.Lc(0, true);
            } else {
                unVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadPinnedMessages, Long.valueOf(unVar.f44252f6), arrayList2, Boolean.FALSE, 0, 0, 0, 0, Boolean.TRUE);
            }
            org.telegram.ui.Components.qc qcVar2 = unVar.M3;
            if (qcVar2 != null) {
                qcVar2.b();
            }
            unVar.N3 = true;
            int i11 = unVar.O3 + 1;
            unVar.O3 = i11;
            boolean z12 = unVar.f44422t4;
            un unVar2 = this.f40032a;
            if (z12) {
                Q8 = unVar2.Q8();
            } else {
                Q8 = unVar.Q8();
            }
            int i12 = Q8;
            if (unVar.f44422t4) {
                arrayList = unVar2.T4;
            } else {
                arrayList = unVar.T4;
            }
            ArrayList arrayList4 = new ArrayList(arrayList);
            org.telegram.messenger.c8 c8Var = new org.telegram.messenger.c8(this, z11, arrayList2, arrayList3, i12, i11);
            org.telegram.messenger.voip.j0 j0Var = new org.telegram.messenger.voip.j0(this, z11, arrayList4, i11);
            sn snVar = unVar.f44388qa;
            if (unVar.getParentActivity() == null) {
                j0Var.run();
            } else {
                if (z11) {
                    ?? ncVar = new org.telegram.ui.Components.nc(unVar.getParentActivity(), snVar);
                    ncVar.c(R.raw.ic_unpin, 28, 28, "Pin", "Line");
                    ncVar.f30954b.setText(LocaleController.getString(R.string.PinnedMessagesHidden));
                    ncVar.f30955c.setText(LocaleController.getString(R.string.PinnedMessagesHiddenInfo));
                    ybVar = ncVar;
                } else {
                    org.telegram.ui.Components.yb ybVar2 = new org.telegram.ui.Components.yb(unVar.getParentActivity(), snVar);
                    ybVar2.c(R.raw.ic_unpin, 28, 28, "Pin", "Line");
                    ybVar2.f35001b.setText(LocaleController.formatPluralString("MessagesUnpinned", i12, new Object[0]));
                    ybVar = ybVar2;
                }
                org.telegram.ui.Components.oc ocVar = new org.telegram.ui.Components.oc(unVar.getParentActivity(), snVar, true);
                ocVar.f31255b = c8Var;
                ocVar.f31256c = j0Var;
                ybVar.setButton(ocVar);
                qcVar = org.telegram.ui.Components.qc.g(unVar, ybVar, 5000);
            }
            unVar.M3 = qcVar;
            return;
        }
        MessageObject messageObject = (MessageObject) unVar.V4.get(Integer.valueOf(unVar.X4));
        if (messageObject == null) {
            messageObject = (MessageObject) unVar.A6[0].get(unVar.X4);
        }
        unVar.pc(messageObject);
    }

    @Override
    public final void p0(String str) {
        this.f40033b.na(str, false);
    }
}
