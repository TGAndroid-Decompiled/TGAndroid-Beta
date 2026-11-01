package org.telegram.ui;

import org.telegram.tgnet.tl.TL_stars;
public final class ie {
    public String f38010b;
    public CharSequence f38011c;
    public long d;
    public long e;
    public String f38012f;
    public boolean f38013g;
    public String h;
    public long f38015j;
    public boolean f38009a = true;
    public TL_stars.StarsAmount f38014i = TL_stars.StarsAmount.ofStars(0);

    public static ie a(String str, String str2) {
        ie ieVar = new ie();
        ieVar.f38010b = str;
        ieVar.f38011c = str2;
        return ieVar;
    }
}
