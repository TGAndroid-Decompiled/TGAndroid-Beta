package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
public final class q71 {
    public final boolean f27479a;
    public final int f27480b;
    public final int f27481c;
    public final ArrayList d;

    public q71(s71 s71Var) {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.f27479a = s71Var.f28078b;
        this.f27480b = s71Var.f28082i;
        this.f27481c = s71Var.f28083j;
        arrayList.add(s71Var);
    }

    public final s71 a() {
        ArrayList arrayList = this.d;
        s71 s71Var = null;
        if (arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            s71 s71Var2 = (s71) obj;
            if (s71Var2.b()) {
                return s71Var2;
            }
        }
        long j3 = Long.MAX_VALUE;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            s71 s71Var3 = (s71) arrayList.get(i11);
            if (s71Var3.f28084k < j3 && u71.Y(s71Var3.f28086m)) {
                j3 = s71Var3.f28084k;
                s71Var = s71Var3;
            }
        }
        if (s71Var != null) {
            return s71Var;
        }
        return (s71) arrayList.get(0);
    }

    public final int b() {
        int min = Math.min(this.f27480b, this.f27481c);
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
        boolean z11 = this.f27479a;
        String str2 = "";
        if (z10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f27480b);
            sb2.append("x");
            sb2.append(this.f27481c);
            if (!z11) {
                str = "";
            } else {
                str = " (" + LocaleController.getString(R.string.QualitySource) + ")";
            }
            sb2.append(str);
            sb2.append("\n");
            ArrayList arrayList = this.d;
            sb2.append(AndroidUtilities.formatFileSize((long) ((s71) arrayList.get(0)).f28085l).replace(" ", ""));
            sb2.append("/s");
            if (((s71) arrayList.get(0)).f28086m != null) {
                str2 = ", " + ((s71) arrayList.get(0)).f28086m;
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
