package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.ArrayList;
public final class nl implements gm {
    public final un f39924a;
    public final un f39925b;

    public nl(un unVar, un unVar2) {
        this.f39925b = unVar;
        this.f39924a = unVar2;
    }

    @Override
    public final void T0(int i10) {
        this.f39925b.l(i10, 0, true, 0, true, 0);
    }

    @Override
    public final void X(boolean z10, boolean z11) {
        int X8;
        ArrayList arrayList;
        org.telegram.ui.Components.eb ebVar;
        int i10;
        un unVar = this.f39925b;
        if (z10) {
            ArrayList arrayList2 = new ArrayList(unVar.T4);
            ArrayList arrayList3 = new ArrayList(unVar.V4.values());
            org.telegram.ui.Components.wb wbVar = null;
            if (z11) {
                i10 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
                SharedPreferences sharedPreferences = org.telegram.messenger.wp.r1(i10).e7;
                if (unVar.T4.isEmpty()) {
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.remove("pin_" + unVar.f42108j6).commit();
                } else {
                    SharedPreferences.Editor edit2 = sharedPreferences.edit();
                    edit2.putInt("pin_" + unVar.f42108j6, ((Integer) unVar.T4.get(0)).intValue()).commit();
                }
                unVar.Xc(0, true);
            } else {
                unVar.getNotificationCenter().k(org.telegram.messenger.at.f14787t0, Long.valueOf(unVar.f42108j6), arrayList2, Boolean.FALSE, 0, 0, 0, 0, Boolean.TRUE);
            }
            org.telegram.ui.Components.wb wbVar2 = unVar.O3;
            if (wbVar2 != null) {
                wbVar2.b();
            }
            unVar.P3 = true;
            int i11 = unVar.Q3 + 1;
            unVar.Q3 = i11;
            boolean z12 = unVar.f42256v4;
            un unVar2 = this.f39924a;
            if (z12) {
                X8 = unVar2.X8();
            } else {
                X8 = unVar.X8();
            }
            int i12 = X8;
            if (unVar.f42256v4) {
                arrayList = unVar2.T4;
            } else {
                arrayList = unVar.T4;
            }
            ArrayList arrayList4 = new ArrayList(arrayList);
            ml mlVar = new ml(this, z11, arrayList2, arrayList3, i12, i11);
            org.telegram.messenger.voip.p0 p0Var = new org.telegram.messenger.voip.p0(this, z11, arrayList4, i11);
            sn snVar = unVar.f42288xa;
            if (unVar.getParentActivity() == null) {
                p0Var.run();
            } else {
                if (z11) {
                    org.telegram.ui.Components.tb tbVar = new org.telegram.ui.Components.tb(unVar.getParentActivity(), snVar);
                    tbVar.c(2131624059, 28, 28, "Pin", "Line");
                    tbVar.f30619b.setText(org.telegram.messenger.dd.L0(2131747240, null));
                    tbVar.f30620c.setText(org.telegram.messenger.dd.L0(2131747239, null));
                    ebVar = tbVar;
                } else {
                    org.telegram.ui.Components.eb ebVar2 = new org.telegram.ui.Components.eb(unVar.getParentActivity(), snVar);
                    ebVar2.c(2131624059, 28, 28, "Pin", "Line");
                    ebVar2.f25779b.setText(org.telegram.messenger.dd.G(i12, "MessagesUnpinned", new Object[0]));
                    ebVar = ebVar2;
                }
                org.telegram.ui.Components.ub ubVar = new org.telegram.ui.Components.ub(unVar.getParentActivity(), snVar, true);
                ubVar.f30924b = mlVar;
                ubVar.f30925c = p0Var;
                ebVar.setButton(ubVar);
                wbVar = org.telegram.ui.Components.wb.g(unVar, ebVar, 5000);
            }
            unVar.O3 = wbVar;
            return;
        }
        org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) unVar.V4.get(Integer.valueOf(unVar.X4));
        if (kjVar == null) {
            kjVar = (org.telegram.messenger.kj) unVar.E6[0].get(unVar.X4);
        }
        unVar.Bc(kjVar);
    }

    @Override
    public final void v0(String str) {
        this.f39925b.ya(str, false);
    }
}
