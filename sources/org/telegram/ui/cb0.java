package org.telegram.ui;

import android.content.ComponentName;
import android.content.Context;
import org.telegram.messenger.R;
public final class cb0 {
    public static final cb0 h;
    public static final cb0[] f33063n;
    public final String f33064a;
    public final int f33065b;
    public final int f33066c;
    public final int d;
    public final boolean e;
    public ComponentName f33067f;

    static {
        int i10 = R.drawable.icon_background_sa;
        int i11 = R.mipmap.icon_foreground_sa;
        cb0 cb0Var = new cb0("DEFAULT", 0, "DefaultIcon", i10, i11, R.string.AppIconDefault, false);
        h = cb0Var;
        f33063n = new cb0[]{cb0Var, new cb0("VINTAGE", 1, "VintageIcon", R.drawable.icon_6_background_sa, R.mipmap.icon_6_foreground_sa, R.string.AppIconVintage, false), new cb0("AQUA", 2, "AquaIcon", R.drawable.icon_4_background_sa, i11, R.string.AppIconAqua, false), new cb0("PREMIUM", 3, "PremiumIcon", R.drawable.icon_3_background_sa, R.mipmap.icon_3_foreground_sa, R.string.AppIconPremium, true), new cb0("TURBO", 4, "TurboIcon", R.drawable.icon_5_background_sa, R.mipmap.icon_5_foreground_sa, R.string.AppIconTurbo, true), new cb0("NOX", 5, "NoxIcon", R.mipmap.icon_2_background_sa, i11, R.string.AppIconNox, true)};
    }

    public cb0(String str, int i10, String str2, int i11, int i12, int i13, boolean z4) {
        this.f33064a = str2;
        this.f33065b = i11;
        this.f33066c = i12;
        this.d = i13;
        this.e = z4;
    }

    public static cb0 valueOf(String str) {
        return (cb0) Enum.valueOf(cb0.class, str);
    }

    public static cb0[] values() {
        return (cb0[]) f33063n.clone();
    }

    public final ComponentName a(Context context) {
        if (this.f33067f == null) {
            String packageName = context.getPackageName();
            this.f33067f = new ComponentName(packageName, "org.telegram.messenger." + this.f33064a);
        }
        return this.f33067f;
    }
}
