package org.telegram.ui.Components;

import java.util.ArrayList;
public final class ml0 implements Runnable {
    public final int f37578a = 1;
    public final sl0 f37579b;
    public final String f37580c;
    public final ArrayList d;
    public final ArrayList f37581e;

    public ml0(sl0 sl0Var, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.f37579b = sl0Var;
        this.f37580c = str;
        this.d = arrayList;
        this.f37581e = arrayList2;
    }

    @Override
    public final void run() {
        int i7 = this.f37578a;
        ArrayList arrayList = this.f37581e;
        ArrayList arrayList2 = this.d;
        String str = this.f37580c;
        sl0 sl0Var = this.f37579b;
        switch (i7) {
            case 0:
                int i10 = sl0Var.d;
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    String B = org.telegram.messenger.w7.B(((org.telegram.messenger.gj) arrayList2.get(i11)).F0());
                    if (B != null && B.toLowerCase().contains(str)) {
                        org.telegram.messenger.gj gjVar = new org.telegram.messenger.gj(i10, ((org.telegram.messenger.gj) arrayList2.get(i11)).f24213k, false, false);
                        gjVar.f24272z0 = ((org.telegram.messenger.gj) arrayList2.get(i11)).f24272z0;
                        gjVar.K5(sl0Var.L, true);
                        arrayList3.add(gjVar);
                    }
                }
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    String B2 = org.telegram.messenger.w7.B(((org.telegram.messenger.gj) arrayList.get(i12)).F0());
                    if (B2 != null && B2.toLowerCase().contains(str)) {
                        org.telegram.messenger.gj gjVar2 = new org.telegram.messenger.gj(i10, ((org.telegram.messenger.gj) arrayList.get(i12)).f24213k, false, false);
                        gjVar2.f24272z0 = ((org.telegram.messenger.gj) arrayList.get(i12)).f24272z0;
                        gjVar2.K5(sl0Var.L, true);
                        arrayList4.add(gjVar2);
                    }
                }
                org.telegram.messenger.g0.g3(new ml0(sl0Var, str, arrayList3, arrayList4));
                return;
            default:
                nv0 nv0Var = sl0Var.f39616a;
                if (str.equals(sl0Var.M)) {
                    if (sl0Var.f39622r == 0) {
                        sl0Var.O.b(0);
                    }
                    sl0Var.e(arrayList2, arrayList, true);
                    if (sl0Var.f39622r == 0) {
                        nv0Var.e(false, true);
                        m80 m80Var = nv0Var.f37996e;
                        nv0Var.d.setText(org.telegram.messenger.hd.N0(2131745604, null));
                        m80Var.setVisibility(0);
                        m80Var.setText(org.telegram.messenger.hd.N0(2131745611, null));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public ml0(sl0 sl0Var, ArrayList arrayList, String str, ArrayList arrayList2) {
        this.f37579b = sl0Var;
        this.d = arrayList;
        this.f37580c = str;
        this.f37581e = arrayList2;
    }
}
