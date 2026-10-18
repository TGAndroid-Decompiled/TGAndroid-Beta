package org.telegram.ui;

import android.content.ComponentName;
import android.content.Context;
import org.telegram.messenger.R;
public final class qa0 {
    public static final qa0 h;
    public static final qa0[] f40352n;
    public final String f40353a;
    public final int f40354b;
    public final int f40355c;
    public final int d;
    public final boolean e;
    public ComponentName f40356f;

    static {
        int i10 = R.drawable.icon_background_sa;
        int i11 = R.mipmap.icon_foreground_sa;
        qa0 qa0Var = new qa0("DEFAULT", 0, "DefaultIcon", i10, i11, R.string.AppIconDefault, false);
        h = qa0Var;
        f40352n = new qa0[]{qa0Var, new qa0("VINTAGE", 1, "VintageIcon", R.drawable.icon_6_background_sa, R.mipmap.icon_6_foreground_sa, R.string.AppIconVintage, false), new qa0("AQUA", 2, "AquaIcon", R.drawable.icon_4_background_sa, i11, R.string.AppIconAqua, false), new qa0("PREMIUM", 3, "PremiumIcon", R.drawable.icon_3_background_sa, R.mipmap.icon_3_foreground_sa, R.string.AppIconPremium, true), new qa0("TURBO", 4, "TurboIcon", R.drawable.icon_5_background_sa, R.mipmap.icon_5_foreground_sa, R.string.AppIconTurbo, true), new qa0("NOX", 5, "NoxIcon", R.mipmap.icon_2_background_sa, i11, R.string.AppIconNox, true)};
    }

    public qa0(String str, int i10, String str2, int i11, int i12, int i13, boolean z10) {
        this.f40353a = str2;
        this.f40354b = i11;
        this.f40355c = i12;
        this.d = i13;
        this.e = z10;
    }

    public static qa0 valueOf(String str) {
        return (qa0) Enum.valueOf(qa0.class, str);
    }

    public static qa0[] values() {
        return (qa0[]) f40352n.clone();
    }

    public final ComponentName a(Context context) {
        if (this.f40356f == null) {
            String packageName = context.getPackageName();
            this.f40356f = new ComponentName(packageName, "org.telegram.messenger." + this.f40353a);
        }
        return this.f40356f;
    }
}
