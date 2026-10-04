package org.telegram.ui;

import android.content.ComponentName;
import android.content.Context;
import org.telegram.messenger.R;
public final class jb0 {
    public static final jb0 h;
    public static final jb0[] f37624n;
    public final String f37625a;
    public final int f37626b;
    public final int f37627c;
    public final int d;
    public final boolean f37628e;
    public ComponentName f37629f;

    static {
        int i10 = R.drawable.icon_background_sa;
        int i11 = R.mipmap.icon_foreground_sa;
        jb0 jb0Var = new jb0("DEFAULT", 0, "DefaultIcon", i10, i11, R.string.AppIconDefault, false);
        h = jb0Var;
        f37624n = new jb0[]{jb0Var, new jb0("VINTAGE", 1, "VintageIcon", R.drawable.icon_6_background_sa, R.mipmap.icon_6_foreground_sa, R.string.AppIconVintage, false), new jb0("AQUA", 2, "AquaIcon", R.drawable.icon_4_background_sa, i11, R.string.AppIconAqua, false), new jb0("PREMIUM", 3, "PremiumIcon", R.drawable.icon_3_background_sa, R.mipmap.icon_3_foreground_sa, R.string.AppIconPremium, true), new jb0("TURBO", 4, "TurboIcon", R.drawable.icon_5_background_sa, R.mipmap.icon_5_foreground_sa, R.string.AppIconTurbo, true), new jb0("NOX", 5, "NoxIcon", R.mipmap.icon_2_background_sa, i11, R.string.AppIconNox, true)};
    }

    public jb0(String str, int i10, String str2, int i11, int i12, int i13, boolean z10) {
        this.f37625a = str2;
        this.f37626b = i11;
        this.f37627c = i12;
        this.d = i13;
        this.f37628e = z10;
    }

    public static jb0 valueOf(String str) {
        return (jb0) Enum.valueOf(jb0.class, str);
    }

    public static jb0[] values() {
        return (jb0[]) f37624n.clone();
    }

    public final ComponentName a(Context context) {
        if (this.f37629f == null) {
            String packageName = context.getPackageName();
            this.f37629f = new ComponentName(packageName, "org.telegram.messenger." + this.f37625a);
        }
        return this.f37629f;
    }
}
