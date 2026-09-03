package org.telegram.ui;

import android.content.ComponentName;
import android.content.Context;
import org.telegram.messenger.R;
public final class bb0 {
    public static final bb0 h;
    public static final bb0[] f35423n;
    public final String f35424a;
    public final int f35425b;
    public final int f35426c;
    public final int d;
    public final boolean f35427e;
    public ComponentName f35428f;

    static {
        int i10 = R.drawable.icon_background_sa;
        int i11 = R.mipmap.icon_foreground_sa;
        bb0 bb0Var = new bb0("DEFAULT", 0, "DefaultIcon", i10, i11, R.string.AppIconDefault, false);
        h = bb0Var;
        f35423n = new bb0[]{bb0Var, new bb0("VINTAGE", 1, "VintageIcon", R.drawable.icon_6_background_sa, R.mipmap.icon_6_foreground_sa, R.string.AppIconVintage, false), new bb0("AQUA", 2, "AquaIcon", R.drawable.icon_4_background_sa, i11, R.string.AppIconAqua, false), new bb0("PREMIUM", 3, "PremiumIcon", R.drawable.icon_3_background_sa, R.mipmap.icon_3_foreground_sa, R.string.AppIconPremium, true), new bb0("TURBO", 4, "TurboIcon", R.drawable.icon_5_background_sa, R.mipmap.icon_5_foreground_sa, R.string.AppIconTurbo, true), new bb0("NOX", 5, "NoxIcon", R.mipmap.icon_2_background_sa, i11, R.string.AppIconNox, true)};
    }

    public bb0(String str, int i10, String str2, int i11, int i12, int i13, boolean z4) {
        this.f35424a = str2;
        this.f35425b = i11;
        this.f35426c = i12;
        this.d = i13;
        this.f35427e = z4;
    }

    public static bb0 valueOf(String str) {
        return (bb0) Enum.valueOf(bb0.class, str);
    }

    public static bb0[] values() {
        return (bb0[]) f35423n.clone();
    }

    public final ComponentName a(Context context) {
        if (this.f35428f == null) {
            String packageName = context.getPackageName();
            this.f35428f = new ComponentName(packageName, "org.telegram.messenger." + this.f35424a);
        }
        return this.f35428f;
    }
}
