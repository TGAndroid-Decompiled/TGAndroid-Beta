package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
public final class f81 {
    public final boolean f26230a;
    public final int f26231b;
    public final int f26232c;
    public final ArrayList d;

    public f81(h81 h81Var) {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.f26230a = h81Var.f26828b;
        this.f26231b = h81Var.f26832i;
        this.f26232c = h81Var.f26833j;
        arrayList.add(h81Var);
    }

    public final h81 a() {
        ArrayList arrayList = this.d;
        h81 h81Var = null;
        if (arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            h81 h81Var2 = (h81) obj;
            if (h81Var2.b()) {
                return h81Var2;
            }
        }
        long j10 = Long.MAX_VALUE;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            h81 h81Var3 = (h81) arrayList.get(i11);
            if (h81Var3.f26834k < j10 && j81.Y(h81Var3.f26836m)) {
                j10 = h81Var3.f26834k;
                h81Var = h81Var3;
            }
        }
        if (h81Var != null) {
            return h81Var;
        }
        return (h81) arrayList.get(0);
    }

    public final int b() {
        int min = Math.min(this.f26231b, this.f26232c);
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
        boolean z11 = this.f26230a;
        String str2 = "";
        if (z10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f26231b);
            sb2.append("x");
            sb2.append(this.f26232c);
            if (!z11) {
                str = "";
            } else {
                str = " (" + LocaleController.getString(R.string.QualitySource) + ")";
            }
            sb2.append(str);
            sb2.append("\n");
            ArrayList arrayList = this.d;
            sb2.append(AndroidUtilities.formatFileSize((long) ((h81) arrayList.get(0)).f26835l).replace(" ", ""));
            sb2.append("/s");
            if (((h81) arrayList.get(0)).f26836m != null) {
                str2 = ", " + ((h81) arrayList.get(0)).f26836m;
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
