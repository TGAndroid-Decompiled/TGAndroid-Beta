package org.telegram.ui;

import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stats;
public final class ia1 {
    public String A;
    public boolean B;
    public boolean C;
    public String D;
    public String E;
    public String F;
    public boolean G;
    public boolean H;
    public String f37594a;
    public String f37595b;
    public String f37596c;
    public boolean d;
    public String f37597e;
    public String f37598f;
    public String f37599g;
    public boolean h;
    public String f37600i;
    public String f37601j;
    public String f37602k;
    public boolean f37603l;
    public String f37604m;
    public String f37605n;
    public String f37606o;
    public String f37607p;
    public String f37608q;
    public boolean f37609r;
    public boolean f37610s;
    public String f37611t;
    public String f37612u;
    public String v;
    public boolean f37613w;
    public boolean f37614x;
    public String f37615y;
    public String f37616z;

    public static sf.f a(TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev) {
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
        sf.f fVar = new sf.f(11, false);
        fVar.f47351b = formatWholeNumber;
        fVar.f47352c = str;
        fVar.d = valueOf;
        fVar.f47353e = valueOf2;
        return fVar;
    }
}
