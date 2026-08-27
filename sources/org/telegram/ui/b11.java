package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

public final class b11 extends org.telegram.ui.ActionBar.j {

    public final Context f36665a;

    public final ProxyListActivity f36666b;

    public b11(ProxyListActivity proxyListActivity, Context context) {
        this.f36666b = proxyListActivity;
        this.f36665a = context;
    }

    @Override
    public final void b(int i10) {
        ProxyListActivity proxyListActivity = this.f36666b;
        ArrayList arrayList = proxyListActivity.D;
        if (i10 == -1) {
            if (arrayList.isEmpty()) {
                proxyListActivity.finishFragment();
                return;
            } else {
                proxyListActivity.f36099a.F();
                return;
            }
        }
        int i11 = 0;
        if (i10 == 0) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(proxyListActivity.getParentActivity());
            alertDialog$Builder.f22702a.P = LocaleController.getString(arrayList.size() > 1 ? R.string.DeleteProxyMultiConfirm : R.string.DeleteProxyConfirm);
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.DeleteProxyTitle);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new dl0(this, 14));
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
            proxyListActivity.showDialog(b2Var);
            TextView textView = (TextView) b2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23284q7, false));
                return;
            }
            return;
        }
        if (i10 != 1) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int size = arrayList.size();
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            SharedConfig.ProxyInfo proxyInfo = (SharedConfig.ProxyInfo) obj;
            if (sb2.length() > 0) {
                sb2.append("\n\n");
            }
            sb2.append(proxyInfo.getLink());
        }
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", sb2.toString());
        Intent intentCreateChooser = Intent.createChooser(intent, LocaleController.getString(arrayList.size() > 1 ? R.string.ShareLinks : R.string.ShareLink));
        intentCreateChooser.setFlags(268435456);
        this.f36665a.startActivity(intentCreateChooser);
        c11 c11Var = proxyListActivity.f36099a;
        if (c11Var != null) {
            c11Var.F();
        }
    }
}
