package org.telegram.ui;

import java.util.ArrayList;
public final class q8 implements Runnable {
    public final int f49166a;
    public final int f49167b;
    public final Object f49168c;
    public final Object d;

    public q8(int i7, Object obj, Object obj2, int i10) {
        this.f49166a = i10;
        this.f49167b = i7;
        this.f49168c = obj;
        this.d = obj2;
    }

    private final void a() {
        int i7;
        org.telegram.ui.Components.qz0 qz0Var = (org.telegram.ui.Components.qz0) this.d;
        String str = (String) this.f49168c;
        int i10 = this.f49167b;
        org.telegram.ui.Components.pz0 pz0Var = qz0Var.f37434r.f31579o1;
        try {
            String lowerCase = str.trim().toLowerCase();
            if (lowerCase.length() == 0) {
                qz0Var.d = -1;
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.pp0(qz0Var, qz0Var.d, new ArrayList(), new ArrayList(), 4));
                return;
            }
            int i11 = 0;
            String S0 = org.telegram.messenger.hd.E0().S0(lowerCase, true, false);
            S0 = (lowerCase.equals(S0) || S0.length() == 0) ? null : null;
            if (S0 != null) {
                i7 = 1;
            } else {
                i7 = 0;
            }
            int i12 = i7 + 1;
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
                String c10 = org.telegram.ui.ActionBar.u4.c(((org.telegram.ui.ActionBar.t6) arrayList3.get(i11)).f28534e);
                String lowerCase2 = c10.toLowerCase();
                int i14 = i11;
                while (true) {
                    if (i14 < i12) {
                        String str2 = strArr[i14];
                        if (lowerCase2.contains(str2)) {
                            arrayList.add(arrayList3);
                            arrayList2.add(org.telegram.ui.Components.qz0.E(c10, str2));
                            break;
                        }
                        i14++;
                    }
                }
                i13++;
                i11 = 0;
            }
            org.telegram.messenger.g0.h3(new org.telegram.ui.Components.pp0(qz0Var, i10, arrayList, arrayList2, 4));
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.q8.run():void");
    }

    public q8(Object obj, int i7, Object obj2, int i10) {
        this.f49166a = i10;
        this.f49168c = obj;
        this.f49167b = i7;
        this.d = obj2;
    }

    public q8(Object obj, Object obj2, int i7, int i10) {
        this.f49166a = i10;
        this.f49168c = obj;
        this.d = obj2;
        this.f49167b = i7;
    }

    public q8(Object obj, String str, int i7, int i10) {
        this.f49166a = i10;
        this.d = obj;
        this.f49168c = str;
        this.f49167b = i7;
    }

    public q8(org.telegram.ui.Components.u20 u20Var, int i7, String str) {
        this.f49166a = 10;
        this.d = u20Var;
        this.f49167b = i7;
        this.f49168c = str;
    }
}
