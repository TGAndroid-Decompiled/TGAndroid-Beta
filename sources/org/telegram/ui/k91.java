package org.telegram.ui;

import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stats;
public final class k91 {
    public String A;
    public boolean B;
    public boolean C;
    public String D;
    public String E;
    public String F;
    public boolean G;
    public boolean H;
    public String f38480a;
    public String f38481b;
    public String f38482c;
    public boolean d;
    public String e;
    public String f38483f;
    public String f38484g;
    public boolean h;
    public String f38485i;
    public String f38486j;
    public String f38487k;
    public boolean f38488l;
    public String f38489m;
    public String f38490n;
    public String f38491o;
    public String f38492p;
    public String f38493q;
    public boolean f38494r;
    public boolean f38495s;
    public String f38496t;
    public String f38497u;
    public String v;
    public boolean f38498w;
    public boolean f38499x;
    public String f38500y;
    public String f38501z;

    public static com.google.firebase.messaging.r a(TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev) {
        float abs;
        boolean z10;
        double d = tL_statsAbsValueAndPrev.current;
        double d10 = tL_statsAbsValueAndPrev.previous;
        int i10 = (int) (d - d10);
        if (d10 == 0.0d) {
            abs = 0.0f;
        } else {
            abs = Math.abs((i10 / ((float) d10)) * 100.0f);
        }
        String formatWholeNumber = AndroidUtilities.formatWholeNumber((int) tL_statsAbsValueAndPrev.current, 0);
        boolean z11 = true;
        String str = "";
        if (i10 != 0 && abs != 0.0f) {
            int i11 = (int) abs;
            if (abs == i11) {
                Locale locale = Locale.ENGLISH;
                StringBuilder sb2 = new StringBuilder();
                if (i10 > 0) {
                    str = "+";
                }
                sb2.append(str);
                sb2.append(AndroidUtilities.formatWholeNumber(i10, 0));
                str = sb2.toString() + " (" + i11 + "%)";
            } else {
                Locale locale2 = Locale.ENGLISH;
                StringBuilder sb3 = new StringBuilder();
                if (i10 > 0) {
                    str = "+";
                }
                sb3.append(str);
                sb3.append(AndroidUtilities.formatWholeNumber(i10, 0));
                str = String.format(locale2, "%s (%.1f%s)", sb3.toString(), Float.valueOf(abs), "%");
            }
        }
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i10 == 0 && tL_statsAbsValueAndPrev.current == 0.0d) {
            z11 = false;
        }
        Boolean valueOf = Boolean.valueOf(z10);
        Boolean valueOf2 = Boolean.valueOf(z11);
        com.google.firebase.messaging.r rVar = new com.google.firebase.messaging.r(8, false);
        rVar.f7660b = formatWholeNumber;
        rVar.e = str;
        rVar.f7661c = valueOf;
        rVar.d = valueOf2;
        return rVar;
    }
}
