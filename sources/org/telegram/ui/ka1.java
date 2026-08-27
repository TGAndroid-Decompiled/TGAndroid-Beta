package org.telegram.ui;

import android.content.SharedPreferences;
import android.widget.TextView;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

public final class ka1 extends org.telegram.ui.ActionBar.j {

    public final ThemeActivity f39684a;

    public ka1(ThemeActivity themeActivity) {
        this.f39684a = themeActivity;
    }

    @Override
    public final void b(int i10) throws Throwable {
        boolean zEquals;
        org.telegram.ui.ActionBar.f6 f6VarN0;
        if (i10 == -1) {
            this.f39684a.finishFragment();
            return;
        }
        if (i10 == 1) {
            this.f39684a.w0();
            return;
        }
        if (i10 == 2) {
            org.telegram.ui.ActionBar.e6 e6VarK = org.telegram.ui.ActionBar.g6.A0().k(false);
            if (e6VarK.f22898r == null) {
                this.f39684a.getMessagesController().saveThemeToServer(e6VarK.f22884b, e6VarK);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShareTheme, e6VarK.f22884b, e6VarK);
                return;
            }
            String str = "https://" + this.f39684a.getMessagesController().linkPrefix + "/addtheme/" + e6VarK.f22898r.slug;
            this.f39684a.showDialog(new org.telegram.ui.Components.sp0(this.f39684a.getParentActivity(), null, str, false, str, false, null));
            return;
        }
        if (i10 == 3) {
            this.f39684a.x0();
            return;
        }
        if (i10 == 4) {
            if (this.f39684a.getParentActivity() == null) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f39684a.getParentActivity());
            alertDialog$Builder.f22702a.N = LocaleController.getString("ThemeResetToDefaultsTitle", R.string.ThemeResetToDefaultsTitle);
            alertDialog$Builder.f22702a.P = LocaleController.getString("ThemeResetToDefaultsText", R.string.ThemeResetToDefaultsText);
            alertDialog$Builder.k(LocaleController.getString("Reset", R.string.Reset), new dl0(this, 20));
            alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
            this.f39684a.showDialog(b2Var);
            TextView textView = (TextView) b2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23284q7, false));
                return;
            }
            return;
        }
        if (i10 == 5) {
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
            String str2 = "Blue";
            String string = sharedPreferences.getString("lastDayTheme", "Blue");
            if (org.telegram.ui.ActionBar.g6.N0(string) == null || org.telegram.ui.ActionBar.g6.N0(string).q()) {
                string = "Blue";
            }
            String str3 = "Dark Blue";
            String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
            if (org.telegram.ui.ActionBar.g6.N0(string2) == null || !org.telegram.ui.ActionBar.g6.N0(string2).q()) {
                string2 = "Dark Blue";
            }
            org.telegram.ui.ActionBar.f6 f6Var = org.telegram.ui.ActionBar.g6.I;
            if (string.equals(string2)) {
                if (f6Var.q() || string.equals("Dark Blue") || string.equals("Night")) {
                    str3 = string2;
                }
                zEquals = str2.equals(f6Var.m());
                if (zEquals) {
                    f6VarN0 = org.telegram.ui.ActionBar.g6.N0(str3);
                } else {
                    f6VarN0 = org.telegram.ui.ActionBar.g6.N0(str2);
                }
                int[] iArr = {(this.f39684a.f36252s.getIconView().getMeasuredWidth() / 2) + i, (this.f39684a.f36252s.getIconView().getMeasuredHeight() / 2) + i};
                this.f39684a.f36252s.getIconView().getLocationInWindow(iArr);
                int i11 = iArr[0];
                int i12 = iArr[1];
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, f6VarN0, Boolean.FALSE, iArr, -1, Boolean.valueOf(zEquals), this.f39684a.f36252s.getIconView());
                this.f39684a.A0(true);
                org.telegram.ui.ActionBar.g6.F1(this.f39684a);
            }
            str3 = string2;
            str2 = string;
            zEquals = str2.equals(f6Var.m());
            if (zEquals) {
                f6VarN0 = org.telegram.ui.ActionBar.g6.N0(str3);
            } else {
                f6VarN0 = org.telegram.ui.ActionBar.g6.N0(str2);
            }
            int[] iArr2 = {(this.f39684a.f36252s.getIconView().getMeasuredWidth() / 2) + i11, (this.f39684a.f36252s.getIconView().getMeasuredHeight() / 2) + i12};
            this.f39684a.f36252s.getIconView().getLocationInWindow(iArr2);
            int i13 = iArr2[0];
            int i14 = iArr2[1];
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, f6VarN0, Boolean.FALSE, iArr2, -1, Boolean.valueOf(zEquals), this.f39684a.f36252s.getIconView());
            this.f39684a.A0(true);
            org.telegram.ui.ActionBar.g6.F1(this.f39684a);
        }
    }
}
