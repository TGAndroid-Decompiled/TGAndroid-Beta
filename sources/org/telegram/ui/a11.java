package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class a11 extends org.telegram.ui.ActionBar.j {
    public final Context f36329a;
    public final ProxyListActivity f36330b;

    public a11(ProxyListActivity proxyListActivity, Context context) {
        this.f36330b = proxyListActivity;
        this.f36329a = context;
    }

    @Override
    public final void b(int i9) {
        int i10;
        int i11;
        ProxyListActivity proxyListActivity = this.f36330b;
        ArrayList arrayList = proxyListActivity.D;
        if (i9 != -1) {
            int i12 = 0;
            if (i9 != 0) {
                if (i9 == 1) {
                    StringBuilder sb2 = new StringBuilder();
                    int size = arrayList.size();
                    while (i12 < size) {
                        Object obj = arrayList.get(i12);
                        i12++;
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
                        i11 = R.string.ShareLinks;
                    } else {
                        i11 = R.string.ShareLink;
                    }
                    Intent createChooser = Intent.createChooser(intent, LocaleController.getString(i11));
                    createChooser.setFlags(268435456);
                    this.f36329a.startActivity(createChooser);
                    b11 b11Var = proxyListActivity.f36096a;
                    if (b11Var != null) {
                        b11Var.F();
                        return;
                    }
                    return;
                }
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(proxyListActivity.getParentActivity());
            if (arrayList.size() > 1) {
                i10 = R.string.DeleteProxyMultiConfirm;
            } else {
                i10 = R.string.DeleteProxyConfirm;
            }
            alertDialog$Builder.f22702a.P = LocaleController.getString(i10);
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.DeleteProxyTitle);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new dl0(this, 14));
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
            proxyListActivity.showDialog(c2Var);
            TextView textView = (TextView) c2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23230q7, false));
            }
        } else if (arrayList.isEmpty()) {
            proxyListActivity.finishFragment();
        } else {
            proxyListActivity.f36096a.F();
        }
    }
}
