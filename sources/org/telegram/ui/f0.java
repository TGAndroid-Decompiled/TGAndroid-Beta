package org.telegram.ui;

import java.util.ArrayList;
public final class f0 implements Runnable {
    public final int f47652a;
    public final int f47653b;
    public final Object f47654c;
    public final Object d;

    public f0(int i7, Object obj, Object obj2, int i10) {
        this.f47652a = i10;
        this.f47653b = i7;
        this.f47654c = obj;
        this.d = obj2;
    }

    private final void a() {
        int i7;
        org.telegram.ui.Components.b01 b01Var = (org.telegram.ui.Components.b01) this.f47654c;
        String str = (String) this.d;
        int i10 = this.f47653b;
        org.telegram.ui.Components.a01 a01Var = b01Var.f33595r.f33263s1;
        try {
            String lowerCase = str.trim().toLowerCase();
            if (lowerCase.length() == 0) {
                b01Var.d = -1;
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.kp0(b01Var, b01Var.d, new ArrayList(), new ArrayList(), 6));
                return;
            }
            int i11 = 0;
            String T0 = org.telegram.messenger.gd.E0().T0(lowerCase, true, false);
            T0 = (lowerCase.equals(T0) || T0.length() == 0) ? null : null;
            if (T0 != null) {
                i7 = 1;
            } else {
                i7 = 0;
            }
            int i12 = i7 + 1;
            String[] strArr = new String[i12];
            strArr[0] = lowerCase;
            if (T0 != null) {
                strArr[1] = T0;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = a01Var.d.size();
            int i13 = 0;
            while (i13 < size) {
                ArrayList arrayList3 = (ArrayList) a01Var.d.get(i13);
                String c10 = org.telegram.ui.ActionBar.v4.c(((org.telegram.ui.ActionBar.w6) arrayList3.get(i11)).f30281e);
                String lowerCase2 = c10.toLowerCase();
                int i14 = i11;
                while (true) {
                    if (i14 < i12) {
                        String str2 = strArr[i14];
                        if (lowerCase2.contains(str2)) {
                            arrayList.add(arrayList3);
                            arrayList2.add(org.telegram.ui.Components.b01.E(c10, str2));
                            break;
                        }
                        i14++;
                    }
                }
                i13++;
                i11 = 0;
            }
            org.telegram.messenger.g0.g3(new org.telegram.ui.Components.kp0(b01Var, i10, arrayList, arrayList2, 6));
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.f0.run():void");
    }

    public f0(Object obj, int i7, Object obj2, int i10) {
        this.f47652a = i10;
        this.f47654c = obj;
        this.f47653b = i7;
        this.d = obj2;
    }

    public f0(Object obj, Object obj2, int i7, int i10) {
        this.f47652a = i10;
        this.f47654c = obj;
        this.d = obj2;
        this.f47653b = i7;
    }

    public f0(e4 e4Var, int i7, int[] iArr, int[] iArr2) {
        this.f47652a = 2;
        this.f47654c = e4Var;
        this.f47653b = i7;
        this.d = iArr2;
    }
}
