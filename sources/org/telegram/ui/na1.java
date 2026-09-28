package org.telegram.ui;

import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stats;
public final class na1 {
    public String A;
    public boolean B;
    public boolean C;
    public String D;
    public String E;
    public String F;
    public boolean G;
    public boolean H;
    public String f35819a;
    public String f35820b;
    public String f35821c;
    public boolean d;
    public String e;
    public String f35822f;
    public String f35823g;
    public boolean h;
    public String f35824i;
    public String f35825j;
    public String f35826k;
    public boolean f35827l;
    public String f35828m;
    public String f35829n;
    public String f35830o;
    public String f35831p;
    public String f35832q;
    public boolean f35833r;
    public boolean f35834s;
    public String f35835t;
    public String f35836u;
    public String v;
    public boolean f35837w;
    public boolean f35838x;
    public String f35839y;
    public String f35840z;

    public static com.google.firebase.messaging.t a(TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev) {
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
        com.google.firebase.messaging.t tVar = new com.google.firebase.messaging.t(8, false);
        tVar.f7328b = formatWholeNumber;
        tVar.e = str;
        tVar.f7329c = valueOf;
        tVar.d = valueOf2;
        return tVar;
    }
}
