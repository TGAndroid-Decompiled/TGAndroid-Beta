package org.telegram.ui;

import android.content.ComponentName;
import android.content.Context;
import org.telegram.messenger.R;
public final class fb0 {
    public static final fb0 h;
    public static final fb0[] f33599n;
    public final String f33600a;
    public final int f33601b;
    public final int f33602c;
    public final int d;
    public final boolean e;
    public ComponentName f33603f;

    static {
        int i10 = R.drawable.icon_background_sa;
        int i11 = R.mipmap.icon_foreground_sa;
        fb0 fb0Var = new fb0("DEFAULT", 0, "DefaultIcon", i10, i11, R.string.AppIconDefault, false);
        h = fb0Var;
        f33599n = new fb0[]{fb0Var, new fb0("VINTAGE", 1, "VintageIcon", R.drawable.icon_6_background_sa, R.mipmap.icon_6_foreground_sa, R.string.AppIconVintage, false), new fb0("AQUA", 2, "AquaIcon", R.drawable.icon_4_background_sa, i11, R.string.AppIconAqua, false), new fb0("PREMIUM", 3, "PremiumIcon", R.drawable.icon_3_background_sa, R.mipmap.icon_3_foreground_sa, R.string.AppIconPremium, true), new fb0("TURBO", 4, "TurboIcon", R.drawable.icon_5_background_sa, R.mipmap.icon_5_foreground_sa, R.string.AppIconTurbo, true), new fb0("NOX", 5, "NoxIcon", R.mipmap.icon_2_background_sa, i11, R.string.AppIconNox, true)};
    }

    public fb0(String str, int i10, String str2, int i11, int i12, int i13, boolean z10) {
        this.f33600a = str2;
        this.f33601b = i11;
        this.f33602c = i12;
        this.d = i13;
        this.e = z10;
    }

    public static fb0 valueOf(String str) {
        return (fb0) Enum.valueOf(fb0.class, str);
    }

    public static fb0[] values() {
        return (fb0[]) f33599n.clone();
    }

    public final ComponentName a(Context context) {
        if (this.f33603f == null) {
            String packageName = context.getPackageName();
            this.f33603f = new ComponentName(packageName, "org.telegram.messenger." + this.f33600a);
        }
        return this.f33603f;
    }
}
