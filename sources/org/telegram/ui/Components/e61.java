package org.telegram.ui.Components;

import java.util.ArrayList;
public final class e61 {
    public final boolean f34584a;
    public final int f34585b;
    public final int f34586c;
    public final ArrayList d;

    public e61(g61 g61Var) {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.f34584a = g61Var.f35334b;
        this.f34585b = g61Var.f35339i;
        this.f34586c = g61Var.f35340j;
        arrayList.add(g61Var);
    }

    public final g61 a() {
        ArrayList arrayList = this.d;
        g61 g61Var = null;
        if (arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            g61 g61Var2 = (g61) obj;
            if (g61Var2.b()) {
                return g61Var2;
            }
        }
        long j3 = Long.MAX_VALUE;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            g61 g61Var3 = (g61) arrayList.get(i10);
            if (g61Var3.f35341k < j3 && h61.D0(g61Var3.f35343m)) {
                j3 = g61Var3.f35341k;
                g61Var = g61Var3;
            }
        }
        if (g61Var != null) {
            return g61Var;
        }
        return (g61) arrayList.get(0);
    }

    public final int b() {
        int min = Math.min(this.f34585b, this.f34586c);
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
        boolean z11 = this.f34584a;
        String str2 = "";
        if (z10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f34585b);
            sb2.append("x");
            sb2.append(this.f34586c);
            if (!z11) {
                str = "";
            } else {
                str = " (" + org.telegram.messenger.gd.N0(2131746254, null) + ")";
            }
            sb2.append(str);
            sb2.append("\n");
            ArrayList arrayList = this.d;
            sb2.append(org.telegram.messenger.g0.i0((long) ((g61) arrayList.get(0)).f35342l, false, false).replace(" ", ""));
            sb2.append("/s");
            if (((g61) arrayList.get(0)).f35343m != null) {
                str2 = ", " + ((g61) arrayList.get(0)).f35343m;
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
