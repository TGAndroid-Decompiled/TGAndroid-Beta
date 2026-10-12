package org.telegram.ui;

import android.content.ComponentName;
import android.content.Context;
import org.telegram.messenger.R;
public final class ob0 {
    public static final ob0 h;
    public static final ob0[] f38915n;
    public final String f38916a;
    public final int f38917b;
    public final int f38918c;
    public final int d;
    public final boolean e;
    public ComponentName f38919f;

    static {
        int i10 = R.drawable.icon_background_sa;
        int i11 = R.mipmap.icon_foreground_sa;
        ob0 ob0Var = new ob0("DEFAULT", 0, "DefaultIcon", i10, i11, R.string.AppIconDefault, false);
        h = ob0Var;
        f38915n = new ob0[]{ob0Var, new ob0("VINTAGE", 1, "VintageIcon", R.drawable.icon_6_background_sa, R.mipmap.icon_6_foreground_sa, R.string.AppIconVintage, false), new ob0("AQUA", 2, "AquaIcon", R.drawable.icon_4_background_sa, i11, R.string.AppIconAqua, false), new ob0("PREMIUM", 3, "PremiumIcon", R.drawable.icon_3_background_sa, R.mipmap.icon_3_foreground_sa, R.string.AppIconPremium, true), new ob0("TURBO", 4, "TurboIcon", R.drawable.icon_5_background_sa, R.mipmap.icon_5_foreground_sa, R.string.AppIconTurbo, true), new ob0("NOX", 5, "NoxIcon", R.mipmap.icon_2_background_sa, i11, R.string.AppIconNox, true)};
    }

    public ob0(String str, int i10, String str2, int i11, int i12, int i13, boolean z10) {
        this.f38916a = str2;
        this.f38917b = i11;
        this.f38918c = i12;
        this.d = i13;
        this.e = z10;
    }

    public static ob0 valueOf(String str) {
        return (ob0) Enum.valueOf(ob0.class, str);
    }

    public static ob0[] values() {
        return (ob0[]) f38915n.clone();
    }

    public final ComponentName a(Context context) {
        if (this.f38919f == null) {
            String packageName = context.getPackageName();
            this.f38919f = new ComponentName(packageName, "org.telegram.messenger." + this.f38916a);
        }
        return this.f38919f;
    }
}
