package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
public final class r71 {
    public final boolean f27842a;
    public final int f27843b;
    public final int f27844c;
    public final ArrayList d;

    public r71(t71 t71Var) {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.f27842a = t71Var.f28410b;
        this.f27843b = t71Var.f28414i;
        this.f27844c = t71Var.f28415j;
        arrayList.add(t71Var);
    }

    public final t71 a() {
        ArrayList arrayList = this.d;
        t71 t71Var = null;
        if (arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            t71 t71Var2 = (t71) obj;
            if (t71Var2.b()) {
                return t71Var2;
            }
        }
        long j3 = Long.MAX_VALUE;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            t71 t71Var3 = (t71) arrayList.get(i11);
            if (t71Var3.f28416k < j3 && v71.Y(t71Var3.f28418m)) {
                j3 = t71Var3.f28416k;
                t71Var = t71Var3;
            }
        }
        if (t71Var != null) {
            return t71Var;
        }
        return (t71) arrayList.get(0);
    }

    public final int b() {
        int min = Math.min(this.f27843b, this.f27844c);
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
        boolean z11 = this.f27842a;
        String str2 = "";
        if (z10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f27843b);
            sb2.append("x");
            sb2.append(this.f27844c);
            if (!z11) {
                str = "";
            } else {
                str = " (" + LocaleController.getString(R.string.QualitySource) + ")";
            }
            sb2.append(str);
            sb2.append("\n");
            ArrayList arrayList = this.d;
            sb2.append(AndroidUtilities.formatFileSize((long) ((t71) arrayList.get(0)).f28417l).replace(" ", ""));
            sb2.append("/s");
            if (((t71) arrayList.get(0)).f28418m != null) {
                str2 = ", " + ((t71) arrayList.get(0)).f28418m;
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
