package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
public final class p71 {
    public final boolean f27181a;
    public final int f27182b;
    public final int f27183c;
    public final ArrayList d;

    public p71(r71 r71Var) {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.f27181a = r71Var.f27794b;
        this.f27182b = r71Var.f27798i;
        this.f27183c = r71Var.f27799j;
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
            if (r71Var3.f27800k < j3 && t71.Y(r71Var3.f27802m)) {
                j3 = r71Var3.f27800k;
                r71Var = r71Var3;
            }
        }
        if (r71Var != null) {
            return r71Var;
        }
        return (r71) arrayList.get(0);
    }

    public final int b() {
        int min = Math.min(this.f27182b, this.f27183c);
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
        boolean z11 = this.f27181a;
        String str2 = "";
        if (z10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f27182b);
            sb2.append("x");
            sb2.append(this.f27183c);
            if (!z11) {
                str = "";
            } else {
                str = " (" + LocaleController.getString(R.string.QualitySource) + ")";
            }
            sb2.append(str);
            sb2.append("\n");
            ArrayList arrayList = this.d;
            sb2.append(AndroidUtilities.formatFileSize((long) ((r71) arrayList.get(0)).f27801l).replace(" ", ""));
            sb2.append("/s");
            if (((r71) arrayList.get(0)).f27802m != null) {
                str2 = ", " + ((r71) arrayList.get(0)).f27802m;
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
