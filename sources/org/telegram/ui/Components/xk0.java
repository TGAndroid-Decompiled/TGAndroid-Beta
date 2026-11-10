package org.telegram.ui.Components;

import java.util.ArrayList;
public final class xk0 implements Runnable {
    public final int f40323a = 1;
    public final dl0 f40324b;
    public final String f40325c;
    public final ArrayList d;
    public final ArrayList f40326e;

    public xk0(dl0 dl0Var, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.f40324b = dl0Var;
        this.f40325c = str;
        this.d = arrayList;
        this.f40326e = arrayList2;
    }

    @Override
    public final void run() {
        int i7 = this.f40323a;
        ArrayList arrayList = this.f40326e;
        ArrayList arrayList2 = this.d;
        String str = this.f40325c;
        dl0 dl0Var = this.f40324b;
        switch (i7) {
            case 0:
                int i10 = dl0Var.d;
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    String B = org.telegram.messenger.w7.B(((org.telegram.messenger.ij) arrayList2.get(i11)).F0());
                    if (B != null && B.toLowerCase().contains(str)) {
                        org.telegram.messenger.ij ijVar = new org.telegram.messenger.ij(i10, ((org.telegram.messenger.ij) arrayList2.get(i11)).f23266k, false, false);
                        ijVar.f23315x0 = ((org.telegram.messenger.ij) arrayList2.get(i11)).f23315x0;
                        ijVar.K5(dl0Var.K, true);
                        arrayList3.add(ijVar);
                    }
                }
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    String B2 = org.telegram.messenger.w7.B(((org.telegram.messenger.ij) arrayList.get(i12)).F0());
                    if (B2 != null && B2.toLowerCase().contains(str)) {
                        org.telegram.messenger.ij ijVar2 = new org.telegram.messenger.ij(i10, ((org.telegram.messenger.ij) arrayList.get(i12)).f23266k, false, false);
                        ijVar2.f23315x0 = ((org.telegram.messenger.ij) arrayList.get(i12)).f23315x0;
                        ijVar2.K5(dl0Var.K, true);
                        arrayList4.add(ijVar2);
                    }
                }
                org.telegram.messenger.g0.h3(new xk0(dl0Var, str, arrayList3, arrayList4));
                return;
            default:
                bv0 bv0Var = dl0Var.f33022a;
                if (str.equals(dl0Var.L)) {
                    if (dl0Var.f33028r == 0) {
                        dl0Var.N.b(0);
                    }
                    dl0Var.e(arrayList2, arrayList, true);
                    if (dl0Var.f33028r == 0) {
                        bv0Var.e(false, true);
                        w70 w70Var = bv0Var.f32368e;
                        bv0Var.d.setText(org.telegram.messenger.id.M0(2131745800, null));
                        w70Var.setVisibility(0);
                        w70Var.setText(org.telegram.messenger.id.M0(2131745807, null));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public xk0(dl0 dl0Var, ArrayList arrayList, String str, ArrayList arrayList2) {
        this.f40324b = dl0Var;
        this.d = arrayList;
        this.f40325c = str;
        this.f40326e = arrayList2;
    }
}
