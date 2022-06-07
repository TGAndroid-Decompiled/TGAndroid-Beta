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

    public enum LauncherIcon {
        DEFAULT("DefaultIcon", R.drawable.icon_background_sa, R.mipmap.icon_foreground_sa, R.string.AppIconDefault),
        VINTAGE("VintageIcon", R.drawable.icon_6_background_sa, R.mipmap.icon_6_foreground_sa, R.string.AppIconVintage),
        AQUA("AquaIcon", R.drawable.icon_4_background_sa, R.mipmap.icon_foreground_sa, R.string.AppIconAqua),
        PREMIUM("PremiumIcon", R.drawable.icon_3_background_sa, R.mipmap.icon_3_foreground_sa, R.string.AppIconPremium, true),
        TURBO("TurboIcon", R.drawable.icon_5_background_sa, R.mipmap.icon_5_foreground_sa, R.string.AppIconTurbo, true),
        NOX("NoxIcon", R.drawable.icon_2_background_sa, R.mipmap.icon_foreground_sa, R.string.AppIconNox, true);
        
        public final int background;
        private ComponentName componentName;
        public final int foreground;
        public final String key;
        public final boolean premium;
        public final int title;

        public ComponentName getComponentName(Context context) {
            if (this.componentName == null) {
                String packageName = context.getPackageName();
                this.componentName = new ComponentName(packageName, "org.telegram.messenger." + this.key);
            }
            return this.componentName;
        }

        LauncherIcon(String str, int i, int i2, int i3) {
            this(str, i, i2, i3, false);
        }

        LauncherIcon(String str, int i, int i2, int i3, boolean z) {
            this.key = str;
            this.background = i;
            this.foreground = i2;
            this.title = i3;
            this.premium = z;
        }
    }
}
