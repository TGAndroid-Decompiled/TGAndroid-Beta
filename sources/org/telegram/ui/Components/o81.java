package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
public final class o81 {
    public final boolean f31223a;
    public final int f31224b;
    public final int f31225c;
    public final ArrayList d;

    public o81(q81 q81Var) {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.f31223a = q81Var.f31853b;
        this.f31224b = q81Var.f31857i;
        this.f31225c = q81Var.f31858j;
        arrayList.add(q81Var);
    }

    public final q81 a() {
        ArrayList arrayList = this.d;
        q81 q81Var = null;
        if (arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            q81 q81Var2 = (q81) obj;
            if (q81Var2.b()) {
                return q81Var2;
            }
        }
        long j10 = Long.MAX_VALUE;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            q81 q81Var3 = (q81) arrayList.get(i11);
            if (q81Var3.f31859k < j10 && s81.Y(q81Var3.f31861m)) {
                j10 = q81Var3.f31859k;
                q81Var = q81Var3;
            }
        }
        if (q81Var != null) {
            return q81Var;
        }
        return (q81) arrayList.get(0);
    }

    public final int b() {
        int min = Math.min(this.f31224b, this.f31225c);
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
        boolean z10 = SharedConfig.debugVideoQualities;
        boolean z11 = this.f31223a;
        String str2 = "";
        if (z10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f31224b);
            sb2.append("x");
            sb2.append(this.f31225c);
            if (!z11) {
                str = "";
            } else {
                str = " (" + LocaleController.getString(R.string.QualitySource) + ")";
            }
            sb2.append(str);
            sb2.append("\n");
            ArrayList arrayList = this.d;
            sb2.append(AndroidUtilities.formatFileSize((long) ((q81) arrayList.get(0)).f31860l).replace(" ", ""));
            sb2.append("/s");
            if (((q81) arrayList.get(0)).f31861m != null) {
                str2 = ", " + ((q81) arrayList.get(0)).f31861m;
            }
            sb2.append(str2);
            return sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(b());
        sb3.append("p");
        if (z11) {
            str2 = " (" + LocaleController.getString(R.string.QualitySource) + ")";
        }
        sb3.append(str2);
        return sb3.toString();
    }
}
