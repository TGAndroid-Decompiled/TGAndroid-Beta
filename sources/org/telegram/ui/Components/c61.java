package org.telegram.ui.Components;

import java.util.ArrayList;
public final class c61 {
    public final boolean f33902a;
    public final int f33903b;
    public final int f33904c;
    public final ArrayList d;

    public c61(e61 e61Var) {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.f33902a = e61Var.f34623b;
        this.f33903b = e61Var.f34628i;
        this.f33904c = e61Var.f34629j;
        arrayList.add(e61Var);
    }

    public final e61 a() {
        ArrayList arrayList = this.d;
        e61 e61Var = null;
        if (arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            e61 e61Var2 = (e61) obj;
            if (e61Var2.b()) {
                return e61Var2;
            }
        }
        long j3 = Long.MAX_VALUE;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            e61 e61Var3 = (e61) arrayList.get(i10);
            if (e61Var3.f34630k < j3 && f61.D0(e61Var3.f34632m)) {
                j3 = e61Var3.f34630k;
                e61Var = e61Var3;
            }
        }
        if (e61Var != null) {
            return e61Var;
        }
        return (e61) arrayList.get(0);
    }

    public final int b() {
        int min = Math.min(this.f33903b, this.f33904c);
        if (Math.abs(min - 2160) < 55) {
            return 2160;
        }
        if (Math.abs(min - 1440) < 55) {
            return 1440;
        }
        if (Math.abs(min - 1080) < 55) {
            return 1080;
        }
        if (Math.abs(min - 720) < 55) {
            return 720;
        }
        if (Math.abs(min - 480) < 55) {
            return 480;
        }
        if (Math.abs(min - 360) < 55) {
            return 360;
        }
        if (Math.abs(min - 240) < 55) {
            return 240;
        }
        if (Math.abs(min - 144) < 55) {
            return 144;
        }
        return min;
    }

    public final String toString() {
        String str;
        boolean z10 = org.telegram.messenger.bz.R0;
        boolean z11 = this.f33902a;
        String str2 = "";
        if (z10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f33903b);
            sb2.append("x");
            sb2.append(this.f33904c);
            if (!z11) {
                str = "";
            } else {
                str = " (" + org.telegram.messenger.gd.M0(2131746255, null) + ")";
            }
            sb2.append(str);
            sb2.append("\n");
            ArrayList arrayList = this.d;
            sb2.append(org.telegram.messenger.g0.i0((long) ((e61) arrayList.get(0)).f34631l, false, false).replace(" ", ""));
            sb2.append("/s");
            if (((e61) arrayList.get(0)).f34632m != null) {
                str2 = ", " + ((e61) arrayList.get(0)).f34632m;
            }
            sb2.append(str2);
            return sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(b());
        sb3.append("p");
        if (z11) {
            str2 = " (" + org.telegram.messenger.gd.M0(2131746255, null) + ")";
        }
        sb3.append(str2);
        return sb3.toString();
    }
}
