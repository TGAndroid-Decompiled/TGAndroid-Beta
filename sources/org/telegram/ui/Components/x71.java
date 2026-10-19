package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
public final class x71 {
    public final boolean f32325a;
    public final int f32326b;
    public final int f32327c;
    public final ArrayList d;

    public x71(z71 z71Var) {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.f32325a = z71Var.f32874b;
        this.f32326b = z71Var.f32878i;
        this.f32327c = z71Var.f32879j;
        arrayList.add(z71Var);
    }

    public final z71 a() {
        ArrayList arrayList = this.d;
        z71 z71Var = null;
        if (arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            z71 z71Var2 = (z71) obj;
            if (z71Var2.b()) {
                return z71Var2;
            }
        }
        long j10 = Long.MAX_VALUE;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            z71 z71Var3 = (z71) arrayList.get(i11);
            if (z71Var3.f32880k < j10 && b81.Y(z71Var3.f32882m)) {
                j10 = z71Var3.f32880k;
                z71Var = z71Var3;
            }
        }
        if (z71Var != null) {
            return z71Var;
        }
        return (z71) arrayList.get(0);
    }

    public final int b() {
        int min = Math.min(this.f32326b, this.f32327c);
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
        boolean z11 = this.f32325a;
        String str2 = "";
        if (z10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f32326b);
            sb2.append("x");
            sb2.append(this.f32327c);
            if (!z11) {
                str = "";
            } else {
                str = " (" + LocaleController.getString(R.string.QualitySource) + ")";
            }
            sb2.append(str);
            sb2.append("\n");
            ArrayList arrayList = this.d;
            sb2.append(AndroidUtilities.formatFileSize((long) ((z71) arrayList.get(0)).f32881l).replace(" ", ""));
            sb2.append("/s");
            if (((z71) arrayList.get(0)).f32882m != null) {
                str2 = ", " + ((z71) arrayList.get(0)).f32882m;
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
