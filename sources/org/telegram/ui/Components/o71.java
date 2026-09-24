package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
public final class o71 {
    public final boolean f26951a;
    public final int f26952b;
    public final int f26953c;
    public final ArrayList d;

    public o71(q71 q71Var) {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.f26951a = q71Var.f27523b;
        this.f26952b = q71Var.f27527i;
        this.f26953c = q71Var.f27528j;
        arrayList.add(q71Var);
    }

    public final q71 a() {
        ArrayList arrayList = this.d;
        q71 q71Var = null;
        if (arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            q71 q71Var2 = (q71) obj;
            if (q71Var2.b()) {
                return q71Var2;
            }
        }
        long j3 = Long.MAX_VALUE;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            q71 q71Var3 = (q71) arrayList.get(i11);
            if (q71Var3.f27529k < j3 && s71.Y(q71Var3.f27531m)) {
                j3 = q71Var3.f27529k;
                q71Var = q71Var3;
            }
        }
        if (q71Var != null) {
            return q71Var;
        }
        return (q71) arrayList.get(0);
    }

    public final int b() {
        int min = Math.min(this.f26952b, this.f26953c);
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
        boolean z11 = this.f26951a;
        String str2 = "";
        if (z10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f26952b);
            sb2.append("x");
            sb2.append(this.f26953c);
            if (!z11) {
                str = "";
            } else {
                str = " (" + LocaleController.getString(R.string.QualitySource) + ")";
            }
            sb2.append(str);
            sb2.append("\n");
            ArrayList arrayList = this.d;
            sb2.append(AndroidUtilities.formatFileSize((long) ((q71) arrayList.get(0)).f27530l).replace(" ", ""));
            sb2.append("/s");
            if (((q71) arrayList.get(0)).f27531m != null) {
                str2 = ", " + ((q71) arrayList.get(0)).f27531m;
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
