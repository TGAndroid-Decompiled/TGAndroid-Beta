package org.telegram.ui;

import android.content.ComponentName;
import android.content.Context;
import org.telegram.messenger.R;
public final class kb0 {
    public static final kb0 h;
    public static final kb0[] f39438n;
    public final String f39439a;
    public final int f39440b;
    public final int f39441c;
    public final int d;
    public final boolean f39442e;
    public ComponentName f39443f;

    static {
        int i10 = R.drawable.icon_background_sa;
        int i11 = R.mipmap.icon_foreground_sa;
        kb0 kb0Var = new kb0("DEFAULT", 0, "DefaultIcon", i10, i11, R.string.AppIconDefault, false);
        h = kb0Var;
        f39438n = new kb0[]{kb0Var, new kb0("VINTAGE", 1, "VintageIcon", R.drawable.icon_6_background_sa, R.mipmap.icon_6_foreground_sa, R.string.AppIconVintage, false), new kb0("AQUA", 2, "AquaIcon", R.drawable.icon_4_background_sa, i11, R.string.AppIconAqua, false), new kb0("PREMIUM", 3, "PremiumIcon", R.drawable.icon_3_background_sa, R.mipmap.icon_3_foreground_sa, R.string.AppIconPremium, true), new kb0("TURBO", 4, "TurboIcon", R.drawable.icon_5_background_sa, R.mipmap.icon_5_foreground_sa, R.string.AppIconTurbo, true), new kb0("NOX", 5, "NoxIcon", R.mipmap.icon_2_background_sa, i11, R.string.AppIconNox, true)};
    }

    public kb0(String str, int i10, String str2, int i11, int i12, int i13, boolean z10) {
        this.f39439a = str2;
        this.f39440b = i11;
        this.f39441c = i12;
        this.d = i13;
        this.f39442e = z10;
    }

    public static kb0 valueOf(String str) {
        return (kb0) Enum.valueOf(kb0.class, str);
    }

    public static kb0[] values() {
        return (kb0[]) f39438n.clone();
    }

    public final ComponentName a(Context context) {
        if (this.f39443f == null) {
            String packageName = context.getPackageName();
            this.f39443f = new ComponentName(packageName, "org.telegram.messenger." + this.f39439a);
        }
        return this.f39443f;
    }
}
