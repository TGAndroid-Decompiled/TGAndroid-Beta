package org.telegram.ui.Components;

import java.util.ArrayList;
public final class r51 {
    public final boolean f38885a;
    public final int f38886b;
    public final int f38887c;
    public final ArrayList d;

    public r51(t51 t51Var) {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.f38885a = t51Var.f39544b;
        this.f38886b = t51Var.f39549i;
        this.f38887c = t51Var.f39550j;
        arrayList.add(t51Var);
    }

    public final t51 a() {
        ArrayList arrayList = this.d;
        t51 t51Var = null;
        if (arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            t51 t51Var2 = (t51) obj;
            if (t51Var2.b()) {
                return t51Var2;
            }
        }
        long j3 = Long.MAX_VALUE;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            t51 t51Var3 = (t51) arrayList.get(i10);
            if (t51Var3.f39551k < j3 && u51.D0(t51Var3.f39553m)) {
                j3 = t51Var3.f39551k;
                t51Var = t51Var3;
            }
        }
        if (t51Var != null) {
            return t51Var;
        }
        return (t51) arrayList.get(0);
    }

    public final int b() {
        int min = Math.min(this.f38886b, this.f38887c);
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
        boolean z10 = org.telegram.messenger.gz.R0;
        boolean z11 = this.f38885a;
        String str2 = "";
        if (z10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f38886b);
            sb2.append("x");
            sb2.append(this.f38887c);
            if (!z11) {
                str = "";
            } else {
                str = " (" + org.telegram.messenger.hd.M0(2131746450, null) + ")";
            }
            sb2.append(str);
            sb2.append("\n");
            ArrayList arrayList = this.d;
            sb2.append(org.telegram.messenger.g0.i0((long) ((t51) arrayList.get(0)).f39552l, false, false).replace(" ", ""));
            sb2.append("/s");
            if (((t51) arrayList.get(0)).f39553m != null) {
                str2 = ", " + ((t51) arrayList.get(0)).f39553m;
            }
            sb2.append(str2);
            return sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(b());
        sb3.append("p");
        if (z11) {
            str2 = " (" + org.telegram.messenger.hd.M0(2131746450, null) + ")";
        }
        sb3.append(str2);
        return sb3.toString();
    }
}
