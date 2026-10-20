package org.telegram.ui;

import android.content.ComponentName;
import android.content.Context;
import org.telegram.messenger.R;
public final class oa0 {
    public static final oa0 h;
    public static final oa0[] f39807n;
    public final String f39808a;
    public final int f39809b;
    public final int f39810c;
    public final int d;
    public final boolean e;
    public ComponentName f39811f;

    static {
        int i10 = R.drawable.icon_background_sa;
        int i11 = R.mipmap.icon_foreground_sa;
        oa0 oa0Var = new oa0("DEFAULT", 0, "DefaultIcon", i10, i11, R.string.AppIconDefault, false);
        h = oa0Var;
        f39807n = new oa0[]{oa0Var, new oa0("VINTAGE", 1, "VintageIcon", R.drawable.icon_6_background_sa, R.mipmap.icon_6_foreground_sa, R.string.AppIconVintage, false), new oa0("AQUA", 2, "AquaIcon", R.drawable.icon_4_background_sa, i11, R.string.AppIconAqua, false), new oa0("PREMIUM", 3, "PremiumIcon", R.drawable.icon_3_background_sa, R.mipmap.icon_3_foreground_sa, R.string.AppIconPremium, true), new oa0("TURBO", 4, "TurboIcon", R.drawable.icon_5_background_sa, R.mipmap.icon_5_foreground_sa, R.string.AppIconTurbo, true), new oa0("NOX", 5, "NoxIcon", R.mipmap.icon_2_background_sa, i11, R.string.AppIconNox, true)};
    }

    public oa0(String str, int i10, String str2, int i11, int i12, int i13, boolean z10) {
        this.f39808a = str2;
        this.f39809b = i11;
        this.f39810c = i12;
        this.d = i13;
        this.e = z10;
    }

    public static oa0 valueOf(String str) {
        return (oa0) Enum.valueOf(oa0.class, str);
    }

    public static oa0[] values() {
        return (oa0[]) f39807n.clone();
    }

    public final ComponentName a(Context context) {
        if (this.f39811f == null) {
            String packageName = context.getPackageName();
            this.f39811f = new ComponentName(packageName, "org.telegram.messenger." + this.f39808a);
        }
        return this.f39811f;
    }
}
