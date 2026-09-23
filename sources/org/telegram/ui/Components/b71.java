package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
public final class b71 {
    public final boolean f22594a;
    public final int f22595b;
    public final int f22596c;
    public final ArrayList d;

    public b71(d71 d71Var) {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.f22594a = d71Var.f23301b;
        this.f22595b = d71Var.f23305i;
        this.f22596c = d71Var.f23306j;
        arrayList.add(d71Var);
    }

    public final d71 a() {
        ArrayList arrayList = this.d;
        d71 d71Var = null;
        if (arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            d71 d71Var2 = (d71) obj;
            if (d71Var2.b()) {
                return d71Var2;
            }
        }
        long j3 = Long.MAX_VALUE;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            d71 d71Var3 = (d71) arrayList.get(i11);
            if (d71Var3.f23307k < j3 && f71.Y(d71Var3.f23309m)) {
                j3 = d71Var3.f23307k;
                d71Var = d71Var3;
            }
        }
        if (d71Var != null) {
            return d71Var;
        }
        return (d71) arrayList.get(0);
    }

    public final int b() {
        int min = Math.min(this.f22595b, this.f22596c);
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
        boolean z11 = this.f22594a;
        String str2 = "";
        if (z10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f22595b);
            sb2.append("x");
            sb2.append(this.f22596c);
            if (!z11) {
                str = "";
            } else {
                str = " (" + LocaleController.getString(R.string.QualitySource) + ")";
            }
            sb2.append(str);
            sb2.append("\n");
            ArrayList arrayList = this.d;
            sb2.append(AndroidUtilities.formatFileSize((long) ((d71) arrayList.get(0)).f23308l).replace(" ", ""));
            sb2.append("/s");
            if (((d71) arrayList.get(0)).f23309m != null) {
                str2 = ", " + ((d71) arrayList.get(0)).f23309m;
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
