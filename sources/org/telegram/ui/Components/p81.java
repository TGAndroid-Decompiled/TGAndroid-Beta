package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
public final class p81 {
    public final boolean f31524a;
    public final int f31525b;
    public final int f31526c;
    public final ArrayList d;

    public p81(r81 r81Var) {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.f31524a = r81Var.f32173b;
        this.f31525b = r81Var.f32177i;
        this.f31526c = r81Var.f32178j;
        arrayList.add(r81Var);
    }

    public final r81 a() {
        ArrayList arrayList = this.d;
        r81 r81Var = null;
        if (arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            r81 r81Var2 = (r81) obj;
            if (r81Var2.b()) {
                return r81Var2;
            }
        }
        long j10 = Long.MAX_VALUE;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            r81 r81Var3 = (r81) arrayList.get(i11);
            if (r81Var3.f32179k < j10 && t81.Y(r81Var3.f32181m)) {
                j10 = r81Var3.f32179k;
                r81Var = r81Var3;
            }
        }
        if (r81Var != null) {
            return r81Var;
        }
        return (r81) arrayList.get(0);
    }

    public final int b() {
        int min = Math.min(this.f31525b, this.f31526c);
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
        boolean z11 = this.f31524a;
        String str2 = "";
        if (z10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f31525b);
            sb2.append("x");
            sb2.append(this.f31526c);
            if (!z11) {
                str = "";
            } else {
                str = " (" + LocaleController.getString(R.string.QualitySource) + ")";
            }
            sb2.append(str);
            sb2.append("\n");
            ArrayList arrayList = this.d;
            sb2.append(AndroidUtilities.formatFileSize((long) ((r81) arrayList.get(0)).f32180l).replace(" ", ""));
            sb2.append("/s");
            if (((r81) arrayList.get(0)).f32181m != null) {
                str2 = ", " + ((r81) arrayList.get(0)).f32181m;
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
