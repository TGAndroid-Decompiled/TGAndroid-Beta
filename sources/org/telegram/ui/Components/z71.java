package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
public final class z71 {
    public final boolean f33405a;
    public final int f33406b;
    public final int f33407c;
    public final ArrayList d;

    public z71(b81 b81Var) {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.f33405a = b81Var.f24853b;
        this.f33406b = b81Var.f24858i;
        this.f33407c = b81Var.f24859j;
        arrayList.add(b81Var);
    }

    public final b81 a() {
        ArrayList arrayList = this.d;
        b81 b81Var = null;
        if (arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            b81 b81Var2 = (b81) obj;
            if (b81Var2.b()) {
                return b81Var2;
            }
        }
        long j3 = Long.MAX_VALUE;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            b81 b81Var3 = (b81) arrayList.get(i11);
            if (b81Var3.f24860k < j3 && d81.Y(b81Var3.f24862m)) {
                j3 = b81Var3.f24860k;
                b81Var = b81Var3;
            }
        }
        if (b81Var != null) {
            return b81Var;
        }
        return (b81) arrayList.get(0);
    }

    public final int b() {
        int min = Math.min(this.f33406b, this.f33407c);
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
        boolean z11 = this.f33405a;
        String str2 = "";
        if (z10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f33406b);
            sb2.append("x");
            sb2.append(this.f33407c);
            if (!z11) {
                str = "";
            } else {
                str = " (" + LocaleController.getString(R.string.QualitySource) + ")";
            }
            sb2.append(str);
            sb2.append("\n");
            ArrayList arrayList = this.d;
            sb2.append(AndroidUtilities.formatFileSize((long) ((b81) arrayList.get(0)).f24861l).replace(" ", ""));
            sb2.append("/s");
            if (((b81) arrayList.get(0)).f24862m != null) {
                str2 = ", " + ((b81) arrayList.get(0)).f24862m;
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
