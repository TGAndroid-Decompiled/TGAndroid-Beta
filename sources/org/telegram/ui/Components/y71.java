package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
public final class y71 {
    public final boolean f32586a;
    public final int f32587b;
    public final int f32588c;
    public final ArrayList d;

    public y71(a81 a81Var) {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.f32586a = a81Var.f24541b;
        this.f32587b = a81Var.f24545i;
        this.f32588c = a81Var.f24546j;
        arrayList.add(a81Var);
    }

    public final a81 a() {
        ArrayList arrayList = this.d;
        a81 a81Var = null;
        if (arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            a81 a81Var2 = (a81) obj;
            if (a81Var2.b()) {
                return a81Var2;
            }
        }
        long j10 = Long.MAX_VALUE;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            a81 a81Var3 = (a81) arrayList.get(i11);
            if (a81Var3.f24547k < j10 && c81.Y(a81Var3.f24549m)) {
                j10 = a81Var3.f24547k;
                a81Var = a81Var3;
            }
        }
        if (a81Var != null) {
            return a81Var;
        }
        return (a81) arrayList.get(0);
    }

    public final int b() {
        int min = Math.min(this.f32587b, this.f32588c);
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
        boolean z11 = this.f32586a;
        String str2 = "";
        if (z10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f32587b);
            sb2.append("x");
            sb2.append(this.f32588c);
            if (!z11) {
                str = "";
            } else {
                str = " (" + LocaleController.getString(R.string.QualitySource) + ")";
            }
            sb2.append(str);
            sb2.append("\n");
            ArrayList arrayList = this.d;
            sb2.append(AndroidUtilities.formatFileSize((long) ((a81) arrayList.get(0)).f24548l).replace(" ", ""));
            sb2.append("/s");
            if (((a81) arrayList.get(0)).f24549m != null) {
                str2 = ", " + ((a81) arrayList.get(0)).f24549m;
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
