package org.telegram.ui.Components;

import java.util.ArrayList;
public final class s61 {
    public final boolean f30224a;
    public final int f30225b;
    public final int f30226c;
    public final ArrayList d;

    public s61(u61 u61Var) {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.f30224a = u61Var.f30871b;
        this.f30225b = u61Var.f30875i;
        this.f30226c = u61Var.f30876j;
        arrayList.add(u61Var);
    }

    public final u61 a() {
        ArrayList arrayList = this.d;
        u61 u61Var = null;
        if (arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            u61 u61Var2 = (u61) obj;
            if (u61Var2.b()) {
                return u61Var2;
            }
        }
        long j10 = Long.MAX_VALUE;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            u61 u61Var3 = (u61) arrayList.get(i11);
            if (u61Var3.f30877k < j10 && v61.D0(u61Var3.f30879m)) {
                j10 = u61Var3.f30877k;
                u61Var = u61Var3;
            }
        }
        if (u61Var != null) {
            return u61Var;
        }
        return (u61) arrayList.get(0);
    }

    public final int b() {
        int min = Math.min(this.f30225b, this.f30226c);
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
        boolean z10 = org.telegram.messenger.uz.R0;
        boolean z11 = this.f30224a;
        String str2 = "";
        if (z10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f30225b);
            sb2.append("x");
            sb2.append(this.f30226c);
            if (!z11) {
                str = "";
            } else {
                str = " (" + org.telegram.messenger.dd.L0(2131746465, null) + ")";
            }
            sb2.append(str);
            sb2.append("\n");
            ArrayList arrayList = this.d;
            sb2.append(org.telegram.messenger.i0.i0((long) ((u61) arrayList.get(0)).f30878l, false, false).replace(" ", ""));
            sb2.append("/s");
            if (((u61) arrayList.get(0)).f30879m != null) {
                str2 = ", " + ((u61) arrayList.get(0)).f30879m;
            }
            sb2.append(str2);
            return sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(b());
        sb3.append("p");
        if (z11) {
            str2 = " (" + org.telegram.messenger.dd.L0(2131746465, null) + ")";
        }
        sb3.append(str2);
        return sb3.toString();
    }
}
