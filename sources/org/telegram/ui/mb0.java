package org.telegram.ui;

import android.content.ComponentName;
import android.content.Context;
import org.telegram.messenger.R;
public final class mb0 {
    public static final mb0 h;
    public static final mb0[] f35575n;
    public final String f35576a;
    public final int f35577b;
    public final int f35578c;
    public final int d;
    public final boolean e;
    public ComponentName f35579f;

    static {
        int i10 = R.drawable.icon_background_sa;
        int i11 = R.mipmap.icon_foreground_sa;
        mb0 mb0Var = new mb0("DEFAULT", 0, "DefaultIcon", i10, i11, R.string.AppIconDefault, false);
        h = mb0Var;
        f35575n = new mb0[]{mb0Var, new mb0("VINTAGE", 1, "VintageIcon", R.drawable.icon_6_background_sa, R.mipmap.icon_6_foreground_sa, R.string.AppIconVintage, false), new mb0("AQUA", 2, "AquaIcon", R.drawable.icon_4_background_sa, i11, R.string.AppIconAqua, false), new mb0("PREMIUM", 3, "PremiumIcon", R.drawable.icon_3_background_sa, R.mipmap.icon_3_foreground_sa, R.string.AppIconPremium, true), new mb0("TURBO", 4, "TurboIcon", R.drawable.icon_5_background_sa, R.mipmap.icon_5_foreground_sa, R.string.AppIconTurbo, true), new mb0("NOX", 5, "NoxIcon", R.mipmap.icon_2_background_sa, i11, R.string.AppIconNox, true)};
    }

    public mb0(String str, int i10, String str2, int i11, int i12, int i13, boolean z10) {
        this.f35576a = str2;
        this.f35577b = i11;
        this.f35578c = i12;
        this.d = i13;
        this.e = z10;
    }

    public static mb0 valueOf(String str) {
        return (mb0) Enum.valueOf(mb0.class, str);
    }

    public static mb0[] values() {
        return (mb0[]) f35575n.clone();
    }

    public final ComponentName a(Context context) {
        if (this.f35579f == null) {
            String packageName = context.getPackageName();
            this.f35579f = new ComponentName(packageName, "org.telegram.messenger." + this.f35576a);
        }
        return this.f35579f;
    }
}
