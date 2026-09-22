package org.telegram.ui;

import android.content.ComponentName;
import android.content.Context;
import org.telegram.messenger.R;
public final class nb0 {
    public static final nb0 h;
    public static final nb0[] f35981n;
    public final String f35982a;
    public final int f35983b;
    public final int f35984c;
    public final int d;
    public final boolean e;
    public ComponentName f35985f;

    static {
        int i10 = R.drawable.icon_background_sa;
        int i11 = R.mipmap.icon_foreground_sa;
        nb0 nb0Var = new nb0("DEFAULT", 0, "DefaultIcon", i10, i11, R.string.AppIconDefault, false);
        h = nb0Var;
        f35981n = new nb0[]{nb0Var, new nb0("VINTAGE", 1, "VintageIcon", R.drawable.icon_6_background_sa, R.mipmap.icon_6_foreground_sa, R.string.AppIconVintage, false), new nb0("AQUA", 2, "AquaIcon", R.drawable.icon_4_background_sa, i11, R.string.AppIconAqua, false), new nb0("PREMIUM", 3, "PremiumIcon", R.drawable.icon_3_background_sa, R.mipmap.icon_3_foreground_sa, R.string.AppIconPremium, true), new nb0("TURBO", 4, "TurboIcon", R.drawable.icon_5_background_sa, R.mipmap.icon_5_foreground_sa, R.string.AppIconTurbo, true), new nb0("NOX", 5, "NoxIcon", R.mipmap.icon_2_background_sa, i11, R.string.AppIconNox, true)};
    }

    public nb0(String str, int i10, String str2, int i11, int i12, int i13, boolean z10) {
        this.f35982a = str2;
        this.f35983b = i11;
        this.f35984c = i12;
        this.d = i13;
        this.e = z10;
    }

    public static nb0 valueOf(String str) {
        return (nb0) Enum.valueOf(nb0.class, str);
    }

    public static nb0[] values() {
        return (nb0[]) f35981n.clone();
    }

    public final ComponentName a(Context context) {
        if (this.f35985f == null) {
            String packageName = context.getPackageName();
            this.f35985f = new ComponentName(packageName, "org.telegram.messenger." + this.f35982a);
        }
        return this.f35985f;
    }
}
