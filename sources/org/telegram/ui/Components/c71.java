package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
public final class c71 {
    public final boolean f24915a;
    public final int f24916b;
    public final int f24917c;
    public final ArrayList d;

    public c71(e71 e71Var) {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.f24915a = e71Var.f25580b;
        this.f24916b = e71Var.f25585i;
        this.f24917c = e71Var.f25586j;
        arrayList.add(e71Var);
    }

    public final e71 a() {
        ArrayList arrayList = this.d;
        e71 e71Var = null;
        if (arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            e71 e71Var2 = (e71) obj;
            if (e71Var2.b()) {
                return e71Var2;
            }
        }
        long j3 = Long.MAX_VALUE;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            e71 e71Var3 = (e71) arrayList.get(i11);
            if (e71Var3.f25587k < j3 && g71.Y(e71Var3.f25589m)) {
                j3 = e71Var3.f25587k;
                e71Var = e71Var3;
            }
        }
        if (e71Var != null) {
            return e71Var;
        }
        return (e71) arrayList.get(0);
    }

    public final int b() {
        int min = Math.min(this.f24916b, this.f24917c);
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
        boolean z11 = this.f24915a;
        String str2 = "";
        if (z10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f24916b);
            sb2.append("x");
            sb2.append(this.f24917c);
            if (!z11) {
                str = "";
            } else {
                str = " (" + LocaleController.getString(R.string.QualitySource) + ")";
            }
            sb2.append(str);
            sb2.append("\n");
            ArrayList arrayList = this.d;
            sb2.append(AndroidUtilities.formatFileSize((long) ((e71) arrayList.get(0)).f25588l).replace(" ", ""));
            sb2.append("/s");
            if (((e71) arrayList.get(0)).f25589m != null) {
                str2 = ", " + ((e71) arrayList.get(0)).f25589m;
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
