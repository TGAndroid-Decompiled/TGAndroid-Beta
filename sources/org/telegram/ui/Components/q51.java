package org.telegram.ui.Components;

import java.util.ArrayList;
public final class q51 {
    public final boolean f37199a;
    public final int f37200b;
    public final int f37201c;
    public final ArrayList d;

    public q51(s51 s51Var) {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.f37199a = s51Var.f37926b;
        this.f37200b = s51Var.f37931i;
        this.f37201c = s51Var.f37932j;
        arrayList.add(s51Var);
    }

    public final s51 a() {
        ArrayList arrayList = this.d;
        s51 s51Var = null;
        if (arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            s51 s51Var2 = (s51) obj;
            if (s51Var2.b()) {
                return s51Var2;
            }
        }
        long j3 = Long.MAX_VALUE;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            s51 s51Var3 = (s51) arrayList.get(i10);
            if (s51Var3.f37933k < j3 && u51.D0(s51Var3.f37935m)) {
                j3 = s51Var3.f37933k;
                s51Var = s51Var3;
            }
        }
        if (s51Var != null) {
            return s51Var;
        }
        return (s51) arrayList.get(0);
    }

    public final int b() {
        int min = Math.min(this.f37200b, this.f37201c);
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
        boolean z9 = org.telegram.messenger.iz.R0;
        boolean z10 = this.f37199a;
        String str2 = "";
        if (z9) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f37200b);
            sb2.append("x");
            sb2.append(this.f37201c);
            if (!z10) {
                str = "";
            } else {
                str = " (" + org.telegram.messenger.id.M0(2131746450, null) + ")";
            }
            sb2.append(str);
            sb2.append("\n");
            ArrayList arrayList = this.d;
            sb2.append(org.telegram.messenger.g0.i0((long) ((s51) arrayList.get(0)).f37934l, false, false).replace(" ", ""));
            sb2.append("/s");
            if (((s51) arrayList.get(0)).f37935m != null) {
                str2 = ", " + ((s51) arrayList.get(0)).f37935m;
            }
            sb2.append(str2);
            return sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(b());
        sb3.append("p");
        if (z10) {
            str2 = " (" + org.telegram.messenger.id.M0(2131746450, null) + ")";
        }
        sb3.append(str2);
        return sb3.toString();
    }
}
