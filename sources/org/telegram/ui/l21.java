package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
public final class l21 extends org.telegram.ui.ActionBar.j {
    public final q21 f38205a;

    public l21(q21 q21Var) {
        this.f38205a = q21Var;
    }

    @Override
    public final void b(int i10) {
        int i11;
        String obj;
        int intValue;
        String str;
        String str2;
        String str3;
        q21 q21Var = this.f38205a;
        boolean z10 = q21Var.I;
        SharedConfig.ProxyInfo proxyInfo = q21Var.J;
        if (i10 == -1) {
            q21Var.finishFragment();
            return;
        }
        boolean z11 = true;
        if (i10 == 1 && q21Var.getParentActivity() != null) {
            fg.a a2 = fg.b.a();
            int i12 = q21Var.v;
            if (i12 != 0) {
                i11 = i12;
            } else {
                i11 = 1;
            }
            a2.f9500a = i11;
            if (i12 == 3) {
                obj = fg.k.i(q21Var.f39708a[0].getText().toString());
            } else {
                obj = q21Var.f39708a[0].getText().toString();
            }
            String str4 = "";
            if (obj == null) {
                obj = "";
            }
            a2.f9501b = obj;
            if (q21Var.v == 3) {
                intValue = 443;
            } else {
                intValue = Utilities.parseInt((CharSequence) q21Var.f39708a[1].getText().toString()).intValue();
            }
            a2.f9502c = intValue;
            if (q21Var.v != 1) {
                str = "";
            } else {
                str = q21Var.f39708a[2].getText().toString();
            }
            if (str == null) {
                str = "";
            }
            a2.d = str;
            if (q21Var.v != 1) {
                str2 = "";
            } else {
                str2 = q21Var.f39708a[3].getText().toString();
            }
            if (str2 == null) {
                str2 = "";
            }
            a2.f9503e = str2;
            if (q21Var.v == 1) {
                str3 = "";
            } else {
                str3 = q21Var.f39708a[4].getText().toString();
            }
            if (str3 != null) {
                str4 = str3;
            }
            a2.f9504f = str4;
            proxyInfo.settings = new fg.b(a2);
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
            q21Var.finishFragment();
        }
    }
}
