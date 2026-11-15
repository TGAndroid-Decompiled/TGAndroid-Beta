package org.telegram.ui.Components;

import java.util.ArrayList;
public final class cl0 implements Runnable {
    public final int f33626a = 1;
    public final il0 f33627b;
    public final String f33628c;
    public final ArrayList d;
    public final ArrayList f33629e;

    public cl0(il0 il0Var, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.f33627b = il0Var;
        this.f33628c = str;
        this.d = arrayList;
        this.f33629e = arrayList2;
    }

    @Override
    public final void run() {
        int i7 = this.f33626a;
        ArrayList arrayList = this.f33629e;
        ArrayList arrayList2 = this.d;
        String str = this.f33628c;
        il0 il0Var = this.f33627b;
        switch (i7) {
            case 0:
                int i10 = il0Var.d;
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    String B = org.telegram.messenger.w7.B(((org.telegram.messenger.gj) arrayList2.get(i11)).F0());
                    if (B != null && B.toLowerCase().contains(str)) {
                        org.telegram.messenger.gj gjVar = new org.telegram.messenger.gj(i10, ((org.telegram.messenger.gj) arrayList2.get(i11)).f23817k, false, false);
                        gjVar.f23876z0 = ((org.telegram.messenger.gj) arrayList2.get(i11)).f23876z0;
                        gjVar.K5(il0Var.L, true);
                        arrayList3.add(gjVar);
                    }
                }
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    String B2 = org.telegram.messenger.w7.B(((org.telegram.messenger.gj) arrayList.get(i12)).F0());
                    if (B2 != null && B2.toLowerCase().contains(str)) {
                        org.telegram.messenger.gj gjVar2 = new org.telegram.messenger.gj(i10, ((org.telegram.messenger.gj) arrayList.get(i12)).f23817k, false, false);
                        gjVar2.f23876z0 = ((org.telegram.messenger.gj) arrayList.get(i12)).f23876z0;
                        gjVar2.K5(il0Var.L, true);
                        arrayList4.add(gjVar2);
                    }
                }
                org.telegram.messenger.g0.h3(new cl0(il0Var, str, arrayList3, arrayList4));
                return;
            default:
                cv0 cv0Var = il0Var.f35651a;
                if (str.equals(il0Var.M)) {
                    if (il0Var.f35657r == 0) {
                        il0Var.O.b(0);
                    }
                    il0Var.e(arrayList2, arrayList, true);
                    if (il0Var.f35657r == 0) {
                        cv0Var.e(false, true);
                        z70 z70Var = cv0Var.f33707e;
                        cv0Var.d.setText(org.telegram.messenger.hd.M0(2131745800, null));
                        z70Var.setVisibility(0);
                        z70Var.setText(org.telegram.messenger.hd.M0(2131745807, null));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public cl0(il0 il0Var, ArrayList arrayList, String str, ArrayList arrayList2) {
        this.f33627b = il0Var;
        this.d = arrayList;
        this.f33628c = str;
        this.f33629e = arrayList2;
    }
}
