package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
public final class g71 {
    public final boolean f27129a;
    public final int f27130b;
    public final int f27131c;
    public final ArrayList d;

    public g71(i71 i71Var) {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.f27129a = i71Var.f27686b;
        this.f27130b = i71Var.f27691i;
        this.f27131c = i71Var.f27692j;
        arrayList.add(i71Var);
    }

    public final i71 a() {
        ArrayList arrayList = this.d;
        i71 i71Var = null;
        if (arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            i71 i71Var2 = (i71) obj;
            if (i71Var2.b()) {
                return i71Var2;
            }
        }
        long j10 = Long.MAX_VALUE;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            i71 i71Var3 = (i71) arrayList.get(i11);
            if (i71Var3.f27693k < j10 && k71.Y(i71Var3.f27695m)) {
                j10 = i71Var3.f27693k;
                i71Var = i71Var3;
            }
        }
        if (i71Var != null) {
            return i71Var;
        }
        return (i71) arrayList.get(0);
    }

    public final int b() {
        int min = Math.min(this.f27130b, this.f27131c);
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
        boolean z10 = this.f27129a;
        String str2 = "";
        if (z4) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f27130b);
            sb.append("x");
            sb.append(this.f27131c);
            if (!z10) {
                str = "";
            } else {
                str = " (" + LocaleController.getString(R.string.QualitySource) + ")";
            }
            sb.append(str);
            sb.append("\n");
            ArrayList arrayList = this.d;
            sb.append(AndroidUtilities.formatFileSize((long) ((i71) arrayList.get(0)).f27694l).replace(" ", ""));
            sb.append("/s");
            if (((i71) arrayList.get(0)).f27695m != null) {
                str2 = ", " + ((i71) arrayList.get(0)).f27695m;
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
