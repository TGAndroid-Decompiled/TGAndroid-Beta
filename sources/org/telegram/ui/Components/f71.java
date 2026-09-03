package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
public final class f71 {
    public final boolean f26811a;
    public final int f26812b;
    public final int f26813c;
    public final ArrayList d;

    public f71(h71 h71Var) {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.f26811a = h71Var.f27397b;
        this.f26812b = h71Var.f27402i;
        this.f26813c = h71Var.f27403j;
        arrayList.add(h71Var);
    }

    public final h71 a() {
        ArrayList arrayList = this.d;
        h71 h71Var = null;
        if (arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            h71 h71Var2 = (h71) obj;
            if (h71Var2.b()) {
                return h71Var2;
            }
        }
        long j10 = Long.MAX_VALUE;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            h71 h71Var3 = (h71) arrayList.get(i11);
            if (h71Var3.f27404k < j10 && j71.Y(h71Var3.f27406m)) {
                j10 = h71Var3.f27404k;
                h71Var = h71Var3;
            }
        }
        if (h71Var != null) {
            return h71Var;
        }
        return (h71) arrayList.get(0);
    }

    public final int b() {
        int min = Math.min(this.f26812b, this.f26813c);
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
        boolean z4 = SharedConfig.debugVideoQualities;
        boolean z10 = this.f26811a;
        String str2 = "";
        if (z4) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f26812b);
            sb.append("x");
            sb.append(this.f26813c);
            if (!z10) {
                str = "";
            } else {
                str = " (" + LocaleController.getString(R.string.QualitySource) + ")";
            }
            sb.append(str);
            sb.append("\n");
            ArrayList arrayList = this.d;
            sb.append(AndroidUtilities.formatFileSize((long) ((h71) arrayList.get(0)).f27405l).replace(" ", ""));
            sb.append("/s");
            if (((h71) arrayList.get(0)).f27406m != null) {
                str2 = ", " + ((h71) arrayList.get(0)).f27406m;
            }
            sb.append(str2);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(b());
        sb2.append("p");
        if (z10) {
            str2 = " (" + LocaleController.getString(R.string.QualitySource) + ")";
        }
        sb2.append(str2);
        return sb2.toString();
    }
}
