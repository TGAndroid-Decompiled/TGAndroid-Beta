package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
public final class w71 {
    public final boolean f32029a;
    public final int f32030b;
    public final int f32031c;
    public final ArrayList d;

    public w71(y71 y71Var) {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.f32029a = y71Var.f32565b;
        this.f32030b = y71Var.f32569i;
        this.f32031c = y71Var.f32570j;
        arrayList.add(y71Var);
    }

    public final y71 a() {
        ArrayList arrayList = this.d;
        y71 y71Var = null;
        if (arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            y71 y71Var2 = (y71) obj;
            if (y71Var2.b()) {
                return y71Var2;
            }
        }
        long j10 = Long.MAX_VALUE;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            y71 y71Var3 = (y71) arrayList.get(i11);
            if (y71Var3.f32571k < j10 && a81.Y(y71Var3.f32573m)) {
                j10 = y71Var3.f32571k;
                y71Var = y71Var3;
            }
        }
        if (y71Var != null) {
            return y71Var;
        }
        return (y71) arrayList.get(0);
    }

    public final int b() {
        int min = Math.min(this.f32030b, this.f32031c);
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
        boolean z11 = this.f32029a;
        String str2 = "";
        if (z10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f32030b);
            sb2.append("x");
            sb2.append(this.f32031c);
            if (!z11) {
                str = "";
            } else {
                str = " (" + LocaleController.getString(R.string.QualitySource) + ")";
            }
            sb2.append(str);
            sb2.append("\n");
            ArrayList arrayList = this.d;
            sb2.append(AndroidUtilities.formatFileSize((long) ((y71) arrayList.get(0)).f32572l).replace(" ", ""));
            sb2.append("/s");
            if (((y71) arrayList.get(0)).f32573m != null) {
                str2 = ", " + ((y71) arrayList.get(0)).f32573m;
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
