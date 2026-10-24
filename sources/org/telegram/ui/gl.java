package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class gl implements fm {
    public final sn f37604a;
    public final sn f37605b;

    public gl(sn snVar, sn snVar2) {
        this.f37605b = snVar;
        this.f37604a = snVar2;
    }

    @Override
    public final void D0(int i10) {
        this.f37605b.j(i10, 0, true, 0, true, 0);
    }

    @Override
    public final void J(boolean z10, boolean z11) {
        int L8;
        ArrayList arrayList;
        org.telegram.ui.Components.wb wbVar;
        int i10;
        sn snVar = this.f37605b;
        if (z10) {
            ArrayList arrayList2 = new ArrayList(snVar.T4);
            ArrayList arrayList3 = new ArrayList(snVar.V4.values());
            org.telegram.ui.Components.oc ocVar = null;
            if (z11) {
                i10 = ((org.telegram.ui.ActionBar.o2) snVar).currentAccount;
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
                if (snVar.T4.isEmpty()) {
                    SharedPreferences.Editor edit = notificationsSettings.edit();
                    edit.remove("pin_" + snVar.f41516f6).commit();
                } else {
                    SharedPreferences.Editor edit2 = notificationsSettings.edit();
                    edit2.putInt("pin_" + snVar.f41516f6, ((Integer) snVar.T4.get(0)).intValue()).commit();
                }
                snVar.Fc(0, true);
            } else {
                snVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadPinnedMessages, Long.valueOf(snVar.f41516f6), arrayList2, Boolean.FALSE, 0, 0, 0, 0, Boolean.TRUE);
            }
            org.telegram.ui.Components.oc ocVar2 = snVar.M3;
            if (ocVar2 != null) {
                ocVar2.b();
            }
            snVar.N3 = true;
            int i11 = snVar.O3 + 1;
            snVar.O3 = i11;
            boolean z12 = snVar.f41686t4;
            sn snVar2 = this.f37604a;
            if (z12) {
                L8 = snVar2.L8();
            } else {
                L8 = snVar.L8();
            }
            int i12 = L8;
            if (snVar.f41686t4) {
                arrayList = snVar2.T4;
            } else {
                arrayList = snVar.T4;
            }
            ArrayList arrayList4 = new ArrayList(arrayList);
            org.telegram.messenger.b8 b8Var = new org.telegram.messenger.b8(this, z11, arrayList2, arrayList3, i12, i11);
            org.telegram.messenger.voip.k0 k0Var = new org.telegram.messenger.voip.k0(this, z11, arrayList4, i11);
            qn qnVar = snVar.f41651qa;
            if (snVar.getParentActivity() == null) {
                k0Var.run();
            } else {
                if (z11) {
                    ?? lcVar = new org.telegram.ui.Components.lc(snVar.getParentActivity(), qnVar);
                    lcVar.c(R.raw.ic_unpin, 28, 28, "Pin", "Line");
                    lcVar.f28318b.setText(LocaleController.getString(R.string.PinnedMessagesHidden));
                    lcVar.f28319c.setText(LocaleController.getString(R.string.PinnedMessagesHiddenInfo));
                    wbVar = lcVar;
                } else {
                    org.telegram.ui.Components.wb wbVar2 = new org.telegram.ui.Components.wb(snVar.getParentActivity(), qnVar);
                    wbVar2.c(R.raw.ic_unpin, 28, 28, "Pin", "Line");
                    wbVar2.f32176b.setText(LocaleController.formatPluralString("MessagesUnpinned", i12, new Object[0]));
                    wbVar = wbVar2;
                }
                org.telegram.ui.Components.mc mcVar = new org.telegram.ui.Components.mc(snVar.getParentActivity(), qnVar, true);
                mcVar.f28574b = b8Var;
                mcVar.f28575c = k0Var;
                wbVar.setButton(mcVar);
                ocVar = org.telegram.ui.Components.oc.g(snVar, wbVar, 5000);
            }
            snVar.M3 = ocVar;
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
        this.f37605b.ia(str, false);
    }
}
