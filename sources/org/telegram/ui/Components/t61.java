package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
public final class t61 {
    public final boolean f32883a;
    public final int f32884b;
    public final int f32885c;
    public final ArrayList d;

    public t61(v61 v61Var) {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.f32883a = v61Var.f33473b;
        this.f32884b = v61Var.f33478i;
        this.f32885c = v61Var.f33479j;
        arrayList.add(v61Var);
    }

    public final v61 a() {
        ArrayList arrayList = this.d;
        v61 v61Var = null;
        if (arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            v61 v61Var2 = (v61) obj;
            if (v61Var2.b()) {
                return v61Var2;
            }
        }
        long j10 = Long.MAX_VALUE;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            v61 v61Var3 = (v61) arrayList.get(i11);
            if (v61Var3.f33480k < j10 && x61.Y(v61Var3.f33482m)) {
                j10 = v61Var3.f33480k;
                v61Var = v61Var3;
            }
        }
        if (v61Var != null) {
            return v61Var;
        }
        return (v61) arrayList.get(0);
    }

    public final int b() {
        int min = Math.min(this.f32884b, this.f32885c);
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
        boolean z11 = this.f32883a;
        String str2 = "";
        if (z10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f32884b);
            sb2.append("x");
            sb2.append(this.f32885c);
            if (!z11) {
                str = "";
            } else {
                str = " (" + LocaleController.getString(R.string.QualitySource) + ")";
            }
            sb2.append(str);
            sb2.append("\n");
            ArrayList arrayList = this.d;
            sb2.append(AndroidUtilities.formatFileSize((long) ((v61) arrayList.get(0)).f33481l).replace(" ", ""));
            sb2.append("/s");
            if (((v61) arrayList.get(0)).f33482m != null) {
                str2 = ", " + ((v61) arrayList.get(0)).f33482m;
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
