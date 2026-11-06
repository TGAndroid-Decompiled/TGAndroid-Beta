package org.telegram.ui.Components;

import java.util.ArrayList;
public final class o51 {
    public final boolean f36516a;
    public final int f36517b;
    public final int f36518c;
    public final ArrayList d;

    public o51(q51 q51Var) {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.f36516a = q51Var.f37151b;
        this.f36517b = q51Var.f37156i;
        this.f36518c = q51Var.f37157j;
        arrayList.add(q51Var);
    }

    public final q51 a() {
        ArrayList arrayList = this.d;
        q51 q51Var = null;
        if (arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            q51 q51Var2 = (q51) obj;
            if (q51Var2.b()) {
                return q51Var2;
            }
        }
        long j3 = Long.MAX_VALUE;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            q51 q51Var3 = (q51) arrayList.get(i10);
            if (q51Var3.f37158k < j3 && s51.D0(q51Var3.f37160m)) {
                j3 = q51Var3.f37158k;
                q51Var = q51Var3;
            }
        }
        if (q51Var != null) {
            return q51Var;
        }
        return (q51) arrayList.get(0);
    }

    public final int b() {
        int min = Math.min(this.f36517b, this.f36518c);
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
        boolean z10 = this.f36516a;
        String str2 = "";
        if (z9) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f36517b);
            sb2.append("x");
            sb2.append(this.f36518c);
            if (!z10) {
                str = "";
            } else {
                str = " (" + org.telegram.messenger.hd.M0(2131746449, null) + ")";
            }
            sb2.append(str);
            sb2.append("\n");
            ArrayList arrayList = this.d;
            sb2.append(org.telegram.messenger.g0.i0((long) ((q51) arrayList.get(0)).f37159l, false, false).replace(" ", ""));
            sb2.append("/s");
            if (((q51) arrayList.get(0)).f37160m != null) {
                str2 = ", " + ((q51) arrayList.get(0)).f37160m;
            }
            sb2.append(str2);
            return sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(b());
        sb3.append("p");
        if (z10) {
            str2 = " (" + org.telegram.messenger.hd.M0(2131746449, null) + ")";
        }
        sb3.append(str2);
        return sb3.toString();
    }
}
