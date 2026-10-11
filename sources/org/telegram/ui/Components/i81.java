package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
public final class i81 {
    public final boolean f27212a;
    public final int f27213b;
    public final int f27214c;
    public final ArrayList d;

    public i81(k81 k81Var) {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.f27212a = k81Var.f27869b;
        this.f27213b = k81Var.f27874i;
        this.f27214c = k81Var.f27875j;
        arrayList.add(k81Var);
    }

    public final k81 a() {
        ArrayList arrayList = this.d;
        k81 k81Var = null;
        if (arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            k81 k81Var2 = (k81) obj;
            if (k81Var2.b()) {
                return k81Var2;
            }
        }
        long j3 = Long.MAX_VALUE;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            k81 k81Var3 = (k81) arrayList.get(i11);
            if (k81Var3.f27876k < j3 && m81.Y(k81Var3.f27878m)) {
                j3 = k81Var3.f27876k;
                k81Var = k81Var3;
            }
        }
        if (k81Var != null) {
            return k81Var;
        }
        return (k81) arrayList.get(0);
    }

    public final int b() {
        int min = Math.min(this.f27213b, this.f27214c);
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
        boolean z11 = this.f27212a;
        String str2 = "";
        if (z10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f27213b);
            sb2.append("x");
            sb2.append(this.f27214c);
            if (!z11) {
                str = "";
            } else {
                str = " (" + LocaleController.getString(R.string.QualitySource) + ")";
            }
            sb2.append(str);
            sb2.append("\n");
            ArrayList arrayList = this.d;
            sb2.append(AndroidUtilities.formatFileSize((long) ((k81) arrayList.get(0)).f27877l).replace(" ", ""));
            sb2.append("/s");
            if (((k81) arrayList.get(0)).f27878m != null) {
                str2 = ", " + ((k81) arrayList.get(0)).f27878m;
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
