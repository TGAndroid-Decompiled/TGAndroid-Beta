package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
public final class p21 extends org.telegram.ui.ActionBar.k {
    public final u21 f35674a;

    public p21(u21 u21Var) {
        this.f35674a = u21Var;
    }

    @Override
    public final void b(int i10) {
        int i11;
        String obj;
        int intValue;
        String str;
        String str2;
        String str3;
        u21 u21Var = this.f35674a;
        boolean z10 = u21Var.I;
        SharedConfig.ProxyInfo proxyInfo = u21Var.J;
        if (i10 == -1) {
            u21Var.finishFragment();
            return;
        }
        boolean z11 = true;
        if (i10 == 1 && u21Var.getParentActivity() != null) {
            ki.a a2 = ki.b.a();
            int i12 = u21Var.v;
            if (i12 != 0) {
                i11 = i12;
            } else {
                i11 = 1;
            }
            a2.f12521a = i11;
            if (i12 == 3) {
                obj = ki.k.i(u21Var.f37089a[0].getText().toString());
            } else {
                obj = u21Var.f37089a[0].getText().toString();
            }
            String str4 = "";
            if (obj == null) {
                obj = "";
            }
            a2.f12522b = obj;
            if (u21Var.v == 3) {
                intValue = 443;
            } else {
                intValue = Utilities.parseInt((CharSequence) u21Var.f37089a[1].getText().toString()).intValue();
            }
            a2.f12523c = intValue;
            if (u21Var.v != 1) {
                str = "";
            } else {
                str = u21Var.f37089a[2].getText().toString();
            }
            if (str == null) {
                str = "";
            }
            a2.d = str;
            if (u21Var.v != 1) {
                str2 = "";
            } else {
                str2 = u21Var.f37089a[3].getText().toString();
            }
            if (str2 == null) {
                str2 = "";
            }
            a2.e = str2;
            if (u21Var.v == 1) {
                str3 = "";
            } else {
                str3 = u21Var.f37089a[4].getText().toString();
            }
            if (str3 != null) {
                str4 = str3;
            }
            a2.f12524f = str4;
            proxyInfo.settings = new ki.b(a2);
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
                proxyInfo.settings.f(edit);
                ConnectionsManager.setProxySettings(z11, proxyInfo.settings);
            }
            edit.commit();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.proxySettingsChanged, new Object[0]);
            u21Var.finishFragment();
        }
    }
}
