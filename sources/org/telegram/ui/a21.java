package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
public final class a21 extends org.telegram.ui.ActionBar.j {
    public final f21 f31965a;

    public a21(f21 f21Var) {
        this.f31965a = f21Var;
    }

    @Override
    public final void b(int i10) {
        int intValue;
        String str;
        String str2;
        String str3;
        f21 f21Var = this.f31965a;
        boolean z10 = f21Var.I;
        SharedConfig.ProxyInfo proxyInfo = f21Var.J;
        if (i10 == -1) {
            f21Var.finishFragment();
            return;
        }
        boolean z11 = true;
        if (i10 == 1 && f21Var.getParentActivity() != null) {
            oi.a a2 = oi.b.a();
            int i11 = f21Var.v;
            if (i11 == 0) {
                i11 = 1;
            }
            a2.f15741a = i11;
            String obj = f21Var.f33522a[0].getText().toString();
            String str4 = "";
            if (obj == null) {
                obj = "";
            }
            a2.f15742b = obj;
            if (f21Var.v == 3) {
                intValue = 0;
            } else {
                intValue = Utilities.parseInt((CharSequence) f21Var.f33522a[1].getText().toString()).intValue();
            }
            a2.f15743c = intValue;
            if (f21Var.v != 1) {
                str = "";
            } else {
                str = f21Var.f33522a[2].getText().toString();
            }
            if (str == null) {
                str = "";
            }
            a2.d = str;
            if (f21Var.v != 1) {
                str2 = "";
            } else {
                str2 = f21Var.f33522a[3].getText().toString();
            }
            if (str2 == null) {
                str2 = "";
            }
            a2.e = str2;
            if (f21Var.v == 1) {
                str3 = "";
            } else {
                str3 = f21Var.f33522a[4].getText().toString();
            }
            if (str3 != null) {
                str4 = str3;
            }
            a2.f15744f = str4;
            proxyInfo.settings = a2.a();
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            SharedPreferences.Editor edit = globalMainSettings.edit();
            if (z10) {
                SharedConfig.addProxy(proxyInfo);
                SharedConfig.currentProxy = proxyInfo;
                edit.putBoolean("proxy_enabled", true);
            } else {
                z11 = globalMainSettings.getBoolean("proxy_enabled", false);
                SharedConfig.saveProxyList();
            }
            if (z10 || SharedConfig.currentProxy == proxyInfo) {
                proxyInfo.settings.h(edit);
                ConnectionsManager.setProxySettings(z11, proxyInfo.settings);
            }
            edit.commit();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.proxySettingsChanged, new Object[0]);
            f21Var.finishFragment();
        }
    }
}
