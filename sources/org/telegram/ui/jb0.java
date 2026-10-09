package org.telegram.ui;

import android.content.ComponentName;
import android.content.Context;
import org.telegram.messenger.R;
public final class jb0 {
    public static final jb0 h;
    public static final jb0[] f38896n;
    public final String f38897a;
    public final int f38898b;
    public final int f38899c;
    public final int d;
    public final boolean f38900e;
    public ComponentName f38901f;

    static {
        int i10 = R.drawable.icon_background_sa;
        int i11 = R.mipmap.icon_foreground_sa;
        jb0 jb0Var = new jb0("DEFAULT", 0, "DefaultIcon", i10, i11, R.string.AppIconDefault, false);
        h = jb0Var;
        f38896n = new jb0[]{jb0Var, new jb0("VINTAGE", 1, "VintageIcon", R.drawable.icon_6_background_sa, R.mipmap.icon_6_foreground_sa, R.string.AppIconVintage, false), new jb0("AQUA", 2, "AquaIcon", R.drawable.icon_4_background_sa, i11, R.string.AppIconAqua, false), new jb0("PREMIUM", 3, "PremiumIcon", R.drawable.icon_3_background_sa, R.mipmap.icon_3_foreground_sa, R.string.AppIconPremium, true), new jb0("TURBO", 4, "TurboIcon", R.drawable.icon_5_background_sa, R.mipmap.icon_5_foreground_sa, R.string.AppIconTurbo, true), new jb0("NOX", 5, "NoxIcon", R.mipmap.icon_2_background_sa, i11, R.string.AppIconNox, true)};
    }

    public jb0(String str, int i10, String str2, int i11, int i12, int i13, boolean z10) {
        this.f38897a = str2;
        this.f38898b = i11;
        this.f38899c = i12;
        this.d = i13;
        this.f38900e = z10;
    }

    public static jb0 valueOf(String str) {
        return (jb0) Enum.valueOf(jb0.class, str);
    }

    public static jb0[] values() {
        return (jb0[]) f38896n.clone();
    }

    public final ComponentName a(Context context) {
        if (this.f38901f == null) {
            String packageName = context.getPackageName();
            this.f38901f = new ComponentName(packageName, "org.telegram.messenger." + this.f38897a);
        }
        return this.f38901f;
    }
}
