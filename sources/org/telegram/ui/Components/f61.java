package org.telegram.ui.Components;

import java.util.ArrayList;
public final class f61 {
    public final boolean f35099a;
    public final int f35100b;
    public final int f35101c;
    public final ArrayList d;

    public f61(h61 h61Var) {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.f35099a = h61Var.f35807b;
        this.f35100b = h61Var.f35812i;
        this.f35101c = h61Var.f35813j;
        arrayList.add(h61Var);
    }

    public final h61 a() {
        ArrayList arrayList = this.d;
        h61 h61Var = null;
        if (arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            h61 h61Var2 = (h61) obj;
            if (h61Var2.b()) {
                return h61Var2;
            }
        }
        long j3 = Long.MAX_VALUE;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            h61 h61Var3 = (h61) arrayList.get(i10);
            if (h61Var3.f35814k < j3 && i61.D0(h61Var3.f35816m)) {
                j3 = h61Var3.f35814k;
                h61Var = h61Var3;
            }
        }
        if (h61Var != null) {
            return h61Var;
        }
        return (h61) arrayList.get(0);
    }

    public final int b() {
        int min = Math.min(this.f35100b, this.f35101c);
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
        boolean z11 = this.f35099a;
        String str2 = "";
        if (z10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f35100b);
            sb2.append("x");
            sb2.append(this.f35101c);
            if (!z11) {
                str = "";
            } else {
                str = " (" + org.telegram.messenger.gd.N0(2131746254, null) + ")";
            }
            sb2.append(str);
            sb2.append("\n");
            ArrayList arrayList = this.d;
            sb2.append(org.telegram.messenger.g0.i0((long) ((h61) arrayList.get(0)).f35815l, false, false).replace(" ", ""));
            sb2.append("/s");
            if (((h61) arrayList.get(0)).f35816m != null) {
                str2 = ", " + ((h61) arrayList.get(0)).f35816m;
            }
            sb2.append(str2);
            return sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(b());
        sb3.append("p");
        if (z11) {
            str2 = " (" + org.telegram.messenger.gd.N0(2131746254, null) + ")";
        }
        sb3.append(str2);
        return sb3.toString();
    }
}
