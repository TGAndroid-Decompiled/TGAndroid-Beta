package org.telegram.ui;

import java.util.ArrayList;
public final class f4 implements Runnable {
    public final int f45137a;
    public final int f45138b;
    public final Object f45139c;
    public final Object d;

    public f4(int i3, Object obj, Object obj2, int i10) {
        this.f45137a = i10;
        this.f45138b = i3;
        this.f45139c = obj;
        this.d = obj2;
    }

    private final void a() {
        int i3;
        org.telegram.ui.Components.qz0 qz0Var = (org.telegram.ui.Components.qz0) this.f45139c;
        String str = (String) this.d;
        int i10 = this.f45138b;
        org.telegram.ui.Components.pz0 pz0Var = qz0Var.f37577r.f31658p1;
        try {
            String lowerCase = str.trim().toLowerCase();
            if (lowerCase.length() == 0) {
                qz0Var.d = -1;
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.zo0(qz0Var, qz0Var.d, new ArrayList(), new ArrayList(), 5));
                return;
            }
            int i11 = 0;
            String S0 = org.telegram.messenger.bd.E0().S0(lowerCase, true, false);
            S0 = (lowerCase.equals(S0) || S0.length() == 0) ? null : null;
            if (S0 != null) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            int i12 = i3 + 1;
            String[] strArr = new String[i12];
            strArr[0] = lowerCase;
            if (S0 != null) {
                strArr[1] = S0;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = pz0Var.d.size();
            int i13 = 0;
            while (i13 < size) {
                ArrayList arrayList3 = (ArrayList) pz0Var.d.get(i13);
                String c2 = org.telegram.ui.ActionBar.u4.c(((org.telegram.ui.ActionBar.t6) arrayList3.get(i11)).f28659e);
                String lowerCase2 = c2.toLowerCase();
                int i14 = i11;
                while (true) {
                    if (i14 < i12) {
                        String str2 = strArr[i14];
                        if (lowerCase2.contains(str2)) {
                            arrayList.add(arrayList3);
                            arrayList2.add(org.telegram.ui.Components.qz0.E(c2, str2));
                            break;
                        }
                        i14++;
                    }
                }
                i13++;
                i11 = 0;
            }
            org.telegram.messenger.g0.h3(new org.telegram.ui.Components.zo0(qz0Var, i10, arrayList, arrayList2, 5));
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.f4.run():void");
    }

    public f4(Object obj, int i3, Object obj2, int i10) {
        this.f45137a = i10;
        this.f45139c = obj;
        this.f45138b = i3;
        this.d = obj2;
    }

    public f4(Object obj, Object obj2, int i3, int i10) {
        this.f45137a = i10;
        this.f45139c = obj;
        this.d = obj2;
        this.f45138b = i3;
    }

    public f4(g4 g4Var, int i3, int[] iArr, int[] iArr2) {
        this.f45137a = 0;
        this.f45139c = g4Var;
        this.f45138b = i3;
        this.d = iArr2;
    }
}
