package org.telegram.ui.Components;

import java.util.ArrayList;
public final class r61 {
    public final boolean f29844a;
    public final int f29845b;
    public final int f29846c;
    public final ArrayList d;

    public r61(t61 t61Var) {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.f29844a = t61Var.f30457b;
        this.f29845b = t61Var.f30461i;
        this.f29846c = t61Var.f30462j;
        arrayList.add(t61Var);
    }

    public final t61 a() {
        ArrayList arrayList = this.d;
        t61 t61Var = null;
        if (arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            t61 t61Var2 = (t61) obj;
            if (t61Var2.b()) {
                return t61Var2;
            }
        }
        long j10 = Long.MAX_VALUE;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            t61 t61Var3 = (t61) arrayList.get(i11);
            if (t61Var3.f30463k < j10 && u61.D0(t61Var3.f30465m)) {
                j10 = t61Var3.f30463k;
                t61Var = t61Var3;
            }
        }
        if (t61Var != null) {
            return t61Var;
        }
        return (t61) arrayList.get(0);
    }

    public final int b() {
        int min = Math.min(this.f29845b, this.f29846c);
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
        boolean z10 = org.telegram.messenger.tz.R0;
        boolean z11 = this.f29844a;
        String str2 = "";
        if (z10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f29845b);
            sb2.append("x");
            sb2.append(this.f29846c);
            if (!z11) {
                str = "";
            } else {
                str = " (" + org.telegram.messenger.cd.L0(2131746465, null) + ")";
            }
            sb2.append(str);
            sb2.append("\n");
            ArrayList arrayList = this.d;
            sb2.append(org.telegram.messenger.i0.i0((long) ((t61) arrayList.get(0)).f30464l, false, false).replace(" ", ""));
            sb2.append("/s");
            if (((t61) arrayList.get(0)).f30465m != null) {
                str2 = ", " + ((t61) arrayList.get(0)).f30465m;
            }
            sb2.append(str2);
            return sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(b());
        sb3.append("p");
        if (z11) {
            str2 = " (" + org.telegram.messenger.cd.L0(2131746465, null) + ")";
        }
        sb3.append(str2);
        return sb3.toString();
    }
}
