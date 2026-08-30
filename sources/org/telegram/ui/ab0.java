package org.telegram.ui;

import android.content.ComponentName;
import android.content.Context;
import org.telegram.messenger.R;
public final class ab0 {
    public static final ab0 h;
    public static final ab0[] f32508n;
    public final String f32509a;
    public final int f32510b;
    public final int f32511c;
    public final int d;
    public final boolean e;
    public ComponentName f32512f;

    static {
        int i10 = R.drawable.icon_background_sa;
        int i11 = R.mipmap.icon_foreground_sa;
        ab0 ab0Var = new ab0("DEFAULT", 0, "DefaultIcon", i10, i11, R.string.AppIconDefault, false);
        h = ab0Var;
        f32508n = new ab0[]{ab0Var, new ab0("VINTAGE", 1, "VintageIcon", R.drawable.icon_6_background_sa, R.mipmap.icon_6_foreground_sa, R.string.AppIconVintage, false), new ab0("AQUA", 2, "AquaIcon", R.drawable.icon_4_background_sa, i11, R.string.AppIconAqua, false), new ab0("PREMIUM", 3, "PremiumIcon", R.drawable.icon_3_background_sa, R.mipmap.icon_3_foreground_sa, R.string.AppIconPremium, true), new ab0("TURBO", 4, "TurboIcon", R.drawable.icon_5_background_sa, R.mipmap.icon_5_foreground_sa, R.string.AppIconTurbo, true), new ab0("NOX", 5, "NoxIcon", R.mipmap.icon_2_background_sa, i11, R.string.AppIconNox, true)};
    }

    public ab0(String str, int i10, String str2, int i11, int i12, int i13, boolean z4) {
        this.f32509a = str2;
        this.f32510b = i11;
        this.f32511c = i12;
        this.d = i13;
        this.e = z4;
    }

    public static ab0 valueOf(String str) {
        return (ab0) Enum.valueOf(ab0.class, str);
    }

    public static ab0[] values() {
        return (ab0[]) f32508n.clone();
    }

    public final ComponentName a(Context context) {
        if (this.f32512f == null) {
            String packageName = context.getPackageName();
            this.f32512f = new ComponentName(packageName, "org.telegram.messenger." + this.f32509a);
        }
        return this.f32512f;
    }
}
