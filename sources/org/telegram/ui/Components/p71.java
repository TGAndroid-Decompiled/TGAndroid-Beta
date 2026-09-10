package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
public final class p71 {
    public final boolean f26052a;
    public final int f26053b;
    public final int f26054c;
    public final ArrayList d;

    public p71(r71 r71Var) {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.f26052a = r71Var.f26617b;
        this.f26053b = r71Var.f26621i;
        this.f26054c = r71Var.f26622j;
        arrayList.add(r71Var);
    }

    public final r71 a() {
        ArrayList arrayList = this.d;
        r71 r71Var = null;
        if (arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            r71 r71Var2 = (r71) obj;
            if (r71Var2.b()) {
                return r71Var2;
            }
        }
        long j3 = Long.MAX_VALUE;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            r71 r71Var3 = (r71) arrayList.get(i11);
            if (r71Var3.f26623k < j3 && t71.Y(r71Var3.f26625m)) {
                j3 = r71Var3.f26623k;
                r71Var = r71Var3;
            }
        }
        if (r71Var != null) {
            return r71Var;
        }
        return (r71) arrayList.get(0);
    }

    public final int b() {
        int min = Math.min(this.f26053b, this.f26054c);
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
        boolean z11 = this.f26052a;
        String str2 = "";
        if (z10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f26053b);
            sb2.append("x");
            sb2.append(this.f26054c);
            if (!z11) {
                str = "";
            } else {
                str = " (" + LocaleController.getString(R.string.QualitySource) + ")";
            }
            sb2.append(str);
            sb2.append("\n");
            ArrayList arrayList = this.d;
            sb2.append(AndroidUtilities.formatFileSize((long) ((r71) arrayList.get(0)).f26624l).replace(" ", ""));
            sb2.append("/s");
            if (((r71) arrayList.get(0)).f26625m != null) {
                str2 = ", " + ((r71) arrayList.get(0)).f26625m;
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
