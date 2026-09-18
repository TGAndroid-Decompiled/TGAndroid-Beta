package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
public final class j21 extends org.telegram.ui.ActionBar.j {
    public final o21 f34693a;

    public j21(o21 o21Var) {
        this.f34693a = o21Var;
    }

    @Override
    public final void b(int i10) {
        int intValue;
        String str;
        String str2;
        String str3;
        o21 o21Var = this.f34693a;
        boolean z10 = o21Var.I;
        SharedConfig.ProxyInfo proxyInfo = o21Var.J;
        if (i10 == -1) {
            o21Var.finishFragment();
            return;
        }
        boolean z11 = true;
        if (i10 == 1 && o21Var.getParentActivity() != null) {
            oi.a a2 = oi.b.a();
            int i11 = o21Var.v;
            if (i11 == 0) {
                i11 = 1;
            }
            a2.f15698a = i11;
            String obj = o21Var.f36094a[0].getText().toString();
            String str4 = "";
            if (obj == null) {
                obj = "";
            }
            a2.f15699b = obj;
            if (o21Var.v == 3) {
                intValue = 0;
            } else {
                intValue = Utilities.parseInt((CharSequence) o21Var.f36094a[1].getText().toString()).intValue();
            }
            a2.f15700c = intValue;
            if (o21Var.v != 1) {
                str = "";
            } else {
                str = o21Var.f36094a[2].getText().toString();
            }
            if (str == null) {
                str = "";
            }
            a2.d = str;
            if (o21Var.v != 1) {
                str2 = "";
            } else {
                str2 = o21Var.f36094a[3].getText().toString();
            }
            if (str2 == null) {
                str2 = "";
            }
            a2.e = str2;
            if (o21Var.v == 1) {
                str3 = "";
            } else {
                str3 = o21Var.f36094a[4].getText().toString();
            }
            if (str3 != null) {
                str4 = str3;
            }
            a2.f15701f = str4;
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
            o21Var.finishFragment();
        }
    }
}
