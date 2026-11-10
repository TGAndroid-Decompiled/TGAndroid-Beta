package org.telegram.ui.Components;

import java.util.ArrayList;
public final class p51 {
    public final boolean f36798a;
    public final int f36799b;
    public final int f36800c;
    public final ArrayList d;

    public p51(r51 r51Var) {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.f36798a = r51Var.f37511b;
        this.f36799b = r51Var.f37516i;
        this.f36800c = r51Var.f37517j;
        arrayList.add(r51Var);
    }

    public final r51 a() {
        ArrayList arrayList = this.d;
        r51 r51Var = null;
        if (arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            r51 r51Var2 = (r51) obj;
            if (r51Var2.b()) {
                return r51Var2;
            }
        }
        long j3 = Long.MAX_VALUE;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            r51 r51Var3 = (r51) arrayList.get(i10);
            if (r51Var3.f37518k < j3 && t51.D0(r51Var3.f37520m)) {
                j3 = r51Var3.f37518k;
                r51Var = r51Var3;
            }
        }
        if (r51Var != null) {
            return r51Var;
        }
        return (r51) arrayList.get(0);
    }

    public final int b() {
        int min = Math.min(this.f36799b, this.f36800c);
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
        boolean z10 = this.f36798a;
        String str2 = "";
        if (z9) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f36799b);
            sb2.append("x");
            sb2.append(this.f36800c);
            if (!z10) {
                str = "";
            } else {
                str = " (" + org.telegram.messenger.id.M0(2131746450, null) + ")";
            }
            sb2.append(str);
            sb2.append("\n");
            ArrayList arrayList = this.d;
            sb2.append(org.telegram.messenger.g0.i0((long) ((r51) arrayList.get(0)).f37519l, false, false).replace(" ", ""));
            sb2.append("/s");
            if (((r51) arrayList.get(0)).f37520m != null) {
                str2 = ", " + ((r51) arrayList.get(0)).f37520m;
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
