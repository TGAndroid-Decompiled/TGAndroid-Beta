package org.telegram.ui;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.R;

public abstract class LauncherIconController {

    public final class LauncherIcon {
        public static final LauncherIcon[] $VALUES;
        public static final LauncherIcon DEFAULT;
        public final int background;
        public ComponentName componentName;
        public final int foreground;
        public final String key;
        public final boolean premium;
        public final int title;

        static {
            int i = R.drawable.icon_background_sa;
            int i2 = R.mipmap.icon_foreground_sa;
            LauncherIcon launcherIcon = new LauncherIcon("DEFAULT", 0, "DefaultIcon", i, i2, R.string.AppIconDefault, false);
            DEFAULT = launcherIcon;
            $VALUES = new LauncherIcon[]{launcherIcon, new LauncherIcon("VINTAGE", 1, "VintageIcon", R.drawable.icon_6_background_sa, R.mipmap.icon_6_foreground_sa, R.string.AppIconVintage, false), new LauncherIcon("AQUA", 2, "AquaIcon", R.drawable.icon_4_background_sa, i2, R.string.AppIconAqua, false), new LauncherIcon("PREMIUM", 3, "PremiumIcon", R.drawable.icon_3_background_sa, R.mipmap.icon_3_foreground_sa, R.string.AppIconPremium, true), new LauncherIcon("TURBO", 4, "TurboIcon", R.drawable.icon_5_background_sa, R.mipmap.icon_5_foreground_sa, R.string.AppIconTurbo, true), new LauncherIcon("NOX", 5, "NoxIcon", R.mipmap.icon_2_background_sa, i2, R.string.AppIconNox, true)};
        }

        public LauncherIcon(String str, int i, String str2, int i2, int i3, int i4, boolean z) {
            super(str, i);
            this.key = str2;
            this.background = i2;
            this.foreground = i3;
            this.title = i4;
            this.premium = z;
        }

        public static LauncherIcon valueOf(String str) {
            return (LauncherIcon) Enum.valueOf(LauncherIcon.class, str);
        }

        public static LauncherIcon[] values() {
            return (LauncherIcon[]) $VALUES.clone();
        }
    }

    public static boolean isEnabled(LauncherIcon launcherIcon) {
        Context context = ApplicationLoader.applicationContext;
        PackageManager packageManager = context.getPackageManager();
        if (launcherIcon.componentName == null) {
            launcherIcon.componentName = new ComponentName(context.getPackageName(), "org.telegram.messenger." + launcherIcon.key);
        }
        int componentEnabledSetting = packageManager.getComponentEnabledSetting(launcherIcon.componentName);
        return componentEnabledSetting == 1 || (componentEnabledSetting == 0 && launcherIcon == LauncherIcon.DEFAULT);
    }
}
