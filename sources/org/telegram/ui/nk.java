package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.ArrayList;
public final class nk implements gl {
    public final wm f48013a;
    public final wm f48014b;

    public nk(wm wmVar, wm wmVar2) {
        this.f48014b = wmVar;
        this.f48013a = wmVar2;
    }

    @Override
    public final void T0(int i3) {
        this.f48014b.l(i3, 0, true, 0, true, 0);
    }

    @Override
    public final void Y(boolean z10, boolean z11) {
        int a92;
        ArrayList arrayList;
        org.telegram.ui.Components.ib ibVar;
        int i3;
        wm wmVar = this.f48014b;
        if (z10) {
            ArrayList arrayList2 = new ArrayList(wmVar.U4);
            ArrayList arrayList3 = new ArrayList(wmVar.W4.values());
            org.telegram.ui.Components.ac acVar = null;
            if (z11) {
                i3 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
                SharedPreferences sharedPreferences = org.telegram.messenger.hp.s1(i3).f22989d7;
                if (wmVar.U4.isEmpty()) {
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.remove("pin_" + wmVar.f51376k6).commit();
                } else {
                    SharedPreferences.Editor edit2 = sharedPreferences.edit();
                    edit2.putInt("pin_" + wmVar.f51376k6, ((Integer) wmVar.U4.get(0)).intValue()).commit();
                }
                wmVar.cd(0, true);
            } else {
                wmVar.getNotificationCenter().k(org.telegram.messenger.hs.f23306t0, Long.valueOf(wmVar.f51376k6), arrayList2, Boolean.FALSE, 0, 0, 0, 0, Boolean.TRUE);
            }
            org.telegram.ui.Components.ac acVar2 = wmVar.P3;
            if (acVar2 != null) {
                acVar2.b();
            }
            wmVar.Q3 = true;
            int i10 = wmVar.R3 + 1;
            wmVar.R3 = i10;
            boolean z12 = wmVar.f51525w4;
            wm wmVar2 = this.f48013a;
            if (z12) {
                a92 = wmVar2.a9();
            } else {
                a92 = wmVar.a9();
            }
            int i11 = a92;
            if (wmVar.f51525w4) {
                arrayList = wmVar2.U4;
            } else {
                arrayList = wmVar.U4;
            }
            ArrayList arrayList4 = new ArrayList(arrayList);
            mk mkVar = new mk(this, z11, arrayList2, arrayList3, i11, i10);
            org.telegram.messenger.voip.j0 j0Var = new org.telegram.messenger.voip.j0(this, z11, arrayList4, i10);
            um umVar = wmVar.f51557ya;
            if (wmVar.getParentActivity() == null) {
                j0Var.run();
            } else {
                if (z11) {
                    org.telegram.ui.Components.xb xbVar = new org.telegram.ui.Components.xb(wmVar.getParentActivity(), umVar);
                    xbVar.c(2131624060, 28, 28, "Pin", "Line");
                    xbVar.f40303b.setText(org.telegram.messenger.bd.M0(2131747232, null));
                    xbVar.f40304c.setText(org.telegram.messenger.bd.M0(2131747231, null));
                    ibVar = xbVar;
                } else {
                    org.telegram.ui.Components.ib ibVar2 = new org.telegram.ui.Components.ib(wmVar.getParentActivity(), umVar);
                    ibVar2.c(2131624060, 28, 28, "Pin", "Line");
                    ibVar2.f34651b.setText(org.telegram.messenger.bd.G(i11, "MessagesUnpinned", new Object[0]));
                    ibVar = ibVar2;
                }
                org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(wmVar.getParentActivity(), umVar, true);
                ybVar.f40672b = mkVar;
                ybVar.f40673c = j0Var;
                ibVar.setButton(ybVar);
                acVar = org.telegram.ui.Components.ac.g(wmVar, ibVar, 5000);
            }
            wmVar.P3 = acVar;
            return;
        }
        org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) wmVar.W4.get(Integer.valueOf(wmVar.Y4));
        if (ziVar == null) {
            ziVar = (org.telegram.messenger.zi) wmVar.F6[0].get(wmVar.Y4);
        }
        wmVar.Gc(ziVar);
    }

    @Override
    public final void w0(String str) {
        this.f48014b.Da(str, false);
    }
}
