package org.telegram.ui;

import android.content.ComponentName;
import android.content.Context;
import org.telegram.messenger.R;
public final class fb0 {
    public static final fb0 h;
    public static final fb0[] f33615n;
    public final String f33616a;
    public final int f33617b;
    public final int f33618c;
    public final int d;
    public final boolean e;
    public ComponentName f33619f;

    static {
        int i10 = R.drawable.icon_background_sa;
        int i11 = R.mipmap.icon_foreground_sa;
        fb0 fb0Var = new fb0("DEFAULT", 0, "DefaultIcon", i10, i11, R.string.AppIconDefault, false);
        h = fb0Var;
        f33615n = new fb0[]{fb0Var, new fb0("VINTAGE", 1, "VintageIcon", R.drawable.icon_6_background_sa, R.mipmap.icon_6_foreground_sa, R.string.AppIconVintage, false), new fb0("AQUA", 2, "AquaIcon", R.drawable.icon_4_background_sa, i11, R.string.AppIconAqua, false), new fb0("PREMIUM", 3, "PremiumIcon", R.drawable.icon_3_background_sa, R.mipmap.icon_3_foreground_sa, R.string.AppIconPremium, true), new fb0("TURBO", 4, "TurboIcon", R.drawable.icon_5_background_sa, R.mipmap.icon_5_foreground_sa, R.string.AppIconTurbo, true), new fb0("NOX", 5, "NoxIcon", R.mipmap.icon_2_background_sa, i11, R.string.AppIconNox, true)};
    }

    public fb0(String str, int i10, String str2, int i11, int i12, int i13, boolean z10) {
        this.f33616a = str2;
        this.f33617b = i11;
        this.f33618c = i12;
        this.d = i13;
        this.e = z10;
    }

    public static fb0 valueOf(String str) {
        return (fb0) Enum.valueOf(fb0.class, str);
    }

    public static fb0[] values() {
        return (fb0[]) f33615n.clone();
    }

    public final ComponentName a(Context context) {
        if (this.f33619f == null) {
            String packageName = context.getPackageName();
            this.f33619f = new ComponentName(packageName, "org.telegram.messenger." + this.f33616a);
        }
        return this.f33619f;
    }
}
