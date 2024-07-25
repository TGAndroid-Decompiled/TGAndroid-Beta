package org.telegram.ui;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.R;
public class LauncherIconController {
    public static void tryFixLauncherIconIfNeeded() {
        for (LauncherIcon launcherIcon : LauncherIcon.values()) {
            if (isEnabled(launcherIcon)) {
                return;
            }
        }
        setIcon(LauncherIcon.DEFAULT);
    }

    public static boolean isEnabled(LauncherIcon launcherIcon) {
        Context context = ApplicationLoader.applicationContext;
        int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(launcherIcon.getComponentName(context));
        if (componentEnabledSetting != 1) {
            return componentEnabledSetting == 0 && launcherIcon == LauncherIcon.DEFAULT;
        }
        return true;
    }

    public static void setIcon(LauncherIcon launcherIcon) {
        Context context = ApplicationLoader.applicationContext;
        PackageManager packageManager = context.getPackageManager();
        LauncherIcon[] values = LauncherIcon.values();
        int length = values.length;
        for (int i = 0; i < length; i++) {
            LauncherIcon launcherIcon2 = values[i];
            packageManager.setComponentEnabledSetting(launcherIcon2.getComponentName(context), launcherIcon2 == launcherIcon ? 1 : 2, 1);
        }
    }

    public static final class LauncherIcon {
        private static final LauncherIcon[] $VALUES;
        public static final LauncherIcon AQUA;
        public static final LauncherIcon DEFAULT;
        public static final LauncherIcon NOX;
        public static final LauncherIcon PREMIUM;
        public static final LauncherIcon TURBO;
        public static final LauncherIcon VINTAGE;
        public final int background;
        private ComponentName componentName;
        public final int foreground;
        public final String key;
        public final boolean premium;
        public final int title;

        private static LauncherIcon[] $values() {
            return new LauncherIcon[]{DEFAULT, VINTAGE, AQUA, PREMIUM, TURBO, NOX};
        }

        public static LauncherIcon valueOf(String str) {
            return (LauncherIcon) Enum.valueOf(LauncherIcon.class, str);
        }

        public static LauncherIcon[] values() {
            return (LauncherIcon[]) $VALUES.clone();
        }

        static {
            int i = R.drawable.icon_background_sa;
            int i2 = R.mipmap.icon_foreground_sa;
            DEFAULT = new LauncherIcon("DEFAULT", 0, "DefaultIcon", i, i2, R.string.AppIconDefault);
            VINTAGE = new LauncherIcon("VINTAGE", 1, "VintageIcon", R.drawable.icon_6_background_sa, R.mipmap.icon_6_foreground_sa, R.string.AppIconVintage);
            AQUA = new LauncherIcon("AQUA", 2, "AquaIcon", R.drawable.icon_4_background_sa, i2, R.string.AppIconAqua);
            PREMIUM = new LauncherIcon("PREMIUM", 3, "PremiumIcon", R.drawable.icon_3_background_sa, R.mipmap.icon_3_foreground_sa, R.string.AppIconPremium, true);
            TURBO = new LauncherIcon("TURBO", 4, "TurboIcon", R.drawable.icon_5_background_sa, R.mipmap.icon_5_foreground_sa, R.string.AppIconTurbo, true);
            NOX = new LauncherIcon("NOX", 5, "NoxIcon", R.mipmap.icon_2_background_sa, i2, R.string.AppIconNox, true);
            $VALUES = $values();
        }

        public ComponentName getComponentName(Context context) {
            if (this.componentName == null) {
                String packageName = context.getPackageName();
                this.componentName = new ComponentName(packageName, "org.telegram.messenger." + this.key);
            }
            return this.componentName;
        }

        private LauncherIcon(String str, int i, String str2, int i2, int i3, int i4) {
            this(str, i, str2, i2, i3, i4, false);
        }

        private LauncherIcon(String str, int i, String str2, int i2, int i3, int i4, boolean z) {
            this.key = str2;
            this.background = i2;
            this.foreground = i3;
            this.title = i4;
            this.premium = z;
        }
    }
}
