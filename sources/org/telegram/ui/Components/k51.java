package org.telegram.ui.Components;

import java.util.ArrayList;
public final class k51 {
    public final boolean f35180a;
    public final int f35181b;
    public final int f35182c;
    public final ArrayList d;

    public k51(m51 m51Var) {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.f35180a = m51Var.f35925b;
        this.f35181b = m51Var.f35930i;
        this.f35182c = m51Var.f35931j;
        arrayList.add(m51Var);
    }

    public final m51 a() {
        ArrayList arrayList = this.d;
        m51 m51Var = null;
        if (arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            m51 m51Var2 = (m51) obj;
            if (m51Var2.b()) {
                return m51Var2;
            }
        }
        long j3 = Long.MAX_VALUE;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            m51 m51Var3 = (m51) arrayList.get(i10);
            if (m51Var3.f35932k < j3 && n51.D0(m51Var3.f35934m)) {
                j3 = m51Var3.f35932k;
                m51Var = m51Var3;
            }
        }
        if (m51Var != null) {
            return m51Var;
        }
        return (m51) arrayList.get(0);
    }

    public final int b() {
        int min = Math.min(this.f35181b, this.f35182c);
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
        boolean z10 = this.f35180a;
        String str2 = "";
        if (z9) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f35181b);
            sb2.append("x");
            sb2.append(this.f35182c);
            if (!z10) {
                str = "";
            } else {
                str = " (" + org.telegram.messenger.hd.M0(2131746449, null) + ")";
            }
            sb2.append(str);
            sb2.append("\n");
            ArrayList arrayList = this.d;
            sb2.append(org.telegram.messenger.g0.i0((long) ((m51) arrayList.get(0)).f35933l, false, false).replace(" ", ""));
            sb2.append("/s");
            if (((m51) arrayList.get(0)).f35934m != null) {
                str2 = ", " + ((m51) arrayList.get(0)).f35934m;
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
