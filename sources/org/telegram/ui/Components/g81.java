package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
public final class g81 {
    public final boolean f26618a;
    public final int f26619b;
    public final int f26620c;
    public final ArrayList d;

    public g81(i81 i81Var) {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.f26618a = i81Var.f27269b;
        this.f26619b = i81Var.f27274i;
        this.f26620c = i81Var.f27275j;
        arrayList.add(i81Var);
    }

    public final i81 a() {
        ArrayList arrayList = this.d;
        i81 i81Var = null;
        if (arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            i81 i81Var2 = (i81) obj;
            if (i81Var2.b()) {
                return i81Var2;
            }
        }
        long j3 = Long.MAX_VALUE;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            i81 i81Var3 = (i81) arrayList.get(i11);
            if (i81Var3.f27276k < j3 && k81.Y(i81Var3.f27278m)) {
                j3 = i81Var3.f27276k;
                i81Var = i81Var3;
            }
        }
        if (i81Var != null) {
            return i81Var;
        }
        return (i81) arrayList.get(0);
    }

    public final int b() {
        int min = Math.min(this.f26619b, this.f26620c);
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
        boolean z11 = this.f26618a;
        String str2 = "";
        if (z10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f26619b);
            sb2.append("x");
            sb2.append(this.f26620c);
            if (!z11) {
                str = "";
            } else {
                str = " (" + LocaleController.getString(R.string.QualitySource) + ")";
            }
            sb2.append(str);
            sb2.append("\n");
            ArrayList arrayList = this.d;
            sb2.append(AndroidUtilities.formatFileSize((long) ((i81) arrayList.get(0)).f27277l).replace(" ", ""));
            sb2.append("/s");
            if (((i81) arrayList.get(0)).f27278m != null) {
                str2 = ", " + ((i81) arrayList.get(0)).f27278m;
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
