package org.telegram.ui;

import java.util.Locale;
import org.telegram.tgnet.tl.TL_stats;
public final class n61 {
    public String A;
    public boolean B;
    public boolean C;
    public String D;
    public String E;
    public String F;
    public boolean G;
    public boolean H;
    public String f39713a;
    public String f39714b;
    public String f39715c;
    public boolean d;
    public String e;
    public String f39716f;
    public String f39717g;
    public boolean h;
    public String f39718i;
    public String f39719j;
    public String f39720k;
    public boolean f39721l;
    public String f39722m;
    public String f39723n;
    public String f39724o;
    public String f39725p;
    public String f39726q;
    public boolean f39727r;
    public boolean f39728s;
    public String f39729t;
    public String f39730u;
    public String v;
    public boolean f39731w;
    public boolean f39732x;
    public String f39733y;
    public String f39734z;

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
        obj.f53572a = o02;
        obj.d = str;
        obj.f53573b = valueOf;
        obj.f53574c = valueOf2;
        return obj;
    }
}
