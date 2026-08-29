package org.telegram.ui;

import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stats;
public final class o91 {
    public String A;
    public boolean B;
    public boolean C;
    public String D;
    public String E;
    public String F;
    public boolean G;
    public boolean H;
    public String f41013a;
    public String f41014b;
    public String f41015c;
    public boolean d;
    public String f41016e;
    public String f41017f;
    public String f41018g;
    public boolean h;
    public String f41019i;
    public String f41020j;
    public String f41021k;
    public boolean f41022l;
    public String f41023m;
    public String f41024n;
    public String f41025o;
    public String f41026p;
    public String f41027q;
    public boolean f41028r;
    public boolean f41029s;
    public String f41030t;
    public String f41031u;
    public String v;
    public boolean f41032w;
    public boolean f41033x;
    public String f41034y;
    public String f41035z;

    public static com.google.firebase.messaging.s a(TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev) {
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
        com.google.firebase.messaging.s sVar = new com.google.firebase.messaging.s(23, false);
        sVar.f5185b = formatWholeNumber;
        sVar.f5187e = str;
        sVar.f5186c = valueOf;
        sVar.d = valueOf2;
        return sVar;
    }
}
