package org.telegram.ui;

import android.content.ComponentName;
import android.content.Context;
import org.telegram.messenger.R;
public final class ib0 {
    public static final ib0 h;
    public static final ib0[] f38678n;
    public final String f38679a;
    public final int f38680b;
    public final int f38681c;
    public final int d;
    public final boolean f38682e;
    public ComponentName f38683f;

    static {
        int i10 = R.drawable.icon_background_sa;
        int i11 = R.mipmap.icon_foreground_sa;
        ib0 ib0Var = new ib0("DEFAULT", 0, "DefaultIcon", i10, i11, R.string.AppIconDefault, false);
        h = ib0Var;
        f38678n = new ib0[]{ib0Var, new ib0("VINTAGE", 1, "VintageIcon", R.drawable.icon_6_background_sa, R.mipmap.icon_6_foreground_sa, R.string.AppIconVintage, false), new ib0("AQUA", 2, "AquaIcon", R.drawable.icon_4_background_sa, i11, R.string.AppIconAqua, false), new ib0("PREMIUM", 3, "PremiumIcon", R.drawable.icon_3_background_sa, R.mipmap.icon_3_foreground_sa, R.string.AppIconPremium, true), new ib0("TURBO", 4, "TurboIcon", R.drawable.icon_5_background_sa, R.mipmap.icon_5_foreground_sa, R.string.AppIconTurbo, true), new ib0("NOX", 5, "NoxIcon", R.mipmap.icon_2_background_sa, i11, R.string.AppIconNox, true)};
    }

    public ib0(String str, int i10, String str2, int i11, int i12, int i13, boolean z10) {
        this.f38679a = str2;
        this.f38680b = i11;
        this.f38681c = i12;
        this.d = i13;
        this.f38682e = z10;
    }

    public static ib0 valueOf(String str) {
        return (ib0) Enum.valueOf(ib0.class, str);
    }

    public static ib0[] values() {
        return (ib0[]) f38678n.clone();
    }

    public final ComponentName a(Context context) {
        if (this.f38683f == null) {
            String packageName = context.getPackageName();
            this.f38683f = new ComponentName(packageName, "org.telegram.messenger." + this.f38679a);
        }
        return this.f38683f;
    }
}
