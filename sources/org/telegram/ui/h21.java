package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
public final class h21 extends org.telegram.ui.ActionBar.j {
    public final m21 f38268a;

    public h21(m21 m21Var) {
        this.f38268a = m21Var;
    }

    @Override
    public final void b(int i10) {
        int intValue;
        String str;
        String str2;
        String str3;
        m21 m21Var = this.f38268a;
        boolean z10 = m21Var.I;
        SharedConfig.ProxyInfo proxyInfo = m21Var.J;
        if (i10 == -1) {
            m21Var.finishFragment();
            return;
        }
        boolean z11 = true;
        if (i10 == 1 && m21Var.getParentActivity() != null) {
            pi.a a2 = pi.b.a();
            int i11 = m21Var.v;
            if (i11 == 0) {
                i11 = 1;
            }
            a2.f45951a = i11;
            String obj = m21Var.f39827a[0].getText().toString();
            String str4 = "";
            if (obj == null) {
                obj = "";
            }
            a2.f45952b = obj;
            if (m21Var.v == 3) {
                intValue = 0;
            } else {
                intValue = Utilities.parseInt((CharSequence) m21Var.f39827a[1].getText().toString()).intValue();
            }
            a2.f45953c = intValue;
            if (m21Var.v != 1) {
                str = "";
            } else {
                str = m21Var.f39827a[2].getText().toString();
            }
            if (str == null) {
                str = "";
            }
            a2.d = str;
            if (m21Var.v != 1) {
                str2 = "";
            } else {
                str2 = m21Var.f39827a[3].getText().toString();
            }
            if (str2 == null) {
                str2 = "";
            }
            a2.f45954e = str2;
            if (m21Var.v == 1) {
                str3 = "";
            } else {
                str3 = m21Var.f39827a[4].getText().toString();
            }
            if (str3 != null) {
                str4 = str3;
            }
            a2.f45955f = str4;
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
            m21Var.finishFragment();
        }
    }
}
