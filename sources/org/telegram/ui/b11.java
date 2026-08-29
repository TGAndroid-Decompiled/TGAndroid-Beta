package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class b11 extends org.telegram.ui.ActionBar.k {
    public final Context f36646a;
    public final ProxyListActivity f36647b;

    public b11(ProxyListActivity proxyListActivity, Context context) {
        this.f36647b = proxyListActivity;
        this.f36646a = context;
    }

    @Override
    public final void b(int i10) {
        int i11;
        int i12;
        ProxyListActivity proxyListActivity = this.f36647b;
        ArrayList arrayList = proxyListActivity.D;
        if (i10 != -1) {
            int i13 = 0;
            if (i10 != 0) {
                if (i10 == 1) {
                    StringBuilder sb2 = new StringBuilder();
                    int size = arrayList.size();
                    while (i13 < size) {
                        Object obj = arrayList.get(i13);
                        i13++;
                        SharedConfig.ProxyInfo proxyInfo = (SharedConfig.ProxyInfo) obj;
                        if (sb2.length() > 0) {
                            sb2.append("\n\n");
                        }
                        sb2.append(proxyInfo.getLink());
                    }
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("text/plain");
                    intent.putExtra("android.intent.extra.TEXT", sb2.toString());
                    if (arrayList.size() > 1) {
                        i12 = R.string.ShareLinks;
                    } else {
                        i12 = R.string.ShareLink;
                    }
                    Intent createChooser = Intent.createChooser(intent, LocaleController.getString(i12));
                    createChooser.setFlags(268435456);
                    this.f36646a.startActivity(createChooser);
                    c11 c11Var = proxyListActivity.f36161a;
                    if (c11Var != null) {
                        c11Var.F();
                        return;
                    }
                    return;
                }
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(proxyListActivity.getParentActivity());
            if (arrayList.size() > 1) {
                i11 = R.string.DeleteProxyMultiConfirm;
            } else {
                i11 = R.string.DeleteProxyConfirm;
            }
            alertDialog$Builder.f22714a.P = LocaleController.getString(i11);
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.DeleteProxyTitle);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new zk0(this, 14));
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
            proxyListActivity.showDialog(c2Var);
            TextView textView = (TextView) c2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23295q7, false));
            }
        } else if (arrayList.isEmpty()) {
            proxyListActivity.finishFragment();
        } else {
            proxyListActivity.f36161a.F();
        }
    }
}
