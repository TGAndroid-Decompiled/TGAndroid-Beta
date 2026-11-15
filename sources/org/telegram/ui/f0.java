package org.telegram.ui;

import java.util.ArrayList;
public final class f0 implements Runnable {
    public final int f46931a;
    public final int f46932b;
    public final Object f46933c;
    public final Object d;

    public f0(int i7, Object obj, Object obj2, int i10) {
        this.f46931a = i10;
        this.f46932b = i7;
        this.f46933c = obj;
        this.d = obj2;
    }

    private final void a() {
        int i7;
        org.telegram.ui.Components.tz0 tz0Var = (org.telegram.ui.Components.tz0) this.f46933c;
        String str = (String) this.d;
        int i10 = this.f46932b;
        org.telegram.ui.Components.sz0 sz0Var = tz0Var.f39840r.f32766s1;
        try {
            String lowerCase = str.trim().toLowerCase();
            if (lowerCase.length() == 0) {
                tz0Var.d = -1;
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.sp0(tz0Var, tz0Var.d, new ArrayList(), new ArrayList(), 4));
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
            int size = sz0Var.d.size();
            int i13 = 0;
            while (i13 < size) {
                ArrayList arrayList3 = (ArrayList) sz0Var.d.get(i13);
                String c10 = org.telegram.ui.ActionBar.s4.c(((org.telegram.ui.ActionBar.s6) arrayList3.get(i11)).f29600e);
                String lowerCase2 = c10.toLowerCase();
                int i14 = i11;
                while (true) {
                    if (i14 < i12) {
                        String str2 = strArr[i14];
                        if (lowerCase2.contains(str2)) {
                            arrayList.add(arrayList3);
                            arrayList2.add(org.telegram.ui.Components.tz0.E(c10, str2));
                            break;
                        }
                        i14++;
                    }
                }
                i13++;
                i11 = 0;
            }
            org.telegram.messenger.g0.h3(new org.telegram.ui.Components.sp0(tz0Var, i10, arrayList, arrayList2, 4));
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.f0.run():void");
    }

    public f0(Object obj, int i7, Object obj2, int i10) {
        this.f46931a = i10;
        this.f46933c = obj;
        this.f46932b = i7;
        this.d = obj2;
    }

    public f0(Object obj, Object obj2, int i7, int i10) {
        this.f46931a = i10;
        this.f46933c = obj;
        this.d = obj2;
        this.f46932b = i7;
    }

    public f0(e4 e4Var, int i7, int[] iArr, int[] iArr2) {
        this.f46931a = 2;
        this.f46933c = e4Var;
        this.f46932b = i7;
        this.d = iArr2;
    }
}
