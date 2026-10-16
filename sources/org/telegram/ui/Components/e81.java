package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
public final class e81 {
    public final boolean f24328a;
    public final int f24329b;
    public final int f24330c;
    public final ArrayList d;

    public e81(g81 g81Var) {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.f24328a = g81Var.f24911b;
        this.f24329b = g81Var.f24915i;
        this.f24330c = g81Var.f24916j;
        arrayList.add(g81Var);
    }

    public final g81 a() {
        ArrayList arrayList = this.d;
        g81 g81Var = null;
        if (arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            g81 g81Var2 = (g81) obj;
            if (g81Var2.b()) {
                return g81Var2;
            }
        }
        long j10 = Long.MAX_VALUE;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            g81 g81Var3 = (g81) arrayList.get(i11);
            if (g81Var3.f24917k < j10 && i81.Y(g81Var3.f24919m)) {
                j10 = g81Var3.f24917k;
                g81Var = g81Var3;
            }
        }
        if (g81Var != null) {
            return g81Var;
        }
        return (g81) arrayList.get(0);
    }

    public final int b() {
        int min = Math.min(this.f24329b, this.f24330c);
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
        boolean z11 = this.f24328a;
        String str2 = "";
        if (z10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f24329b);
            sb2.append("x");
            sb2.append(this.f24330c);
            if (!z11) {
                str = "";
            } else {
                str = " (" + LocaleController.getString(R.string.QualitySource) + ")";
            }
            sb2.append(str);
            sb2.append("\n");
            ArrayList arrayList = this.d;
            sb2.append(AndroidUtilities.formatFileSize((long) ((g81) arrayList.get(0)).f24918l).replace(" ", ""));
            sb2.append("/s");
            if (((g81) arrayList.get(0)).f24919m != null) {
                str2 = ", " + ((g81) arrayList.get(0)).f24919m;
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
