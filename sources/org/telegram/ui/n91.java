package org.telegram.ui;

import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stats;
public final class n91 {
    public String A;
    public boolean B;
    public boolean C;
    public String D;
    public String E;
    public String F;
    public boolean G;
    public boolean H;
    public String f40654a;
    public String f40655b;
    public String f40656c;
    public boolean d;
    public String f40657e;
    public String f40658f;
    public String f40659g;
    public boolean h;
    public String f40660i;
    public String f40661j;
    public String f40662k;
    public boolean f40663l;
    public String f40664m;
    public String f40665n;
    public String f40666o;
    public String f40667p;
    public String f40668q;
    public boolean f40669r;
    public boolean f40670s;
    public String f40671t;
    public String f40672u;
    public String v;
    public boolean f40673w;
    public boolean f40674x;
    public String f40675y;
    public String f40676z;

    public static com.google.firebase.messaging.t a(TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev) {
        float abs;
        boolean z10;
        double d = tL_statsAbsValueAndPrev.current;
        double d9 = tL_statsAbsValueAndPrev.previous;
        int i9 = (int) (d - d9);
        if (d9 == 0.0d) {
            abs = 0.0f;
        } else {
            abs = Math.abs((i9 / ((float) d9)) * 100.0f);
        }
        String formatWholeNumber = AndroidUtilities.formatWholeNumber((int) tL_statsAbsValueAndPrev.current, 0);
        boolean z11 = true;
        String str = "";
        if (i9 != 0 && abs != 0.0f) {
            int i10 = (int) abs;
            if (abs == i10) {
                Locale locale = Locale.ENGLISH;
                StringBuilder sb2 = new StringBuilder();
                if (i9 > 0) {
                    str = "+";
                }
                sb2.append(str);
                sb2.append(AndroidUtilities.formatWholeNumber(i9, 0));
                str = sb2.toString() + " (" + i10 + "%)";
            } else {
                Locale locale2 = Locale.ENGLISH;
                StringBuilder sb3 = new StringBuilder();
                if (i9 > 0) {
                    str = "+";
                }
                sb3.append(str);
                sb3.append(AndroidUtilities.formatWholeNumber(i9, 0));
                str = String.format(locale2, "%s (%.1f%s)", sb3.toString(), Float.valueOf(abs), "%");
            }
        }
        if (i9 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i9 == 0 && tL_statsAbsValueAndPrev.current == 0.0d) {
            z11 = false;
        }
        Boolean valueOf = Boolean.valueOf(z10);
        Boolean valueOf2 = Boolean.valueOf(z11);
        com.google.firebase.messaging.t tVar = new com.google.firebase.messaging.t(21, false);
        tVar.f4177b = formatWholeNumber;
        tVar.f4179e = str;
        tVar.f4178c = valueOf;
        tVar.d = valueOf2;
        return tVar;
    }
}
