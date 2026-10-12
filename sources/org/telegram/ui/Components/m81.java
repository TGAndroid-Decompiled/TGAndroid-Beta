package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
public final class m81 {
    public final boolean f28442a;
    public final int f28443b;
    public final int f28444c;
    public final ArrayList d;

    public m81(o81 o81Var) {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.f28442a = o81Var.f29088b;
        this.f28443b = o81Var.f29093i;
        this.f28444c = o81Var.f29094j;
        arrayList.add(o81Var);
    }

    public final o81 a() {
        ArrayList arrayList = this.d;
        o81 o81Var = null;
        if (arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            o81 o81Var2 = (o81) obj;
            if (o81Var2.b()) {
                return o81Var2;
            }
        }
        long j3 = Long.MAX_VALUE;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            o81 o81Var3 = (o81) arrayList.get(i11);
            if (o81Var3.f29095k < j3 && q81.Y(o81Var3.f29097m)) {
                j3 = o81Var3.f29095k;
                o81Var = o81Var3;
            }
        }
        if (o81Var != null) {
            return o81Var;
        }
        return (o81) arrayList.get(0);
    }

    public final int b() {
        int min = Math.min(this.f28443b, this.f28444c);
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
        boolean z11 = this.f28442a;
        String str2 = "";
        if (z10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f28443b);
            sb2.append("x");
            sb2.append(this.f28444c);
            if (!z11) {
                str = "";
            } else {
                str = " (" + LocaleController.getString(R.string.QualitySource) + ")";
            }
            sb2.append(str);
            sb2.append("\n");
            ArrayList arrayList = this.d;
            sb2.append(AndroidUtilities.formatFileSize((long) ((o81) arrayList.get(0)).f29096l).replace(" ", ""));
            sb2.append("/s");
            if (((o81) arrayList.get(0)).f29097m != null) {
                str2 = ", " + ((o81) arrayList.get(0)).f29097m;
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
