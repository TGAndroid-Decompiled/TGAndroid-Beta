package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
public final class d81 {
    public final boolean f24317a;
    public final int f24318b;
    public final int f24319c;
    public final ArrayList d;

    public d81(f81 f81Var) {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.f24317a = f81Var.f24961b;
        this.f24318b = f81Var.f24965i;
        this.f24319c = f81Var.f24966j;
        arrayList.add(f81Var);
    }

    public final f81 a() {
        ArrayList arrayList = this.d;
        f81 f81Var = null;
        if (arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            f81 f81Var2 = (f81) obj;
            if (f81Var2.b()) {
                return f81Var2;
            }
        }
        long j10 = Long.MAX_VALUE;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            f81 f81Var3 = (f81) arrayList.get(i11);
            if (f81Var3.f24967k < j10 && h81.Y(f81Var3.f24969m)) {
                j10 = f81Var3.f24967k;
                f81Var = f81Var3;
            }
        }
        if (f81Var != null) {
            return f81Var;
        }
        return (f81) arrayList.get(0);
    }

    public final int b() {
        int min = Math.min(this.f24318b, this.f24319c);
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
        boolean z11 = this.f24317a;
        String str2 = "";
        if (z10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f24318b);
            sb2.append("x");
            sb2.append(this.f24319c);
            if (!z11) {
                str = "";
            } else {
                str = " (" + LocaleController.getString(R.string.QualitySource) + ")";
            }
            sb2.append(str);
            sb2.append("\n");
            ArrayList arrayList = this.d;
            sb2.append(AndroidUtilities.formatFileSize((long) ((f81) arrayList.get(0)).f24968l).replace(" ", ""));
            sb2.append("/s");
            if (((f81) arrayList.get(0)).f24969m != null) {
                str2 = ", " + ((f81) arrayList.get(0)).f24969m;
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
