package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
public final class i21 extends org.telegram.ui.ActionBar.j {
    public final n21 f38508a;

    public i21(n21 n21Var) {
        this.f38508a = n21Var;
    }

    @Override
    public final void b(int i10) {
        int intValue;
        String str;
        String str2;
        String str3;
        n21 n21Var = this.f38508a;
        boolean z10 = n21Var.I;
        SharedConfig.ProxyInfo proxyInfo = n21Var.J;
        if (i10 == -1) {
            n21Var.finishFragment();
            return;
        }
        boolean z11 = true;
        if (i10 == 1 && n21Var.getParentActivity() != null) {
            oi.a a2 = oi.b.a();
            int i11 = n21Var.v;
            if (i11 == 0) {
                i11 = 1;
            }
            a2.f17158a = i11;
            String obj = n21Var.f40096a[0].getText().toString();
            String str4 = "";
            if (obj == null) {
                obj = "";
            }
            a2.f17159b = obj;
            if (n21Var.v == 3) {
                intValue = 0;
            } else {
                intValue = Utilities.parseInt((CharSequence) n21Var.f40096a[1].getText().toString()).intValue();
            }
            a2.f17160c = intValue;
            if (n21Var.v != 1) {
                str = "";
            } else {
                str = n21Var.f40096a[2].getText().toString();
            }
            if (str == null) {
                str = "";
            }
            a2.d = str;
            if (n21Var.v != 1) {
                str2 = "";
            } else {
                str2 = n21Var.f40096a[3].getText().toString();
            }
            if (str2 == null) {
                str2 = "";
            }
            a2.f17161e = str2;
            if (n21Var.v == 1) {
                str3 = "";
            } else {
                str3 = n21Var.f40096a[4].getText().toString();
            }
            if (str3 != null) {
                str4 = str3;
            }
            a2.f17162f = str4;
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
            n21Var.finishFragment();
        }
    }
}
