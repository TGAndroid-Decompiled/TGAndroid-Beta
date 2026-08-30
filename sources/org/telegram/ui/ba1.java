package org.telegram.ui;

import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stats;
public final class ba1 {
    public String A;
    public boolean B;
    public boolean C;
    public String D;
    public String E;
    public String F;
    public boolean G;
    public boolean H;
    public String f32866a;
    public String f32867b;
    public String f32868c;
    public boolean d;
    public String e;
    public String f32869f;
    public String f32870g;
    public boolean h;
    public String f32871i;
    public String f32872j;
    public String f32873k;
    public boolean f32874l;
    public String f32875m;
    public String f32876n;
    public String f32877o;
    public String f32878p;
    public String f32879q;
    public boolean f32880r;
    public boolean f32881s;
    public String f32882t;
    public String f32883u;
    public String v;
    public boolean f32884w;
    public boolean f32885x;
    public String f32886y;
    public String f32887z;

    public static com.google.firebase.messaging.r a(TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev) {
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
        com.google.firebase.messaging.r rVar = new com.google.firebase.messaging.r(22, false);
        rVar.f4028b = formatWholeNumber;
        rVar.e = str;
        rVar.f4029c = valueOf;
        rVar.d = valueOf2;
        return rVar;
    }
}
