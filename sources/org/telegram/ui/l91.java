package org.telegram.ui;

import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stats;

public final class l91 {
    public String A;
    public boolean B;
    public boolean C;
    public String D;
    public String E;
    public String F;
    public boolean G;
    public boolean H;

    public String f40004a;

    public String f40005b;

    public String f40006c;
    public boolean d;

    public String f40007e;

    public String f40008f;

    public String f40009g;
    public boolean h;

    public String f40010i;

    public String f40011j;

    public String f40012k;

    public boolean f40013l;

    public String f40014m;

    public String f40015n;

    public String f40016o;

    public String f40017p;

    public String f40018q;

    public boolean f40019r;

    public boolean f40020s;

    public String f40021t;

    public String f40022u;
    public String v;

    public boolean f40023w;

    public boolean f40024x;

    public String f40025y;

    public String f40026z;

    public static com.google.firebase.messaging.t a(TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev) {
        double d = tL_statsAbsValueAndPrev.current;
        double d10 = tL_statsAbsValueAndPrev.previous;
        int i10 = (int) (d - d10);
        float fAbs = d10 == 0.0d ? 0.0f : Math.abs((i10 / ((float) d10)) * 100.0f);
        boolean z10 = false;
        String wholeNumber = AndroidUtilities.formatWholeNumber((int) tL_statsAbsValueAndPrev.current, 0);
        boolean z11 = true;
        String str = "";
        if (i10 != 0 && fAbs != 0.0f) {
            int i11 = (int) fAbs;
            if (fAbs == i11) {
                Locale locale = Locale.ENGLISH;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i10 > 0 ? "+" : "");
                sb2.append(AndroidUtilities.formatWholeNumber(i10, 0));
                str = sb2.toString() + " (" + i11 + "%)";
            } else {
                Locale locale2 = Locale.ENGLISH;
                StringBuilder sb3 = new StringBuilder();
                sb3.append(i10 > 0 ? "+" : "");
                sb3.append(AndroidUtilities.formatWholeNumber(i10, 0));
                str = String.format(locale2, "%s (%.1f%s)", sb3.toString(), Float.valueOf(fAbs), "%");
            }
        }
        boolean z12 = i10 >= 0;
        if (i10 == 0 && tL_statsAbsValueAndPrev.current == 0.0d) {
            z11 = false;
        }
        Boolean boolValueOf = Boolean.valueOf(z12);
        Boolean boolValueOf2 = Boolean.valueOf(z11);
        com.google.firebase.messaging.t tVar = new com.google.firebase.messaging.t(22, z10);
        tVar.f4619b = wholeNumber;
        tVar.f4621e = str;
        tVar.f4620c = boolValueOf;
        tVar.d = boolValueOf2;
        return tVar;
    }
}
