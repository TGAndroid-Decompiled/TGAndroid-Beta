package org.telegram.ui;

import android.content.ComponentName;
import android.content.Context;
import org.telegram.messenger.R;
public final class lb0 {
    public static final lb0 h;
    public static final lb0[] f34633n;
    public final String f34634a;
    public final int f34635b;
    public final int f34636c;
    public final int d;
    public final boolean e;
    public ComponentName f34637f;

    static {
        int i10 = R.drawable.icon_background_sa;
        int i11 = R.mipmap.icon_foreground_sa;
        lb0 lb0Var = new lb0("DEFAULT", 0, "DefaultIcon", i10, i11, R.string.AppIconDefault, false);
        h = lb0Var;
        f34633n = new lb0[]{lb0Var, new lb0("VINTAGE", 1, "VintageIcon", R.drawable.icon_6_background_sa, R.mipmap.icon_6_foreground_sa, R.string.AppIconVintage, false), new lb0("AQUA", 2, "AquaIcon", R.drawable.icon_4_background_sa, i11, R.string.AppIconAqua, false), new lb0("PREMIUM", 3, "PremiumIcon", R.drawable.icon_3_background_sa, R.mipmap.icon_3_foreground_sa, R.string.AppIconPremium, true), new lb0("TURBO", 4, "TurboIcon", R.drawable.icon_5_background_sa, R.mipmap.icon_5_foreground_sa, R.string.AppIconTurbo, true), new lb0("NOX", 5, "NoxIcon", R.mipmap.icon_2_background_sa, i11, R.string.AppIconNox, true)};
    }

    public lb0(String str, int i10, String str2, int i11, int i12, int i13, boolean z10) {
        this.f34634a = str2;
        this.f34635b = i11;
        this.f34636c = i12;
        this.d = i13;
        this.e = z10;
    }

    public static lb0 valueOf(String str) {
        return (lb0) Enum.valueOf(lb0.class, str);
    }

    public static lb0[] values() {
        return (lb0[]) f34633n.clone();
    }

    public final ComponentName a(Context context) {
        if (this.f34637f == null) {
            String packageName = context.getPackageName();
            this.f34637f = new ComponentName(packageName, "org.telegram.messenger." + this.f34634a);
        }
        return this.f34637f;
    }
}
