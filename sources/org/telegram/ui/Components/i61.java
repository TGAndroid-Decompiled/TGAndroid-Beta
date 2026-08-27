package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;

public final class i61 {

    public final boolean f29261a;

    public final int f29262b;

    public final int f29263c;
    public final ArrayList d;

    public i61(k61 k61Var) {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.f29261a = k61Var.f30008b;
        this.f29262b = k61Var.f30013i;
        this.f29263c = k61Var.f30014j;
        arrayList.add(k61Var);
    }

    public final k61 a() {
        ArrayList arrayList = this.d;
        k61 k61Var = null;
        if (arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            k61 k61Var2 = (k61) obj;
            if (k61Var2.b()) {
                return k61Var2;
            }
        }
        long j10 = Long.MAX_VALUE;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            k61 k61Var3 = (k61) arrayList.get(i11);
            if (k61Var3.f30015k < j10 && m61.Y(k61Var3.f30017m)) {
                j10 = k61Var3.f30015k;
                k61Var = k61Var3;
            }
        }
        return k61Var != null ? k61Var : (k61) arrayList.get(0);
    }

    public final int b() {
        int iMin = Math.min(this.f29262b, this.f29263c);
        if (Math.abs(iMin - 2160) < 55) {
            return 2160;
        }
        if (Math.abs(iMin - 1440) < 55) {
            return 1440;
        }
        if (Math.abs(iMin - 1080) < 55) {
            return 1080;
        }
        if (Math.abs(iMin - 720) < 55) {
            return 720;
        }
        if (Math.abs(iMin - 480) < 55) {
            return 480;
        }
        if (Math.abs(iMin - 360) < 55) {
            return 360;
        }
        if (Math.abs(iMin - 240) < 55) {
            return 240;
        }
        if (Math.abs(iMin - 144) < 55) {
            return 144;
        }
        return iMin;
    }

    public final String toString() {
        String str;
        boolean z10 = SharedConfig.debugVideoQualities;
        boolean z11 = this.f29261a;
        String str2 = "";
        if (!z10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(b());
            sb2.append("p");
            if (z11) {
                str2 = " (" + LocaleController.getString(R.string.QualitySource) + ")";
            }
            sb2.append(str2);
            return sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f29262b);
        sb3.append("x");
        sb3.append(this.f29263c);
        if (z11) {
            str = " (" + LocaleController.getString(R.string.QualitySource) + ")";
        } else {
            str = "";
        }
        sb3.append(str);
        sb3.append("\n");
        ArrayList arrayList = this.d;
        sb3.append(AndroidUtilities.formatFileSize((long) ((k61) arrayList.get(0)).f30016l).replace(" ", ""));
        sb3.append("/s");
        if (((k61) arrayList.get(0)).f30017m != null) {
            str2 = ", " + ((k61) arrayList.get(0)).f30017m;
        }
        sb3.append(str2);
        return sb3.toString();
    }
}
