package org.telegram.ui;

import java.util.ArrayList;
public final class q8 implements Runnable {
    public final int f48972a;
    public final int f48973b;
    public final Object f48974c;
    public final Object d;

    public q8(int i7, Object obj, Object obj2, int i10) {
        this.f48972a = i10;
        this.f48973b = i7;
        this.f48974c = obj;
        this.d = obj2;
    }

    private final void a() {
        int i7;
        org.telegram.ui.Components.sz0 sz0Var = (org.telegram.ui.Components.sz0) this.d;
        String str = (String) this.f48974c;
        int i10 = this.f48973b;
        org.telegram.ui.Components.rz0 rz0Var = sz0Var.f38202r.f31589o1;
        try {
            String lowerCase = str.trim().toLowerCase();
            if (lowerCase.length() == 0) {
                sz0Var.d = -1;
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.qp0(sz0Var, sz0Var.d, new ArrayList(), new ArrayList(), 4));
                return;
            }
            int i11 = 0;
            String S0 = org.telegram.messenger.id.E0().S0(lowerCase, true, false);
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
            int size = rz0Var.d.size();
            int i13 = 0;
            while (i13 < size) {
                ArrayList arrayList3 = (ArrayList) rz0Var.d.get(i13);
                String c10 = org.telegram.ui.ActionBar.u4.c(((org.telegram.ui.ActionBar.u6) arrayList3.get(i11)).f28603e);
                String lowerCase2 = c10.toLowerCase();
                int i14 = i11;
                while (true) {
                    if (i14 < i12) {
                        String str2 = strArr[i14];
                        if (lowerCase2.contains(str2)) {
                            arrayList.add(arrayList3);
                            arrayList2.add(org.telegram.ui.Components.sz0.E(c10, str2));
                            break;
                        }
                        i14++;
                    }
                }
                i13++;
                i11 = 0;
            }
            org.telegram.messenger.g0.h3(new org.telegram.ui.Components.qp0(sz0Var, i10, arrayList, arrayList2, 4));
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.q8.run():void");
    }

    public q8(Object obj, int i7, Object obj2, int i10) {
        this.f48972a = i10;
        this.f48974c = obj;
        this.f48973b = i7;
        this.d = obj2;
    }

    public q8(Object obj, Object obj2, int i7, int i10) {
        this.f48972a = i10;
        this.f48974c = obj;
        this.d = obj2;
        this.f48973b = i7;
    }

    public q8(Object obj, String str, int i7, int i10) {
        this.f48972a = i10;
        this.d = obj;
        this.f48974c = str;
        this.f48973b = i7;
    }

    public q8(org.telegram.ui.Components.v20 v20Var, int i7, String str) {
        this.f48972a = 10;
        this.d = v20Var;
        this.f48973b = i7;
        this.f48974c = str;
    }
}
