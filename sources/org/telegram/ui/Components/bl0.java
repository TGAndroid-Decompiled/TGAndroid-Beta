package org.telegram.ui.Components;

import java.util.ArrayList;
public final class bl0 implements Runnable {
    public final int f32317a = 1;
    public final hl0 f32318b;
    public final String f32319c;
    public final ArrayList d;
    public final ArrayList f32320e;

    public bl0(hl0 hl0Var, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.f32318b = hl0Var;
        this.f32319c = str;
        this.d = arrayList;
        this.f32320e = arrayList2;
    }

    @Override
    public final void run() {
        int i3 = this.f32317a;
        ArrayList arrayList = this.f32320e;
        ArrayList arrayList2 = this.d;
        String str = this.f32319c;
        hl0 hl0Var = this.f32318b;
        switch (i3) {
            case 0:
                int i10 = hl0Var.d;
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    String B = org.telegram.messenger.w7.B(((org.telegram.messenger.zi) arrayList2.get(i11)).F0());
                    if (B != null && B.toLowerCase().contains(str)) {
                        org.telegram.messenger.zi ziVar = new org.telegram.messenger.zi(i10, ((org.telegram.messenger.zi) arrayList2.get(i11)).f26868k, false, false);
                        ziVar.f26917x0 = ((org.telegram.messenger.zi) arrayList2.get(i11)).f26917x0;
                        ziVar.L5(hl0Var.L, true);
                        arrayList3.add(ziVar);
                    }
                }
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    String B2 = org.telegram.messenger.w7.B(((org.telegram.messenger.zi) arrayList.get(i12)).F0());
                    if (B2 != null && B2.toLowerCase().contains(str)) {
                        org.telegram.messenger.zi ziVar2 = new org.telegram.messenger.zi(i10, ((org.telegram.messenger.zi) arrayList.get(i12)).f26868k, false, false);
                        ziVar2.f26917x0 = ((org.telegram.messenger.zi) arrayList.get(i12)).f26917x0;
                        ziVar2.L5(hl0Var.L, true);
                        arrayList4.add(ziVar2);
                    }
                }
                org.telegram.messenger.g0.h3(new bl0(hl0Var, str, arrayList3, arrayList4));
                return;
            default:
                zu0 zu0Var = hl0Var.f34442a;
                if (str.equals(hl0Var.M)) {
                    if (hl0Var.f34448r == 0) {
                        hl0Var.O.b(0);
                    }
                    hl0Var.e(arrayList2, arrayList, true);
                    if (hl0Var.f34448r == 0) {
                        zu0Var.e(false, true);
                        s70 s70Var = zu0Var.f41128e;
                        zu0Var.d.setText(org.telegram.messenger.bd.M0(2131745810, null));
                        s70Var.setVisibility(0);
                        s70Var.setText(org.telegram.messenger.bd.M0(2131745817, null));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public bl0(hl0 hl0Var, ArrayList arrayList, String str, ArrayList arrayList2) {
        this.f32318b = hl0Var;
        this.d = arrayList;
        this.f32319c = str;
        this.f32320e = arrayList2;
    }
}
