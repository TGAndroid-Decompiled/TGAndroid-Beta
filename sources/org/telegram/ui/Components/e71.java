package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
public final class e71 {
    public final boolean f24487a;
    public final int f24488b;
    public final int f24489c;
    public final ArrayList d;

    public e71(g71 g71Var) {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.f24487a = g71Var.f25072b;
        this.f24488b = g71Var.f25076i;
        this.f24489c = g71Var.f25077j;
        arrayList.add(g71Var);
    }

    public final g71 a() {
        ArrayList arrayList = this.d;
        g71 g71Var = null;
        if (arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            g71 g71Var2 = (g71) obj;
            if (g71Var2.b()) {
                return g71Var2;
            }
        }
        long j10 = Long.MAX_VALUE;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            g71 g71Var3 = (g71) arrayList.get(i11);
            if (g71Var3.f25078k < j10 && i71.Y(g71Var3.f25080m)) {
                j10 = g71Var3.f25078k;
                g71Var = g71Var3;
            }
        }
        if (g71Var != null) {
            return g71Var;
        }
        return (g71) arrayList.get(0);
    }

    public final int b() {
        int min = Math.min(this.f24488b, this.f24489c);
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
        boolean z4 = SharedConfig.debugVideoQualities;
        boolean z10 = this.f24487a;
        String str2 = "";
        if (z4) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f24488b);
            sb.append("x");
            sb.append(this.f24489c);
            if (!z10) {
                str = "";
            } else {
                str = " (" + LocaleController.getString(R.string.QualitySource) + ")";
            }
            sb.append(str);
            sb.append("\n");
            ArrayList arrayList = this.d;
            sb.append(AndroidUtilities.formatFileSize((long) ((g71) arrayList.get(0)).f25079l).replace(" ", ""));
            sb.append("/s");
            if (((g71) arrayList.get(0)).f25080m != null) {
                str2 = ", " + ((g71) arrayList.get(0)).f25080m;
            }
            sb.append(str2);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(b());
        sb2.append("p");
        if (z10) {
            str2 = " (" + LocaleController.getString(R.string.QualitySource) + ")";
        }
        sb2.append(str2);
        return sb2.toString();
    }
}
