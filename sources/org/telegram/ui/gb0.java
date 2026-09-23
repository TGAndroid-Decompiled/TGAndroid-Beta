package org.telegram.ui;

import android.content.ComponentName;
import android.content.Context;
import org.telegram.messenger.R;
public final class gb0 {
    public static final gb0 h;
    public static final gb0[] f33504n;
    public final String f33505a;
    public final int f33506b;
    public final int f33507c;
    public final int d;
    public final boolean e;
    public ComponentName f33508f;

    static {
        int i10 = R.drawable.icon_background_sa;
        int i11 = R.mipmap.icon_foreground_sa;
        gb0 gb0Var = new gb0("DEFAULT", 0, "DefaultIcon", i10, i11, R.string.AppIconDefault, false);
        h = gb0Var;
        f33504n = new gb0[]{gb0Var, new gb0("VINTAGE", 1, "VintageIcon", R.drawable.icon_6_background_sa, R.mipmap.icon_6_foreground_sa, R.string.AppIconVintage, false), new gb0("AQUA", 2, "AquaIcon", R.drawable.icon_4_background_sa, i11, R.string.AppIconAqua, false), new gb0("PREMIUM", 3, "PremiumIcon", R.drawable.icon_3_background_sa, R.mipmap.icon_3_foreground_sa, R.string.AppIconPremium, true), new gb0("TURBO", 4, "TurboIcon", R.drawable.icon_5_background_sa, R.mipmap.icon_5_foreground_sa, R.string.AppIconTurbo, true), new gb0("NOX", 5, "NoxIcon", R.mipmap.icon_2_background_sa, i11, R.string.AppIconNox, true)};
    }

    public gb0(String str, int i10, String str2, int i11, int i12, int i13, boolean z10) {
        this.f33505a = str2;
        this.f33506b = i11;
        this.f33507c = i12;
        this.d = i13;
        this.e = z10;
    }

    public static gb0 valueOf(String str) {
        return (gb0) Enum.valueOf(gb0.class, str);
    }

    public static gb0[] values() {
        return (gb0[]) f33504n.clone();
    }

    public final ComponentName a(Context context) {
        if (this.f33508f == null) {
            String packageName = context.getPackageName();
            this.f33508f = new ComponentName(packageName, "org.telegram.messenger." + this.f33505a);
        }
        return this.f33508f;
    }
}
