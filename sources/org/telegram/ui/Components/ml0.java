package org.telegram.ui.Components;

import java.util.ArrayList;
public final class ml0 implements Runnable {
    public final int f37579a = 1;
    public final sl0 f37580b;
    public final String f37581c;
    public final ArrayList d;
    public final ArrayList f37582e;

    public ml0(sl0 sl0Var, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.f37580b = sl0Var;
        this.f37581c = str;
        this.d = arrayList;
        this.f37582e = arrayList2;
    }

    @Override
    public final void run() {
        int i7 = this.f37579a;
        ArrayList arrayList = this.f37582e;
        ArrayList arrayList2 = this.d;
        String str = this.f37581c;
        sl0 sl0Var = this.f37580b;
        switch (i7) {
            case 0:
                int i10 = sl0Var.d;
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    String B = org.telegram.messenger.w7.B(((org.telegram.messenger.fj) arrayList2.get(i11)).F0());
                    if (B != null && B.toLowerCase().contains(str)) {
                        org.telegram.messenger.fj fjVar = new org.telegram.messenger.fj(i10, ((org.telegram.messenger.fj) arrayList2.get(i11)).f23993k, false, false);
                        fjVar.f24052z0 = ((org.telegram.messenger.fj) arrayList2.get(i11)).f24052z0;
                        fjVar.K5(sl0Var.L, true);
                        arrayList3.add(fjVar);
                    }
                }
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    String B2 = org.telegram.messenger.w7.B(((org.telegram.messenger.fj) arrayList.get(i12)).F0());
                    if (B2 != null && B2.toLowerCase().contains(str)) {
                        org.telegram.messenger.fj fjVar2 = new org.telegram.messenger.fj(i10, ((org.telegram.messenger.fj) arrayList.get(i12)).f23993k, false, false);
                        fjVar2.f24052z0 = ((org.telegram.messenger.fj) arrayList.get(i12)).f24052z0;
                        fjVar2.K5(sl0Var.L, true);
                        arrayList4.add(fjVar2);
                    }
                }
                org.telegram.messenger.g0.g3(new ml0(sl0Var, str, arrayList3, arrayList4));
                return;
            default:
                nv0 nv0Var = sl0Var.f39623a;
                if (str.equals(sl0Var.M)) {
                    if (sl0Var.f39629r == 0) {
                        sl0Var.O.b(0);
                    }
                    sl0Var.e(arrayList2, arrayList, true);
                    if (sl0Var.f39629r == 0) {
                        nv0Var.e(false, true);
                        m80 m80Var = nv0Var.f37991e;
                        nv0Var.d.setText(org.telegram.messenger.gd.N0(2131745604, null));
                        m80Var.setVisibility(0);
                        m80Var.setText(org.telegram.messenger.gd.N0(2131745611, null));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public ml0(sl0 sl0Var, ArrayList arrayList, String str, ArrayList arrayList2) {
        this.f37580b = sl0Var;
        this.d = arrayList;
        this.f37581c = str;
        this.f37582e = arrayList2;
    }
}
