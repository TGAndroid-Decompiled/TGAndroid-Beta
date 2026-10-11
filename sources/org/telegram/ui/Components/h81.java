package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
public final class h81 {
    public final boolean f26997a;
    public final int f26998b;
    public final int f26999c;
    public final ArrayList d;

    public h81(j81 j81Var) {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.f26997a = j81Var.f27643b;
        this.f26998b = j81Var.f27648i;
        this.f26999c = j81Var.f27649j;
        arrayList.add(j81Var);
    }

    public final j81 a() {
        ArrayList arrayList = this.d;
        j81 j81Var = null;
        if (arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            j81 j81Var2 = (j81) obj;
            if (j81Var2.b()) {
                return j81Var2;
            }
        }
        long j3 = Long.MAX_VALUE;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            j81 j81Var3 = (j81) arrayList.get(i11);
            if (j81Var3.f27650k < j3 && l81.Y(j81Var3.f27652m)) {
                j3 = j81Var3.f27650k;
                j81Var = j81Var3;
            }
        }
        if (j81Var != null) {
            return j81Var;
        }
        return (j81) arrayList.get(0);
    }

    public final int b() {
        int min = Math.min(this.f26998b, this.f26999c);
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
        boolean z11 = this.f26997a;
        String str2 = "";
        if (z10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f26998b);
            sb2.append("x");
            sb2.append(this.f26999c);
            if (!z11) {
                str = "";
            } else {
                str = " (" + LocaleController.getString(R.string.QualitySource) + ")";
            }
            sb2.append(str);
            sb2.append("\n");
            ArrayList arrayList = this.d;
            sb2.append(AndroidUtilities.formatFileSize((long) ((j81) arrayList.get(0)).f27651l).replace(" ", ""));
            sb2.append("/s");
            if (((j81) arrayList.get(0)).f27652m != null) {
                str2 = ", " + ((j81) arrayList.get(0)).f27652m;
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
