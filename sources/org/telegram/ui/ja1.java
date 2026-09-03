package org.telegram.ui;

import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stats;
public final class ja1 {
    public String A;
    public boolean B;
    public boolean C;
    public String D;
    public String E;
    public String F;
    public boolean G;
    public boolean H;
    public String f35137a;
    public String f35138b;
    public String f35139c;
    public boolean d;
    public String e;
    public String f35140f;
    public String f35141g;
    public boolean h;
    public String f35142i;
    public String f35143j;
    public String f35144k;
    public boolean f35145l;
    public String f35146m;
    public String f35147n;
    public String f35148o;
    public String f35149p;
    public String f35150q;
    public boolean f35151r;
    public boolean f35152s;
    public String f35153t;
    public String f35154u;
    public String v;
    public boolean f35155w;
    public boolean f35156x;
    public String f35157y;
    public String f35158z;

    public static rf.f a(TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev) {
        float abs;
        boolean z4;
        double d = tL_statsAbsValueAndPrev.current;
        double d10 = tL_statsAbsValueAndPrev.previous;
        int i10 = (int) (d - d10);
        if (d10 == 0.0d) {
            abs = 0.0f;
        } else {
            abs = Math.abs((i10 / ((float) d10)) * 100.0f);
        }
        String formatWholeNumber = AndroidUtilities.formatWholeNumber((int) tL_statsAbsValueAndPrev.current, 0);
        boolean z10 = true;
        String str = "";
        if (i10 != 0 && abs != 0.0f) {
            int i11 = (int) abs;
            if (abs == i11) {
                Locale locale = Locale.ENGLISH;
                StringBuilder sb = new StringBuilder();
                if (i10 > 0) {
                    str = "+";
                }
                sb.append(str);
                sb.append(AndroidUtilities.formatWholeNumber(i10, 0));
                str = sb.toString() + " (" + i11 + "%)";
            } else {
                Locale locale2 = Locale.ENGLISH;
                StringBuilder sb2 = new StringBuilder();
                if (i10 > 0) {
                    str = "+";
                }
                sb2.append(str);
                sb2.append(AndroidUtilities.formatWholeNumber(i10, 0));
                str = String.format(locale2, "%s (%.1f%s)", sb2.toString(), Float.valueOf(abs), "%");
            }
        }
        if (i10 >= 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (i10 == 0 && tL_statsAbsValueAndPrev.current == 0.0d) {
            z10 = false;
        }
        Boolean valueOf = Boolean.valueOf(z4);
        Boolean valueOf2 = Boolean.valueOf(z10);
        rf.f fVar = new rf.f(11, false);
        fVar.f43490b = formatWholeNumber;
        fVar.f43491c = str;
        fVar.d = valueOf;
        fVar.e = valueOf2;
        return fVar;
    }
}
