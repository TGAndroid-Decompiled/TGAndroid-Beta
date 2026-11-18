package org.telegram.ui.Components;

import java.util.ArrayList;
public final class kl0 implements Runnable {
    public final int f36824a = 1;
    public final ql0 f36825b;
    public final String f36826c;
    public final ArrayList d;
    public final ArrayList f36827e;

    public kl0(ql0 ql0Var, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.f36825b = ql0Var;
        this.f36826c = str;
        this.d = arrayList;
        this.f36827e = arrayList2;
    }

    @Override
    public final void run() {
        int i7 = this.f36824a;
        ArrayList arrayList = this.f36827e;
        ArrayList arrayList2 = this.d;
        String str = this.f36826c;
        ql0 ql0Var = this.f36825b;
        switch (i7) {
            case 0:
                int i10 = ql0Var.d;
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    String B = org.telegram.messenger.w7.B(((org.telegram.messenger.fj) arrayList2.get(i11)).F0());
                    if (B != null && B.toLowerCase().contains(str)) {
                        org.telegram.messenger.fj fjVar = new org.telegram.messenger.fj(i10, ((org.telegram.messenger.fj) arrayList2.get(i11)).f23965k, false, false);
                        fjVar.f24024z0 = ((org.telegram.messenger.fj) arrayList2.get(i11)).f24024z0;
                        fjVar.K5(ql0Var.L, true);
                        arrayList3.add(fjVar);
                    }
                }
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    String B2 = org.telegram.messenger.w7.B(((org.telegram.messenger.fj) arrayList.get(i12)).F0());
                    if (B2 != null && B2.toLowerCase().contains(str)) {
                        org.telegram.messenger.fj fjVar2 = new org.telegram.messenger.fj(i10, ((org.telegram.messenger.fj) arrayList.get(i12)).f23965k, false, false);
                        fjVar2.f24024z0 = ((org.telegram.messenger.fj) arrayList.get(i12)).f24024z0;
                        fjVar2.K5(ql0Var.L, true);
                        arrayList4.add(fjVar2);
                    }
                }
                org.telegram.messenger.g0.g3(new kl0(ql0Var, str, arrayList3, arrayList4));
                return;
            default:
                kv0 kv0Var = ql0Var.f38827a;
                if (str.equals(ql0Var.M)) {
                    if (ql0Var.f38833r == 0) {
                        ql0Var.O.b(0);
                    }
                    ql0Var.e(arrayList2, arrayList, true);
                    if (ql0Var.f38833r == 0) {
                        kv0Var.e(false, true);
                        k80 k80Var = kv0Var.f36896e;
                        kv0Var.d.setText(org.telegram.messenger.gd.M0(2131745605, null));
                        k80Var.setVisibility(0);
                        k80Var.setText(org.telegram.messenger.gd.M0(2131745612, null));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public kl0(ql0 ql0Var, ArrayList arrayList, String str, ArrayList arrayList2) {
        this.f36825b = ql0Var;
        this.d = arrayList;
        this.f36826c = str;
        this.f36827e = arrayList2;
    }
}
