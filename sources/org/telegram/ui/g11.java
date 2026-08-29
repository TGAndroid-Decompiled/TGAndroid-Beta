package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.WebProxyTransport;
import org.telegram.tgnet.ConnectionsManager;
public final class g11 extends org.telegram.ui.ActionBar.k {
    public final l11 f38430a;

    public g11(l11 l11Var) {
        this.f38430a = l11Var;
    }

    @Override
    public final void b(int i10) {
        String obj;
        int intValue;
        boolean z10;
        l11 l11Var = this.f38430a;
        SharedConfig.ProxyInfo proxyInfo = l11Var.G;
        if (i10 == -1) {
            l11Var.finishFragment();
        } else if (i10 == 1 && l11Var.getParentActivity() != null) {
            if (l11Var.v == 2) {
                obj = WebProxyTransport.normalizeHost(l11Var.f40053a[0].getText().toString());
            } else {
                obj = l11Var.f40053a[0].getText().toString();
            }
            proxyInfo.address = obj;
            if (l11Var.v == 2) {
                intValue = 443;
            } else {
                intValue = Utilities.parseInt((CharSequence) l11Var.f40053a[1].getText().toString()).intValue();
            }
            proxyInfo.port = intValue;
            int i11 = l11Var.v;
            proxyInfo.type = i11;
            if (i11 == 0) {
                proxyInfo.secret = "";
                proxyInfo.username = l11Var.f40053a[2].getText().toString();
                proxyInfo.password = l11Var.f40053a[3].getText().toString();
            } else {
                proxyInfo.secret = l11Var.f40053a[4].getText().toString();
                proxyInfo.username = "";
                proxyInfo.password = "";
            }
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            SharedPreferences.Editor edit = globalMainSettings.edit();
            if (l11Var.F) {
                SharedConfig.addProxy(proxyInfo);
                SharedConfig.currentProxy = proxyInfo;
                edit.putBoolean("proxy_enabled", true);
                z10 = true;
            } else {
                boolean z11 = globalMainSettings.getBoolean("proxy_enabled", false);
                SharedConfig.saveProxyList();
                z10 = z11;
            }
            if (l11Var.F || SharedConfig.currentProxy == proxyInfo) {
                edit.putString("proxy_ip", proxyInfo.address);
                edit.putString("proxy_pass", proxyInfo.password);
                edit.putString("proxy_user", proxyInfo.username);
                edit.putInt("proxy_port", proxyInfo.port);
                edit.putString("proxy_secret", proxyInfo.secret);
                edit.putInt("proxy_type", proxyInfo.type);
                ConnectionsManager.setProxySettings(z10, proxyInfo.address, proxyInfo.port, proxyInfo.username, proxyInfo.password, proxyInfo.secret, proxyInfo.type);
            }
            edit.commit();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.proxySettingsChanged, new Object[0]);
            l11Var.finishFragment();
        }
    }
}
