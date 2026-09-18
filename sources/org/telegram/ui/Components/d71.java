package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
public final class d71 {
    public final boolean f23227a;
    public final int f23228b;
    public final int f23229c;
    public final ArrayList d;

    public d71(f71 f71Var) {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.f23227a = f71Var.f23812b;
        this.f23228b = f71Var.f23816i;
        this.f23229c = f71Var.f23817j;
        arrayList.add(f71Var);
    }

    public final f71 a() {
        ArrayList arrayList = this.d;
        f71 f71Var = null;
        if (arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            f71 f71Var2 = (f71) obj;
            if (f71Var2.b()) {
                return f71Var2;
            }
        }
        long j3 = Long.MAX_VALUE;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            f71 f71Var3 = (f71) arrayList.get(i11);
            if (f71Var3.f23818k < j3 && h71.Y(f71Var3.f23820m)) {
                j3 = f71Var3.f23818k;
                f71Var = f71Var3;
            }
        }
        if (f71Var != null) {
            return f71Var;
        }
        return (f71) arrayList.get(0);
    }

    public final int b() {
        int min = Math.min(this.f23228b, this.f23229c);
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
        boolean z11 = this.f23227a;
        String str2 = "";
        if (z10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f23228b);
            sb2.append("x");
            sb2.append(this.f23229c);
            if (!z11) {
                str = "";
            } else {
                str = " (" + LocaleController.getString(R.string.QualitySource) + ")";
            }
            sb2.append(str);
            sb2.append("\n");
            ArrayList arrayList = this.d;
            sb2.append(AndroidUtilities.formatFileSize((long) ((f71) arrayList.get(0)).f23819l).replace(" ", ""));
            sb2.append("/s");
            if (((f71) arrayList.get(0)).f23820m != null) {
                str2 = ", " + ((f71) arrayList.get(0)).f23820m;
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
