package org.telegram.ui;

import java.util.Locale;
import org.telegram.tgnet.tl.TL_stats;
public final class p61 {
    public String A;
    public boolean B;
    public boolean C;
    public String D;
    public String E;
    public String F;
    public boolean G;
    public boolean H;
    public String f40477a;
    public String f40478b;
    public String f40479c;
    public boolean d;
    public String e;
    public String f40480f;
    public String f40481g;
    public boolean h;
    public String f40482i;
    public String f40483j;
    public String f40484k;
    public boolean f40485l;
    public String f40486m;
    public String f40487n;
    public String f40488o;
    public String f40489p;
    public String f40490q;
    public boolean f40491r;
    public boolean f40492s;
    public String f40493t;
    public String f40494u;
    public String v;
    public boolean f40495w;
    public boolean f40496x;
    public String f40497y;
    public String f40498z;

    public static xa.n a(TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev) {
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
        boolean z11 = false;
        String o02 = org.telegram.messenger.i0.o0((int) tL_statsAbsValueAndPrev.current, 0);
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
                sb2.append(org.telegram.messenger.i0.o0(i10, 0));
                str = sb2.toString() + " (" + i11 + "%)";
            } else {
                Locale locale2 = Locale.ENGLISH;
                StringBuilder sb3 = new StringBuilder();
                if (i10 > 0) {
                    str = "+";
                }
                sb3.append(str);
                sb3.append(org.telegram.messenger.i0.o0(i10, 0));
                str = String.format(locale2, "%s (%.1f%s)", sb3.toString(), Float.valueOf(abs), "%");
            }
        }
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i10 != 0 || tL_statsAbsValueAndPrev.current != 0.0d) {
            z11 = true;
        }
        Boolean valueOf = Boolean.valueOf(z10);
        Boolean valueOf2 = Boolean.valueOf(z11);
        ?? obj = new Object();
        obj.f53554a = o02;
        obj.d = str;
        obj.f53555b = valueOf;
        obj.f53556c = valueOf2;
        return obj;
    }
}
