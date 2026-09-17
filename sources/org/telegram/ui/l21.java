package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
public final class l21 extends org.telegram.ui.ActionBar.j {
    public final q21 f35428a;

    public l21(q21 q21Var) {
        this.f35428a = q21Var;
    }

    @Override
    public final void b(int i10) {
        int intValue;
        String str;
        String str2;
        String str3;
        q21 q21Var = this.f35428a;
        boolean z10 = q21Var.I;
        SharedConfig.ProxyInfo proxyInfo = q21Var.J;
        if (i10 == -1) {
            q21Var.finishFragment();
            return;
        }
        boolean z11 = true;
        if (i10 == 1 && q21Var.getParentActivity() != null) {
            ni.a a2 = ni.b.a();
            int i11 = q21Var.v;
            if (i11 == 0) {
                i11 = 1;
            }
            a2.f15249a = i11;
            String obj = q21Var.f36781a[0].getText().toString();
            String str4 = "";
            if (obj == null) {
                obj = "";
            }
            a2.f15250b = obj;
            if (q21Var.v == 3) {
                intValue = 0;
            } else {
                intValue = Utilities.parseInt((CharSequence) q21Var.f36781a[1].getText().toString()).intValue();
            }
            a2.f15251c = intValue;
            if (q21Var.v != 1) {
                str = "";
            } else {
                str = q21Var.f36781a[2].getText().toString();
            }
            if (str == null) {
                str = "";
            }
            a2.d = str;
            if (q21Var.v != 1) {
                str2 = "";
            } else {
                str2 = q21Var.f36781a[3].getText().toString();
            }
            if (str2 == null) {
                str2 = "";
            }
            a2.e = str2;
            if (q21Var.v == 1) {
                str3 = "";
            } else {
                str3 = q21Var.f36781a[4].getText().toString();
            }
            if (str3 != null) {
                str4 = str3;
            }
            a2.f15252f = str4;
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
            q21Var.finishFragment();
        }
    }
}
