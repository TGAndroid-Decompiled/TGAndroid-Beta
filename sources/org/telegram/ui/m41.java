package org.telegram.ui;

import java.util.Locale;
import org.telegram.tgnet.tl.TL_stats;
public final class m41 {
    public String A;
    public boolean B;
    public boolean C;
    public String D;
    public String E;
    public String F;
    public boolean G;
    public boolean H;
    public String f47500a;
    public String f47501b;
    public String f47502c;
    public boolean d;
    public String f47503e;
    public String f47504f;
    public String f47505g;
    public boolean h;
    public String f47506i;
    public String f47507j;
    public String f47508k;
    public boolean f47509l;
    public String f47510m;
    public String f47511n;
    public String f47512o;
    public String f47513p;
    public String f47514q;
    public boolean f47515r;
    public boolean f47516s;
    public String f47517t;
    public String f47518u;
    public String v;
    public boolean f47519w;
    public boolean f47520x;
    public String f47521y;
    public String f47522z;

    public static za.p a(TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev) {
        float abs;
        boolean z10;
        double d = tL_statsAbsValueAndPrev.current;
        double d10 = tL_statsAbsValueAndPrev.previous;
        int i3 = (int) (d - d10);
        if (d10 == 0.0d) {
            abs = 0.0f;
        } else {
            abs = Math.abs((i3 / ((float) d10)) * 100.0f);
        }
        boolean z11 = false;
        String o02 = org.telegram.messenger.g0.o0((int) tL_statsAbsValueAndPrev.current, 0);
        String str = "";
        if (i3 != 0 && abs != 0.0f) {
            int i10 = (int) abs;
            if (abs == i10) {
                Locale locale = Locale.ENGLISH;
                StringBuilder sb2 = new StringBuilder();
                if (i3 > 0) {
                    str = "+";
                }
                sb2.append(str);
                sb2.append(org.telegram.messenger.g0.o0(i3, 0));
                str = sb2.toString() + " (" + i10 + "%)";
            } else {
                Locale locale2 = Locale.ENGLISH;
                StringBuilder sb3 = new StringBuilder();
                if (i3 > 0) {
                    str = "+";
                }
                sb3.append(str);
                sb3.append(org.telegram.messenger.g0.o0(i3, 0));
                str = String.format(locale2, "%s (%.1f%s)", sb3.toString(), Float.valueOf(abs), "%");
            }
        }
        if (i3 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i3 != 0 || tL_statsAbsValueAndPrev.current != 0.0d) {
            z11 = true;
        }
        Boolean valueOf = Boolean.valueOf(z10);
        Boolean valueOf2 = Boolean.valueOf(z11);
        ?? obj = new Object();
        obj.f60311a = o02;
        obj.d = str;
        obj.f60312b = valueOf;
        obj.f60313c = valueOf2;
        return obj;
    }
}
