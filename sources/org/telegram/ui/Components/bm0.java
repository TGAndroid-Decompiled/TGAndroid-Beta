package org.telegram.ui.Components;

import java.util.ArrayList;
public final class bm0 implements Runnable {
    public final int f24893a = 1;
    public final hm0 f24894b;
    public final String f24895c;
    public final ArrayList d;
    public final ArrayList e;

    public bm0(hm0 hm0Var, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.f24894b = hm0Var;
        this.f24895c = str;
        this.d = arrayList;
        this.e = arrayList2;
    }

    @Override
    public final void run() {
        int i10 = this.f24893a;
        ArrayList arrayList = this.e;
        ArrayList arrayList2 = this.d;
        String str = this.f24895c;
        hm0 hm0Var = this.f24894b;
        switch (i10) {
            case 0:
                int i11 = hm0Var.d;
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    String B = org.telegram.messenger.b8.B(((org.telegram.messenger.kj) arrayList2.get(i12)).F0());
                    if (B != null && B.toLowerCase().contains(str)) {
                        org.telegram.messenger.kj kjVar = new org.telegram.messenger.kj(i11, ((org.telegram.messenger.kj) arrayList2.get(i12)).f16690k, false, false);
                        kjVar.f16740x0 = ((org.telegram.messenger.kj) arrayList2.get(i12)).f16740x0;
                        kjVar.J5(hm0Var.K, true);
                        arrayList3.add(kjVar);
                    }
                }
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    String B2 = org.telegram.messenger.b8.B(((org.telegram.messenger.kj) arrayList.get(i13)).F0());
                    if (B2 != null && B2.toLowerCase().contains(str)) {
                        org.telegram.messenger.kj kjVar2 = new org.telegram.messenger.kj(i11, ((org.telegram.messenger.kj) arrayList.get(i13)).f16690k, false, false);
                        kjVar2.f16740x0 = ((org.telegram.messenger.kj) arrayList.get(i13)).f16740x0;
                        kjVar2.J5(hm0Var.K, true);
                        arrayList4.add(kjVar2);
                    }
                }
                org.telegram.messenger.i0.g3(new bm0(hm0Var, str, arrayList3, arrayList4));
                return;
            default:
                ew0 ew0Var = hm0Var.f26858a;
                if (str.equals(hm0Var.L)) {
                    if (hm0Var.f26863r == 0) {
                        hm0Var.N.b(0);
                    }
                    hm0Var.e(arrayList2, arrayList, true);
                    if (hm0Var.f26863r == 0) {
                        ew0Var.e(false, true);
                        p80 p80Var = ew0Var.e;
                        ew0Var.d.setText(org.telegram.messenger.dd.L0(2131745817, null));
                        p80Var.setVisibility(0);
                        p80Var.setText(org.telegram.messenger.dd.L0(2131745824, null));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public bm0(hm0 hm0Var, ArrayList arrayList, String str, ArrayList arrayList2) {
        this.f24894b = hm0Var;
        this.d = arrayList;
        this.f24895c = str;
        this.e = arrayList2;
    }
}
