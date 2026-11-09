package org.telegram.ui.Components;

import java.util.ArrayList;
public final class yk0 implements Runnable {
    public final int f40736a = 1;
    public final el0 f40737b;
    public final String f40738c;
    public final ArrayList d;
    public final ArrayList f40739e;

    public yk0(el0 el0Var, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.f40737b = el0Var;
        this.f40738c = str;
        this.d = arrayList;
        this.f40739e = arrayList2;
    }

    @Override
    public final void run() {
        int i7 = this.f40736a;
        ArrayList arrayList = this.f40739e;
        ArrayList arrayList2 = this.d;
        String str = this.f40738c;
        el0 el0Var = this.f40737b;
        switch (i7) {
            case 0:
                int i10 = el0Var.d;
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    String B = org.telegram.messenger.w7.B(((org.telegram.messenger.ij) arrayList2.get(i11)).F0());
                    if (B != null && B.toLowerCase().contains(str)) {
                        org.telegram.messenger.ij ijVar = new org.telegram.messenger.ij(i10, ((org.telegram.messenger.ij) arrayList2.get(i11)).f23262k, false, false);
                        ijVar.f23311x0 = ((org.telegram.messenger.ij) arrayList2.get(i11)).f23311x0;
                        ijVar.K5(el0Var.K, true);
                        arrayList3.add(ijVar);
                    }
                }
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    String B2 = org.telegram.messenger.w7.B(((org.telegram.messenger.ij) arrayList.get(i12)).F0());
                    if (B2 != null && B2.toLowerCase().contains(str)) {
                        org.telegram.messenger.ij ijVar2 = new org.telegram.messenger.ij(i10, ((org.telegram.messenger.ij) arrayList.get(i12)).f23262k, false, false);
                        ijVar2.f23311x0 = ((org.telegram.messenger.ij) arrayList.get(i12)).f23311x0;
                        ijVar2.K5(el0Var.K, true);
                        arrayList4.add(ijVar2);
                    }
                }
                org.telegram.messenger.g0.h3(new yk0(el0Var, str, arrayList3, arrayList4));
                return;
            default:
                cv0 cv0Var = el0Var.f33437a;
                if (str.equals(el0Var.L)) {
                    if (el0Var.f33443r == 0) {
                        el0Var.N.b(0);
                    }
                    el0Var.e(arrayList2, arrayList, true);
                    if (el0Var.f33443r == 0) {
                        cv0Var.e(false, true);
                        x70 x70Var = cv0Var.f32768e;
                        cv0Var.d.setText(org.telegram.messenger.id.M0(2131745800, null));
                        x70Var.setVisibility(0);
                        x70Var.setText(org.telegram.messenger.id.M0(2131745807, null));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public yk0(el0 el0Var, ArrayList arrayList, String str, ArrayList arrayList2) {
        this.f40737b = el0Var;
        this.d = arrayList;
        this.f40738c = str;
        this.f40739e = arrayList2;
    }
}
