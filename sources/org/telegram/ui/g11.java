package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;

public final class g11 extends org.telegram.ui.ActionBar.j {

    public final j11 f38273a;

    public g11(j11 j11Var) {
        this.f38273a = j11Var;
    }

    @Override
    public final void b(int i10) {
        boolean z10;
        j11 j11Var = this.f38273a;
        boolean z11 = j11Var.F;
        SharedConfig.ProxyInfo proxyInfo = j11Var.G;
        if (i10 == -1) {
            j11Var.finishFragment();
            return;
        }
        if (i10 != 1 || j11Var.getParentActivity() == null) {
            return;
        }
        proxyInfo.address = j11Var.f39223a[0].getText().toString();
        proxyInfo.port = Utilities.parseInt((CharSequence) j11Var.f39223a[1].getText().toString()).intValue();
        if (j11Var.v == 0) {
            proxyInfo.secret = "";
            proxyInfo.username = j11Var.f39223a[2].getText().toString();
            proxyInfo.password = j11Var.f39223a[3].getText().toString();
        } else {
            proxyInfo.secret = j11Var.f39223a[4].getText().toString();
            proxyInfo.username = "";
            proxyInfo.password = "";
        }
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        SharedPreferences.Editor editorEdit = globalMainSettings.edit();
        if (z11) {
            SharedConfig.addProxy(proxyInfo);
            SharedConfig.currentProxy = proxyInfo;
            editorEdit.putBoolean("proxy_enabled", true);
            z10 = true;
        } else {
            boolean z12 = globalMainSettings.getBoolean("proxy_enabled", false);
            SharedConfig.saveProxyList();
            z10 = z12;
        }
        if (z11 || SharedConfig.currentProxy == proxyInfo) {
            editorEdit.putString("proxy_ip", proxyInfo.address);
            editorEdit.putString("proxy_pass", proxyInfo.password);
            editorEdit.putString("proxy_user", proxyInfo.username);
            editorEdit.putInt("proxy_port", proxyInfo.port);
            editorEdit.putString("proxy_secret", proxyInfo.secret);
            ConnectionsManager.setProxySettings(z10, proxyInfo.address, proxyInfo.port, proxyInfo.username, proxyInfo.password, proxyInfo.secret);
        }
        editorEdit.commit();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.proxySettingsChanged, new Object[0]);
        j11Var.finishFragment();
    }
}
