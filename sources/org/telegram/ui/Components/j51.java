package org.telegram.ui.Components;

import java.util.ArrayList;
public final class j51 {
    public final boolean f34966a;
    public final int f34967b;
    public final int f34968c;
    public final ArrayList d;

    public j51(l51 l51Var) {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.f34966a = l51Var.f35604b;
        this.f34967b = l51Var.f35609i;
        this.f34968c = l51Var.f35610j;
        arrayList.add(l51Var);
    }

    public final l51 a() {
        ArrayList arrayList = this.d;
        l51 l51Var = null;
        if (arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            l51 l51Var2 = (l51) obj;
            if (l51Var2.b()) {
                return l51Var2;
            }
        }
        long j10 = Long.MAX_VALUE;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            l51 l51Var3 = (l51) arrayList.get(i10);
            if (l51Var3.f35611k < j10 && m51.D0(l51Var3.f35613m)) {
                j10 = l51Var3.f35611k;
                l51Var = l51Var3;
            }
        }
        if (l51Var != null) {
            return l51Var;
        }
        return (l51) arrayList.get(0);
    }

    public final int b() {
        int min = Math.min(this.f34967b, this.f34968c);
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
        boolean z10 = org.telegram.messenger.az.R0;
        boolean z11 = this.f34966a;
        String str2 = "";
        if (z10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f34967b);
            sb2.append("x");
            sb2.append(this.f34968c);
            if (!z11) {
                str = "";
            } else {
                str = " (" + org.telegram.messenger.bd.M0(2131746458, null) + ")";
            }
            sb2.append(str);
            sb2.append("\n");
            ArrayList arrayList = this.d;
            sb2.append(org.telegram.messenger.g0.i0((long) ((l51) arrayList.get(0)).f35612l, false, false).replace(" ", ""));
            sb2.append("/s");
            if (((l51) arrayList.get(0)).f35613m != null) {
                str2 = ", " + ((l51) arrayList.get(0)).f35613m;
            }
            sb2.append(str2);
            return sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(b());
        sb3.append("p");
        if (z11) {
            str2 = " (" + org.telegram.messenger.bd.M0(2131746458, null) + ")";
        }
        sb3.append(str2);
        return sb3.toString();
    }
}
