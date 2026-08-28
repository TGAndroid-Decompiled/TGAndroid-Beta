package org.telegram.ui;

import android.content.ComponentName;
import android.content.Context;
import org.telegram.messenger.R;
public final class pa0 {
    public static final pa0 h;
    public static final pa0[] f41385n;
    public final String f41386a;
    public final int f41387b;
    public final int f41388c;
    public final int d;
    public final boolean f41389e;
    public ComponentName f41390f;

    static {
        int i9 = R.drawable.icon_background_sa;
        int i10 = R.mipmap.icon_foreground_sa;
        pa0 pa0Var = new pa0("DEFAULT", 0, "DefaultIcon", i9, i10, R.string.AppIconDefault, false);
        h = pa0Var;
        f41385n = new pa0[]{pa0Var, new pa0("VINTAGE", 1, "VintageIcon", R.drawable.icon_6_background_sa, R.mipmap.icon_6_foreground_sa, R.string.AppIconVintage, false), new pa0("AQUA", 2, "AquaIcon", R.drawable.icon_4_background_sa, i10, R.string.AppIconAqua, false), new pa0("PREMIUM", 3, "PremiumIcon", R.drawable.icon_3_background_sa, R.mipmap.icon_3_foreground_sa, R.string.AppIconPremium, true), new pa0("TURBO", 4, "TurboIcon", R.drawable.icon_5_background_sa, R.mipmap.icon_5_foreground_sa, R.string.AppIconTurbo, true), new pa0("NOX", 5, "NoxIcon", R.mipmap.icon_2_background_sa, i10, R.string.AppIconNox, true)};
    }

    public pa0(String str, int i9, String str2, int i10, int i11, int i12, boolean z10) {
        this.f41386a = str2;
        this.f41387b = i10;
        this.f41388c = i11;
        this.d = i12;
        this.f41389e = z10;
    }

    public static pa0 valueOf(String str) {
        return (pa0) Enum.valueOf(pa0.class, str);
    }

    public static pa0[] values() {
        return (pa0[]) f41385n.clone();
    }

    public final ComponentName a(Context context) {
        if (this.f41390f == null) {
            String packageName = context.getPackageName();
            this.f41390f = new ComponentName(packageName, "org.telegram.messenger." + this.f41386a);
        }
        return this.f41390f;
    }
}
