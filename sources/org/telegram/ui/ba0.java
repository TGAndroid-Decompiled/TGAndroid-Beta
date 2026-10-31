package org.telegram.ui;

import android.content.ComponentName;
import android.content.Context;
public enum ba0 {
    DEFAULT("DefaultIcon", 2131231491, 2131558426, 2131754237, false),
    VINTAGE("VintageIcon", 2131231486, 2131558419, 2131754233, false),
    AQUA("AquaIcon", 2131231480, 2131558426, 2131754239, false),
    PREMIUM("PremiumIcon", 2131231477, 2131558407, 2131754235, true),
    TURBO("TurboIcon", 2131231483, 2131558414, 2131754234, true),
    NOX("NoxIcon", 2131558402, 2131558426, 2131754236, true);
    
    public final String f36147a;
    public final int f36148b;
    public final int f36149c;
    public final int d;
    public final boolean e;
    public ComponentName f36150f;

    ba0(String str, int i10, int i11, int i12, boolean z10) {
        this.f36147a = str;
        this.f36148b = i10;
        this.f36149c = i11;
        this.d = i12;
        this.e = z10;
    }

    public final ComponentName a(Context context) {
        if (this.f36150f == null) {
            String packageName = context.getPackageName();
            this.f36150f = new ComponentName(packageName, "org.telegram.messenger." + this.f36147a);
        }
        return this.f36150f;
    }
}
