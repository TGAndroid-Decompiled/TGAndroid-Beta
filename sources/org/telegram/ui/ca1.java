package org.telegram.ui;

import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stats;
public final class ca1 {
    public String A;
    public boolean B;
    public boolean C;
    public String D;
    public String E;
    public String F;
    public boolean G;
    public boolean H;
    public String f35736a;
    public String f35737b;
    public String f35738c;
    public boolean d;
    public String f35739e;
    public String f35740f;
    public String f35741g;
    public boolean h;
    public String f35742i;
    public String f35743j;
    public String f35744k;
    public boolean f35745l;
    public String f35746m;
    public String f35747n;
    public String f35748o;
    public String f35749p;
    public String f35750q;
    public boolean f35751r;
    public boolean f35752s;
    public String f35753t;
    public String f35754u;
    public String v;
    public boolean f35755w;
    public boolean f35756x;
    public String f35757y;
    public String f35758z;

    public static sf.e a(TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev) {
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
        sf.e eVar = new sf.e(11, false);
        eVar.f47315b = formatWholeNumber;
        eVar.f47316c = str;
        eVar.d = valueOf;
        eVar.f47317e = valueOf2;
        return eVar;
    }
}
