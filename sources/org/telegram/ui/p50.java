package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class p50 implements Runnable {
    public final int f48466a;
    public final kg.m1 f48467b;
    public final String f48468c;

    public p50(kg.m1 m1Var, String str, int i3) {
        this.f48466a = i3;
        this.f48467b = m1Var;
        this.f48468c = str;
    }

    @Override
    public final void run() {
        int i3;
        switch (this.f48466a) {
            case 0:
                Utilities.f21389g.c(new p50(this.f48467b, this.f48468c, 1));
                return;
            default:
                kg.m1 m1Var = this.f48467b;
                String str = this.f48468c;
                q50 q50Var = (q50) m1Var.f17100c;
                String lowerCase = str.trim().toLowerCase();
                if (lowerCase.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    q50Var.getClass();
                    org.telegram.messenger.g0.h3(new pp(q50Var, arrayList, arrayList2, 12));
                    return;
                }
                boolean z10 = true;
                String S0 = org.telegram.messenger.bd.E0().S0(lowerCase, true, false);
                if (lowerCase.equals(S0) || S0.isEmpty()) {
                    S0 = null;
                }
                if (S0 != null) {
                    i3 = 1;
                } else {
                    i3 = 0;
                }
                int i10 = i3 + 1;
                String[] strArr = new String[i10];
                strArr[0] = lowerCase;
                if (S0 != null) {
                    strArr[1] = S0;
                }
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                int i11 = 0;
                while (i11 < q50Var.f48755n.f49708w.size()) {
                    org.telegram.messenger.d5 d5Var = (org.telegram.messenger.d5) q50Var.f48755n.f49708w.get(i11);
                    String lowerCase2 = org.telegram.messenger.g5.m(0, d5Var.f22153i, d5Var.f22154j).toLowerCase();
                    String S02 = org.telegram.messenger.bd.E0().S0(lowerCase2, z10, false);
                    if (lowerCase2.equals(S02)) {
                        S02 = null;
                    }
                    int i12 = 0;
                    boolean z11 = false;
                    while (true) {
                        if (i12 < i10) {
                            String str2 = strArr[i12];
                            if (lowerCase2.startsWith(str2) || k2.p1.z(" ", str2, lowerCase2) || (S02 != null && (S02.startsWith(str2) || k2.p1.z(" ", str2, S02)))) {
                                z11 = true;
                            }
                            if (z11) {
                                arrayList4.add(org.telegram.messenger.g0.r0(d5Var.f22153i, d5Var.f22154j, str2));
                                arrayList3.add(d5Var);
                            } else {
                                i12++;
                            }
                        }
                    }
                    i11++;
                    z10 = true;
                }
                org.telegram.messenger.g0.h3(new pp(q50Var, arrayList3, arrayList4, 12));
                return;
        }
    }
}
