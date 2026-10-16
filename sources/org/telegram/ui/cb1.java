package org.telegram.ui;

import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stats;
public final class cb1 {
    public String A;
    public boolean B;
    public boolean C;
    public String D;
    public String E;
    public String F;
    public boolean G;
    public boolean H;
    public String f34531a;
    public String f34532b;
    public String f34533c;
    public boolean d;
    public String e;
    public String f34534f;
    public String f34535g;
    public boolean h;
    public String f34536i;
    public String f34537j;
    public String f34538k;
    public boolean f34539l;
    public String f34540m;
    public String f34541n;
    public String f34542o;
    public String f34543p;
    public String f34544q;
    public boolean f34545r;
    public boolean f34546s;
    public String f34547t;
    public String f34548u;
    public String v;
    public boolean f34549w;
    public boolean f34550x;
    public String f34551y;
    public String f34552z;

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
        com.google.firebase.messaging.s sVar = new com.google.firebase.messaging.s(8, false);
        sVar.f6209b = formatWholeNumber;
        sVar.e = str;
        sVar.f6210c = valueOf;
        sVar.d = valueOf2;
        return sVar;
    }
}
