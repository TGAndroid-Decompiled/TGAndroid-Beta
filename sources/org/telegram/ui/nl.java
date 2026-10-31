package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.ArrayList;
public final class nl implements gm {
    public final un f39969a;
    public final un f39970b;

    public nl(un unVar, un unVar2) {
        this.f39970b = unVar;
        this.f39969a = unVar2;
    }

    @Override
    public final void T0(int i10) {
        this.f39970b.k(i10, 0, true, 0, true, 0);
    }

    @Override
    public final void X(boolean z10, boolean z11) {
        int T8;
        ArrayList arrayList;
        org.telegram.ui.Components.eb ebVar;
        int i10;
        un unVar = this.f39970b;
        if (z10) {
            ArrayList arrayList2 = new ArrayList(unVar.T4);
            ArrayList arrayList3 = new ArrayList(unVar.V4.values());
            org.telegram.ui.Components.wb wbVar = null;
            if (z11) {
                i10 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
                SharedPreferences sharedPreferences = org.telegram.messenger.vp.r1(i10).e7;
                if (unVar.T4.isEmpty()) {
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.remove("pin_" + unVar.f42297j6).commit();
                } else {
                    SharedPreferences.Editor edit2 = sharedPreferences.edit();
                    edit2.putInt("pin_" + unVar.f42297j6, ((Integer) unVar.T4.get(0)).intValue()).commit();
                }
                unVar.Sc(0, true);
            } else {
                unVar.getNotificationCenter().k(org.telegram.messenger.zs.f19691t0, Long.valueOf(unVar.f42297j6), arrayList2, Boolean.FALSE, 0, 0, 0, 0, Boolean.TRUE);
            }
            org.telegram.ui.Components.wb wbVar2 = unVar.O3;
            if (wbVar2 != null) {
                wbVar2.b();
            }
            unVar.P3 = true;
            int i11 = unVar.Q3 + 1;
            unVar.Q3 = i11;
            boolean z12 = unVar.f42445v4;
            un unVar2 = this.f39969a;
            if (z12) {
                T8 = unVar2.T8();
            } else {
                T8 = unVar.T8();
            }
            int i12 = T8;
            if (unVar.f42445v4) {
                arrayList = unVar2.T4;
            } else {
                arrayList = unVar.T4;
            }
            ArrayList arrayList4 = new ArrayList(arrayList);
            ml mlVar = new ml(this, z11, arrayList2, arrayList3, i12, i11);
            org.telegram.messenger.voip.p0 p0Var = new org.telegram.messenger.voip.p0(this, z11, arrayList4, i11);
            sn snVar = unVar.f42477xa;
            if (unVar.getParentActivity() == null) {
                p0Var.run();
            } else {
                if (z11) {
                    org.telegram.ui.Components.tb tbVar = new org.telegram.ui.Components.tb(unVar.getParentActivity(), snVar);
                    tbVar.c(2131624059, 28, 28, "Pin", "Line");
                    tbVar.f30537b.setText(org.telegram.messenger.cd.L0(2131747240, null));
                    tbVar.f30538c.setText(org.telegram.messenger.cd.L0(2131747239, null));
                    ebVar = tbVar;
                } else {
                    org.telegram.ui.Components.eb ebVar2 = new org.telegram.ui.Components.eb(unVar.getParentActivity(), snVar);
                    ebVar2.c(2131624059, 28, 28, "Pin", "Line");
                    ebVar2.f25745b.setText(org.telegram.messenger.cd.G(i12, "MessagesUnpinned", new Object[0]));
                    ebVar = ebVar2;
                }
                org.telegram.ui.Components.ub ubVar = new org.telegram.ui.Components.ub(unVar.getParentActivity(), snVar, true);
                ubVar.f30890b = mlVar;
                ubVar.f30891c = p0Var;
                ebVar.setButton(ubVar);
                wbVar = org.telegram.ui.Components.wb.g(unVar, ebVar, 5000);
            }
            unVar.O3 = wbVar;
            return;
        }
        org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) unVar.V4.get(Integer.valueOf(unVar.X4));
        if (jjVar == null) {
            jjVar = (org.telegram.messenger.jj) unVar.E6[0].get(unVar.X4);
        }
        unVar.wc(jjVar);
    }

    @Override
    public final void v0(String str) {
        this.f39970b.ta(str, false);
    }
}
